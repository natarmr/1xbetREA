package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p860 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p860 f26540a;
    public static final p860 b;
    public static final p860 c;
    public static final /* synthetic */ p860[] d;

    static {
        p860 p860Var = new p860("FORCE_FLEXIBILITY", 0);
        f26540a = p860Var;
        p860 p860Var2 = new p860("NULLABLE", 1);
        b = p860Var2;
        p860 p860Var3 = new p860("NOT_NULL", 2);
        c = p860Var3;
        d = new p860[]{p860Var, p860Var2, p860Var3};
    }

    public static p860 valueOf(String str) {
        return (p860) Enum.valueOf(p860.class, str);
    }

    public static p860[] values() {
        return (p860[]) d.clone();
    }
}
