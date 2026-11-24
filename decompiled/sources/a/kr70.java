package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kr70;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kr70 extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public ii M1;
    public wdk0 N1;
    public fiu0 O1;
    public final a8z P1;
    public final a8z Q1;
    public PowerManager.WakeLock R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(kr70.class, "binding", "getBinding()Lorg/xplatform/feature/online_cal/impl/databinding/FragmentOnlineCallBinding;", 0)};
    public static final jh70 S1 = new jh70();
    public static final String V1 = kr70.class.getSimpleName();

    public kr70() {
        super(R.layout.fragment_online_call);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, jr70.f16990a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(bv70.class), new ir70(this, (byte) 0));
        this.Q1 = maz.a(wez.b, new ir70(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0q n0qVar = o7k0.c;
        ccq0.V(this, "PERMISSION_DIALOG", new ir70(this, (byte) 4));
        ccq0.V(this, "APP_SETTINGS_DIALOG", new ir70(this, (byte) 5));
        Object objN = this.L1.n(U1[0], this);
        objN.getClass();
        h97.t(((l2r) objN).b, new owp0(this), new ugd(-645012951, true, new jt50(this, n0qVar, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lr70.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lr70 lr70Var = (lr70) (ze3Var instanceof lr70 ? ze3Var : null);
            if (lr70Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                wyu wyuVar = lr70Var.p;
                ieu ieuVar = lr70Var.o;
                ii iiVar = lr70Var.f20516a;
                wdk0 wdk0Var = lr70Var.b;
                gr70 gr70Var = lr70Var.c;
                cad cadVar = lr70Var.d;
                uq70 uq70Var = lr70Var.e;
                m1e m1eVar = lr70Var.f;
                gst0 gst0Var = lr70Var.g;
                j1q0 j1q0Var = lr70Var.h;
                yfu yfuVar = lr70Var.i;
                btt0 btt0Var = lr70Var.j;
                b3c0 b3c0Var = lr70Var.k;
                vwb0 vwb0Var = lr70Var.l;
                ony onyVar = lr70Var.m;
                n6k0 n6k0Var = lr70Var.n;
                ol olVar = lr70Var.q;
                js70 js70Var = lr70Var.r;
                gii0 gii0Var = lr70Var.s;
                gr70Var.getClass();
                wyuVar.getClass();
                uq70Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                j1q0Var.getClass();
                btt0Var.getClass();
                b3c0Var.getClass();
                vwb0Var.getClass();
                onyVar.getClass();
                n6k0Var.getClass();
                olVar.getClass();
                js70Var.getClass();
                gii0Var.getClass();
                h6i h6iVar = new h6i(gr70Var, cadVar, wyuVar, uq70Var, i1w0VarF, iiVar, wdk0Var, m1eVar, gst0Var, j1q0Var, yfuVar, b3c0Var, ieuVar, olVar, js70Var);
                this.M1 = iiVar;
                this.N1 = wdk0Var;
                this.O1 = new fiu0(Collections.singletonMap(bv70.class, (omi) h6iVar.p));
                return;
            }
        }
        jf4.n(b1j.i(lr70.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.A0(this, "REQUEST_KEY", new ds60(this, (byte) 14));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
