package a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yx5 extends Fragment {
    public final g9o0 H1;
    public final inm0 I1;
    public final n0o0 J1;

    public yx5(int i) {
        super(i);
        this.H1 = g9o0.f10925a;
        this.I1 = inm0.f15081a;
        this.J1 = maz.b(new zo4(this, (byte) 14));
    }

    /* JADX INFO: renamed from: A0 */
    public boolean getL1() {
        return false;
    }

    public final void E0(boolean z) {
        Object next;
        b5q b5qVar = new b5q(pgi0.h(lgi0.e(new da40((byte) 25), this.y), j9x.Z));
        do {
            if (!b5qVar.hasNext()) {
                next = null;
                break;
            }
            next = b5qVar.next();
        } while (!((yx5) next).getL1());
        yx5 yx5Var = (yx5) next;
        if ((yx5Var != null && yx5Var.N() && yx5Var.S()) || !zdx.B(this)) {
            return;
        }
        i0h0 i0h0VarB = B();
        da50 da50Var = i0h0VarB instanceof da50 ? (da50) i0h0VarB : null;
        if (da50Var == null) {
            return;
        }
        ba50 ba50Var = ((ApplicationActivity) da50Var).Z;
        if (ba50Var != null) {
            ba50Var.a(z);
        } else {
            Intrinsics.h("navBarHolder");
            throw null;
        }
    }

    public final void F0() {
        kxq kxqVarB;
        Window window;
        boolean zA;
        boolean z;
        if (Intrinsics.d(z0(), i9o0.f14396a) || (kxqVarB = B()) == null || (window = kxqVarB.getWindow()) == null) {
            return;
        }
        boolean k1 = getM1();
        j9o0 j9o0VarZ0 = h9o0.f12688a;
        g9o0 g9o0Var = g9o0.f10925a;
        if (!k1 || !Intrinsics.d(z0(), g9o0Var)) {
            j9o0VarZ0 = (getM1() || !Intrinsics.d(z0(), j9o0VarZ0)) ? z0() : g9o0Var;
        }
        int iL = jtm0.l(j9o0VarZ0);
        etm0.j(iL, this);
        j9o0 j9o0Var = j9o0VarZ0;
        Context contextO0 = o0();
        int iK = jtm0.k(j9o0Var);
        Context contextO1 = o0();
        boolean z2 = j9o0Var instanceof e9o0;
        boolean zA2 = false;
        if (z2) {
            zA = ((e9o0) j9o0Var).c.a(contextO1);
        } else {
            zA = !qem0.r(contextO1);
        }
        Context contextO2 = o0();
        if (z2) {
            zA2 = ((e9o0) j9o0Var).d.a(contextO2);
        } else {
            if (!(j9o0Var instanceof f9o0)) {
                if (!qem0.r(contextO2)) {
                    z = true;
                }
                ofm0.y(window, contextO0, iL, iK, zA, z);
            }
            zA2 = ((f9o0) j9o0Var).b.a(contextO2);
        }
        z = zA2;
        ofm0.y(window, contextO0, iL, iK, zA, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Context context) {
        context.getClass();
        super.V(context);
        C0();
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        Log.i("onCreate", "Current screen: ".concat(getClass().getName()));
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z() {
        Window window;
        View decorView;
        kxq kxqVarB = B();
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.removeCallbacks((Runnable) this.J1.getValue());
        }
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        this.j1 = true;
        F0();
    }

    @Override // androidx.fragment.app.Fragment
    public void g0() {
        this.j1 = true;
        E0(getM1());
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) {
        view.getClass();
        n0().setTheme(qem0.p(o0()));
        if (!Intrinsics.d(y0(), inm0.f15081a)) {
            View viewQ0 = q0();
            gne gneVar = new gne(this, (byte) 16);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(viewQ0, gneVar);
        }
        B0(bundle);
        D0();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        kxq kxqVarB;
        Window window;
        View decorView;
        configuration.getClass();
        this.j1 = true;
        if (!S() || (kxqVarB = B()) == null || (window = kxqVarB.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        n0o0 n0o0Var = this.J1;
        decorView.removeCallbacks((Runnable) n0o0Var.getValue());
        decorView.post((Runnable) n0o0Var.getValue());
    }

    /* JADX INFO: renamed from: x0 */
    public boolean getM1() {
        return this instanceof v51;
    }

    public jnm0 y0() {
        return this.I1;
    }

    public j9o0 z0() {
        return this.H1;
    }

    public void C0() {
    }

    public void D0() {
    }

    public void B0(Bundle bundle) {
    }
}
