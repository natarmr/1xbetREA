package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dj90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dj90 f6173a;
    public static final dj90 b;
    public static final dj90 c;
    public static final /* synthetic */ dj90[] d;

    static {
        dj90 dj90Var = new dj90("FIRST", 0);
        f6173a = dj90Var;
        dj90 dj90Var2 = new dj90("LAST", 1);
        b = dj90Var2;
        dj90 dj90Var3 = new dj90("NONE", 2);
        c = dj90Var3;
        d = new dj90[]{dj90Var, dj90Var2, dj90Var3};
    }

    public static dj90 valueOf(String str) {
        return (dj90) Enum.valueOf(dj90.class, str);
    }

    public static dj90[] values() {
        return (dj90[]) d.clone();
    }
}
