package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lq8 f20474a;
    public static final lq8 b;
    public static final lq8 c;
    public static final /* synthetic */ lq8[] d;

    static {
        lq8 lq8Var = new lq8("Collapsed", 0);
        f20474a = lq8Var;
        lq8 lq8Var2 = new lq8("Dragging", 1);
        b = lq8Var2;
        lq8 lq8Var3 = new lq8("Expanded", 2);
        c = lq8Var3;
        d = new lq8[]{lq8Var, lq8Var2, lq8Var3};
    }

    public static lq8 valueOf(String str) {
        return (lq8) Enum.valueOf(lq8.class, str);
    }

    public static lq8[] values() {
        return (lq8[]) d.clone();
    }
}
