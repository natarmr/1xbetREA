package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z83 f43948a;
    public static final z83 b;
    public static final z83 c;
    public static final z83 d;
    public static final z83 e;
    public static final z83 f;
    public static final z83 g;
    public static final /* synthetic */ z83[] h;

    static {
        z83 z83Var = new z83("Paragraph", 0);
        f43948a = z83Var;
        z83 z83Var2 = new z83("Span", 1);
        b = z83Var2;
        z83 z83Var3 = new z83("VerbatimTts", 2);
        c = z83Var3;
        z83 z83Var4 = new z83("Url", 3);
        d = z83Var4;
        z83 z83Var5 = new z83("Link", 4);
        e = z83Var5;
        z83 z83Var6 = new z83("Clickable", 5);
        f = z83Var6;
        z83 z83Var7 = new z83("String", 6);
        g = z83Var7;
        h = new z83[]{z83Var, z83Var2, z83Var3, z83Var4, z83Var5, z83Var6, z83Var7};
    }

    public static z83 valueOf(String str) {
        return (z83) Enum.valueOf(z83.class, str);
    }

    public static z83[] values() {
        return (z83[]) h.clone();
    }
}
