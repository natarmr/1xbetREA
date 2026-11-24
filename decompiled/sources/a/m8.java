package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m8 f21344a;
    public static final m8 b;
    public static final m8 c;
    public static final m8 d;
    public static final /* synthetic */ m8[] e;

    static {
        m8 m8Var = new m8("LEFT", 0);
        f21344a = m8Var;
        m8 m8Var2 = new m8("RIGHT", 1);
        b = m8Var2;
        m8 m8Var3 = new m8("LEFT_BOTTOM", 2);
        c = m8Var3;
        m8 m8Var4 = new m8("RIGHT_BOTTOM", 3);
        d = m8Var4;
        e = new m8[]{m8Var, m8Var2, m8Var3, m8Var4};
    }

    public static m8 valueOf(String str) {
        return (m8) Enum.valueOf(m8.class, str);
    }

    public static m8[] values() {
        return (m8[]) e.clone();
    }
}
