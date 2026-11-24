package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yq10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yq10 f43054a;
    public static final yq10 b;
    public static final yq10 c;
    public static final yq10 d;
    public static final yq10 e;
    public static final /* synthetic */ yq10[] f;
    public static final /* synthetic */ c0o g;

    static {
        yq10 yq10Var = new yq10("BASE_EMAIL_NEWS", 0);
        f43054a = yq10Var;
        yq10 yq10Var2 = new yq10("BASE_EMAIL_BETS", 1);
        b = yq10Var2;
        yq10 yq10Var3 = new yq10("BASE_EMAIL_INCOME_DEPOSIT", 2);
        c = yq10Var3;
        yq10 yq10Var4 = new yq10("BASE_SMS_PROMO", 3);
        d = yq10Var4;
        yq10 yq10Var5 = new yq10("NOTIFY_NEWS_CALL", 4);
        e = yq10Var5;
        yq10[] yq10VarArr = {yq10Var, yq10Var2, yq10Var3, yq10Var4, yq10Var5};
        f = yq10VarArr;
        g = new c0o(yq10VarArr);
    }

    public static yq10 valueOf(String str) {
        return (yq10) Enum.valueOf(yq10.class, str);
    }

    public static yq10[] values() {
        return (yq10[]) f.clone();
    }
}
