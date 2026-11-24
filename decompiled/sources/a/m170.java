package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m170 f20993a;
    public static final m170 b;
    public static final m170 c;
    public static final /* synthetic */ m170[] d;

    static {
        m170 m170Var = new m170("NONE", 0);
        f20993a = m170Var;
        m170 m170Var2 = new m170("DEFAULT", 1);
        b = m170Var2;
        m170 m170Var3 = new m170("UNDER_MAINTENANCE", 2);
        c = m170Var3;
        d = new m170[]{m170Var, m170Var2, m170Var3};
    }

    public static m170 valueOf(String str) {
        return (m170) Enum.valueOf(m170.class, str);
    }

    public static m170[] values() {
        return (m170[]) d.clone();
    }
}
