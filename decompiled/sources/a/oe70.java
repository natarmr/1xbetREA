package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/oe70;", "La/yx5;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oe70 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(oe70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/OnexGameBalanceFragmentBinding;", 0)};
    public final i9o0 K1;
    public u6i L1;
    public ii M1;
    public peg0 N1;
    public final s0r O1;
    public final kiu0 P1;

    public oe70() {
        super(R.layout.onex_game_balance_fragment);
        this.K1 = i9o0.f14396a;
        this.O1 = ltt0.o(this, me70.f21631a);
        le70 le70Var = new le70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ej50(this, (byte) 24), (byte) 25));
        this.P1 = agc.G(this, sre0.f32672a.b(qf70.class), new co60(a8zVarA, (byte) 20), new co60(a8zVarA, (byte) 21), le70Var);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        bn70 bn70Var = fragment instanceof bn70 ? (bn70) fragment : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.q(this);
    }

    public final pe70 G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (pe70) objN;
    }

    public final qf70 H0() {
        return (qf70) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        e3c.n(H0().O);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        H0().H = false;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        qf70 qf70VarH0 = H0();
        qf70VarH0.H = true;
        if (qf70VarH0.I) {
            qf70VarH0.I = false;
            return;
        }
        if (qf70VarH0.E.f42064a != s470.LUCKY_WHEEL) {
            return;
        }
        sac.V(jiu0.a(qf70VarH0), new cf70(1, qf70VarH0, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, qf70VarH0.v.b, new ef70(qf70VarH0, null, (byte) 3), 10);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        qf70 qf70VarH0 = H0();
        Class<qf70> cls = qf70.class;
        yje yjeVar = null;
        sac.V(jiu0.a(qf70VarH0), new cf70(1, qf70VarH0, cls, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, qf70VarH0.v.b, new xj1((diu0) qf70VarH0, yjeVar, (byte) 18), 10);
        byte b = 1;
        G0().c.setOnReplenishClickListener(new le70(this, b));
        G0().c.setOnBalanceClickListener(new le70(this, (byte) 2));
        p7m0 p7m0Var = H0().J;
        ne70 ne70Var = new ne70(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(p7m0Var, clzVarW, ne70Var, (yje) null), 3);
        itb itbVarV = xkb.V(H0().K);
        ne70 ne70Var2 = new ne70(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(itbVarV, clzVarW2, ne70Var2, (yje) null), 3);
        ccq0.V(this, "CHANGE_BONUS_ACCOUNT_TO_PRIMARY_REQUEST_KEY", new le70(this, (byte) 5));
        sj3.r0(this, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", new cd60((Object) this, (byte) 17));
        ccq0.T(this, "CHANGE_ACCOUNT_REQUEST_KEY", new le70(this, (byte) 3));
        ccq0.V(this, "CHANGE_ACCOUNT_REQUEST_KEY", new le70(this, (byte) 4));
        qf70 qf70VarH1 = H0();
        sac.V(jiu0.a(qf70VarH1), new cf70(1, qf70VarH1, cls, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, qf70VarH1.v.f22085a, new ef70(qf70VarH1, yjeVar, b), 10);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
