package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zh0 f44367a;
    public static final zh0 b;
    public static final zh0 c;
    public static final zh0 d;
    public static final zh0 e;
    public static final /* synthetic */ zh0[] f;

    static {
        zh0 zh0Var = new zh0("FULL", 0);
        f44367a = zh0Var;
        zh0 zh0Var2 = new zh0("ICON_LEFT", 1);
        b = zh0Var2;
        zh0 zh0Var3 = new zh0("ICON_LEFT_VIRTUAL", 2);
        c = zh0Var3;
        zh0 zh0Var4 = new zh0("ICON_RIGHT", 3);
        d = zh0Var4;
        zh0 zh0Var5 = new zh0("RECTANGLE", 4);
        e = zh0Var5;
        f = new zh0[]{zh0Var, zh0Var2, zh0Var3, zh0Var4, zh0Var5};
    }

    public static zh0 valueOf(String str) {
        return (zh0) Enum.valueOf(zh0.class, str);
    }

    public static zh0[] values() {
        return (zh0[]) f.clone();
    }
}
