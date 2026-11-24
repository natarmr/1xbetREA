package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jvj0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jvj0 extends yx5 {
    public final i9o0 K1;
    public bli L1;
    public wdk0 M1;
    public ii N1;
    public ynb O1;
    public lgn0 P1;
    public final yzn0 Q1;
    public final yzn0 R1;
    public final kiu0 S1;
    public final kiu0 U1;
    public final s0r V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(jvj0.class, "entryPointType", "getEntryPointType()Lorg/xplatform/analytics/domain/AnalyticsEventModel$EntryPointType;", 0), new ez40(jvj0.class, "singleBetGame", "getSingleBetGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;", 0), new j0d0(jvj0.class, "binding", "getBinding()Lorg/xplatform/make_bet/impl/databinding/MakeBetSimpleFragmentBinding;", 0)};
    public static final zie0 W1 = new zie0();

    public jvj0() {
        super(R.layout.make_bet_simple_fragment);
        this.K1 = i9o0.f14396a;
        this.Q1 = new yzn0("ANALYTICS_ENTRY_POINT_TYPE_BUNDLE_KEY");
        this.R1 = new yzn0("SINGLE_BET_GAME_BUNDLE_KEY");
        l9i0 l9i0Var = new l9i0(new avj0(this, (byte) 2), (byte) 16);
        l9i0 l9i0Var2 = new l9i0(this, (byte) 18);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new l9i0(l9i0Var2, (byte) 20));
        tre0 tre0Var = sre0.f32672a;
        this.S1 = agc.G(this, tre0Var.b(xxj0.class), new s9i0(a8zVarA, (byte) 14), new s9i0(a8zVarA, (byte) 16), l9i0Var);
        a8z a8zVarA2 = maz.a(wezVar, new l9i0(new lph0(0, this, jvj0.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 15), (byte) 22));
        this.U1 = agc.G(this, tre0Var.b(ya20.class), new s9i0(a8zVarA2, (byte) 18), new s9i0(a8zVarA2, (byte) 19), new sue0(this, a8zVarA2, (byte) 20));
        this.V1 = ltt0.o(this, evj0.f8471a);
    }

    public static a720 G0(Fragment fragment) {
        Fragment fragmentP0 = fragment.p0();
        a720 a720Var = fragmentP0 instanceof a720 ? (a720) fragmentP0 : null;
        return a720Var == null ? G0(fragment.p0()) : a720Var;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().b.setChangeBalanceClickListener(new dvj0(this, (byte) 0));
        H0().b.setAddDepositClickListener(new lph0(0, J0(), xxj0.class, "onAddDepositClick", "onAddDepositClick()V", 0, (byte) 6));
        BetInputView betInputView = H0().c;
        betInputView.setPlusButtonClickListener(new lph0(0, J0(), xxj0.class, "onStepUpClick", "onStepUpClick()V", 0, (byte) 9));
        betInputView.setMinusButtonClickListener(new lph0(0, J0(), xxj0.class, "onStepDownClick", "onStepDownClick()V", 0, (byte) 11));
        betInputView.setFormatParams(new sd7(13, 2));
        int i = 1;
        betInputView.setAfterTextChangedListener(new gvj0(i, J0(), xxj0.class, "onStepInputChange", "onStepInputChange(Ljava/lang/String;)V", 0, (byte) 0));
        betInputView.setOnMakeBetButtonClickListener(new x6h0(betInputView, this, (byte) 23));
        betInputView.setVisibilityStepButtons(false);
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new avj0(this, (byte) 0));
        ccq0.T(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new lph0(0, J0(), xxj0.class, "onMakeBetClickCancel", "onMakeBetClickCancel()V", 0, (byte) 7));
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new lph0(0, J0(), xxj0.class, "onInsufficientFundsAddDepositClick", "onInsufficientFundsAddDepositClick()V", 0, (byte) 8));
        ccq0.V(this, "REQUEST_ADVANCE_KEY", new avj0(this, (byte) 1));
        dyb.O(H0().g, new rai0(this, (byte) 16));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(c920.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            c920 c920Var = (c920) (ze3Var instanceof c920 ? ze3Var : null);
            if (c920Var != null) {
                mki mkiVarA = c920Var.a(a4n0.f(this), I0(), (m0k0) this.R1.n(this, X1[1]));
                this.L1 = (bli) ((n5d0) mkiVarA.f21945a).get();
                this.M1 = (wdk0) mkiVarA.M;
                this.N1 = (ii) mkiVarA.N;
                ynb ynbVarI = ((yzn0) ((peg0) mkiVarA.O).b).i();
                x1x.x(ynbVarI);
                this.O1 = ynbVarI;
                this.P1 = (lgn0) mkiVarA.P;
                return;
            }
        }
        jf4.n(b1j.i(c920.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(J0().r0);
        yje yjeVar = null;
        hvj0 hvj0Var = new hvj0(this, yjeVar, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zmj0(xae0VarN, clzVarW, hvj0Var, (yje) null, (char) 0), 3);
        vae0 vae0VarM = vtb.M(J0().t0);
        tmg0 tmg0Var = new tmg0(this, yjeVar, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zmj0(vae0VarM, clzVarW2, tmg0Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(J0().E0);
        hvj0 hvj0Var2 = new hvj0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zmj0(xae0VarN2, clzVarW3, hvj0Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = J0().p0;
        hvj0 hvj0Var3 = new hvj0(this, yjeVar, (byte) 7);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zmj0((gmq) ol60Var, clzVarW4, hvj0Var3, (yje) null, (char) 0), 3);
        ol60 ol60Var2 = J0().q0;
        hvj0 hvj0Var4 = new hvj0(this, yjeVar, (byte) 4);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new zmj0(ol60Var2, clzVarW5, hvj0Var4, (yje) null), 3);
        xxj0 xxj0VarJ0 = J0();
        vwj0 vwj0Var = new vwj0(xxj0VarJ0.C0, xxj0VarJ0, (byte) 1);
        hvj0 hvj0Var5 = new hvj0(this, yjeVar, (byte) 9);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new zmj0(vwj0Var, clzVarW6, hvj0Var5, (yje) null, (byte) 0), 3);
        ol60 ol60Var3 = J0().y0;
        ivj0 ivj0Var = new ivj0(this, null);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new zmj0(ol60Var3, clzVarW7, ivj0Var, (yje) null), 3);
        gmq gmqVarS = sj3.S(J0().u0, 100L);
        hvj0 hvj0Var6 = new hvj0(this, yjeVar, (byte) 6);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new zmj0(gmqVarS, clzVarW8, hvj0Var6, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(J0().B0);
        hvj0 hvj0Var7 = new hvj0(this, yjeVar, (byte) 8);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new zmj0(xae0VarN3, clzVarW9, hvj0Var7, (yje) null, (short) 0), 3);
        xxj0 xxj0VarJ1 = J0();
        vwj0 vwj0Var2 = new vwj0(xxj0VarJ1.v0, xxj0VarJ1, (byte) 0);
        hvj0 hvj0Var8 = new hvj0(this, yjeVar, (byte) 0);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new zmj0(vwj0Var2, clzVarW10, hvj0Var8, (yje) null), 3);
        xae0 xae0VarN4 = vtb.N(J0().x0);
        hvj0 hvj0Var9 = new hvj0(this, yjeVar, (byte) 1);
        clz clzVarW11 = aac.W(this);
        qjj.W(x0x.Q(clzVarW11.x()), null, null, new zmj0(xae0VarN4, clzVarW11, hvj0Var9, (yje) null), 3);
        xae0 xae0VarN5 = vtb.N(J0().z0);
        hvj0 hvj0Var10 = new hvj0(this, yjeVar, (byte) 10);
        clz clzVarW12 = aac.W(this);
        qjj.W(x0x.Q(clzVarW12.x()), null, null, new zmj0(xae0VarN5, clzVarW12, hvj0Var10, null, (byte) 0, false), 3);
        xae0 xae0VarN6 = vtb.N(J0().D0);
        hvj0 hvj0Var11 = new hvj0(this, yjeVar, (byte) 5);
        clz clzVarW13 = aac.W(this);
        qjj.W(x0x.Q(clzVarW13.x()), null, null, new zmj0(xae0VarN6, clzVarW13, hvj0Var11, (yje) null, 0), 3);
        xae0 xae0VarN7 = vtb.N(((ya20) this.U1.getValue()).b);
        yng0 yng0Var = new yng0(this, yjeVar, (byte) 16);
        clz clzVarW14 = aac.W(this);
        qjj.W(x0x.Q(clzVarW14.x()), null, null, new zmj0(xae0VarN7, clzVarW14, yng0Var, (yje) null), 3);
    }

    public final bd20 H0() {
        Object objN = this.V1.n(X1[2], this);
        objN.getClass();
        return (bd20) objN;
    }

    public final ms2 I0() {
        return (ms2) this.Q1.n(this, X1[0]);
    }

    public final xxj0 J0() {
        return (xxj0) this.S1.getValue();
    }

    public final void K0(final exo exoVar) {
        bd20 bd20VarH0 = H0();
        final byte b = 0;
        bd20VarH0.i.setVisibility(0);
        bd20VarH0.l.setVisibility(8);
        DsButton dsButton = bd20VarH0.d;
        final byte b2 = 1;
        dsButton.setEnabled(!exoVar.g);
        dsButton.l(exoVar.f8588a.f13819a);
        ymx ymxVar = ymx.INTERVAL_400;
        dyb.b0(dsButton, ymxVar, new Function1(this) { // from class: a.yuj0
            public final /* synthetic */ jvj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                exo exoVar2 = exoVar;
                jvj0 jvj0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        zie0 zie0Var = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.f8588a.b);
                        break;
                    case 1:
                        zie0 zie0Var2 = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.b.b);
                        break;
                    default:
                        zie0 zie0Var3 = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.c.b);
                        break;
                }
                return Unit.f46060a;
            }
        });
        DsButton dsButton2 = bd20VarH0.e;
        boolean z = !exoVar.g;
        dsButton2.setEnabled(z);
        dsButton2.l(exoVar.b.f13819a);
        dyb.b0(dsButton2, ymxVar, new Function1(this) { // from class: a.yuj0
            public final /* synthetic */ jvj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                exo exoVar2 = exoVar;
                jvj0 jvj0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        zie0 zie0Var = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.f8588a.b);
                        break;
                    case 1:
                        zie0 zie0Var2 = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.b.b);
                        break;
                    default:
                        zie0 zie0Var3 = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.c.b);
                        break;
                }
                return Unit.f46060a;
            }
        });
        DsButton dsButton3 = bd20VarH0.f;
        dsButton3.setEnabled(z);
        dsButton3.l(exoVar.c.f13819a);
        final byte b3 = 2;
        dyb.b0(dsButton3, ymxVar, new Function1(this) { // from class: a.yuj0
            public final /* synthetic */ jvj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                exo exoVar2 = exoVar;
                jvj0 jvj0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        zie0 zie0Var = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.f8588a.b);
                        break;
                    case 1:
                        zie0 zie0Var2 = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.b.b);
                        break;
                    default:
                        zie0 zie0Var3 = jvj0.W1;
                        view.getClass();
                        jvj0Var.H0().c.clearFocus();
                        jvj0Var.J0().M(kpb.v0(jvj0Var.I0()), exoVar2.c.b);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    public final void L0(String str, String str2, String str3) {
        ii iiVar = this.N1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        DialogFields dialogFields = new DialogFields((CharSequence) H(R.string.error), (CharSequence) str, (CharSequence) str3, H(R.string.cancel), (String) null, str2, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        H0().b.w();
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        E0(true);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
