package a;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class kmx extends cwr0 {
    public final /* synthetic */ byte q;

    public /* synthetic */ kmx(byte b) {
        this.q = b;
    }

    @Override // a.cwr0
    public b9v I(Context context, Looper looper, qgd qgdVar, Object obj, qav qavVar, rav ravVar) {
        switch (this.q) {
            case 1:
                Object obj2 = qgdVar.g;
                Integer num = (Integer) qgdVar.h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new buj0(context, looper, qgdVar, bundle, qavVar, ravVar);
            case 2:
                throw rw2.g(obj);
            case 5:
                return new vaw0(context, looper, qgdVar, (uaw0) obj, (h9w0) qavVar, (h9w0) ravVar);
            case 7:
                return new waw0(context, looper, qgdVar, (GoogleSignInOptions) obj, (h9w0) qavVar, (h9w0) ravVar);
            case 10:
                return new i0x0(context, looper, 51, qgdVar, qavVar, ravVar);
            default:
                return super.I(context, looper, qgdVar, obj, qavVar, ravVar);
        }
    }

    @Override // a.cwr0
    public b9v J(Context context, Looper looper, qgd qgdVar, Object obj, h9w0 h9w0Var, h9w0 h9w0Var2) {
        switch (this.q) {
            case 0:
                context.getClass();
                looper.getClass();
                ((da3) obj).getClass();
                return new rxw(context, looper, 352, qgdVar, h9w0Var, h9w0Var2);
            case 1:
            case 2:
            case 5:
            case 7:
            default:
                return super.J(context, looper, qgdVar, obj, h9w0Var, h9w0Var2);
            case 3:
                return new e9w0(context, looper, 449, qgdVar, h9w0Var, h9w0Var2);
            case 4:
                return new kaw0(context, looper, qgdVar, (mwp0) obj, h9w0Var, h9w0Var2);
            case 6:
                return new paw0(context, looper, qgdVar, h9w0Var, h9w0Var2);
            case 8:
                return new fhw0(context, looper, 126, qgdVar, h9w0Var, h9w0Var2);
            case 9:
                return new bqw0(context, looper, 457, qgdVar, h9w0Var, h9w0Var2);
        }
    }
}
