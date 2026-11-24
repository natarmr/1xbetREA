package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ghn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ghn0 f11308a;
    public static final ghn0 b;
    public static final ghn0 c;
    public static final /* synthetic */ ghn0[] d;

    static {
        ghn0 ghn0Var = new ghn0("CONTINUE", 0);
        f11308a = ghn0Var;
        ghn0 ghn0Var2 = new ghn0("HISTORY", 1);
        b = ghn0Var2;
        ghn0 ghn0Var3 = new ghn0("SHARE", 2);
        c = ghn0Var3;
        d = new ghn0[]{ghn0Var, ghn0Var2, ghn0Var3};
    }

    public static ghn0 valueOf(String str) {
        return (ghn0) Enum.valueOf(ghn0.class, str);
    }

    public static ghn0[] values() {
        return (ghn0[]) d.clone();
    }
}
