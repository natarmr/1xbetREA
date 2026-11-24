package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pao0 f26664a;
    public static final pao0 b;
    public static final pao0 c;
    public static final pao0 d;
    public static final pao0 e;
    public static final /* synthetic */ pao0[] f;

    static {
        pao0 pao0Var = new pao0("MainButtonAccentIcons", 0);
        f26664a = pao0Var;
        pao0 pao0Var2 = new pao0("BubbleSelectionIcons", 1);
        b = pao0Var2;
        pao0 pao0Var3 = new pao0("ColorSelectionIcons", 2);
        c = pao0Var3;
        pao0 pao0Var4 = new pao0("BackgroundSelectionIcons", 3);
        d = pao0Var4;
        pao0 pao0Var5 = new pao0("MainButtonLogoIcons", 4);
        e = pao0Var5;
        f = new pao0[]{pao0Var, pao0Var2, pao0Var3, pao0Var4, pao0Var5};
    }

    public static pao0 valueOf(String str) {
        return (pao0) Enum.valueOf(pao0.class, str);
    }

    public static pao0[] values() {
        return (pao0[]) f.clone();
    }
}
