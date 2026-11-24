package a;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum;
import org.xplatform.uikit.components.successbetalert.model.BetDoneScreenStyleEnum;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;
import org.xplatform.uikit.components.successbetalert.model.TmpBetDoneUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mgn0 {
    public static final SuccessBetAlertModel a(org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel successBetAlertModel) {
        Parcelable withCurrency;
        String str = successBetAlertModel.f46420a;
        String str2 = successBetAlertModel.b;
        String str3 = successBetAlertModel.c;
        Long l = successBetAlertModel.d;
        String str4 = successBetAlertModel.e;
        List<SuccessBetInfoItem> list = successBetAlertModel.f;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (SuccessBetInfoItem successBetInfoItem : list) {
            if (successBetInfoItem != null) {
                if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                    SuccessBetInfoItem.Simple simple = (SuccessBetInfoItem.Simple) successBetInfoItem;
                    withCurrency = new org.xplatform.uikit.components.successbetalert.model.SuccessBetInfoItem.Simple(simple.f46421a, simple.b);
                } else if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                    SuccessBetInfoItem.WithCurrency withCurrency2 = (SuccessBetInfoItem.WithCurrency) successBetInfoItem;
                    withCurrency = new org.xplatform.uikit.components.successbetalert.model.SuccessBetInfoItem.WithCurrency(withCurrency2.c, withCurrency2.f46422a, withCurrency2.b, withCurrency2.d, withCurrency2.e);
                }
                arrayList.add(withCurrency);
            }
            t9f.b();
            return null;
        }
        return new SuccessBetAlertModel(str, str2, str3, l, str4, arrayList, null);
    }

    public static final SuccessBetStringModel b(org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel successBetStringModel, ctf0 ctf0Var) {
        ctf0Var.getClass();
        String str = successBetStringModel.f46423a;
        String str2 = successBetStringModel.b;
        lsm0 lsm0Var = ctf0Var.b;
        return new SuccessBetStringModel(str, str2, lsm0Var.a(R.string.history, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.continue_action, Arrays.copyOf(new Object[0], 0)), successBetStringModel.c, successBetStringModel.d);
    }

    public static final TmpBetDoneUiModel c(bu6 bu6Var, au6 au6Var) {
        BetDoneScreenStyleEnum betDoneScreenStyleEnum;
        BetDoneIconStyleEnum betDoneIconStyleEnum;
        int iOrdinal = bu6Var.ordinal();
        if (iOrdinal == 0) {
            betDoneScreenStyleEnum = BetDoneScreenStyleEnum.SNACK_BAR;
        } else if (iOrdinal == 1) {
            betDoneScreenStyleEnum = BetDoneScreenStyleEnum.BOTTOM_SHEET_BLACK_TEXT;
        } else if (iOrdinal == 2) {
            betDoneScreenStyleEnum = BetDoneScreenStyleEnum.BOTTOM_SHEET_COLORED_TEXT;
        } else if (iOrdinal == 3) {
            betDoneScreenStyleEnum = BetDoneScreenStyleEnum.ALERT_BLACK_TEXT;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            betDoneScreenStyleEnum = BetDoneScreenStyleEnum.ALERT_COLORED_TEXT;
        }
        int iOrdinal2 = au6Var.ordinal();
        if (iOrdinal2 == 0) {
            betDoneIconStyleEnum = BetDoneIconStyleEnum.NONE;
        } else if (iOrdinal2 == 1) {
            betDoneIconStyleEnum = BetDoneIconStyleEnum.IMAGE;
        } else {
            if (iOrdinal2 != 2) {
                t9f.b();
                return null;
            }
            betDoneIconStyleEnum = BetDoneIconStyleEnum.LOTTIE;
        }
        return new TmpBetDoneUiModel(betDoneScreenStyleEnum, betDoneIconStyleEnum);
    }
}
