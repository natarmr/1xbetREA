package a;

import android.view.View;
import org.xplatform.uikit.components.check_box.DsCheckbox;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public interface l12 {
    DsCheckbox getChecker();

    /* JADX INFO: renamed from: getNegativeButton */
    View mo5getNegativeButton();

    /* JADX INFO: renamed from: getNeutralButton */
    View mo6getNeutralButton();

    View getPositiveButton();

    void setMaxContentHeight(int i);

    void setModel(DialogFields dialogFields);
}
