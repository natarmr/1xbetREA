package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.crystal.presentation.views.CrystalFieldView;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/cff;", "La/yx5;", "La/aif;", "<init>", "()V", "a/qud", "crystal"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cff extends yx5 implements aif {
    public final i9o0 K1;
    public final s0r L1;
    public final n0o0 M1;
    public pdi N1;
    public final kiu0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(cff.class, "binding", "getBinding()Lorg/xplatform/crystal/databinding/CrystalFragmentBinding;", 0)};
    public static final qud P1 = new qud();

    public cff() {
        super(R.layout.crystal_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, bff.f2498a);
        final byte b = 0;
        this.M1 = maz.b(new Function0(this) { // from class: a.aff
            public final /* synthetic */ cff b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                cff cffVar = this.b;
                switch (b2) {
                    case 0:
                        qud qudVar = cff.P1;
                        Fragment fragment = cffVar.y;
                        yef yefVar = fragment instanceof yef ? (yef) fragment : null;
                        if (yefVar != null) {
                            return (qdi) yefVar.W1.getValue();
                        }
                        return null;
                    default:
                        qud qudVar2 = cff.P1;
                        i1w0 i1w0VarF = a4n0.f(cffVar);
                        pdi pdiVar = cffVar.N1;
                        if (pdiVar != null) {
                            return new ry3(i1w0VarF, pdiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        Function0 function0 = new Function0(this) { // from class: a.aff
            public final /* synthetic */ cff b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                cff cffVar = this.b;
                switch (b3) {
                    case 0:
                        qud qudVar = cff.P1;
                        Fragment fragment = cffVar.y;
                        yef yefVar = fragment instanceof yef ? (yef) fragment : null;
                        if (yefVar != null) {
                            return (qdi) yefVar.W1.getValue();
                        }
                        return null;
                    default:
                        qud qudVar2 = cff.P1;
                        i1w0 i1w0VarF = a4n0.f(cffVar);
                        pdi pdiVar = cffVar.N1;
                        if (pdiVar != null) {
                            return new ry3(i1w0VarF, pdiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 18), (byte) 19));
        this.O1 = agc.G(this, sre0.f32672a.b(wff.class), new cce(a8zVarA, (byte) 18), new cce(a8zVarA, (byte) 19), function0);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setUpdateInterface(this);
        wff wffVar = (wff) this.O1.getValue();
        lgf lgfVar = wffVar.c.f45104a.c.f9489a;
        if (lgfVar.equals(lgf.h)) {
            return;
        }
        wffVar.x(new rff(lgfVar, wffVar.h.a().a()));
    }

    @Override // a.yx5
    public final void C0() {
        qdi qdiVar = (qdi) this.M1.getValue();
        if (qdiVar != null) {
            this.N1 = (pdi) qdiVar.k0.get();
        }
    }

    public final zef G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (zef) objN;
    }

    public final void H0() {
        wff wffVar = (wff) this.O1.getValue();
        sac.V(jiu0.a(wffVar), new x6f(1, wffVar, wff.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, wffVar.i.f22085a, new fze(wffVar, null), 10);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.f46475a = null;
        CrystalFieldView crystalFieldView = G0().b;
        AnimatorSet animatorSet = crystalFieldView.h;
        if (animatorSet != null && animatorSet.isStarted()) {
            AnimatorSet animatorSet2 = crystalFieldView.h;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = crystalFieldView.h;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        ValueAnimator valueAnimator = crystalFieldView.i;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            ValueAnimator valueAnimator2 = crystalFieldView.i;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = crystalFieldView.i;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        itb itbVarV = xkb.V(((wff) this.O1.getValue()).n);
        fob fobVar = new fob(this, null, (byte) 22);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fze(itbVarV, clzVarW, fobVar, (yje) null), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
