package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j760 f16026a;
    public static final j760 b;
    public static final j760 c;
    public static final /* synthetic */ j760[] d;

    static {
        j760 j760Var = new j760("CONTENT_ALL_PERIOD_NOTIFICATIONS", 0);
        f16026a = j760Var;
        j760 j760Var2 = new j760("CONTENT_ALL_NOTIFICATIONS", 1);
        b = j760Var2;
        j760 j760Var3 = new j760("CONTENT_NOTIFICATION", 2);
        c = j760Var3;
        d = new j760[]{j760Var, j760Var2, j760Var3};
    }

    public static j760 valueOf(String str) {
        return (j760) Enum.valueOf(j760.class, str);
    }

    public static j760[] values() {
        return (j760[]) d.clone();
    }
}
