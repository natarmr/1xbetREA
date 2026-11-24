package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/o2e0;", "La/sik;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o2e0 extends sik {
    public fiu0 Y1;
    public final nae0 Z1 = ltt0.p(this, n2e0.f22795a);
    public final a8z a2 = xbc.b0(this, sre0.f32672a.b(q2e0.class), new p7d0(this, (byte) 14));
    public static final /* synthetic */ iiy[] c2 = {new j0d0(o2e0.class, "binding", "getBinding()Lorg/xplatform/rate_app/impl/databinding/DialogRateAppBinding;", 0)};
    public static final mi70 b2 = new mi70();

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        hgd hgdVar = new hgd(o0(), this.M1);
        Window window = hgdVar.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            bcm0.x(window, false);
        }
        hgdVar.setCancelable(false);
        return hgdVar;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(m2e0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            m2e0 m2e0Var = (m2e0) (ze3Var instanceof m2e0 ? ze3Var : null);
            if (m2e0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                mne mneVar = m2e0Var.c;
                ctf0 ctf0Var = m2e0Var.d;
                iw20 iw20Var = m2e0Var.f21054a;
                m6m0 m6m0Var = m2e0Var.b;
                vwb0 vwb0Var = m2e0Var.e;
                q7d0 q7d0Var = m2e0Var.f;
                us00 us00Var = m2e0Var.g;
                ctf0Var.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                this.Y1 = new fiu0(Collections.singletonMap(q2e0.class, (ppi) new rrd(mneVar, iw20Var, m6m0Var, i1w0VarF, ctf0Var, vwb0Var, q7d0Var, us00Var).i));
                F0(0, R.style.RateAppDialog);
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(m2e0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Object objN = this.Z1.n(c2[0], this);
        objN.getClass();
        FrameLayout frameLayout = ((ijk) objN).f14878a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        Window window = D0().getWindow();
        if (window != null) {
            ofm0.z(window, o0(), R.attr.uikitStaticTransparent, android.R.attr.statusBarColor, 8);
        }
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object parent = q0().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            nv20 nv20Var = new nv20(this);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view2, nv20Var);
        }
        Object objN = this.Z1.n(c2[0], this);
        objN.getClass();
        pkd.i(((ijk) objN).b, null, new ugd(-739710734, true, new nrc0(this, (byte) 15)));
    }
}
