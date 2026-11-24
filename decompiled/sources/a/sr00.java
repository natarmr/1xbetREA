package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sr00 f32653a;
    public static final sr00 b;
    public static final sr00 c;
    public static final sr00 d;
    public static final sr00 e;
    public static final sr00 f;
    public static final sr00 g;
    public static final sr00 h;
    public static final sr00 i;
    public static final sr00 j;
    public static final /* synthetic */ sr00[] k;

    static {
        sr00 sr00Var = new sr00("PROFILAXIS_COMPLETE", 0);
        f32653a = sr00Var;
        sr00 sr00Var2 = new sr00("FAVORITES_EVENTS_START_SOON", 1);
        b = sr00Var2;
        sr00 sr00Var3 = new sr00("NEED_COMPLETE_COUPON", 2);
        c = sr00Var3;
        sr00 sr00Var4 = new sr00("NEED_AUTH_FOR_AUTHENTICATOR", 3);
        d = sr00Var4;
        sr00 sr00Var5 = new sr00("FIRST_DEPOSIT_BONUS", 4);
        e = sr00Var5;
        sr00 sr00Var6 = new sr00("CASINO_ENABLE_NEW_DAILY_TASKS", 5);
        f = sr00Var6;
        sr00 sr00Var7 = new sr00("CASINO_DO_NOT_MISS_DAILY_REWARDS", 6);
        g = sr00Var7;
        sr00 sr00Var8 = new sr00("AUTH_REMINDER_ONE_DAY", 7);
        h = sr00Var8;
        sr00 sr00Var9 = new sr00("AUTH_REMINDER_THREE_DAYS", 8);
        i = sr00Var9;
        sr00 sr00Var10 = new sr00("AUTH_REMINDER_ONE_WEEK", 9);
        j = sr00Var10;
        k = new sr00[]{sr00Var, sr00Var2, sr00Var3, sr00Var4, sr00Var5, sr00Var6, sr00Var7, sr00Var8, sr00Var9, sr00Var10};
    }

    public static sr00 valueOf(String str) {
        return (sr00) Enum.valueOf(sr00.class, str);
    }

    public static sr00[] values() {
        return (sr00[]) k.clone();
    }
}
