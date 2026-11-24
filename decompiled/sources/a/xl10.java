package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xl10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41053a;
    public final /* synthetic */ zl10 b;

    public /* synthetic */ xl10(zl10 zl10Var, byte b) {
        this.f41053a = b;
        this.b = zl10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41053a;
        zl10 zl10Var = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                wsz wszVar = zl10.U1;
                zl10Var.H0().x(new ul10(jLongValue));
                return Unit.f46060a;
            default:
                sm10 sm10Var = (sm10) obj;
                wsz wszVar2 = zl10.U1;
                sm10Var.getClass();
                if (sm10Var.equals(pm10.f27211a)) {
                    ii iiVarG0 = zl10Var.G0();
                    String strH = zl10Var.H(R.string.error);
                    String strH2 = zl10Var.H(R.string.request_error);
                    String strH3 = zl10Var.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "LUCKY_WHEEL_REQUEST_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = zl10Var.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                } else if (sm10Var instanceof nm10) {
                    String str = ((nm10) sm10Var).f23751a;
                    ii iiVarG1 = zl10Var.G0();
                    String strH4 = zl10Var.H(R.string.error);
                    String strH5 = zl10Var.H(R.string.ok);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str, (CharSequence) strH5, (String) null, (String) null, "LUCKY_WHEEL_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC2 = zl10Var.C();
                    eVarC2.getClass();
                    iiVarG1.d(dialogFields2, eVarC2);
                } else if (sm10Var.equals(mm10.f22017a)) {
                    mj8 mj8Var = zl10Var.M1;
                    if (mj8Var == null) {
                        Intrinsics.h("bonusesInfoScreenFactory");
                        throw null;
                    }
                    r9u r9uVar = mj8Var.f21883a;
                    ygp ygpVar = ygp.s;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    (j1q0Var.f15748a.d(ygpVar) ? new wi8() : new jj8()).H0(zl10Var.C(), "LuckyWheelGameFragment.BONUSES_INFO_DIALOG_TAG");
                } else if (sm10Var.equals(lm10.f20274a)) {
                    ii iiVarG2 = zl10Var.G0();
                    String strH6 = zl10Var.H(R.string.attention);
                    String strH7 = zl10Var.H(R.string.game_not_allowed_from_bonus_account_warning_message_web_game);
                    String strH8 = zl10Var.H(R.string.ok_new);
                    strH8.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, "LUCKY_WHEEL_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC3 = zl10Var.C();
                    eVarC3.getClass();
                    iiVarG2.d(dialogFields3, eVarC3);
                } else if (sm10Var instanceof om10) {
                    if (((om10) sm10Var).f25482a) {
                        ii iiVarG3 = zl10Var.G0();
                        String strH9 = zl10Var.H(R.string.not_enough_money);
                        String strH10 = zl10Var.H(R.string.insufficient_balance_dialog_body);
                        String strH11 = zl10Var.H(R.string.replenish);
                        strH11.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, zl10Var.H(R.string.cancel), (String) null, "LUCKY_WHEEL_NOT_ENOUGH_FUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC4 = zl10Var.C();
                        eVarC4.getClass();
                        iiVarG3.d(dialogFields4, eVarC4);
                    } else {
                        ii iiVarG4 = zl10Var.G0();
                        String strH12 = zl10Var.H(R.string.error);
                        String strH13 = zl10Var.H(R.string.not_enough_cash);
                        String strH14 = zl10Var.H(R.string.cancel);
                        strH14.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC5 = zl10Var.C();
                        eVarC5.getClass();
                        iiVarG4.d(dialogFields5, eVarC5);
                    }
                } else if (sm10Var.equals(qm10.f28961a)) {
                    ii iiVarG5 = zl10Var.G0();
                    String strH15 = zl10Var.H(R.string.attention);
                    String strH16 = zl10Var.H(R.string.unacceptable_bonus_account_for_web_game);
                    String strH17 = zl10Var.H(R.string.ok);
                    strH17.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, (String) null, (String) null, "LUCKY_WHEEL_SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC6 = zl10Var.C();
                    eVarC6.getClass();
                    iiVarG5.d(dialogFields6, eVarC6);
                } else {
                    if (!sm10Var.equals(rm10.f30724a)) {
                        t9f.b();
                        return null;
                    }
                    if (zl10Var.O1 == null) {
                        Intrinsics.h("wildFreeBetScreenFactory");
                        throw null;
                    }
                    ffv0 ffv0Var = new ffv0();
                    androidx.fragment.app.e eVarC7 = zl10Var.C();
                    eVarC7.getClass();
                    sj3.D0(ffv0Var, eVarC7);
                }
                zl10Var.H0().x(bl10.f2775a);
                return Unit.f46060a;
        }
    }
}
