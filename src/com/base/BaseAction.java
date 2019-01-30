package com.base;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ActorService;
import com.service.FilmService;
import com.service.FilmUserService;
import com.service.ImageService;
import com.service.LabelService;
import com.service.LoginLogService;
import com.service.OperateLogService;
import com.service.PrivilegeService;
import com.service.RecommendService;
import com.service.RoleService;
import com.service.TypeService;
import com.service.UserService;
import com.util.Pinyin4jUtil;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>,ServletRequestAware,ServletResponseAware {
	
	private static final long serialVersionUID = 3397890917489557708L;
	
	protected HttpServletRequest request = null;
	protected HttpServletResponse response = null;
	
	// =============== Service实例的声明,并自动注入 ==================
	@Resource 
	protected RoleService roleService;
	@Resource 
	protected UserService userService;
	@Resource 
	protected PrivilegeService privilegeService;
	@Resource 
	protected LabelService labelService;
	@Resource 
	protected TypeService typeService;
	@Resource 
	protected FilmService filmService;
	@Resource 
	protected ActorService actorService;
	@Resource 
	protected ImageService imageService;
	@Resource 
	protected FilmUserService filmUserService;
	@Resource 
	protected LoginLogService loginLogService;
	@Resource 
	protected OperateLogService operateLogService;
	@Resource 
	protected RecommendService recommendService;

	public void setServletRequest(HttpServletRequest req) {
		this.request = req;
	}

	public void setServletResponse(HttpServletResponse res) {
		this.response = res;
	}

	// =============== ModelDriven的支持 ==================

	protected T model;
	
	@SuppressWarnings("unchecked")
	public BaseAction() {
		try {
			// 通过反射获取model的真实类型     generic：类的，泛型            ParameterizedType 表示参数化类型（即泛型）
			//this表示初始化该构造器的子类
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			//表示此类型的实际类型参数的 Type 对象的数组,即T的class
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// 通过反射创建model的实例
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public T getModel() {
		return model;
	}
	
	/**
	 * 将用户加入session中
	 */
	public void sessionAdd(String key,String value){
		ActionContext.getContext().getSession().put(key, value);
	}

	/** 根据用户名获取当前登录的用户*/
	protected User getCurrentUser() {
		String username = ActionContext.getContext().getSession().get("username").toString();
		return userService.getUserByName(username);
	}
	
	/**
	 * 移除session中的用户
	 */
	public void sessionRemove(){
		 ActionContext.getContext().getSession().remove("username");
		 ActionContext.getContext().getSession().remove("userId");
		 
	}

	/** 获取汉字拼音简码 */
	public String getPinYin() throws Exception {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=utf-8");
			String chinese = request.getParameter("chinese");
			String py = Pinyin4jUtil.getPinyinJianPin(chinese);
			PrintWriter out = response.getWriter();
			out.println(py);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
