package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/rye;", "La/yx5;", "La/km7;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rye extends yx5 implements km7 {
    public ldi K1;
    public ii L1;
    public lgn0 M1;
    public wdk0 N1;
    public ynb O1;
    public final s0r P1;
    public final kiu0 Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(rye.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponAutoBetDsBinding;", 0)};
    public static final kwd S1 = new kwd();

    public rye() {
        super(R.layout.coupon_auto_bet_ds);
        this.P1 = ltt0.o(this, nye.f24326a);
        aqe aqeVar = new aqe(new jwd(this, (byte) 11), (byte) 5);
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 6), (byte) 7));
        this.Q1 = agc.G(this, sre0.f32672a.b(h620.class), new cce(a8zVarA, (byte) 8), new cce(a8zVarA, (byte) 9), aqeVar);
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setChangeBalanceClickListener(new mye(this, (byte) 0));
        G0().b.setAddDepositClickListener(new oye(0, H0(), h620.class, "onAddDepositClick", "onAddDepositClick()V", 0, (byte) 0));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new oye(0, H0(), h620.class, "onMakeBetClickApproved", "onMakeBetClickApproved()V", 0, (byte) 1));
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new oye(0, H0(), h620.class, "onInsufficientFundsAddDepositClick", "onInsufficientFundsAddDepositClick()V", 0, (byte) 2));
        BetInputView betInputView = G0().e;
        betInputView.setPlusButtonClickListener(new oye(0, H0(), h620.class, "onStepUpClick", "onStepUpClick()V", 0, (byte) 3));
        betInputView.setMinusButtonClickListener(new oye(0, H0(), h620.class, "onStepDownClick", "onStepDownClick()V", 0, (byte) 4));
        td7 td7Var = new td7(new ry2(new mhc(2, H0(), h620.class, "onCoefChange", "onCoefChange(Ljava/lang/String;Z)V", 0, (byte) 14), betInputView, new sd7(13, 3), (byte) 20));
        betInputView.s = td7Var;
        ((DsTextField) betInputView.r.d).a(td7Var);
        betInputView.setIsNeedClearText(false);
        BetInputView betInputView2 = G0().d;
        betInputView2.setFormatParams(new sd7(13, 2));
        betInputView2.setAfterTextChangedListener(new z6e(1, H0(), h620.class, "onBetSumChange", "onBetSumChange(Ljava/lang/String;)V", 0, (byte) 21));
        betInputView2.setOnMakeBetButtonClickListener(new yw9(this, betInputView2, (byte) 27));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sye.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sye syeVar = (sye) (ze3Var instanceof sye ? ze3Var : null);
            if (syeVar != null) {
                mdi mdiVarA = syeVar.a(a4n0.f(this), true);
                this.K1 = (ldi) mdiVarA.t.get();
                this.L1 = (ii) mdiVarA.Y;
                this.M1 = (lgn0) mdiVarA.Z;
                this.N1 = (wdk0) mdiVarA.b0;
                ynb ynbVarI = ((yzn0) ((peg0) mdiVarA.a0).b).i();
                x1x.x(ynbVarI);
                this.O1 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(sye.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().W);
        pye pyeVar = new pye(this, null, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zpe(xae0VarN, clzVarW, pyeVar, (yje) null, (byte) 0), 3);
        vae0 vae0VarM = vtb.M(H0().U);
        wib wibVar = new wib(this, null, (byte) 12);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zpe(vae0VarM, clzVarW2, wibVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().q0);
        pye pyeVar2 = new pye(this, null, (byte) 0);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zpe(xae0VarN2, clzVarW3, pyeVar2, (yje) null), 3);
        xae0 xae0VarN3 = vtb.N(H0().V);
        pye pyeVar3 = new pye(this, null, (byte) 6);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zpe(xae0VarN3, clzVarW4, pyeVar3, (yje) null, (short) 0), 3);
        ol60 ol60Var = H0().f0;
        pye pyeVar4 = new pye(this, null, (byte) 4);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new zpe(ol60Var, clzVarW5, pyeVar4, (yje) null), 3);
        h620 h620VarH0 = H0();
        p6d p6dVar = new p6d(h620VarH0.h0, h620VarH0.i0, new wx4(h620VarH0, (yje) null, (byte) 20), (byte) 1);
        pye pyeVar5 = new pye(this, null, (byte) 3);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new zpe(p6dVar, clzVarW6, pyeVar5, (yje) null), 3);
        xae0 xae0VarN4 = vtb.N(H0().j0);
        pye pyeVar6 = new pye(this, null, (byte) 8);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new zpe(xae0VarN4, clzVarW7, pyeVar6, (yje) null, (byte) 0, (byte) 0), 3);
        xae0 xae0VarN5 = vtb.N(H0().l0);
        pye pyeVar7 = new pye(this, null, (byte) 7);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new zpe(xae0VarN5, clzVarW8, pyeVar7, (yje) null, (byte) 0, false), 3);
        xae0 xae0VarN6 = vtb.N(H0().m0);
        pye pyeVar8 = new pye(this, null, (byte) 5);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new zpe(xae0VarN6, clzVarW9, pyeVar8, (yje) null, 0), 3);
        xae0 xae0VarN7 = vtb.N(H0().n0);
        pye pyeVar9 = new pye(this, null, (byte) 2);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new zpe(xae0VarN7, clzVarW10, pyeVar9, (yje) null, (char) 0), 3);
    }

    public final wre G0() {
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        return (wre) objN;
    }

    public final h620 H0() {
        return (h620) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.w();
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        c4m0 c4m0Var = H0().b0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        h620 h620VarH0 = H0();
        c4m0 c4m0Var = h620VarH0.b0;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            h620VarH0.b0 = sac.T(dub.d0(new p6d(h620VarH0.h0, h620VarH0.i0, new qos(3, yjeVar, (byte) 14), (byte) 1), h620VarH0.j.b(), h620VarH0.g0, h620VarH0.u.b(), h620VarH0.H.a(), new f620(h620VarH0, null)), jiu0.a(h620VarH0), new sax(2, null, (byte) 12));
        }
        sac.V(jiu0.a(h620VarH0), s520.f31635a, null, null, new wn2(h620VarH0, null, (byte) 17), 14);
    }

    @Override // a.km7
    public final void l() {
        h620 h620VarH0 = H0();
        sac.V(jiu0.a(h620VarH0), new p610((byte) 28), null, h620VarH0.c.b, new z520(h620VarH0, null, (byte) 1), 10);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }
}
