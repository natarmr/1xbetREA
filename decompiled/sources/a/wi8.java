package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/wi8;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wi8 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(gj8.class), new vi8(this, (byte) 1));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1278295090);
        pz40 pz40VarY = ((i3t0) ((k3t0) this.l2.getValue())).y(fetVar);
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        if (zI || objP == ukd.f35823a) {
            objP = new vi8(this, (byte) 0);
            fetVar.o0(objP);
        }
        v3c.A((Function0) objP, null, null, fetVar, 0, 6);
        bw5 bw5Var = new bw5(iw5.O0(0, fetVar), j47.f15870a, (ugd) null, u1c.M(-2007775681, new v7i0(pz40VarY, (byte) 13), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hj8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hj8 hj8Var = (hj8) (ze3Var instanceof hj8 ? ze3Var : null);
            if (hj8Var != null) {
                this.k2 = hj8Var.a(a4n0.f(this)).e0();
                return;
            }
        }
        jf4.n(b1j.i(hj8.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        Window window;
        ycm0 ziv0Var;
        super.e0();
        L0().K = true;
        L0().N(3);
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ani0 ani0Var = new ani0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        pz40 pz40Var = s6t0.f31722a;
        ziv0Var.v(true ^ s6t0.c());
        window.setNavigationBarColor(0);
    }
}
