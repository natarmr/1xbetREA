package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xv8 f41546a;
    public static final /* synthetic */ xv8[] b;

    static {
        xv8 xv8Var = new xv8("SETTING_CELL", 0);
        f41546a = xv8Var;
        b = new xv8[]{xv8Var, new xv8("CHIPS", 1)};
    }

    public static xv8 valueOf(String str) {
        return (xv8) Enum.valueOf(xv8.class, str);
    }

    public static xv8[] values() {
        return (xv8[]) b.clone();
    }
}
