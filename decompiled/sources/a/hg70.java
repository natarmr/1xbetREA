package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hg70;", "La/yx5;", "<init>", "()V", "a/evz", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hg70 extends yx5 {
    public final i9o0 K1;
    public b7i L1;
    public final s0r M1;
    public final kiu0 N1;
    public final cgx0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(hg70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/OnexGameBetHolderFragmentBinding;", 0), new ez40(hg70.class, "raiseGame", "getRaiseGame()Z", 0)};
    public static final evz P1 = new evz();

    public hg70() {
        super(R.layout.onex_game_bet_holder_fragment);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, fg70.f9480a);
        pu50 pu50Var = new pu50(this, (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 0), (byte) 1));
        this.N1 = agc.G(this, sre0.f32672a.b(rg70.class), new co60(a8zVarA, (byte) 26), new co60(a8zVarA, (byte) 27), pu50Var);
        this.O1 = new cgx0("RAISE_GAME_BUNDLE");
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        bn70 bn70Var = fragment instanceof bn70 ? (bn70) fragment : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.a(this);
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
        Object objN = this.M1.n(Q1[0], this);
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
        kiu0 kiu0Var = this.N1;
        itb itbVarV = xkb.V(((rg70) kiu0Var.getValue()).i);
        nf60 nf60Var = new nf60(this, null, (byte) 18);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(itbVarV, clzVarW, nf60Var, (yje) null), 3);
        rg70 rg70Var = (rg70) kiu0Var.getValue();
        rg70Var.w(new ig70(rg70Var.h, rg70Var.c.a() != vrs.b));
        rg70 rg70Var2 = (rg70) kiu0Var.getValue();
        rg70Var2.w(new og70(rg70Var2.d.a()));
        J0(true);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
