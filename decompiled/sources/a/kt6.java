package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kt6;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kt6 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public wdk0 M1;
    public lgn0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(kt6.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/PromoTabFragmentBinding;", 0)};
    public static final bj5 Q1 = new bj5();

    public kt6() {
        super(R.layout.promo_tab_fragment);
        gt6 gt6Var = new gt6(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 9), (byte) 10));
        this.O1 = agc.G(this, sre0.f32672a.b(y920.class), new qw4(a8zVarA, (byte) 28), new qw4(a8zVarA, (byte) 29), gt6Var);
        this.P1 = ltt0.o(this, ht6.f13618a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setEnabled(false);
        dyb.O(G0().b, new os5(this, (byte) 14));
        G0().c.a(new jt6(this, (byte) 0));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new gt6(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v720.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v720 v720Var = (v720) (ze3Var instanceof v720 ? ze3Var : null);
            if (v720Var != null) {
                zki zkiVarA = v720Var.a(a4n0.f(this));
                this.K1 = zkiVarA.d();
                this.L1 = zkiVarA.H;
                this.M1 = zkiVarA.s;
                this.N1 = zkiVarA.J;
                return;
            }
        }
        jf4.n(b1j.i(v720.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().l);
        yje yjeVar = null;
        it6 it6Var = new it6(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new td6(xae0VarN, clzVarW, it6Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().n);
        qv3 qv3Var = new qv3(this, yjeVar, (byte) 11);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new td6(xae0VarN2, clzVarW2, qv3Var, (yje) null), 3);
        gmq gmqVarS = sj3.S(H0().m, 100L);
        it6 it6Var2 = new it6(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new td6(gmqVarS, clzVarW3, it6Var2, (yje) null), 3);
    }

    public final ouc0 G0() {
        Object objN = this.P1.n(R1[0], this);
        objN.getClass();
        return (ouc0) objN;
    }

    public final y920 H0() {
        return (y920) this.O1.getValue();
    }
}
