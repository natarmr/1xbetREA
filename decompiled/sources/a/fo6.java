package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fo6;", "La/yx5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fo6 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final kiu0 M1;
    public final s0r N1;
    public z7z O1;
    public cge0 P1;
    public lgn0 Q1;
    public xi70 R1;
    public wdk0 S1;
    public final hnm0 U1;
    public final a8z V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(fo6.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/BetConstructorBetsFragmentBinding;", 0)};
    public static final kj5 W1 = new kj5();

    public fo6() {
        super(R.layout.bet_constructor_bets_fragment);
        zn6 zn6Var = new zn6(this, (byte) 0);
        p46 p46Var = new p46(this, (byte) 3);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new p46(p46Var, (byte) 4));
        this.M1 = agc.G(this, sre0.f32672a.b(po6.class), new qw4(a8zVarA, (byte) 22), new qw4(a8zVarA, (byte) 23), zn6Var);
        this.N1 = ltt0.o(this, co6.f4685a);
        this.U1 = hnm0.f13359a;
        this.V1 = maz.a(wezVar, new zn6(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().e.b(new zn6(this, (byte) 3));
        byte b = 0;
        dyb.O(G0().c, new ao6(this, b));
        ccq0.V(this, "REQUEST_BALANCE_ERROR_DIALOG_KEY", new pw4(0, H0(), po6.class, "onInsufficientFundsDialogPositiveButtonClicked", "onInsufficientFundsDialogPositiveButtonClicked()V", 0, (byte) 6));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new zn6(this, (byte) 2));
        vcc.g0(this, "REQUEST_TEAM_ACTION_KEY", new bo6(this, (byte) 1));
        G0().g.setNestedScrollingEnabled(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(D(), 6);
        gridLayoutManager.m1 = new eo6(this, b);
        G0().g.setLayoutManager(gridLayoutManager);
        G0().g.setAdapter((xv6) this.V1.getValue());
        RecyclerView recyclerView = G0().g;
        Context context = G0().g.getContext();
        context.getClass();
        recyclerView.m(new yrh(context, (byte) 1));
        G0().g.setClipToPadding(false);
        knm0.i(G0().g, true);
        po6 po6VarH0 = H0();
        if (po6VarH0.G.f25751a.a() && po6VarH0.M) {
            jg7 jg7Var = (jg7) po6VarH0.U.getValue();
            po6VarH0.M = true;
            po6VarH0.E.d(new qo5(po6VarH0, jg7Var, (byte) 16));
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yn6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yn6 yn6Var = (yn6) (ze3Var instanceof yn6 ? ze3Var : null);
            if (yn6Var != null) {
                g7i g7iVarA = yn6Var.a(a4n0.f(this));
                this.K1 = g7iVarA.e();
                this.L1 = (ii) g7iVarA.G;
                this.O1 = mbl.a((zix) g7iVarA.J);
                this.P1 = new cge0((byte) 6);
                this.Q1 = (lgn0) g7iVarA.H;
                this.R1 = ((rmd0) g7iVarA.r).f();
                this.S1 = (wdk0) g7iVarA.I;
                return;
            }
        }
        jf4.n(b1j.i(yn6.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().R;
        yje yjeVar = null;
        do6 do6Var = new do6(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new td6(p7m0Var, clzVarW, do6Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().T;
        do6 do6Var2 = new do6(this, yjeVar, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new td6(p7m0Var2, clzVarW2, do6Var2, (yje) null, 0), 3);
        p7m0 p7m0Var3 = H0().S;
        do6 do6Var3 = new do6(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new td6((gmq) p7m0Var3, clzVarW3, do6Var3, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().V;
        do6 do6Var4 = new do6(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new td6((gmq) ol60Var, clzVarW4, do6Var4, (yje) null, (char) 0), 3);
    }

    public final xn6 G0() {
        Object objN = this.N1.n(X1[0], this);
        objN.getClass();
        return (xn6) objN;
    }

    public final po6 H0() {
        return (po6) this.M1.getValue();
    }

    public final void I0(boolean z) {
        G0().b.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        v3c.N(H0().O);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        c4m0 c4m0Var;
        super.e0();
        po6 po6VarH0 = H0();
        p7m0 p7m0Var = po6VarH0.R;
        if ((p7m0Var.getValue() instanceof xv7) || (p7m0Var.getValue() instanceof vv7) || (c4m0Var = po6VarH0.O) == null || !c4m0Var.isCancelled() || !po6VarH0.N) {
            return;
        }
        po6VarH0.O = sac.T(bkb.h0(30L, TimeUnit.SECONDS, new no6(po6VarH0, null)), jiu0.a(po6VarH0), new mo6(po6VarH0, null, (byte) 4));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.U1;
    }
}
