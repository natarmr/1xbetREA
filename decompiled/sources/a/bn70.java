package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/bn70;", "La/yx5;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class bn70 extends yx5 {
    public static final /* synthetic */ iiy[] S1 = {new ez40(bn70.class, "bonus", "getBonus()Lorg/xplatform/games_section/api/models/GameBonus;", 0), new j0d0(bn70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/OnexGameHolderFragmentBinding;", 0)};
    public final e9o0 K1;
    public h5t L1;
    public final hnm0 M1;
    public ii N1;
    public final yzn0 O1;
    public final s0r P1;
    public int Q1;
    public ma3 R1;

    public bn70() {
        super(R.layout.onex_game_holder_fragment);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticBlack, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        this.M1 = hnm0.f13359a;
        this.O1 = new yzn0("lucky_wheel_bonus");
        this.P1 = ltt0.o(this, ym70.f42874a);
    }

    public void G0(boolean z) {
        hg70.P1.getClass();
        hg70 hg70Var = new hg70();
        hg70Var.O1.v(hg70Var, hg70.Q1[1], z);
        I0(R.id.onex_holder_menu_container, hg70Var);
    }

    public void H0() {
        I0(R.id.onex_holder_end_game_container, new ok70());
    }

    public final void I0(int i, Fragment fragment) {
        fragment.getClass();
        String simpleName = fragment.getClass().getSimpleName();
        if (C().J(simpleName) != null) {
            return;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        zb5 zb5Var = new zb5(eVarC);
        zb5Var.o(i, fragment, simpleName);
        zb5Var.f();
    }

    public void J0() {
        eo60.O1.getClass();
        I0(R.id.onex_holder_game_title_container, new eo60());
    }

    public final ii K0() {
        ii iiVar = this.N1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final zk70 L0() {
        Object objN = this.P1.n(S1[1], this);
        objN.getClass();
        return (zk70) objN;
    }

    public abstract Fragment M0();

    public abstract void N0(AppCompatImageView appCompatImageView);

    public void O0(AppCompatImageView appCompatImageView, km60 km60Var) {
        if (km60Var == null) {
            N0(appCompatImageView);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: P0, reason: from getter and merged with bridge method [inline-methods] */
    public e9o0 z0() {
        return this.K1;
    }

    public abstract to70 Q0();

    public final void R0() {
        L0().d.setVisibility(8);
    }

    public final void S0(csr csrVar) {
        csrVar.getClass();
        this.O1.u(this, S1[0], csrVar);
    }

    public final void T0(boolean z) {
        L0().g.setVisibility(z ? 0 : 8);
        if (z) {
            R0();
        }
    }

    public final void U0(boolean z) {
        L0().f.setVisibility(z ? 0 : 8);
    }

    public final void V0(boolean z) {
        L0().i.setVisibility(z ? 0 : 8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "HOLDER_TECHNICAL_WORKS_DIALOG_REQUEST_KEY", new xm70(this, (byte) 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        F().f("OneXGames.BONUS_NOT_USED_RESULT_KEY");
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ma3 ma3Var = this.R1;
            if (ma3Var != null) {
                n0().getWindow().getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(ma3Var);
            }
            this.R1 = null;
        }
        if (i >= 30) {
            n0().getWindow().setSoftInputMode(this.Q1);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Object next;
        this.j1 = true;
        if (Build.VERSION.SDK_INT >= 33) {
            ma3 ma3Var = this.R1;
            if (ma3Var != null) {
                n0().getWindow().getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(ma3Var);
            }
            this.R1 = null;
        }
        List listP = F().c.p();
        listP.getClass();
        Iterator it = listP.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d((Fragment) next, this));
        if (next == null) {
            to70 to70VarQ0 = Q0();
            if (to70VarQ0.x()) {
                to70VarQ0.F(ho70.f13381a);
            }
        }
        to70 to70VarQ1 = Q0();
        if (to70VarQ1.l.a() != vrs.f37917a) {
            to70VarQ1.C.a(false);
        }
        bby bbyVar = to70VarQ1.S;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        p7m0 p7m0Var = to70VarQ1.V;
        Boolean bool = Boolean.FALSE;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        c4m0 c4m0Var = to70VarQ1.R;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        n0().getWindow().clearFlags(128);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        Object value;
        super.e0();
        to70 to70VarQ0 = Q0();
        y5s y5sVar = to70VarQ0.z;
        if (y5sVar.f42064a.a() != to70VarQ0.M.f33685a.f26724a.z.f42064a.a()) {
            jqc jqcVar = to70VarQ0.L;
            jqcVar.getClass();
            j5t j5tVar = jqcVar.f16943a.f26724a;
            j5tVar.getClass();
            j5tVar.z = y5sVar;
            j5t.a(y5sVar, "gameConfig");
        }
        to70VarQ0.H();
        p7m0 p7m0Var = to70VarQ0.V;
        Boolean bool = Boolean.TRUE;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        oqt oqtVar = to70VarQ0.i;
        vcu vcuVar = to70VarQ0.l;
        boolean z = false;
        boolean z2 = vcuVar.a() == vrs.b;
        boolean z3 = vcuVar.a() == vrs.c;
        if (y5sVar.e && !to70VarQ0.n.a().f4905a.f3145a.a()) {
            z = true;
        }
        if ((y5sVar.b && z2 && oqtVar.a()) || (z && !z3)) {
            p7m0 p7m0Var2 = to70VarQ0.Y;
            do {
                value = p7m0Var2.getValue();
                ((kn70) value).getClass();
            } while (!p7m0Var2.m(value, new kn70(true)));
        }
        if (z3 && !oqtVar.a()) {
            to70VarQ0.G(true);
        }
        n0().getWindow().addFlags(128);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        byte b = 5;
        qcc.X(this, new xm70(this, b));
        to70 to70VarQ0 = Q0();
        byte b2 = 0;
        csr csrVar = (csr) this.O1.n(this, S1[0]);
        to70VarQ0.getClass();
        to70VarQ0.Q = csrVar;
        R0();
        Q0().I();
        to70 to70VarQ1 = Q0();
        to70VarQ1.q.f8096a.f26724a.s = to70VarQ1.z.b;
        Q0().B(o0());
        knm0.h(L0().h, false);
        knm0.h(L0().b, false);
        to70 to70VarQ2 = Q0();
        to70VarQ2.F(new tn70(to70VarQ2.z.f42064a));
        to70 to70VarQ3 = Q0();
        y5s y5sVar = to70VarQ3.z;
        if (!y5sVar.g || y5sVar.c) {
            to70VarQ3.F(new rn70(y5sVar.e));
        } else {
            to70VarQ3.F(sn70.f32480a);
        }
        byte b3 = 3;
        C().k0(new vr3(this, b3), false);
        I0(R.id.onex_holder_balance_container, new oe70());
        J0();
        I0(R.id.onex_holder_game_container, M0());
        H0();
        I0(R.id.onex_holder_bonus_free_game_container, new wn60());
        U0(false);
        p7m0 p7m0Var = Q0().Y;
        yje yjeVar = null;
        an70 an70Var = new an70(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zm70(p7m0Var, clzVarW, an70Var, (yje) null), 3);
        p7m0 p7m0Var2 = Q0().Z;
        an70 an70Var2 = new an70(this, yjeVar, b3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zm70((gmq) p7m0Var2, clzVarW2, an70Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = Q0().W;
        byte b4 = 4;
        an70 an70Var3 = new an70(this, yjeVar, b4);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zm70((gmq) p7m0Var3, clzVarW3, an70Var3, (yje) null, (char) 0), 3);
        p7m0 p7m0Var4 = Q0().b0;
        an70 an70Var4 = new an70(this, yjeVar, b);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zm70(p7m0Var4, clzVarW4, an70Var4, (yje) null, 0), 3);
        ol60 ol60Var = Q0().a0;
        an70 an70Var5 = new an70(this, yjeVar, b2);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new az60(ol60Var, clzVarW5, an70Var5, (yje) null), 3);
        itb itbVarV = xkb.V(Q0().X);
        an70 an70Var6 = new an70(this, yjeVar, (byte) 1);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new zm70(itbVarV, clzVarW6, an70Var6, (yje) null), 3);
        vcc.g0(this, "REQUEST_SELECT_BONUS_KEY", new ds60(this, (byte) 13));
        ccq0.V(this, "ONE_X_GAME_HOLDER_ERROR", new xm70(this, (byte) 8));
        int i = 0;
        Class<to70> cls = to70.class;
        ccq0.V(this, "REQUEST_DIALOG_ERROR_KEY", new cz60(i, Q0(), cls, "warningDialogCanceled", "warningDialogCanceled$core()V", 0, (byte) 3));
        ccq0.V(this, "INSUFFICIENT_DIALOG_ERROR_KEY", new xm70(this, (byte) 7));
        ccq0.V(this, "NOT_ENOUGH_FUNDS", new cz60(0, Q0(), cls, "notEnoughFundsDialogResultOk", "notEnoughFundsDialogResultOk$core()V", 0, (byte) 4));
        ccq0.T(this, "NOT_ENOUGH_FUNDS", new xm70(this, b3));
        C().u0("GameIsNotFinishedDialog.REQUEST_KEY", this, new ex60(this, b4));
        ccq0.V(this, "UNFINISHED_GAME_DIALOG_RESULT", new xm70(this, (byte) 9));
        ccq0.V(this, "CHANGE_ACCOUNT_TO_PRIMARY_REQUEST_KEY", new xm70(this, b2));
        ccq0.V(this, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY", new xm70(this, b4));
        L0().j.setOnCloseListener(new xm70(this, (byte) 10));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.Q1 = n0().getWindow().getAttributes().softInputMode;
            n0().getWindow().setSoftInputMode(48);
        }
        if (i2 < 30) {
            return;
        }
        ConstraintLayout constraintLayout = L0().c;
        FrameLayout frameLayout = L0().h;
        dq00 dq00Var = new dq00((Object) constraintLayout, (Object) this, (byte) 11);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(frameLayout, dq00Var);
    }

    @Override // a.yx5
    public jnm0 y0() {
        return this.M1;
    }
}
