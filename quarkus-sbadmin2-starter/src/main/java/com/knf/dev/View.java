package com.knf.dev;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class View {

    @Inject
    Template index;

    @Inject
    Template login;

    @Inject
    Template register;

    @Inject
    Template forgot_password;

    @Inject
    Template pagenotfound;

    @Inject
    Template blank;

    @Inject
    Template buttons;

    @Inject
    Template cards;

    @Inject
    Template utilities_color;

    @Inject
    Template utilities_border;

    @Inject
    Template utilities_animation;

    @Inject
    Template utilities_other;

    @Inject
    Template charts;

    @Inject
    Template tables;

    final String name = "name";
    final String title = "Quarkus + SB Admin 2";

    //Home View
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance index()
            throws TemplateException {
        return index.data(name, title);
    }

    //Login View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/login")
    public TemplateInstance login()
            throws TemplateException {
        return login.data(name, title);
    }

    //Registration View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/register")
    public TemplateInstance register()
            throws TemplateException {
        return register.data(name, title);
    }

    //Forgot Password View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/forgot_password")
    public TemplateInstance forgotPassword()
            throws TemplateException {
        return forgot_password.data(name, title);
    }

    //404 Error View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/pagenotfound")
    public TemplateInstance pageNotFound()
            throws TemplateException {
        return pagenotfound.data(name, title);
    }

    //Blank View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/blank")
    public TemplateInstance blank()
            throws TemplateException {
        return blank.data(name, title);
    }
    //Buttons View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/buttons")
    public TemplateInstance buttons()
            throws TemplateException {
        return buttons.data(name, title);
    }

    //Cards View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/cards")
    public TemplateInstance cards()
            throws TemplateException {
        return cards.data(name, title);
    }

    //Colors View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/utilities_color")
    public TemplateInstance colors()
            throws TemplateException {
        return utilities_color.data(name, title);
    }

    //Borders View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/utilities_border")
    public TemplateInstance borders()
            throws TemplateException {
        return utilities_border.data(name, title);
    }

    //Animations View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/utilities_animation")
    public TemplateInstance animations()
            throws TemplateException {
        return utilities_animation.data(name, title);
    }

    //Other View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/utilities_other")
    public TemplateInstance other()
            throws TemplateException {
        return utilities_other.data(name, title);
    }

    //Charts View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/charts")
    public TemplateInstance charts()
            throws TemplateException {
        return charts.data(name, title);
    }

    //Tables View
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/tables")
    public TemplateInstance tables()
            throws TemplateException {
        return tables.data(name, title);
    }

}
