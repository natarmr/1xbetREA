package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qh70;", "La/yx5;", "<init>", "()V", "a/nh70", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qh70 extends yx5 {
    public final i9o0 K1;
    public n6i L1;
    public final kiu0 M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(qh70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/OnexGameBetHolderFragmentBinding;", 0)};
    public static final nh70 O1 = new nh70();

    public qh70() {
        super(R.layout.onex_game_bet_holder_fragment);
        this.K1 = i9o0.f14396a;
        pu50 pu50Var = new pu50(this, (byte) 27);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 4), (byte) 5));
        this.M1 = agc.G(this, sre0.f32672a.b(ai70.class), new ph70(a8zVarA, (byte) 0), new ph70(a8zVarA, (byte) 1), pu50Var);
        this.N1 = ltt0.o(this, oh70.f25254a);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVarO = sac.O(this);
        if (h5tVarO != null) {
            h5tVarO.b(this);
        }
    }

    public final void G0(yx5 yx5Var, int i) {
        String simpleName = yx5Var.getClass().getSimpleName();
        if (C().J(simpleName) != null) {
            return;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        zb5 zb5Var = new zb5(eVarC);
        zb5Var.o(i, yx5Var, simpleName);
        zb5Var.c(this.B);
        zb5Var.f();
    }

    public final eg70 H0() {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        return (eg70) objN;
    }

    public final void I0(boolean z) {
        if (!z) {
            H0().b.setVisibility(8);
        } else {
            if (H0().b.getVisibility() == 0) {
                return;
            }
            lwf.c(H0().b);
        }
    }

    public final void J0(boolean z) {
        H0().e.setVisibility(z ? 0 : 8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        kiu0 kiu0Var = this.M1;
        itb itbVarV = xkb.V(((ai70) kiu0Var.getValue()).i);
        nf60 nf60Var = new nf60(this, null, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(itbVarV, clzVarW, nf60Var, (yje) null, (byte) 0), 3);
        ai70 ai70Var = (ai70) kiu0Var.getValue();
        ai70Var.w(rh70.f30477a);
        ai70Var.w(new xh70(ai70Var.d.a()));
        boolean z = ai70Var.c.a() == vrs.f37917a && !ai70Var.g.a();
        ai70Var.w(new vh70(z));
        ai70Var.w(new yh70(z));
        J0(false);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
