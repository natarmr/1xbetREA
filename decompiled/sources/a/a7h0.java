package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a7h0 f370a;
    public static final a7h0 b;
    public static final a7h0 c;
    public static final a7h0 d;
    public static final a7h0 e;
    public static final a7h0 f;
    public static final a7h0 g;
    public static final a7h0 h;
    public static final /* synthetic */ a7h0[] i;

    static {
        a7h0 a7h0Var = new a7h0("TOP", 0);
        f370a = a7h0Var;
        a7h0 a7h0Var2 = new a7h0("HORIZONTAL_MIDDLE", 1);
        b = a7h0Var2;
        a7h0 a7h0Var3 = new a7h0("BOTTOM", 2);
        c = a7h0Var3;
        a7h0 a7h0Var4 = new a7h0("LEFT", 3);
        d = a7h0Var4;
        a7h0 a7h0Var5 = new a7h0("VERTICAL_MIDDLE", 4);
        e = a7h0Var5;
        a7h0 a7h0Var6 = new a7h0("RIGHT", 5);
        f = a7h0Var6;
        a7h0 a7h0Var7 = new a7h0("PRIMARY_DIAGONAL", 6);
        g = a7h0Var7;
        a7h0 a7h0Var8 = new a7h0("SECONDARY_DIAGONAL", 7);
        h = a7h0Var8;
        i = new a7h0[]{a7h0Var, a7h0Var2, a7h0Var3, a7h0Var4, a7h0Var5, a7h0Var6, a7h0Var7, a7h0Var8};
    }

    public static a7h0 valueOf(String str) {
        return (a7h0) Enum.valueOf(a7h0.class, str);
    }

    public static a7h0[] values() {
        return (a7h0[]) i.clone();
    }
}
