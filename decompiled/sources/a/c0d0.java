package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c0d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0d0 f3519a;
    public static final c0d0 b;
    public static final /* synthetic */ c0d0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    c0d0 EF0;

    static {
        c0d0 c0d0Var = new c0d0("PRETTY", 0);
        c0d0 c0d0Var2 = new c0d0("DEBUG", 1);
        f3519a = c0d0Var2;
        c0d0 c0d0Var3 = new c0d0("NONE", 2);
        b = c0d0Var3;
        c = new c0d0[]{c0d0Var, c0d0Var2, c0d0Var3};
    }

    public static c0d0 valueOf(String str) {
        return (c0d0) Enum.valueOf(c0d0.class, str);
    }

    public static c0d0[] values() {
        return (c0d0[]) c.clone();
    }
}
