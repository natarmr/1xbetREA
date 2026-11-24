package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kvj0;", "La/zz5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kvj0 extends zz5 {
    public ynb M1;
    public fhi N1;
    public ii O1;
    public final s0r P1;
    public final kiu0 Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(kvj0.class, "binding", "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentSimpleBetBinding;", 0), new ez40(kvj0.class, "finBetInfoModel", "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;", 0)};
    public static final eke0 S1 = new eke0();

    public kvj0() {
        super(R.layout.fin_bet_fragment_simple_bet);
        this.P1 = ltt0.o(this, fvj0.f10218a);
        l9i0 l9i0Var = new l9i0(new zuj0(this, (byte) 0), (byte) 17);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 19), (byte) 21));
        this.Q1 = agc.G(this, sre0.f32672a.b(yxj0.class), new s9i0(a8zVarA, (byte) 15), new s9i0(a8zVarA, (byte) 17), l9i0Var);
        this.R1 = new khf0("EXTRA_BET_INFO");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        L0().c.setAddDepositClickListener(new lph0(0, M0(), yxj0.class, "onRefillBalanceClick", "onRefillBalanceClick()V", 0, (byte) 13));
        BetInputView betInputView = L0().b;
        betInputView.setPlusButtonClickListener(new lph0(0, M0(), yxj0.class, "onPlusButtonClick", "onPlusButtonClick()V", 0, (byte) 10));
        betInputView.setMinusButtonClickListener(new lph0(0, M0(), yxj0.class, "onMinusButtonClick", "onMinusButtonClick()V", 0, (byte) 12));
        betInputView.setFormatParams(new sd7(13, 2));
        int i = 1;
        betInputView.setAfterTextChangedListener(new gvj0(i, M0(), yxj0.class, "onValuesChanged", "onValuesChanged(Ljava/lang/String;)V", 0, (byte) 1));
        betInputView.setOnMakeBetButtonClickListener(new x6h0(betInputView, this, (byte) 24));
        final byte b = 0;
        C().u0("REQUEST_CHANGE_BALANCE_DIALOG_KEY", this, new k4r(this) { // from class: a.cvj0
            public final /* synthetic */ kvj0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b2 = b;
                kvj0 kvj0Var = this.b;
                switch (b2) {
                    case 0:
                        eke0 eke0Var = kvj0.S1;
                        str.getClass();
                        if (str.equals("REQUEST_CHANGE_BALANCE_DIALOG_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            yxj0 yxj0VarM0 = kvj0Var.M0();
                            sac.V(jiu0.a(yxj0VarM0), new gvj0(1, yxj0VarM0, yxj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, yxj0VarM0.A.b, new zye0((Object) yxj0VarM0, (yje) null, (byte) 29), 10);
                        }
                        break;
                    default:
                        eke0 eke0Var2 = kvj0.S1;
                        str.getClass();
                        if (str.equals("OPEN_PAYMENT_DIALOG_KEY") && bundle2.containsKey("RESULT_ON_PAYMENT_OPENED_KEY")) {
                            kvj0Var.M0();
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        C().u0("OPEN_PAYMENT_DIALOG_KEY", this, new k4r(this) { // from class: a.cvj0
            public final /* synthetic */ kvj0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                kvj0 kvj0Var = this.b;
                switch (b3) {
                    case 0:
                        eke0 eke0Var = kvj0.S1;
                        str.getClass();
                        if (str.equals("REQUEST_CHANGE_BALANCE_DIALOG_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            yxj0 yxj0VarM0 = kvj0Var.M0();
                            sac.V(jiu0.a(yxj0VarM0), new gvj0(1, yxj0VarM0, yxj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, yxj0VarM0.A.b, new zye0((Object) yxj0VarM0, (yje) null, (byte) 29), 10);
                        }
                        break;
                    default:
                        eke0 eke0Var2 = kvj0.S1;
                        str.getClass();
                        if (str.equals("OPEN_PAYMENT_DIALOG_KEY") && bundle2.containsKey("RESULT_ON_PAYMENT_OPENED_KEY")) {
                            kvj0Var.M0();
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "BET_EXIST_ERROR", new zuj0(this, (byte) 1));
        ccq0.T(this, "BET_EXIST_ERROR", new zuj0(this, (byte) 2));
        ccq0.V(this, "OPEN_PAYMENT_DIALOG_KEY", new lph0(0, M0(), yxj0.class, "onInsufficientFundsRefillBalanceClick", "onInsufficientFundsRefillBalanceClick()V", 0, (byte) 14));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(r6q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            r6q r6qVar = (r6q) (ze3Var instanceof r6q ? ze3Var : null);
            if (r6qVar != null) {
                hhi hhiVarA = r6qVar.a(a4n0.f(this), (FinBetInfoModel) this.R1.n(this, U1[1]), kvj0.class.getSimpleName(), ua20.MEDIUM_NO_GAME_INFO);
                ynb ynbVarI = ((yzn0) hhiVarA.x.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = (fhi) hhiVarA.S.get();
                this.O1 = hhiVarA.G;
                return;
            }
        }
        jf4.n(b1j.i(r6q.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(M0().V);
        Class<kvj0> cls = kvj0.class;
        jbh0 jbh0Var = new jbh0(2, this, cls, "handleBalanceStates", "handleBalanceStates(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_state/BalanceState;)V", 4, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zmj0(xae0VarN, clzVarW, jbh0Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(M0().W);
        int i = 4;
        jbh0 jbh0Var2 = new jbh0(2, this, cls, "handleTaxesState", "handleTaxesState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_state/TaxState;)V", i, (byte) 6);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zmj0(xae0VarN2, clzVarW2, jbh0Var2, (yje) null, (byte) 0), 3);
        yxj0 yxj0VarM0 = M0();
        omi0 omi0Var = new omi0(yxj0VarM0.X, yxj0VarM0, (byte) 2);
        int i2 = 2;
        jbh0 jbh0Var3 = new jbh0(i2, this, cls, "handleBetInputStates", "handleBetInputStates(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_state/StepInputState;)V", i, (byte) 7);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zmj0(omi0Var, clzVarW3, jbh0Var3, (yje) null), 3);
        xae0 xae0VarN3 = vtb.N(M0().Y);
        jbh0 jbh0Var4 = new jbh0(i2, this, cls, "handleNavigationActions", "handleNavigationActions(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/NavigationAction;)V", i, (byte) 8);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zmj0(xae0VarN3, clzVarW4, jbh0Var4, (yje) null, (char) 0), 3);
        gmq gmqVarS = sj3.S(M0().o, 100L);
        int i3 = 2;
        jbh0 jbh0Var5 = new jbh0(i3, this, cls, "handleEvents", "handleEvents(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/MakeBetAction;)V", i, (byte) 9);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new zmj0(gmqVarS, clzVarW5, jbh0Var5, (yje) null), 3);
        xae0 xae0VarN4 = vtb.N(M0().Z);
        jbh0 jbh0Var6 = new jbh0(i3, this, cls, "handlePossiblePayoutState", "handlePossiblePayoutState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_state/PossiblePayoutState;)V", i, (byte) 10);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new zmj0(xae0VarN4, clzVarW6, jbh0Var6, (yje) null, 0), 3);
        ol60 ol60Var = M0().p;
        jbh0 jbh0Var7 = new jbh0(2, this, cls, "handleErrors", "handleErrors(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/ErrorAction;)V", i, (byte) 11);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new zmj0(ol60Var, clzVarW7, jbh0Var7, (yje) null, (byte) 0), 3);
        xae0 xae0VarN5 = vtb.N(M0().c0);
        jbh0 jbh0Var8 = new jbh0(2, this, cls, "observeBalanceLowAnimationState", "observeBalanceLowAnimationState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_state/BalanceLowAnimationState;)V", i, (byte) 12);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new zmj0(xae0VarN5, clzVarW8, jbh0Var8, (yje) null, (short) 0), 3);
        ol60 ol60Var2 = M0().b0;
        tmg0 tmg0Var = new tmg0(this, null, (byte) 15);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new zmj0(ol60Var2, clzVarW9, tmg0Var, (yje) null), 3);
    }

    @Override // a.zz5
    public final View I0() {
        return L0().b;
    }

    @Override // a.zz5
    public final void J0(r0o r0oVar) {
        r0oVar.getClass();
        if (r0oVar instanceof q0o) {
            String str = ((q0o) r0oVar).f27910a;
            ii iiVar = this.O1;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH = H(R.string.error);
            String strH2 = H(R.string.replenish);
            strH2.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, H(R.string.cancel), (String) null, "OPEN_PAYMENT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
            return;
        }
        if (!(r0oVar instanceof o0o)) {
            super.J0(r0oVar);
            return;
        }
        String str2 = ((o0o) r0oVar).f24437a;
        ii iiVar2 = this.O1;
        if (iiVar2 == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH3 = H(R.string.error);
        String strH4 = H(R.string.ok_new);
        strH4.getClass();
        DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) str2, (CharSequence) strH4, H(R.string.cancel), (String) null, "BET_EXIST_ERROR", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC2 = C();
        eVarC2.getClass();
        iiVar2.d(dialogFields2, eVarC2);
    }

    public final m6q L0() {
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        return (m6q) objN;
    }

    public final yxj0 M0() {
        return (yxj0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        L0().c.w();
        super.Z();
    }
}
