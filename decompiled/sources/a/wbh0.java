package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wbh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wbh0 f38879a;
    public static final wbh0 b;
    public static final /* synthetic */ wbh0[] c;

    static {
        wbh0 wbh0Var = new wbh0("ITEMS", 0);
        f38879a = wbh0Var;
        wbh0 wbh0Var2 = new wbh0("INDICATOR", 1);
        b = wbh0Var2;
        c = new wbh0[]{wbh0Var, wbh0Var2};
    }

    public static wbh0 valueOf(String str) {
        return (wbh0) Enum.valueOf(wbh0.class, str);
    }

    public static wbh0[] values() {
        return (wbh0[]) c.clone();
    }
}
