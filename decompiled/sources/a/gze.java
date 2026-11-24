package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/gze;", "La/yx5;", "La/km7;", "<init>", "()V", "a/usd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gze extends yx5 implements km7 {
    public kdi K1;
    public ii L1;
    public lgn0 M1;
    public ynb N1;
    public wdk0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(gze.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponSimpleBetDsBinding;", 0)};
    public static final usd S1 = new usd();

    public gze() {
        super(R.layout.coupon_simple_bet_ds);
        aqe aqeVar = new aqe(new yye(this, (byte) 0), (byte) 10);
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 11), (byte) 12));
        this.P1 = agc.G(this, sre0.f32672a.b(qg20.class), new cce(a8zVarA, (byte) 12), new cce(a8zVarA, (byte) 13), aqeVar);
        this.Q1 = ltt0.o(this, cze.f5220a);
        this.R1 = true;
    }

    public static String H0(String str, en7 en7Var) {
        return String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{str, en7Var != null ? Integer.valueOf(en7Var.c) : null}, 2)) + (en7Var != null ? Integer.valueOf(en7Var.f8078a) : null);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        G0().j.setChangeBalanceClickListener(new bze(this, b));
        Class<qg20> cls = qg20.class;
        G0().j.setAddDepositClickListener(new oye(0, I0(), cls, "onAddDepositClick", "onAddDepositClick()V", 0, (byte) 5));
        BetInputView betInputView = G0().b;
        String strH = H(R.string.pf_input_sum_title);
        strH.getClass();
        betInputView.setPlaceholder(strH);
        int i = 0;
        int i2 = 0;
        betInputView.setPlusButtonClickListener(new oye(i2, I0(), cls, "onStepUpClick", "onStepUpClick()V", i, (byte) 7));
        betInputView.setMinusButtonClickListener(new oye(i2, I0(), cls, "onStepDownClick", "onStepDownClick()V", i, (byte) 8));
        final byte b2 = 2;
        betInputView.setFormatParams(new sd7(13, 2));
        betInputView.setAfterTextChangedListener(new z6e(1, I0(), qg20.class, "onStepInputChange", "onStepInputChange(Ljava/lang/String;)V", 0, (byte) 22));
        betInputView.setOnMakeBetButtonClickListener(new yw9(betInputView, this, (byte) 28));
        betInputView.setVisibilityStepButtons(false);
        ccq0.V(this, "REQUEST_KEY_CHANGE_TYPE_TO_SYSTEM", new yye(this, (byte) 5));
        ccq0.T(this, "REQUEST_KEY_CHANGE_TYPE_TO_SYSTEM", new yye(this, (byte) 6));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new yye(this, (byte) 3));
        ccq0.T(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new yye(this, (byte) 4));
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new oye(0, I0(), cls, "onInsufficientFundsAddDepositClick", "onInsufficientFundsAddDepositClick()V", i, (byte) 6));
        final byte b3 = 1;
        ccq0.V(this, "REQUEST_KEY_ADVANCE", new yye(this, (byte) 1));
        ccq0.T(this, "REQUEST_KEY_ADVANCE", new yye(this, (byte) 2));
        dyb.O(G0().g, new Function1(this) { // from class: a.zye
            public final /* synthetic */ gze b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                gze gzeVar = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        usd usdVar = gze.S1;
                        view.getClass();
                        gzeVar.I0().b0();
                        break;
                    case 1:
                        usd usdVar2 = gze.S1;
                        view.getClass();
                        gzeVar.I0().a0();
                        break;
                    default:
                        usd usdVar3 = gze.S1;
                        view.getClass();
                        gzeVar.I0().b0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(G0().g, new Function1(this) { // from class: a.zye
            public final /* synthetic */ gze b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b;
                gze gzeVar = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        usd usdVar = gze.S1;
                        view.getClass();
                        gzeVar.I0().b0();
                        break;
                    case 1:
                        usd usdVar2 = gze.S1;
                        view.getClass();
                        gzeVar.I0().a0();
                        break;
                    default:
                        usd usdVar3 = gze.S1;
                        view.getClass();
                        gzeVar.I0().b0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(G0().f, new Function1(this) { // from class: a.zye
            public final /* synthetic */ gze b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                gze gzeVar = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        usd usdVar = gze.S1;
                        view.getClass();
                        gzeVar.I0().b0();
                        break;
                    case 1:
                        usd usdVar2 = gze.S1;
                        view.getClass();
                        gzeVar.I0().a0();
                        break;
                    default:
                        usd usdVar3 = gze.S1;
                        view.getClass();
                        gzeVar.I0().b0();
                        break;
                }
                return Unit.f46060a;
            }
        });
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
                this.K1 = (kdi) mdiVarA.s.get();
                this.L1 = (ii) mdiVarA.Y;
                this.M1 = (lgn0) mdiVarA.Z;
                ynb ynbVarI = ((yzn0) ((peg0) mdiVarA.a0).b).i();
                x1x.x(ynbVarI);
                this.N1 = ynbVarI;
                this.O1 = (wdk0) mdiVarA.b0;
                return;
            }
        }
        jf4.n(b1j.i(sye.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(I0().U0);
        yje yjeVar = null;
        dze dzeVar = new dze(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zpe(xae0VarN, clzVarW, dzeVar, (yje) null, (char) 0), 3);
        xae0 xae0VarN2 = vtb.N(I0().s1);
        byte b = 1;
        dze dzeVar2 = new dze(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zpe(xae0VarN2, clzVarW2, dzeVar2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(I0().b1);
        dze dzeVar3 = new dze(this, yjeVar, (byte) 8);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fze(xae0VarN3, clzVarW3, dzeVar3, (yje) null, (byte) 0), 3);
        ol60 ol60Var = I0().W0;
        dze dzeVar4 = new dze(this, yjeVar, (byte) 5);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new fze(ol60Var, clzVarW4, dzeVar4, (yje) null), 3);
        qg20 qg20VarI0 = I0();
        p6d p6dVar = new p6d(qg20VarI0.d1, qg20VarI0.m1, new ko0((Object) qg20VarI0, yjeVar, (byte) 26), (byte) 1);
        dze dzeVar5 = new dze(this, yjeVar, (byte) 10);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new fze(p6dVar, clzVarW5, dzeVar5, (yje) null), 3);
        xae0 xae0VarN4 = vtb.N(I0().X0);
        uen uenVar = wen.b;
        gmq gmqVarS = sj3.S(xae0VarN4, qcc.g0(ibc.w0(100L, bfn.MILLISECONDS)));
        dze dzeVar6 = new dze(this, yjeVar, (byte) 7);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new fze(gmqVarS, clzVarW6, dzeVar6, (yje) null, (byte) 0), 3);
        xae0 xae0VarN5 = vtb.N(I0().a1);
        dze dzeVar7 = new dze(this, yjeVar, (byte) 3);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new zpe(xae0VarN5, clzVarW7, dzeVar7, (yje) null, 0), 3);
        qg20 qg20VarI1 = I0();
        byte b2 = 0;
        ye20 ye20Var = new ye20(qg20VarI1.Z0, qg20VarI1, (byte) 0);
        fob fobVar = new fob(this, yjeVar, (byte) 18);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new zpe(ye20Var, clzVarW8, fobVar, (yje) null), 3);
        xae0 xae0VarN6 = vtb.N(I0().Y0);
        dze dzeVar8 = new dze(this, yjeVar, b2);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new zpe(xae0VarN6, clzVarW9, dzeVar8, (yje) null), 3);
        xae0 xae0VarN7 = vtb.N(I0().e1);
        dze dzeVar9 = new dze(this, yjeVar, (byte) 11);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new fze(xae0VarN7, clzVarW10, dzeVar9, (yje) null, 0), 3);
        xae0 xae0VarN8 = vtb.N(I0().h1);
        lkz lkzVar2 = lkz.f20223a;
        dze dzeVar10 = new dze(this, yjeVar, (byte) 9);
        clz clzVarW11 = aac.W(this);
        qjj.W(x0x.Q(clzVarW11.x()), null, null, new fze(xae0VarN8, clzVarW11, dzeVar10, (yje) null, (char) 0), 3);
        xae0 xae0VarN9 = vtb.N(I0().l1);
        dze dzeVar11 = new dze(this, yjeVar, (byte) 6);
        clz clzVarW12 = aac.W(this);
        qjj.W(x0x.Q(clzVarW12.x()), null, null, new fze(xae0VarN9, clzVarW12, dzeVar11, (yje) null), 3);
        xae0 xae0VarN10 = vtb.N(I0().n1);
        dze dzeVar12 = new dze(this, yjeVar, (byte) 4);
        clz clzVarW13 = aac.W(this);
        qjj.W(x0x.Q(clzVarW13.x()), null, null, new zpe(xae0VarN10, clzVarW13, dzeVar12, (yje) null, (short) 0), 3);
        vae0 vae0VarM = vtb.M(I0().k1);
        eze ezeVar = new eze(this, yjeVar, b);
        clz clzVarW14 = aac.W(this);
        qjj.W(x0x.Q(clzVarW14.x()), null, null, new fze(vae0VarM, clzVarW14, ezeVar, (yje) null), 3);
        vae0 vae0VarM2 = vtb.M(I0().j1);
        eze ezeVar2 = new eze(this, yjeVar, b2);
        clz clzVarW15 = aac.W(this);
        qjj.W(x0x.Q(clzVarW15.x()), null, null, new zpe(vae0VarM2, clzVarW15, ezeVar2, (yje) null), 3);
    }

    public final c3f G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (c3f) objN;
    }

    public final qg20 I0() {
        return (qg20) this.P1.getValue();
    }

    public final void J0(final fxo fxoVar) {
        c3f c3fVarG0 = G0();
        final byte b = 0;
        c3fVarG0.h.setVisibility(0);
        DsButton dsButton = c3fVarG0.e;
        final byte b2 = 1;
        dsButton.setEnabled(true);
        c3fVarG0.m.setVisibility(8);
        DsButton dsButton2 = c3fVarG0.c;
        dsButton2.setEnabled(!fxoVar.g);
        dsButton2.l(fxoVar.f10319a.f15551a);
        ymx ymxVar = ymx.INTERVAL_400;
        dyb.b0(dsButton2, ymxVar, new Function1(this) { // from class: a.aze
            public final /* synthetic */ gze b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                fxo fxoVar2 = fxoVar;
                gze gzeVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        usd usdVar = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.f10319a.b);
                        break;
                    case 1:
                        usd usdVar2 = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.b.b);
                        break;
                    default:
                        usd usdVar3 = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.c.b);
                        break;
                }
                return Unit.f46060a;
            }
        });
        DsButton dsButton3 = c3fVarG0.d;
        boolean z = !fxoVar.g;
        dsButton3.setEnabled(z);
        dsButton3.l(fxoVar.b.f15551a);
        dyb.b0(dsButton3, ymxVar, new Function1(this) { // from class: a.aze
            public final /* synthetic */ gze b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                fxo fxoVar2 = fxoVar;
                gze gzeVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        usd usdVar = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.f10319a.b);
                        break;
                    case 1:
                        usd usdVar2 = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.b.b);
                        break;
                    default:
                        usd usdVar3 = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.c.b);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dsButton.setEnabled(z);
        dsButton.l(fxoVar.c.f15551a);
        final byte b3 = 2;
        dyb.b0(dsButton, ymxVar, new Function1(this) { // from class: a.aze
            public final /* synthetic */ gze b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                fxo fxoVar2 = fxoVar;
                gze gzeVar = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        usd usdVar = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.f10319a.b);
                        break;
                    case 1:
                        usd usdVar2 = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.b.b);
                        break;
                    default:
                        usd usdVar3 = gze.S1;
                        view.getClass();
                        gzeVar.I0().Z(fxoVar2.c.b);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().j.w();
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        c4m0 c4m0Var = I0().N0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        qg20 qg20VarI0 = I0();
        mne mneVar = qg20VarI0.d;
        c4m0 c4m0Var = qg20VarI0.N0;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            int i = 2;
            sac.T(new p6d(i120.W(((lye) ((khf0) qg20VarI0.H.f20589a).b).o), qg20VarI0.G.b(), new gbv(qg20VarI0, yjeVar, (byte) 7), (byte) 1), d5c.S(jiu0.a(qg20VarI0), mneVar.b), new sax(i, yjeVar, (byte) 15));
            qg20VarI0.N0 = sac.T(dub.e0(new ye20(qg20VarI0.d1, qg20VarI0, (byte) 1), qg20VarI0.i1, qg20VarI0.u0.a(), qg20VarI0.c1, new fg20(qg20VarI0, new mie0(), null)), d5c.S(jiu0.a(qg20VarI0), mneVar.b), new sax(i, yjeVar, (byte) 18));
        }
        sac.V(jiu0.a(qg20VarI0), oe20.f25103a, null, mneVar.f22085a, new wn2(qg20VarI0, yjeVar, (byte) 19), 10);
    }

    @Override // a.km7
    public final void l() {
        qg20 qg20VarI0 = I0();
        qg20VarI0.S();
        bvc bvcVarA = jiu0.a(qg20VarI0);
        r520 r520Var = new r520((byte) 11);
        mne mneVar = qg20VarI0.d;
        yje yjeVar = null;
        sac.V(bvcVarA, r520Var, null, mneVar.b, new e3p(qg20VarI0, yjeVar, (byte) 16), 10);
        sac.V(jiu0.a(qg20VarI0), ne20.f23363a, null, mneVar.b, new mt00((Object) qg20VarI0, yjeVar, (byte) 8), 10);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }
}
