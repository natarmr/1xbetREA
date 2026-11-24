package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class an7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final an7 f1136a;
    public static final an7 b;
    public static final an7 c;
    public static final an7 d;
    public static final /* synthetic */ an7[] e;

    static {
        an7 an7Var = new an7("VALID", 0);
        f1136a = an7Var;
        an7 an7Var2 = new an7("NOT_ENOUGH_MONEY", 1);
        b = an7Var2;
        an7 an7Var3 = new an7("EXCEEDS_BET_LIMITS", 2);
        c = an7Var3;
        an7 an7Var4 = new an7("BONUS_NOT_ENOUGH_MONEY", 3);
        d = an7Var4;
        e = new an7[]{an7Var, an7Var2, an7Var3, an7Var4};
    }

    public static an7 valueOf(String str) {
        return (an7) Enum.valueOf(an7.class, str);
    }

    public static an7[] values() {
        return (an7[]) e.clone();
    }
}
