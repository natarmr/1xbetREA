package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qr8 f29196a;
    public static final qr8 b;
    public static final /* synthetic */ qr8[] c;

    static {
        qr8 qr8Var = new qr8("TOP", 0);
        f29196a = qr8Var;
        qr8 qr8Var2 = new qr8("MIDDLE", 1);
        qr8 qr8Var3 = new qr8("BOTTOM", 2);
        b = qr8Var3;
        c = new qr8[]{qr8Var, qr8Var2, qr8Var3};
    }

    public static qr8 valueOf(String str) {
        return (qr8) Enum.valueOf(qr8.class, str);
    }

    public static qr8[] values() {
        return (qr8[]) c.clone();
    }
}
