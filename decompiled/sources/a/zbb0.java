package a;

import android.os.Bundle;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zbb0 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44107a;
    public final /* synthetic */ ccb0 b;

    public /* synthetic */ zbb0(ccb0 ccb0Var, byte b) {
        this.f44107a = b;
        this.b = ccb0Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        byte b = this.f44107a;
        ccb0 ccb0Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = ccb0.X1;
                str.getClass();
                if (str.equals("TAX_INFO_DIALOG_RESULT_KEY")) {
                    ccb0Var.I0().x(qxa0.f29474a);
                    break;
                }
                break;
            default:
                mi70 mi70Var2 = ccb0.X1;
                str.getClass();
                String strH = ccb0Var.H(R.string.tfa_enabled_with_secret_code_v2);
                strH.getClass();
                String string = bundle.getString(str);
                if (string == null) {
                    string = "";
                }
                ccb0Var.I0().x(new mxa0(string, strH));
                break;
        }
    }
}
