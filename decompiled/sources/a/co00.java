package a;

import android.content.ComponentCallbacks2;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/co00;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class co00 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public k8i M1;
    public wdk0 N1;
    public zav O1;
    public final a8z P1;
    public ndk0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(co00.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xuz R1 = new xuz();
    public static final String U1 = co00.class.getSimpleName();

    public co00() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, bp3Var, bp3Var);
        this.L1 = ltt0.o(this, bo00.f2909a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(bq00.class), null, new ao00(this, (byte) 1), 14);
        m0(new rg3((byte) 2), new xn((byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fg3.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fg3 fg3Var = (fg3) (ze3Var instanceof fg3 ? ze3Var : null);
            if (fg3Var != null) {
                l8i l8iVarA = fg3Var.a(a4n0.f(this), U1);
                this.M1 = (k8i) l8iVarA.l1.get();
                this.N1 = l8iVarA.L0;
                zav zavVarF = ((vqc) l8iVarA.X.f25390a).f();
                x1x.x(zavVarF);
                this.O1 = zavVarF;
                return;
            }
        }
        jf4.n(b1j.i(fg3.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        G0().x(mk00.f21920a);
        bcm0.x(n0().getWindow(), false);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().x(kk00.f18413a);
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        G0().x(jk00.f16642a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(qk00.f28864a);
        i0h0 i0h0VarB = B();
        i0h0VarB.getClass();
        TypedValue typedValue = j5d.f15927a;
        int iA = j5d.a(o0(), R.attr.uikitBackgroundContent, false);
        ApplicationActivity applicationActivity = (ApplicationActivity) ((rn) i0h0VarB);
        applicationActivity.y1 = Integer.valueOf(iA);
        applicationActivity.C().b.setBackground(new ColorDrawable(iA));
        applicationActivity.getWindow().setBackgroundDrawable(new ColorDrawable(iA));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(pk00.f27113a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        G0().x(ok00.f25383a);
        tkz tkzVarQ = x0x.Q(this.u1);
        rwj rwjVar = tvk.f34603a;
        byte b = 23;
        sac.V(tkzVarQ, null, null, ys10.f43147a.x(), new kaw(this, null, b), 11);
        Object objN = this.L1.n(S1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-87646507, true, new tx(this, b)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
