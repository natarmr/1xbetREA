package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@ahi0(with = m5t.class)
public final class l5t implements kuw {
    public static final k5t Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l5t f19476a;
    public static final l5t b;
    public static final l5t c;
    public static final l5t d;
    public static final l5t e;
    public static final l5t f;
    public static final l5t g;
    public static final l5t h;
    public static final l5t i;
    public static final l5t j;
    public static final l5t k;
    public static final l5t l;
    public static final l5t m;
    public static final /* synthetic */ l5t[] n;
    public static final /* synthetic */ c0o o;

    /* JADX INFO: Fake field, exist only in values array */
    l5t EF1;

    static {
        l5t l5tVar = new l5t("Ok", 0);
        l5t l5tVar2 = new l5t("TwentyOneGameNotFound", 1);
        f19476a = l5tVar2;
        l5t l5tVar3 = new l5t("Error", 2);
        b = l5tVar3;
        l5t l5tVar4 = new l5t("InsufficientFunds", 3);
        c = l5tVar4;
        l5t l5tVar5 = new l5t("AlreadyBet", 4);
        l5t l5tVar6 = new l5t("NotCorrectBetSum", 5);
        d = l5tVar6;
        l5t l5tVar7 = new l5t("SeaBattleGameNotFound", 6);
        e = l5tVar7;
        l5t l5tVar8 = new l5t("ProcedureCrash", 7);
        l5t l5tVar9 = new l5t("InvalidGameType", 8);
        l5t l5tVar10 = new l5t("ExceededMaxAmountBets", 9);
        f = l5tVar10;
        l5t l5tVar11 = new l5t("BonusNotFound", 10);
        l5t l5tVar12 = new l5t("AmountLessMinRate", 11);
        l5t l5tVar13 = new l5t("BonusClose", 12);
        l5t l5tVar14 = new l5t("GameNotAvailable", 13);
        g = l5tVar14;
        l5t l5tVar15 = new l5t("CantThrowIn", 14);
        l5t l5tVar16 = new l5t("WrongRequestParameters", 15);
        l5t l5tVar17 = new l5t("WrongActionNum", 16);
        l5t l5tVar18 = new l5t("BetsBlocked", 17);
        l5t l5tVar19 = new l5t("BetEventBlocked", 18);
        l5t l5tVar20 = new l5t("ForbiddenBonusBet", 19);
        l5t l5tVar21 = new l5t("PlayBonusWithNonPrimaryAccount", 20);
        l5t l5tVar22 = new l5t("GameEndWithError", 21);
        h = l5tVar22;
        l5t l5tVar23 = new l5t("GamePreventWorks", 22);
        i = l5tVar23;
        l5t l5tVar24 = new l5t("SmthWentWrong", 23);
        j = l5tVar24;
        l5t l5tVar25 = new l5t("InsufficientFundsToWithdrawCashback", 24);
        l5t l5tVar26 = new l5t("GameError", 25);
        k = l5tVar26;
        l5t l5tVar27 = new l5t("InternalServerError", 26);
        l = l5tVar27;
        l5t l5tVar28 = new l5t("Unknown", 27);
        m = l5tVar28;
        l5t[] l5tVarArr = {l5tVar, l5tVar2, l5tVar3, l5tVar4, l5tVar5, l5tVar6, l5tVar7, l5tVar8, l5tVar9, l5tVar10, l5tVar11, l5tVar12, l5tVar13, l5tVar14, l5tVar15, l5tVar16, l5tVar17, l5tVar18, l5tVar19, l5tVar20, l5tVar21, l5tVar22, l5tVar23, l5tVar24, l5tVar25, l5tVar26, l5tVar27, l5tVar28};
        n = l5tVarArr;
        o = new c0o(l5tVarArr);
        Companion = new k5t();
    }

    public static l5t valueOf(String str) {
        return (l5t) Enum.valueOf(l5t.class, str);
    }

    public static l5t[] values() {
        return (l5t[]) n.clone();
    }

    @Override // a.kuw
    public final int getErrorCode() {
        switch (ordinal()) {
            case 0:
                return 0;
            case 1:
                return 8;
            case 2:
                return 99;
            case 3:
                return 103;
            case 4:
                return 126;
            case 5:
                return 12202;
            case 6:
                return 104551;
            case 7:
                return 104555;
            case 8:
                return 104567;
            case 9:
                return 105571;
            case 10:
                return 105581;
            case 11:
                return 105593;
            case 12:
                return 105733;
            case 13:
                return 106011;
            case 14:
                return 106418;
            case 15:
                return 111001;
            case 16:
                return 111002;
            case 17:
                return 111003;
            case 18:
                return 111004;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return 111005;
            case 20:
                return 158229;
            case 21:
                return 158222;
            case 22:
                return 158224;
            case 23:
                return 158225;
            case 24:
                return 114910;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Response.BAD_REQUEST;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return 500;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.MIN_VALUE;
            default:
                t9f.b();
                return 0;
        }
    }
}
