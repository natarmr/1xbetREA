package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m7r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m7r0 f21334a;
    public static final m7r0 b;
    public static final /* synthetic */ m7r0[] c;

    static {
        m7r0 m7r0Var = new m7r0("LIVE", 0);
        f21334a = m7r0Var;
        m7r0 m7r0Var2 = new m7r0("LINE", 1);
        b = m7r0Var2;
        c = new m7r0[]{m7r0Var, m7r0Var2};
    }

    public static m7r0 valueOf(String str) {
        return (m7r0) Enum.valueOf(m7r0.class, str);
    }

    public static m7r0[] values() {
        return (m7r0[]) c.clone();
    }
}
