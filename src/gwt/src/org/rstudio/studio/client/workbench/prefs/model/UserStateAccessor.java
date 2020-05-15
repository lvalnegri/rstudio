/* UserStateAccessor.java
 *
 * Copyright (C) 2009-20 by RStudio, PBC
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
 
/* DO NOT HAND-EDIT! This file is automatically generated from the formal user state schema
 * JSON. To add a preference, add it to "user-state-schema.json", then run "generate-prefs.R" to
 * rebuild this file.
 */

package org.rstudio.studio.client.workbench.prefs.model;

import org.rstudio.core.client.js.JsObject;
import org.rstudio.studio.client.workbench.model.SessionInfo;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Accessor class for user state.
 */ 
public class UserStateAccessor extends Prefs
{
   public UserStateAccessor(SessionInfo sessionInfo, 
                            JsArray<PrefLayer> stateLayers)
   {
      super(stateLayers);
   }
   
   /**
    * A unique identifier representing the user and machine.
    */
   public PrefValue<String> contextId()
   {
      return string("context_id", "");
   }

   /**
    * Whether we have automatically created an .Rprofile for this user.
    */
   public PrefValue<Boolean> autoCreatedProfile()
   {
      return bool("auto_created_profile", false);
   }

   /**
    * The color theme to apply.
    */
   public PrefValue<Theme> theme()
   {
      return object("theme", null);
   }

   public static class Theme extends JavaScriptObject
   {
      protected Theme() {} 

      public final native String getName() /*-{
         return this.name;
      }-*/;

      public final native String getUrl() /*-{
         return this.url;
      }-*/;

      public final native boolean getIsDark() /*-{
         return this.isDark;
      }-*/;

   }

   /**
    * The directory path under which to place new projects by default. Shadows a uipref.
    */
   public PrefValue<String> defaultProjectLocation()
   {
      return string("default_project_location", "");
   }

   /**
    * Whether to clear hidden objects along with visible objects when clearing the workspace. Set automatically to remember last action.
    */
   public PrefValue<Boolean> clearHidden()
   {
      return bool("clear_hidden", true);
   }

   /**
    * The most recently used plot export options.
    */
   public PrefValue<ExportPlotOptions> exportPlotOptions()
   {
      return object("export_plot_options", null);
   }

   public static class ExportPlotOptions extends JavaScriptObject
   {
      protected ExportPlotOptions() {} 

      public final native int getWidth() /*-{
         return this.width;
      }-*/;

      public final native int getHeight() /*-{
         return this.height;
      }-*/;

      public final native String getFormat() /*-{
         return this.format;
      }-*/;

      public final native boolean getKeepRatio() /*-{
         return this.keepRatio;
      }-*/;

      public final native boolean getViewAfterSave() /*-{
         return this.viewAfterSave;
      }-*/;

      public final native boolean getCopyAsMetafile() /*-{
         return this.copyAsMetafile;
      }-*/;

   }

   /**
    * The most recently used viewer export options.
    */
   public PrefValue<ExportViewerOptions> exportViewerOptions()
   {
      return object("export_viewer_options", null);
   }

   public static class ExportViewerOptions extends JavaScriptObject
   {
      protected ExportViewerOptions() {} 

      public final native int getWidth() /*-{
         return this.width;
      }-*/;

      public final native int getHeight() /*-{
         return this.height;
      }-*/;

      public final native String getFormat() /*-{
         return this.format;
      }-*/;

      public final native boolean getKeepRatio() /*-{
         return this.keepRatio;
      }-*/;

      public final native boolean getViewAfterSave() /*-{
         return this.viewAfterSave;
      }-*/;

      public final native boolean getCopyAsMetafile() /*-{
         return this.copyAsMetafile;
      }-*/;

   }

   /**
    * The most recently used options for saving a plot as a PDF.
    */
   public PrefValue<SavePlotAsPdfOptions> savePlotAsPdfOptions()
   {
      return object("save_plot_as_pdf_options", null);
   }

   public static class SavePlotAsPdfOptions extends JavaScriptObject
   {
      protected SavePlotAsPdfOptions() {} 

      public final native int getWidth() /*-{
         return this.width;
      }-*/;

      public final native int getHeight() /*-{
         return this.height;
      }-*/;

      public final native boolean getPortrait() /*-{
         return this.portrait;
      }-*/;

      public final native boolean getCairoPdf() /*-{
         return this.cairo_pdf;
      }-*/;

      public final native boolean getViewAfterSave() /*-{
         return this.viewAfterSave;
      }-*/;

   }

   /**
    * Most recently used settings for compiling a notebook from an R script.
    */
   public PrefValue<CompileRNotebookPrefs> compileRNotebookPrefs()
   {
      return object("compile_r_notebook_prefs", null);
   }

   public static class CompileRNotebookPrefs extends JavaScriptObject
   {
      protected CompileRNotebookPrefs() {} 

      public final native String getAuthor() /*-{
         return this.author;
      }-*/;

      public final native String getType() /*-{
         return this.type;
      }-*/;

   }

   /**
    * Most recently used settings for compiling a notebook using R Markdown.
    */
   public PrefValue<CompileRMarkdownNotebookPrefs> compileRMarkdownNotebookPrefs()
   {
      return object("compile_r_markdown_notebook_prefs", null);
   }

   public static class CompileRMarkdownNotebookPrefs extends JavaScriptObject
   {
      protected CompileRMarkdownNotebookPrefs() {} 

      public final native String getFormat() /*-{
         return this.format;
      }-*/;

   }

   /**
    * Whether to show UI for publishing content.
    */
   public PrefValue<Boolean> showPublishUi()
   {
      return bool("show_publish_ui", true);
   }

   /**
    * Whether to show UI for publishing content to RStudio Connect.
    */
   public PrefValue<Boolean> enableRsconnectPublishUi()
   {
      return bool("enable_rsconnect_publish_ui", true);
   }

   /**
    * The default (last) account used for publishing
    */
   public PrefValue<PublishAccount> publishAccount()
   {
      return object("publish_account", null);
   }

   public static class PublishAccount extends JavaScriptObject
   {
      protected PublishAccount() {} 

      public final native String getName() /*-{
         return this.name;
      }-*/;

      public final native String getServer() /*-{
         return this.server;
      }-*/;

   }

   /**
    * The preferred width, in pixels, of the document outline pane.
    */
   public PrefValue<Integer> documentOutlineWidth()
   {
      return integer("document_outline_width", 110);
   }

   /**
    * How to create new connections to data sources.
    */
   public PrefValue<String> connectVia()
   {
      return string("connect_via", "connect-r-console");
   }

   public final static String CONNECT_VIA_CONNECT_R_CONSOLE = "connect-r-console";
   public final static String CONNECT_VIA_CONNECT_NEW_R_SCRIPT = "connect-new-r-script";
   public final static String CONNECT_VIA_CONNECT_NEW_R_NOTEBOOK = "connect-new-r-notebook";
   public final static String CONNECT_VIA_CONNECT_COPY_TO_CLIPBOARD = "connect-copy-to-clipboard";

   /**
    * The kind of handler to invoke when errors occur.
    */
   public PrefValue<String> errorHandlerType()
   {
      return string("error_handler_type", "traceback");
   }

   public final static String ERROR_HANDLER_TYPE_MESSAGE = "message";
   public final static String ERROR_HANDLER_TYPE_TRACEBACK = "traceback";
   public final static String ERROR_HANDLER_TYPE_BREAK = "break";
   public final static String ERROR_HANDLER_TYPE_NOTEBOOK = "notebook";
   public final static String ERROR_HANDLER_TYPE_CUSTOM = "custom";

   /**
    * Whether or not the MinGW compiler with GCC 4.9 is used.
    */
   public PrefValue<Boolean> usingMingwGcc49()
   {
      return bool("using_mingw_gcc49", false);
   }

   public void syncPrefs(String layer, JsObject source)
   {
      if (source.hasKey("context_id"))
         contextId().setValue(layer, source.getString("context_id"));
      if (source.hasKey("auto_created_profile"))
         autoCreatedProfile().setValue(layer, source.getBool("auto_created_profile"));
      if (source.hasKey("theme"))
         theme().setValue(layer, source.getObject("theme"));
      if (source.hasKey("default_project_location"))
         defaultProjectLocation().setValue(layer, source.getString("default_project_location"));
      if (source.hasKey("clear_hidden"))
         clearHidden().setValue(layer, source.getBool("clear_hidden"));
      if (source.hasKey("export_plot_options"))
         exportPlotOptions().setValue(layer, source.getObject("export_plot_options"));
      if (source.hasKey("export_viewer_options"))
         exportViewerOptions().setValue(layer, source.getObject("export_viewer_options"));
      if (source.hasKey("save_plot_as_pdf_options"))
         savePlotAsPdfOptions().setValue(layer, source.getObject("save_plot_as_pdf_options"));
      if (source.hasKey("compile_r_notebook_prefs"))
         compileRNotebookPrefs().setValue(layer, source.getObject("compile_r_notebook_prefs"));
      if (source.hasKey("compile_r_markdown_notebook_prefs"))
         compileRMarkdownNotebookPrefs().setValue(layer, source.getObject("compile_r_markdown_notebook_prefs"));
      if (source.hasKey("show_publish_ui"))
         showPublishUi().setValue(layer, source.getBool("show_publish_ui"));
      if (source.hasKey("enable_rsconnect_publish_ui"))
         enableRsconnectPublishUi().setValue(layer, source.getBool("enable_rsconnect_publish_ui"));
      if (source.hasKey("publish_account"))
         publishAccount().setValue(layer, source.getObject("publish_account"));
      if (source.hasKey("document_outline_width"))
         documentOutlineWidth().setValue(layer, source.getInteger("document_outline_width"));
      if (source.hasKey("connect_via"))
         connectVia().setValue(layer, source.getString("connect_via"));
      if (source.hasKey("error_handler_type"))
         errorHandlerType().setValue(layer, source.getString("error_handler_type"));
      if (source.hasKey("using_mingw_gcc49"))
         usingMingwGcc49().setValue(layer, source.getBool("using_mingw_gcc49"));
   }
   

   public int userLayer()
   {
      return LAYER_USER;
   }

   public int projectLayer()
   {
      // There's currently no project-specific state here
      return LAYER_USER;
   }

   public static final int LAYER_DEFAULT  = 0;
   public static final int LAYER_COMPUTED = 1;
   public static final int LAYER_USER     = 2;
}
