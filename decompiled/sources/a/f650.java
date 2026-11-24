package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f650 implements g650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f650 f8994a;
    public static final f650 b;
    public static final f650 c;
    public static final f650 d;
    public static final f650 e;
    public static final f650 f;
    public static final f650 g;
    public static final /* synthetic */ f650[] h;

    static {
        f650 f650Var = new f650("CHECK_DEEPLINK", 0);
        f8994a = f650Var;
        f650 f650Var2 = new f650("UPDATE_CONFIGURATION", 1);
        b = f650Var2;
        f650 f650Var3 = new f650("OBSERVE_FAVORITES", 2);
        c = f650Var3;
        f650 f650Var4 = new f650("OBSERVE_DAILY_TASKS", 3);
        d = f650Var4;
        f650 f650Var5 = new f650("CHECK_ONBOARD", 4);
        e = f650Var5;
        f650 f650Var6 = new f650("UPDATE_LOYALTY_PROGRAM", 5);
        f = f650Var6;
        f650 f650Var7 = new f650("COLLECT_CASHBACK", 6);
        g = f650Var7;
        h = new f650[]{f650Var, f650Var2, f650Var3, f650Var4, f650Var5, f650Var6, f650Var7};
    }

    public static f650 valueOf(String str) {
        return (f650) Enum.valueOf(f650.class, str);
    }

    public static f650[] values() {
        return (f650[]) h.clone();
    }
}
