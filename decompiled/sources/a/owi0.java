package a;

import android.os.Build;
import android.os.Bundle;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class owi0 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25967a;
    public final /* synthetic */ swi0 b;

    public /* synthetic */ owi0(swi0 swi0Var, byte b) {
        this.f25967a = b;
        this.b = swi0Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        String string;
        Object serializable;
        byte b = this.f25967a;
        swi0 swi0Var = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = swi0.X1;
                str.getClass();
                swi0Var.H0().x(bzi0.f3469a);
                break;
            case 1:
                gne0 gne0Var2 = swi0.X1;
                str.getClass();
                if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle.containsKey("CONNECTION_LOST")) {
                    ii iiVarG0 = swi0Var.G0();
                    String strH = swi0Var.H(R.string.no_connection_title);
                    String strH2 = swi0Var.H(R.string.error_get_data);
                    String strH3 = swi0Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = swi0Var.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                }
                break;
            case 2:
                gne0 gne0Var3 = swi0.X1;
                str.getClass();
                if (str.equals("SETTINGS_QR_SCANNER_REQUEST_KEY") && bundle.containsKey("SETTINGS_QR_SCANNER_BUNDLE_KEY") && (string = bundle.getString("SETTINGS_QR_SCANNER_BUNDLE_KEY")) != null) {
                    swi0Var.H0().x(new xyi0(string));
                }
                break;
            default:
                gne0 gne0Var4 = swi0.X1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable(str, rvs0.class);
                } else {
                    Object serializable2 = bundle.getSerializable(str);
                    if (!(serializable2 instanceof rvs0)) {
                        serializable2 = null;
                    }
                    serializable = (rvs0) serializable2;
                }
                rvs0 rvs0Var = serializable instanceof rvs0 ? (rvs0) serializable : null;
                if (rvs0Var != null) {
                    swi0Var.H0().x(new nyi0(rvs0Var));
                }
                break;
        }
    }
}
