package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class m32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m32 f21092a;
    public static final m32 b;
    public static final m32 c;
    public static final m32 d;
    public static final /* synthetic */ m32[] e;

    static {
        m32 m32Var = new m32("LOADING", 0);
        f21092a = m32Var;
        m32 m32Var2 = new m32("ERROR", 1);
        b = m32Var2;
        m32 m32Var3 = new m32("SUCCESS_WITH_EMPTY", 2);
        c = m32Var3;
        m32 m32Var4 = new m32("SUCCESS", 3);
        d = m32Var4;
        e = new m32[]{m32Var, m32Var2, m32Var3, m32Var4};
    }

    public static m32 valueOf(String str) {
        return (m32) Enum.valueOf(m32.class, str);
    }

    public static m32[] values() {
        return (m32[]) e.clone();
    }
}
