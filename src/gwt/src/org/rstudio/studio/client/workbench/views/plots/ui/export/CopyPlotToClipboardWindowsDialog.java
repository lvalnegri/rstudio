package org.rstudio.studio.client.workbench.views.plots.ui.export;

import org.rstudio.core.client.widget.OperationWithInput;
import org.rstudio.studio.client.workbench.views.plots.model.ExportPlotOptions;
import org.rstudio.studio.client.workbench.views.plots.model.PlotsServerOperations;

public class CopyPlotToClipboardWindowsDialog extends ExportPlotDialog
{

   public CopyPlotToClipboardWindowsDialog(
                                 PlotsServerOperations server,
                                 ExportPlotOptions options,
                                 OperationWithInput<ExportPlotOptions> onClose)
   {
      super(server, options);
     
      
      
   }

}
