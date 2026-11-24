package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/er6;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class er6 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;
    public poq0 O1;
    public ii P1;
    public wdk0 Q1;
    public k4f R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(er6.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/BetConstructorGamesFragmentBinding;", 0)};
    public static final kl5 S1 = new kl5();

    public er6() {
        super(R.layout.bet_constructor_games_fragment);
        this.K1 = hnm0.f13359a;
        br6 br6Var = new br6(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 7), (byte) 8));
        this.M1 = agc.G(this, sre0.f32672a.b(as6.class), new qw4(a8zVarA, (byte) 26), new qw4(a8zVarA, (byte) 27), br6Var);
        this.N1 = ltt0.o(this, cr6.f4827a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().g.b(new br6(this, (byte) 1));
        dyb.O(G0().b, new os5(this, (byte) 13));
        knm0.i(G0().d, false);
        yj5 yj5Var = new yj5(1, H0(), as6.class, "onTabSelected", "onTabSelected(I)V", 0, (byte) 28);
        k4f k4fVar = new k4f();
        ((dp) k4fVar.e).b(new gbn(new jak0((byte) 17), new asj0(3, (byte) 6), new j1l0(yj5Var, (byte) 2), wjj0.m));
        this.R1 = k4fVar;
        G0().h.setAdapter(this.R1);
        vcc.g0(this, "REQUEST_TEAM_SELECTOR_KEY", new fa2((Object) this, (byte) 25));
        ccq0.V(this, "REQUEST_KEY_EXIT", new pw4(0, H0(), as6.class, "onExitConfirmed", "onExitConfirmed()V", 0, (byte) 7));
        as6 as6VarH0 = H0();
        if (!as6VarH0.B) {
            as6VarH0.A();
            as6VarH0.w();
        }
        qcc.W(this, this, new pw4(0, H0(), as6.class, "onBackPressed", "onBackPressed()V", 0, (byte) 8));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ar6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ar6 ar6Var = (ar6) (ze3Var instanceof ar6 ? ze3Var : null);
            if (ar6Var != null) {
                v9i v9iVarA = ar6Var.a(a4n0.f(this));
                this.L1 = v9iVarA.e();
                this.O1 = (poq0) v9iVarA.n;
                this.P1 = (ii) v9iVarA.v;
                this.Q1 = (wdk0) v9iVarA.w;
                return;
            }
        }
        jf4.n(b1j.i(ar6.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().D;
        yje yjeVar = null;
        dr6 dr6Var = new dr6(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new td6(p7m0Var, clzVarW, dr6Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().E;
        dr6 dr6Var2 = new dr6(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new td6(p7m0Var2, clzVarW2, dr6Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().F;
        dr6 dr6Var3 = new dr6(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new td6((gmq) ol60Var, clzVarW3, dr6Var3, (yje) null, (char) 0), 3);
    }

    public final zq6 G0() {
        Object objN = this.N1.n(U1[0], this);
        objN.getClass();
        return (zq6) objN;
    }

    public final as6 H0() {
        return (as6) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().h.setAdapter(null);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        as6 as6VarH0 = H0();
        if (as6VarH0.n.f27342a.d().r(fk60.BET_CONSCTRUCTOR)) {
            as6VarH0.F.f(yct.f42398a);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
