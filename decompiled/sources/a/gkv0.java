package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gkv0 f11463a;
    public static final gkv0 b;
    public static final gkv0 c;
    public static final /* synthetic */ gkv0[] d;

    static {
        gkv0 gkv0Var = new gkv0("TEAM_ONE", 0);
        f11463a = gkv0Var;
        gkv0 gkv0Var2 = new gkv0("TEAM_TWO", 1);
        b = gkv0Var2;
        gkv0 gkv0Var3 = new gkv0("NONE", 2);
        c = gkv0Var3;
        d = new gkv0[]{gkv0Var, gkv0Var2, gkv0Var3};
    }

    public static gkv0 valueOf(String str) {
        return (gkv0) Enum.valueOf(gkv0.class, str);
    }

    public static gkv0[] values() {
        return (gkv0[]) d.clone();
    }
}
