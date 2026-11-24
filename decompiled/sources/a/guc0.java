package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class guc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final guc0 f11922a;
    public static final guc0 b;
    public static final /* synthetic */ guc0[] c;

    static {
        guc0 guc0Var = new guc0("HORIZONTAL", 0);
        f11922a = guc0Var;
        guc0 guc0Var2 = new guc0("VERTICAL", 1);
        b = guc0Var2;
        c = new guc0[]{guc0Var, guc0Var2};
    }

    public static guc0 valueOf(String str) {
        return (guc0) Enum.valueOf(guc0.class, str);
    }

    public static guc0[] values() {
        return (guc0[]) c.clone();
    }
}
