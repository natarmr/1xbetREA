package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i99 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i99 f14377a;
    public static final i99 b;
    public static final i99 c;
    public static final /* synthetic */ i99[] d;

    static {
        i99 i99Var = new i99("SUSPEND", 0);
        f14377a = i99Var;
        i99 i99Var2 = new i99("DROP_OLDEST", 1);
        b = i99Var2;
        i99 i99Var3 = new i99("DROP_LATEST", 2);
        c = i99Var3;
        d = new i99[]{i99Var, i99Var2, i99Var3};
    }

    public static i99 valueOf(String str) {
        return (i99) Enum.valueOf(i99.class, str);
    }

    public static i99[] values() {
        return (i99[]) d.clone();
    }
}
