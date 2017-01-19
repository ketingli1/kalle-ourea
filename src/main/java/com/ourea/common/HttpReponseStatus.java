package com.ourea.common;

/**
 * <p>Title: HttpReponseStatus.java</p>
 * <p>Description: 摘录自 javax.servlet.http.HttpServletResponse</p>
 * <p>Copyright © 2017 www.souche.com. All rights reserved</p>
 * 
 * @author Kalle
 * @date   2017年1月18日 下午9:05:04
 */
public class HttpReponseStatus {
	/*
     * Server status codes; see RFC 2068.
     */

    /**
     * Status code (100) indicating the client can continue.
     */
    public static final int SC_CONTINUE = 100;
    
    /**
     * Status code (200) indicating the request succeeded normally.
     */
    public static final int SC_OK = 200;
    
    /**
     * Status code (300) indicating that the requested resource
     * corresponds to any one of a set of representations, each with
     * its own specific location.
     */
    public static final int SC_MULTIPLE_CHOICES = 300;

    /**
     * Status code (301) indicating that the resource has permanently
     * moved to a new location, and that future references should use a
     * new URI with their requests.
     */
    public static final int SC_MOVED_PERMANENTLY = 301;

    /**
     * Status code (302) indicating that the resource has temporarily
     * moved to another location, but that future references should
     * still use the original URI to access the resource.
     *
     * This definition is being retained for backwards compatibility.
     * SC_FOUND is now the preferred definition.
     */
    public static final int SC_MOVED_TEMPORARILY = 302;

    /**
    * Status code (302) indicating that the resource reside
    * temporarily under a different URI. Since the redirection might
    * be altered on occasion, the client should continue to use the
    * Request-URI for future requests.(HTTP/1.1) To represent the
    * status code (302), it is recommended to use this variable.
    */
    public static final int SC_FOUND = 302;
    
    /**
     * Status code (400) indicating the request sent by the client was
     * syntactically incorrect.
     */
    public static final int SC_BAD_REQUEST = 400;

    /**
     * Status code (404) indicating that the requested resource is not
     * available.
     */
    public static final int SC_NOT_FOUND = 404;
    
    /**
     * Status code (500) indicating an error inside the HTTP server
     * which prevented it from fulfilling the request.
     */
    public static final int SC_INTERNAL_SERVER_ERROR = 500;
}
