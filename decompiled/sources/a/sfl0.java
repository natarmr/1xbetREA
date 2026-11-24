package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sfl0 f32124a;
    public static final sfl0 b;
    public static final sfl0 c;
    public static final sfl0 d;
    public static final sfl0 e;
    public static final /* synthetic */ sfl0[] f;

    static {
        sfl0 sfl0Var = new sfl0("SINGLE", 0);
        f32124a = sfl0Var;
        sfl0 sfl0Var2 = new sfl0("ACCORDION_EXPANDED", 1);
        b = sfl0Var2;
        sfl0 sfl0Var3 = new sfl0("ACCORDION_COLLAPSED", 2);
        c = sfl0Var3;
        sfl0 sfl0Var4 = new sfl0("SUB_ITEM", 3);
        d = sfl0Var4;
        sfl0 sfl0Var5 = new sfl0("SUB_ITEM_BOTTOM", 4);
        e = sfl0Var5;
        f = new sfl0[]{sfl0Var, sfl0Var2, sfl0Var3, sfl0Var4, sfl0Var5};
    }

    public static sfl0 valueOf(String str) {
        return (sfl0) Enum.valueOf(sfl0.class, str);
    }

    public static sfl0[] values() {
        return (sfl0[]) f.clone();
    }
}
