package a;

import android.os.Build;
import android.os.Bundle;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kfj0 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18199a;
    public final /* synthetic */ ofj0 b;

    public /* synthetic */ kfj0(ofj0 ofj0Var, byte b) {
        this.f18199a = b;
        this.b = ofj0Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        String string;
        Object serializable;
        byte b = this.f18199a;
        ofj0 ofj0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = ofj0.X1;
                str.getClass();
                ofj0Var.H0().x(bzi0.f3469a);
                break;
            case 1:
                cge0 cge0Var2 = ofj0.X1;
                str.getClass();
                if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle.containsKey("CONNECTION_LOST")) {
                    ii iiVarG0 = ofj0Var.G0();
                    String strH = ofj0Var.H(R.string.no_connection_title);
                    String strH2 = ofj0Var.H(R.string.error_get_data);
                    String strH3 = ofj0Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = ofj0Var.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                }
                break;
            case 2:
                cge0 cge0Var3 = ofj0.X1;
                str.getClass();
                if (str.equals("SETTINGS_QR_SCANNER_REQUEST_KEY") && bundle.containsKey("SETTINGS_QR_SCANNER_BUNDLE_KEY") && (string = bundle.getString("SETTINGS_QR_SCANNER_BUNDLE_KEY")) != null) {
                    ofj0Var.H0().x(new xyi0(string));
                }
                break;
            default:
                cge0 cge0Var4 = ofj0.X1;
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
                    ofj0Var.H0().x(new nyi0(rvs0Var));
                }
                break;
        }
    }
}
