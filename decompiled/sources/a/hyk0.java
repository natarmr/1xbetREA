package a;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinWheelView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/hyk0;", "La/yx5;", "<init>", "()V", "spin_and_win"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hyk0 extends yx5 {
    public static final /* synthetic */ iiy[] U1 = {new j0d0(hyk0.class, "viewBinding", "getViewBinding()Lorg/xplatform/spin_and_win/databinding/FragmentSpinAndWinBinding;", 0)};
    public final i9o0 K1;
    public jui L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public u70 P1;
    public ndk0 Q1;
    public boolean R1;
    public final n0o0 S1;

    public hyk0() {
        super(R.layout.fragment_spin_and_win);
        this.K1 = i9o0.f14396a;
        byk0 byk0Var = new byk0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new fyk0(new l9i0(this, (byte) 29), (byte) 0));
        this.N1 = agc.G(this, sre0.f32672a.b(tyk0.class), new s9i0(a8zVarA, (byte) 26), new s9i0(a8zVarA, (byte) 27), byk0Var);
        this.O1 = ltt0.o(this, gyk0.f12134a);
        this.S1 = maz.b(new byk0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        x4r x4rVarG0 = G0();
        x4rVarG0.b.setOnButtonClickListener$spin_and_win(new cyk0(this, (byte) 0));
        u70 u70Var = new u70(new cyk0(this, (byte) 1), (byte) 2);
        this.P1 = u70Var;
        x4rVarG0.g.setAdapter(u70Var);
        dyb.c0(x4rVarG0.c, new huh0(this, x4rVarG0, (byte) 25));
    }

    @Override // a.yx5
    public final void C0() {
        kui kuiVar;
        Fragment fragment = this.y;
        ayk0 ayk0Var = fragment instanceof ayk0 ? (ayk0) fragment : null;
        if (ayk0Var == null || (kuiVar = (kui) ayk0Var.W1.getValue()) == null) {
            return;
        }
        this.L1 = (jui) kuiVar.x0.get();
        wdk0 wdk0VarI9 = kuiVar.f18911a.I9();
        x1x.x(wdk0VarI9);
        this.M1 = wdk0VarI9;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qoj0 qoj0Var = H0().G;
        yje yjeVar = null;
        eyk0 eyk0Var = new eyk0(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new myj0((gmq) qoj0Var, clzVarW, eyk0Var, (yje) null, (byte) 0), 3);
        qoj0 qoj0Var2 = H0().F;
        eyk0 eyk0Var2 = new eyk0(this, yjeVar, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new myj0((gmq) qoj0Var2, clzVarW2, eyk0Var2, (yje) null, (char) 0), 3);
        qoj0 qoj0Var3 = H0().E;
        eyk0 eyk0Var3 = new eyk0(this, yjeVar, (byte) 3);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new myj0(qoj0Var3, clzVarW3, eyk0Var3, (yje) null, 0), 3);
        qoj0 qoj0Var4 = H0().D;
        eyk0 eyk0Var4 = new eyk0(this, yjeVar, (byte) 4);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new myj0((gmq) qoj0Var4, clzVarW4, eyk0Var4, (yje) null, (short) 0), 3);
        p7m0 p7m0Var = H0().H;
        eyk0 eyk0Var5 = new eyk0(this, yjeVar, (byte) 5);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new myj0(p7m0Var, clzVarW5, eyk0Var5, null, (byte) 0, false), 3);
    }

    public final x4r G0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (x4r) objN;
    }

    public final tyk0 H0() {
        return (tyk0) this.N1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Exception {
        layoutInflater.getClass();
        qoj0 qoj0Var = H0().I;
        eyk0 eyk0Var = new eyk0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new myj0(qoj0Var, clzVarW, eyk0Var, (yje) null), 3);
        return super.X(layoutInflater, viewGroup, bundle);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        H0().C = false;
        this.P1 = null;
        G0().g.setAdapter(null);
        ObjectAnimator objectAnimator = G0().i.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        if (!H0().C) {
            G0().i.getViewTreeObserver().removeOnGlobalLayoutListener((dyk0) this.S1.getValue());
        }
        this.j1 = true;
        ObjectAnimator objectAnimator = G0().i.b;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        ObjectAnimator objectAnimator;
        super.e0();
        if (!H0().C) {
            G0().i.getViewTreeObserver().addOnGlobalLayoutListener((dyk0) this.S1.getValue());
        }
        SpinAndWinWheelView spinAndWinWheelView = G0().i;
        ObjectAnimator objectAnimator2 = spinAndWinWheelView.b;
        if (objectAnimator2 == null || !objectAnimator2.isPaused() || (objectAnimator = spinAndWinWheelView.b) == null) {
            return;
        }
        objectAnimator.resume();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
