package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteWheel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/n80;", "La/yx5;", "<init>", "()V", "a/jdk0", "african_roulette"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n80 extends yx5 {
    public final i9o0 K1;
    public j6i L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public u70 P1;
    public ndk0 Q1;
    public boolean R1;
    public final n0o0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(n80.class, "viewBinding", "getViewBinding()Lorg/xplatform/african_roulette/databinding/FragmentAfricanRouletteBinding;", 0)};
    public static final jdk0 U1 = new jdk0();

    public n80() {
        super(R.layout.fragment_african_roulette);
        this.K1 = i9o0.f14396a;
        h80 h80Var = new h80(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 1), (byte) 2));
        this.N1 = agc.G(this, sre0.f32672a.b(u90.class), new k8(a8zVarA, (byte) 22), new k8(a8zVarA, (byte) 23), h80Var);
        this.O1 = ltt0.o(this, m80.f21345a);
        this.S1 = maz.b(new h80(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object value;
        G0().c.setCellClickListeners$african_roulette(new i80(this, (byte) 1));
        this.P1 = new u70(new i80(this, (byte) 2), (byte) 0);
        G0().d.setAdapter(this.P1);
        u90 u90VarH0 = H0();
        vcu vcuVar = u90VarH0.e;
        p80 p80Var = u90VarH0.b;
        c4m0 c4m0Var = u90VarH0.r;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        u90VarH0.z();
        if (vcuVar.a() == vrs.f37917a) {
            u90VarH0.G(new g90(true));
            d80 d80Var = p80Var.d.c;
            z70 z70Var = d80Var.b;
            if (z70Var != z70.v) {
                ArrayList arrayListA = d80Var.a();
                if (!arrayListA.isEmpty()) {
                    Iterator it = arrayListA.iterator();
                    do {
                        if (!it.hasNext()) {
                            u90VarH0.A(z70Var);
                            u90VarH0.E(p80Var.d.c.a());
                            break;
                        }
                    } while (((t70) it.next()).b != z70Var);
                } else {
                    u90VarH0.A(z70Var);
                    u90VarH0.E(p80Var.d.c.a());
                    break;
                }
            }
        }
        if (vcuVar.a() == vrs.f37917a) {
            boolean z = (p80Var.d.c.a().isEmpty() || u90VarH0.f.a().f4905a.f3145a.a()) ? false : true;
            p7m0 p7m0Var = u90VarH0.w;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, m90.a((m90) value, z, false, 2)));
        }
        dyb.c0(G0().b, new i80(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        k6i k6iVar;
        Fragment fragment = this.y;
        g80 g80Var = fragment instanceof g80 ? (g80) fragment : null;
        if (g80Var == null || (k6iVar = (k6i) g80Var.W1.getValue()) == null) {
            return;
        }
        this.L1 = (j6i) k6iVar.m0.get();
        wdk0 wdk0VarI9 = k6iVar.f17771a.I9();
        x1x.x(wdk0VarI9);
        this.M1 = wdk0VarI9;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qoj0 qoj0Var = H0().z;
        k80 k80Var = new k80(this, null, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kz((gmq) qoj0Var, clzVarW, k80Var, (yje) null, (byte) 0), 3);
        qoj0 qoj0Var2 = H0().y;
        k80 k80Var2 = new k80(this, null, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kz((gmq) qoj0Var2, clzVarW2, k80Var2, (yje) null, (char) 0), 3);
        qoj0 qoj0Var3 = H0().x;
        k80 k80Var3 = new k80(this, null, (byte) 3);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new kz(qoj0Var3, clzVarW3, k80Var3, (yje) null, 0), 3);
        p7m0 p7m0Var = H0().w;
        k80 k80Var4 = new k80(this, null, (byte) 4);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new kz((gmq) p7m0Var, clzVarW4, k80Var4, (yje) null, (short) 0), 3);
        qoj0 qoj0Var4 = H0().A;
        k80 k80Var5 = new k80(this, null, (byte) 5);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new kz((gmq) qoj0Var4, clzVarW5, k80Var5, (yje) null, (byte) 0, false), 3);
    }

    public final oxq G0() {
        Object objN = this.O1.n(V1[0], this);
        objN.getClass();
        return (oxq) objN;
    }

    public final u90 H0() {
        return (u90) this.N1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Exception {
        layoutInflater.getClass();
        qoj0 qoj0Var = H0().B;
        k80 k80Var = new k80(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kz(qoj0Var, clzVarW, k80Var, (yje) null), 3);
        return super.X(layoutInflater, viewGroup, bundle);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        this.P1 = null;
        G0().d.setAdapter(null);
        AfricanRouletteWheel africanRouletteWheel = G0().f;
        AnimatorSet animatorSet = africanRouletteWheel.c;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = africanRouletteWheel.c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ObjectAnimator objectAnimator = africanRouletteWheel.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        H0().v = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        if (!H0().v) {
            G0().f.getViewTreeObserver().removeOnGlobalLayoutListener((j80) this.S1.getValue());
        }
        this.j1 = true;
        AfricanRouletteWheel africanRouletteWheel = G0().f;
        AnimatorSet animatorSet = africanRouletteWheel.c;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        ObjectAnimator objectAnimator = africanRouletteWheel.d;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        ObjectAnimator objectAnimator;
        AnimatorSet animatorSet;
        super.e0();
        if (!H0().v) {
            G0().f.getViewTreeObserver().addOnGlobalLayoutListener((j80) this.S1.getValue());
        }
        AfricanRouletteWheel africanRouletteWheel = G0().f;
        AnimatorSet animatorSet2 = africanRouletteWheel.c;
        if (animatorSet2 != null && animatorSet2.isPaused() && (animatorSet = africanRouletteWheel.c) != null) {
            animatorSet.resume();
        }
        ObjectAnimator objectAnimator2 = africanRouletteWheel.d;
        if (objectAnimator2 == null || !objectAnimator2.isPaused() || (objectAnimator = africanRouletteWheel.d) == null) {
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
