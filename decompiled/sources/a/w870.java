package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w870 f38709a;
    public static final w870 b;
    public static final w870 c;
    public static final w870 d;
    public static final w870 e;
    public static final w870 f;
    public static final w870 g;
    public static final w870 h;
    public static final /* synthetic */ w870[] i;

    static {
        w870 w870Var = new w870("SectionBalanceExpired", 0);
        f38709a = w870Var;
        w870 w870Var2 = new w870("SportBonusBalanceNotAllowed", 1);
        b = w870Var2;
        w870 w870Var3 = new w870("BonusBalanceNotAllowed", 2);
        c = w870Var3;
        w870 w870Var4 = new w870("BonusWithSecondaryAccountNotAllowed", 3);
        d = w870Var4;
        w870 w870Var5 = new w870("BonusWithBonusAccountNotAllowed", 4);
        e = w870Var5;
        w870 w870Var6 = new w870("BonusResetAfterChangeAccount", 5);
        f = w870Var6;
        w870 w870Var7 = new w870("WildFreeBetDisabled", 6);
        g = w870Var7;
        w870 w870Var8 = new w870("Allowed", 7);
        h = w870Var8;
        i = new w870[]{w870Var, w870Var2, w870Var3, w870Var4, w870Var5, w870Var6, w870Var7, w870Var8};
    }

    public static w870 valueOf(String str) {
        return (w870) Enum.valueOf(w870.class, str);
    }

    public static w870[] values() {
        return (w870[]) i.clone();
    }
}
