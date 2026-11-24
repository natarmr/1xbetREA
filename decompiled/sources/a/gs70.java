package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gs70;", "La/iw5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gs70 extends iw5 {
    public ii k2;
    public fiu0 l2;
    public wdk0 m2;
    public final a8z n2 = xbc.b0(this, sre0.f32672a.b(ws70.class), new es70(this, 0));
    public final v62 o2 = new v62(this, (byte) 18);
    public final a8z p2 = maz.a(wez.b, new es70(this, 1));
    public final phf0 q2 = new phf0("CALL_ID_KEY");
    public static final /* synthetic */ iiy[] s2 = {new ez40(gs70.class, FailedBinderCallBack.CALLER_ID, "getCallId()Ljava/lang/String;", 0)};
    public static final nh70 r2 = new nh70();
    public static final String t2 = gs70.class.getName();

    @Override // a.iw5, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setCancelable(false);
        dialogC0.setCanceledOnTouchOutside(false);
        return dialogC0;
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        gs70 gs70Var;
        fetVar.e0(1256389409);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            gs70Var = this;
            Object gk70Var = new gk70(1, gs70Var, gs70.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/online_call/impl/presentation/rating_dialog/models/OnlineCallOperatorRatingSideEffect;)V", 0, (byte) 20);
            fetVar.o0(gk70Var);
            objP = gk70Var;
        } else {
            gs70Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(gs70Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new khx(k3t0VarP0, gs70Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, gs70Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(1888209296, new ngz(((i3t0) gs70Var.P0()).y(fetVar), gs70Var, (byte) 27), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.n2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hs70.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hs70 hs70Var = (hs70) (ze3Var instanceof hs70 ? ze3Var : null);
            if (hs70Var != null) {
                String strN = this.q2.n(this, s2[0]);
                strN.getClass();
                btt0 btt0Var = hs70Var.f13567a;
                ctf0 ctf0Var = hs70Var.b;
                gii0 gii0Var = hs70Var.c;
                mne mneVar = hs70Var.d;
                ii iiVar = hs70Var.e;
                wdk0 wdk0Var = hs70Var.f;
                ol olVar = hs70Var.g;
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                olVar.getClass();
                rrd rrdVar = new rrd(strN, ctf0Var, gii0Var, mneVar, iiVar, wdk0Var, olVar);
                this.k2 = iiVar;
                this.l2 = new fiu0(Collections.singletonMap(ws70.class, (omi) rrdVar.i));
                this.m2 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(hs70.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ccq0.V(this, "DIALOG_EXIT_WITHOUT_SAVE_REQUEST", new es70(this, (byte) 2));
        ccq0.T(this, "DIALOG_EXIT_WITHOUT_SAVE_REQUEST", new es70(this, (byte) 3));
        ccq0.V(this, "DIALOG_EXIT_WITH_SUCCESS_REQUEST", new es70(this, (byte) 4));
        Dialog dialog = this.S1;
        dialog.getClass();
        ((wo8) dialog).k().a(K(), this.o2);
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        this.a2 = false;
        D0().setCanceledOnTouchOutside(false);
        L0().y((fs70) this.p2.getValue());
    }
}
