package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e6v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e6v0 f7306a;
    public static final e6v0 b;
    public static final /* synthetic */ e6v0[] c;

    static {
        e6v0 e6v0Var = new e6v0("WORKDAY", 0);
        f7306a = e6v0Var;
        e6v0 e6v0Var2 = new e6v0("WEEKEND", 1);
        b = e6v0Var2;
        c = new e6v0[]{e6v0Var, e6v0Var2};
    }

    public static e6v0 valueOf(String str) {
        return (e6v0) Enum.valueOf(e6v0.class, str);
    }

    public static e6v0[] values() {
        return (e6v0[]) c.clone();
    }
}
