package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ht40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ht40 f13615a;
    public static final ht40 b;
    public static final ht40 c;
    public static final /* synthetic */ ht40[] d;

    static {
        ht40 ht40Var = new ht40("CONTENT", 0);
        f13615a = ht40Var;
        ht40 ht40Var2 = new ht40("TOOLBAR", 1);
        b = ht40Var2;
        ht40 ht40Var3 = new ht40("WIDGET", 2);
        c = ht40Var3;
        d = new ht40[]{ht40Var, ht40Var2, ht40Var3};
    }

    public static ht40 valueOf(String str) {
        return (ht40) Enum.valueOf(ht40.class, str);
    }

    public static ht40[] values() {
        return (ht40[]) d.clone();
    }
}
