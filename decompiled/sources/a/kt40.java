package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kt40 f18846a;
    public static final kt40 b;
    public static final kt40 c;
    public static final /* synthetic */ kt40[] d;

    static {
        kt40 kt40Var = new kt40("CONTENT", 0);
        f18846a = kt40Var;
        kt40 kt40Var2 = new kt40("TITLE", 1);
        b = kt40Var2;
        kt40 kt40Var3 = new kt40("CHIPS", 2);
        c = kt40Var3;
        d = new kt40[]{kt40Var, kt40Var2, kt40Var3};
    }

    public static kt40 valueOf(String str) {
        return (kt40) Enum.valueOf(kt40.class, str);
    }

    public static kt40[] values() {
        return (kt40[]) d.clone();
    }
}
