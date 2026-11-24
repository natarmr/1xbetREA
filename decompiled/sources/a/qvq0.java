package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@ahi0(with = rvq0.class)
public final class qvq0 implements kuw {
    public static final pvq0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qvq0 f29398a;
    public static final qvq0 b;
    public static final qvq0 c;
    public static final qvq0 d;
    public static final qvq0 e;
    public static final qvq0 f;
    public static final qvq0 g;
    public static final /* synthetic */ qvq0[] h;
    public static final /* synthetic */ c0o i;

    /* JADX INFO: Fake field, exist only in values array */
    qvq0 EF1;

    static {
        qvq0 qvq0Var = new qvq0("AuthFailed", 0);
        qvq0 qvq0Var2 = new qvq0("TwoFactorError", 1);
        qvq0 qvq0Var3 = new qvq0("Need2fa", 2);
        qvq0 qvq0Var4 = new qvq0("CaptchaError", 3);
        qvq0 qvq0Var5 = new qvq0("AuthNewPlaceResponsePhone", 4);
        f29398a = qvq0Var5;
        qvq0 qvq0Var6 = new qvq0("AuthNewPlaceResponseSecretWord", 5);
        b = qvq0Var6;
        qvq0 qvq0Var7 = new qvq0("AuthNewPlaceResponseSurname", 6);
        c = qvq0Var7;
        qvq0 qvq0Var8 = new qvq0("AuthNewPlaceResponseEmailSent", 7);
        qvq0 qvq0Var9 = new qvq0("AuthNewPlaceResponseSmsSent", 8);
        d = qvq0Var9;
        qvq0 qvq0Var10 = new qvq0("AuthConfirmPhoneKz", 9);
        e = qvq0Var10;
        qvq0 qvq0Var11 = new qvq0("IncorrectSecretQuestionCode", 10);
        qvq0 qvq0Var12 = new qvq0("IncorrectSurname", 11);
        qvq0 qvq0Var13 = new qvq0("IncorrectPhone", 12);
        qvq0 qvq0Var14 = new qvq0("IncorrectLoginOrPassword", 13);
        qvq0 qvq0Var15 = new qvq0("AuthNewPlaceAuthenticatorSent", 14);
        f = qvq0Var15;
        qvq0 qvq0Var16 = new qvq0("IncorrectCode", 15);
        qvq0 qvq0Var17 = new qvq0("NotAllowedLocation", 16);
        qvq0 qvq0Var18 = new qvq0("SocialNetAuthError", 17);
        qvq0 qvq0Var19 = new qvq0("Unknown", 18);
        g = qvq0Var19;
        qvq0[] qvq0VarArr = {qvq0Var, qvq0Var2, qvq0Var3, qvq0Var4, qvq0Var5, qvq0Var6, qvq0Var7, qvq0Var8, qvq0Var9, qvq0Var10, qvq0Var11, qvq0Var12, qvq0Var13, qvq0Var14, qvq0Var15, qvq0Var16, qvq0Var17, qvq0Var18, qvq0Var19};
        h = qvq0VarArr;
        i = new c0o(qvq0VarArr);
        Companion = new pvq0();
    }

    public static qvq0 valueOf(String str) {
        return (qvq0) Enum.valueOf(qvq0.class, str);
    }

    public static qvq0[] values() {
        return (qvq0[]) h.clone();
    }

    @Override // a.kuw
    public final int getErrorCode() {
        switch (ordinal()) {
            case 0:
                return 160;
            case 1:
                return 103596;
            case 2:
                return 156996;
            case 3:
                return 156997;
            case 4:
                return 157177;
            case 5:
                return 157178;
            case 6:
                return 157355;
            case 7:
                return 157539;
            case 8:
                return 157540;
            case 9:
                return 163413;
            case 10:
                return 102550;
            case 11:
                return 157356;
            case 12:
                return 103983;
            case 13:
                return 136;
            case 14:
                return 159259;
            case 15:
                return 100849;
            case 16:
                return 157662;
            case 17:
                return 104485;
            case 18:
                return Integer.MIN_VALUE;
            default:
                t9f.b();
                return 0;
        }
    }
}
