package com.example.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-javascript=/js/angular.js",
		"com.liferay.portlet.header-portlet-javascript=/js/angular-resource.js",
		"com.liferay.portlet.header-portlet-javascript=/js/angular.js",
		"com.liferay.portlet.footer-portlet-javascript=/js/ng-app/app.js",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=xtivia.view Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class XtiviaViewmvcportletPortlet extends MVCPortlet {
}