package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rw4;", "La/yx5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rw4 extends yx5 {
    public final i9o0 K1;
    public cli L1;
    public ii M1;
    public wdk0 N1;
    public lgn0 O1;
    public ynb P1;
    public final yzn0 Q1;
    public final yzn0 R1;
    public final kiu0 S1;
    public final kiu0 U1;
    public final s0r V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(rw4.class, "entryPointType", "getEntryPointType()Lorg/xplatform/analytics/domain/AnalyticsEventModel$EntryPointType;", 0), new ez40(rw4.class, "singleBetGame", "getSingleBetGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;", 0), new j0d0(rw4.class, "binding", "getBinding()Lorg/xplatform/make_bet/impl/databinding/MakeBetAutoFragmentBinding;", 0)};
    public static final gfk0 W1 = new gfk0((byte) 28);

    public rw4() {
        super(R.layout.make_bet_auto_fragment);
        this.K1 = i9o0.f14396a;
        this.Q1 = new yzn0("ANALYTICS_ENTRY_POINT_TYPE_BUNDLE_KEY");
        this.R1 = new yzn0("SINGLE_BET_GAME_BUNDLE_KEY");
        pp4 pp4Var = new pp4(new lw4(this, (byte) 1), (byte) 11);
        pp4 pp4Var2 = new pp4(this, (byte) 12);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new pp4(pp4Var2, (byte) 13));
        tre0 tre0Var = sre0.f32672a;
        this.S1 = agc.G(this, tre0Var.b(fy4.class), new qw4(a8zVarA, (byte) 0), new qw4(a8zVarA, (byte) 1), pp4Var);
        a8z a8zVarA2 = maz.a(wezVar, new pp4(new pw4(0, this, rw4.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 0), (byte) 14));
        this.U1 = agc.G(this, tre0Var.b(ya20.class), new qw4(a8zVarA2, (byte) 2), new qw4(a8zVarA2, (byte) 3), new h5((Object) this, (Object) a8zVarA2, (byte) 8));
        this.V1 = ltt0.o(this, mw4.f22485a);
    }

    public static a720 G0(Fragment fragment) {
        Fragment fragmentP0 = fragment.p0();
        a720 a720Var = fragmentP0 instanceof a720 ? (a720) fragmentP0 : null;
        return a720Var == null ? G0(fragment.p0()) : a720Var;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().b.setChangeBalanceClickListener(new kw4(this, (byte) 0));
        H0().b.setAddDepositClickListener(new f8(0, I0(), fy4.class, "onAddDepositClick", "onAddDepositClick()V", 0, (byte) 26));
        BetInputView betInputView = H0().e;
        betInputView.setPlusButtonClickListener(new f8(0, I0(), fy4.class, "onStepUpClick", "onStepUpClick()V", 0, (byte) 28));
        betInputView.setMinusButtonClickListener(new f8(0, I0(), fy4.class, "onStepDownClick", "onStepDownClick()V", 0, (byte) 29));
        td7 td7Var = new td7(new ry2(new df2(2, I0(), fy4.class, "onCoefChange", "onCoefChange(Ljava/lang/String;Z)V", 0, (byte) 22), betInputView, new sd7(3, 3), (byte) 20));
        betInputView.s = td7Var;
        ((DsTextField) betInputView.r.d).a(td7Var);
        betInputView.setIsNeedClearText(false);
        BetInputView betInputView2 = H0().d;
        betInputView2.setFormatParams(new sd7(13, 2));
        int i = 1;
        betInputView2.setAfterTextChangedListener(new j94(i, I0(), fy4.class, "onBetSumChange", "onBetSumChange(Ljava/lang/String;)V", 0, (byte) 19));
        betInputView2.setOnMakeBetButtonClickListener(new lw4(this, (byte) 0));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new lw4(this, (byte) 2));
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new f8(0, I0(), fy4.class, "onInsufficientFundsAddDepositClick", "onInsufficientFundsAddDepositClick()V", 0, (byte) 27));
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
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = X1;
                mki mkiVarA = c920Var.a(i1w0VarF, (ms2) this.Q1.n(this, iiyVarArr[0]), (m0k0) this.R1.n(this, iiyVarArr[1]));
                this.L1 = (cli) ((n5d0) mkiVarA.b).get();
                this.M1 = (ii) mkiVarA.N;
                this.N1 = (wdk0) mkiVarA.M;
                this.O1 = (lgn0) mkiVarA.P;
                ynb ynbVarI = ((yzn0) ((peg0) mkiVarA.O).b).i();
                x1x.x(ynbVarI);
                this.P1 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(c920.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(I0().X);
        ow4 ow4Var = new ow4(this, null, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ac4(xae0VarN, clzVarW, ow4Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN2 = vtb.N(I0().i0);
        ow4 ow4Var2 = new ow4(this, null, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new ac4(xae0VarN2, clzVarW2, ow4Var2, (yje) null), 3);
        ol60 ol60Var = I0().Z;
        ow4 ow4Var3 = new ow4(this, null, (byte) 5);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new ac4(ol60Var, clzVarW3, ow4Var3, (yje) null, 0), 3);
        ol60 ol60Var2 = I0().a0;
        ow4 ow4Var4 = new ow4(this, null, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new ac4((gmq) ol60Var2, clzVarW4, ow4Var4, (yje) null, (byte) 0), 3);
        fy4 fy4VarI0 = I0();
        p6d p6dVar = new p6d(fy4VarI0.b0, fy4VarI0.c0, new wx4(fy4VarI0, (yje) null, (byte) 0), (byte) 1);
        ow4 ow4Var5 = new ow4(this, null, (byte) 7);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new ac4(p6dVar, clzVarW5, ow4Var5, (yje) null), 3);
        gmq gmqVarS = sj3.S(I0().d0, 100L);
        ow4 ow4Var6 = new ow4(this, null, (byte) 4);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new ac4(gmqVarS, clzVarW6, ow4Var6, (yje) null, (char) 0), 3);
        ol60 ol60Var3 = I0().e0;
        ow4 ow4Var7 = new ow4(this, null, (byte) 2);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new ac4(ol60Var3, clzVarW7, ow4Var7, (yje) null), 3);
        xae0 xae0VarN3 = vtb.N(I0().f0);
        ow4 ow4Var8 = new ow4(this, null, (byte) 8);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new ac4(xae0VarN3, clzVarW8, ow4Var8, (yje) null, 0), 3);
        xae0 xae0VarN4 = vtb.N(I0().h0);
        ow4 ow4Var9 = new ow4(this, null, (byte) 6);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new ac4(xae0VarN4, clzVarW9, ow4Var9, (yje) null, (char) 0), 3);
        xae0 xae0VarN5 = vtb.N(((ya20) this.U1.getValue()).b);
        qv3 qv3Var = new qv3(this, null, (byte) 5);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new ac4(xae0VarN5, clzVarW10, qv3Var, (yje) null), 3);
    }

    public final o520 H0() {
        Object objN = this.V1.n(X1[2], this);
        objN.getClass();
        return (o520) objN;
    }

    public final fy4 I0() {
        return (fy4) this.S1.getValue();
    }

    public final void J0(String str, String str2, String str3) {
        ii iiVar = this.M1;
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
