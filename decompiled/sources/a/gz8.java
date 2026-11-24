package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gz8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gz8 f12169a;
    public static final gz8 b;
    public static final /* synthetic */ gz8[] c;

    static {
        gz8 gz8Var = new gz8("NOT_CONTRACTED", 0);
        f12169a = gz8Var;
        gz8 gz8Var2 = new gz8("CONTRACTED", 1);
        b = gz8Var2;
        c = new gz8[]{gz8Var, gz8Var2};
    }

    public static gz8 valueOf(String str) {
        return (gz8) Enum.valueOf(gz8.class, str);
    }

    public static gz8[] values() {
        return (gz8[]) c.clone();
    }
}
