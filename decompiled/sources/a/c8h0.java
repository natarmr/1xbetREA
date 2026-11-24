package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c8h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c8h0 f3914a;
    public static final c8h0 b;
    public static final c8h0 c;
    public static final /* synthetic */ c8h0[] d;

    static {
        c8h0 c8h0Var = new c8h0("MAIN", 0);
        f3914a = c8h0Var;
        c8h0 c8h0Var2 = new c8h0("RESULT", 1);
        b = c8h0Var2;
        c8h0 c8h0Var3 = new c8h0("NONE", 2);
        c = c8h0Var3;
        d = new c8h0[]{c8h0Var, c8h0Var2, c8h0Var3};
    }

    public static c8h0 valueOf(String str) {
        return (c8h0) Enum.valueOf(c8h0.class, str);
    }

    public static c8h0[] values() {
        return (c8h0[]) d.clone();
    }
}
