package a;

import android.os.Build;
import android.os.Bundle;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p1j0 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26204a;
    public final /* synthetic */ t1j0 b;

    public /* synthetic */ p1j0(t1j0 t1j0Var, byte b) {
        this.f26204a = b;
        this.b = t1j0Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        Object serializable;
        String string;
        byte b = this.f26204a;
        t1j0 t1j0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = t1j0.Y1;
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
                    org.xplatform.settings.impl.presentation.a aVarI0 = t1j0Var.I0();
                    boolean z = rvs0Var instanceof mvs0;
                    a1j0 a1j0Var = a1j0.f73a;
                    if (z) {
                        aVarI0.G(a1j0Var, null);
                    } else if (rvs0Var instanceof ovs0) {
                        ovs0 ovs0Var = (ovs0) rvs0Var;
                        aVarI0.z(new fn50(ovs0Var.f25940a, ovs0Var.b, ovs0Var.c, ovs0Var.f, ovs0Var.d, ovs0Var.e, ovs0Var.g));
                    } else if (rvs0Var instanceof pvs0) {
                        pvs0 pvs0Var = (pvs0) rvs0Var;
                        int i = pvs0Var.f27677a;
                        String str2 = pvs0Var.b;
                        aVarI0.j.s(String.valueOf(i));
                        aVarI0.Q.h(i);
                        aVarI0.G(new j1j0(str2), null);
                    } else if (rvs0Var instanceof nvs0) {
                        Class cls = ((nvs0) rvs0Var).f24202a;
                        if (cls.equals(n64.class)) {
                            aVarI0.G(a1j0Var, null);
                        } else if (!cls.equals(kj50.class)) {
                            aVarI0.G(a1j0Var, null);
                        } else {
                            aVarI0.A();
                        }
                    } else if (!(rvs0Var instanceof qvs0)) {
                        t9f.b();
                    } else {
                        sac.V(jiu0.a(aVarI0), hfj0.f12977a, null, aVarI0.s.b, new oej0(aVarI0, null, (byte) 13), 10);
                    }
                }
                break;
            case 1:
                zie0 zie0Var2 = t1j0.Y1;
                str.getClass();
                org.xplatform.settings.impl.presentation.a aVarI1 = t1j0Var.I0();
                sac.V(jiu0.a(aVarI1), ifj0.f14691a, null, aVarI1.s.b, new oej0(aVarI1, null, (byte) 14), 10);
                break;
            case 2:
                zie0 zie0Var3 = t1j0.Y1;
                str.getClass();
                if (str.equals("SETTINGS_QR_SCANNER_REQUEST_KEY") && bundle.containsKey("SETTINGS_QR_SCANNER_BUNDLE_KEY") && (string = bundle.getString("SETTINGS_QR_SCANNER_BUNDLE_KEY")) != null) {
                    org.xplatform.settings.impl.presentation.a aVarI2 = t1j0Var.I0();
                    if (!aVarI2.U.f15225a.a()) {
                        bby bbyVar = aVarI2.S0;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        aVarI2.S0 = sac.V(jiu0.a(aVarI2), yej0.f42490a, null, null, new sej0(aVarI2, string, null, (byte) 1), 14);
                    } else {
                        sac.V(jiu0.a(aVarI2), new kej0(aVarI2, (byte) 1), null, aVarI2.s.b, new sej0(aVarI2, string, null, (byte) 2), 10);
                    }
                }
                break;
            default:
                zie0 zie0Var4 = t1j0.Y1;
                str.getClass();
                if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle.containsKey("CONNECTION_LOST")) {
                    ii iiVarG0 = t1j0Var.G0();
                    String strH = t1j0Var.H(R.string.no_connection_title);
                    String strH2 = t1j0Var.H(R.string.error_get_data);
                    String strH3 = t1j0Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = t1j0Var.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                }
                break;
        }
    }
}
