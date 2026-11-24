package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ej5;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ej5 extends yx5 {
    public final hnm0 K1;
    public l9i L1;
    public rek0 M1;
    public ii N1;
    public wdk0 O1;
    public String P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final n0o0 S1;
    public final n0o0 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(ej5.class, "binding", "getBinding()Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentBalanceManagementBinding;", 0)};
    public static final bj5 V1 = new bj5();

    public ej5() {
        super(R.layout.fragment_balance_management);
        this.K1 = hnm0.f13359a;
        this.P1 = "";
        zi5 zi5Var = new zi5(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 17), (byte) 18));
        this.Q1 = agc.G(this, sre0.f32672a.b(dk5.class), new qw4(a8zVarA, (byte) 6), new qw4(a8zVarA, (byte) 7), zi5Var);
        this.R1 = ltt0.o(this, cj5.f4442a);
        this.S1 = maz.b(new zi5(this, (byte) 2));
        this.U1 = maz.b(new zi5(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.setButtonIconRes(R.drawable.ic_glyph_chevron_right_small);
        G0().b.a((ub3) this.S1.getValue());
        G0().b.a((ub3) this.U1.getValue());
        mc50.a(G0().g, new zi5(this, (byte) 4));
        final byte b = 1;
        G0().c.setButtonClickListener(new q10(this, b));
        final byte b2 = 0;
        dyb.c0(G0().h, new Function1(this) { // from class: a.aj5
            public final /* synthetic */ ej5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                ej5 ej5Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        bj5 bj5Var = ej5.V1;
                        view.getClass();
                        ej5Var.H0().M(true);
                        break;
                    default:
                        bj5 bj5Var2 = ej5.V1;
                        view.getClass();
                        ej5Var.H0().M(false);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.c0(G0().i, new Function1(this) { // from class: a.aj5
            public final /* synthetic */ ej5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                ej5 ej5Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        bj5 bj5Var = ej5.V1;
                        view.getClass();
                        ej5Var.H0().M(true);
                        break;
                    default:
                        bj5 bj5Var2 = ej5.V1;
                        view.getClass();
                        ej5Var.H0().M(false);
                        break;
                }
                return Unit.f46060a;
            }
        });
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        String name = ej5.class.getName();
        List listP = eVarC.c.p();
        ArrayList<Fragment> arrayListU = twn.u(listP);
        for (Object obj : listP) {
            Fragment fragment = (Fragment) obj;
            if (!fragment.O() && !Intrinsics.d(fragment.B, name)) {
                arrayListU.add(obj);
            }
        }
        Fragment fragmentJ = eVarC.J(name);
        if (!arrayListU.isEmpty() || fragmentJ == null || !fragmentJ.S()) {
            zb5 zb5Var = new zb5(eVarC);
            zb5Var.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
            if (fragmentJ == null) {
                if (this.M1 == null) {
                    Intrinsics.h("contentFactory");
                    throw null;
                }
                ii5.O1.getClass();
                zb5Var.k(R.id.fragmentContainer, new ii5(), name, 1);
            } else if (!fragmentJ.S() || fragmentJ.O()) {
                zb5Var.q(fragmentJ, lkz.e);
                zb5Var.r(fragmentJ);
            }
            for (Fragment fragment2 : arrayListU) {
                zb5Var.q(fragment2, lkz.d);
                zb5Var.m(fragment2);
            }
            zb5Var.h();
        }
        ccq0.V(this, "PAYMENT_ERROR_DIALOG_REQUEST_KEY", new zi5(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ti5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ti5)) {
                ze3Var = null;
            }
            ti5 ti5Var = (ti5) ze3Var;
            if (ti5Var != null) {
                n9i n9iVarA = ti5.a(ti5Var, null, false, this.P1, 7);
                this.L1 = (l9i) n9iVarA.J.get();
                this.M1 = new rek0((byte) 29);
                this.N1 = n9iVarA.F;
                this.O1 = n9iVarA.G;
                return;
            }
        }
        jf4.n(b1j.i(ti5.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().c0);
        Class<ej5> cls = ej5.class;
        vp3 vp3Var = new vp3(2, this, cls, "applyAppBarState", "applyAppBarState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementAppBarUiState;)V", 4, (byte) 16);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        yje yjeVar = null;
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(xae0VarN, clzVarW, vp3Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN2 = vtb.N(H0().e0);
        int i = 4;
        vp3 vp3Var2 = new vp3(2, this, cls, "applyPaymentButtonsState", "applyPaymentButtonsState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementPaymentButtonsUiState;)V", i, (byte) 17);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new me5(xae0VarN2, clzVarW2, vp3Var2, (yje) null, (char) 0), 3);
        xae0 xae0VarN3 = vtb.N(H0().f0);
        vp3 vp3Var3 = new vp3(2, this, cls, "applyShimmersState", "applyShimmersState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementShimmersState;)V", i, (byte) 18);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new me5(xae0VarN3, clzVarW3, vp3Var3, (yje) null, 0), 3);
        p7m0 p7m0Var = H0().d0;
        dj5 dj5Var = new dj5(this, yjeVar, (byte) 1);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new me5(p7m0Var, clzVarW4, dj5Var, (yje) null), 3);
        ol60 ol60Var = H0().b0;
        dj5 dj5Var2 = new dj5(this, yjeVar, (byte) 2);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new me5(ol60Var, clzVarW5, dj5Var2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN4 = vtb.N(H0().Z);
        qv3 qv3Var = new qv3(this, yjeVar, (byte) 8);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new me5(xae0VarN4, clzVarW6, qv3Var, (yje) null), 3);
        xae0 xae0VarN5 = vtb.N(H0().a0);
        dj5 dj5Var3 = new dj5(this, yjeVar, (byte) 0);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new me5(xae0VarN5, clzVarW7, dj5Var3, (yje) null), 3);
    }

    public final gyq G0() {
        Object objN = this.R1.n(W1[0], this);
        objN.getClass();
        return (gyq) objN;
    }

    public final dk5 H0() {
        return (dk5) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.f((ub3) this.S1.getValue());
        G0().b.f((ub3) this.U1.getValue());
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().x();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
