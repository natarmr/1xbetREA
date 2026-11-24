package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hom0 f13401a;
    public static final hom0 b;
    public static final hom0 c;
    public static final hom0 d;
    public static final hom0 e;
    public static final hom0 f;
    public static final hom0 g;
    public static final hom0 h;
    public static final /* synthetic */ hom0[] i;

    static {
        hom0 hom0Var = new hom0("PrimaryCheck", 0);
        f13401a = hom0Var;
        hom0 hom0Var2 = new hom0("GreenCheck", 1);
        b = hom0Var2;
        hom0 hom0Var3 = new hom0("GreenPlus", 2);
        c = hom0Var3;
        hom0 hom0Var4 = new hom0("GreenArrowDown", 3);
        d = hom0Var4;
        hom0 hom0Var5 = new hom0("RedCross", 4);
        e = hom0Var5;
        hom0 hom0Var6 = new hom0("RedMinus", 5);
        f = hom0Var6;
        hom0 hom0Var7 = new hom0("SecondaryClock", 6);
        g = hom0Var7;
        hom0 hom0Var8 = new hom0("SecondaryBlock", 7);
        h = hom0Var8;
        i = new hom0[]{hom0Var, hom0Var2, hom0Var3, hom0Var4, hom0Var5, hom0Var6, hom0Var7, hom0Var8};
    }

    public static hom0 valueOf(String str) {
        return (hom0) Enum.valueOf(hom0.class, str);
    }

    public static hom0[] values() {
        return (hom0[]) i.clone();
    }
}
