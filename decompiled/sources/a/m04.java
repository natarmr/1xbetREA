package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m04 f20935a;
    public static final m04 b;
    public static final /* synthetic */ m04[] c;

    static {
        m04 m04Var = new m04("AUTOMATIC", 0);
        f20935a = m04Var;
        m04 m04Var2 = new m04("ENABLED", 1);
        b = m04Var2;
        c = new m04[]{m04Var, m04Var2, new m04("DISABLED", 2)};
    }

    public static m04 valueOf(String str) {
        return (m04) Enum.valueOf(m04.class, str);
    }

    public static m04[] values() {
        return (m04[]) c.clone();
    }
}
