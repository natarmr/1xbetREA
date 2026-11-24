package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wrs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wrs0 f39661a;
    public static final wrs0 b;
    public static final wrs0 c;
    public static final wrs0 d;
    public static final /* synthetic */ wrs0[] e;

    static {
        wrs0 wrs0Var = new wrs0("SUCCESSFUL", 0);
        f39661a = wrs0Var;
        wrs0 wrs0Var2 = new wrs0("REREGISTER", 1);
        b = wrs0Var2;
        wrs0 wrs0Var3 = new wrs0("CANCELLED", 2);
        c = wrs0Var3;
        wrs0 wrs0Var4 = new wrs0("ALREADY_SELECTED", 3);
        d = wrs0Var4;
        e = new wrs0[]{wrs0Var, wrs0Var2, wrs0Var3, wrs0Var4};
    }

    public static wrs0 valueOf(String str) {
        return (wrs0) Enum.valueOf(wrs0.class, str);
    }

    public static wrs0[] values() {
        return (wrs0[]) e.clone();
    }
}
