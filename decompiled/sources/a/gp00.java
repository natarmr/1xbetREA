package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gp00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gp00 f11660a;
    public static final gp00 b;
    public static final gp00 c;
    public static final /* synthetic */ gp00[] d;

    static {
        gp00 gp00Var = new gp00("REFRESH", 0);
        f11660a = gp00Var;
        gp00 gp00Var2 = new gp00("PREPEND", 1);
        b = gp00Var2;
        gp00 gp00Var3 = new gp00("APPEND", 2);
        c = gp00Var3;
        d = new gp00[]{gp00Var, gp00Var2, gp00Var3};
    }

    public static gp00 valueOf(String str) {
        return (gp00) Enum.valueOf(gp00.class, str);
    }

    public static gp00[] values() {
        return (gp00[]) d.clone();
    }
}
