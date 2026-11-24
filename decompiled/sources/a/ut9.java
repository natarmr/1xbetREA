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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ut9;", "La/iw5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ut9 extends iw5 {
    public ii k2;
    public fiu0 l2;
    public wdk0 m2;
    public final a8z n2 = xbc.b0(this, sre0.f32672a.b(gu9.class), new st9(this, 0));
    public final v62 o2 = new v62(this, 5);
    public final a8z p2 = maz.a(wez.b, new st9(this, 1));
    public final phf0 q2 = new phf0("REQUEST_KEY");
    public final r34 r2 = new r34("CALL_ID_KEY");
    public static final /* synthetic */ iiy[] t2 = {new ez40(ut9.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(ut9.class, FailedBinderCallBack.CALLER_ID, "getCallId()J", 0)};
    public static final bj5 s2 = new bj5();
    public static final String u2 = ut9.class.getName();

    @Override // a.iw5, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setCancelable(false);
        dialogC0.setCanceledOnTouchOutside(false);
        return dialogC0;
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        ut9 ut9Var;
        fetVar.e0(783521878);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            ut9Var = this;
            Object li8Var = new li8(1, ut9Var, ut9.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/callback/impl/presentation/operator_rating/models/CallbackOperatorRatingSideEffect;)V", 0, (byte) 21);
            fetVar.o0(li8Var);
            objP = li8Var;
        } else {
            ut9Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(ut9Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(k3t0VarP0, ut9Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, ut9Var, (Function2) objP2);
        xdr xdrVar = null;
        ugd ugdVar = null;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), xdrVar, ugdVar, u1c.M(1666253191, new ab4((Object) ((i3t0) ut9Var.P0()).y(fetVar), (Object) ut9Var, (byte) 17), fetVar), 14);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vt9.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vt9 vt9Var = (vt9) (ze3Var instanceof vt9 ? ze3Var : null);
            if (vt9Var != null) {
                Long lN = this.r2.n(this, t2[1]);
                btt0 btt0Var = vt9Var.f37994a;
                ctf0 ctf0Var = vt9Var.b;
                gii0 gii0Var = vt9Var.c;
                mne mneVar = vt9Var.d;
                ii iiVar = vt9Var.e;
                wdk0 wdk0Var = vt9Var.f;
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = ctf0Var;
                esg0Var.b = gii0Var;
                esg0Var.c = btt0Var;
                esg0Var.d = lN;
                esg0Var.e = mneVar;
                esg0Var.f = new pai(esg0Var, (byte) 4);
                this.k2 = iiVar;
                this.l2 = new fiu0(Collections.singletonMap(gu9.class, (pai) esg0Var.f));
                this.m2 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(vt9.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ccq0.V(this, "DIALOG_EXIT_WITHOUT_SAVE_REQUEST", new st9(this, (byte) 2));
        ccq0.T(this, "DIALOG_EXIT_WITHOUT_SAVE_REQUEST", new st9(this, (byte) 3));
        ccq0.V(this, "DIALOG_EXIT_WITH_SUCCESS_REQUEST", new st9(this, (byte) 4));
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
        L0().y((tt9) this.p2.getValue());
    }
}
