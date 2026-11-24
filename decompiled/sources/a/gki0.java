package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gki0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gki0 f11446a;
    public static final gki0 b;
    public static final gki0 c;
    public static final /* synthetic */ gki0[] d;

    static {
        gki0 gki0Var = new gki0("PENDING", 0);
        f11446a = gki0Var;
        gki0 gki0Var2 = new gki0("CREATING", 1);
        b = gki0Var2;
        gki0 gki0Var3 = new gki0("CREATED", 2);
        c = gki0Var3;
        d = new gki0[]{gki0Var, gki0Var2, gki0Var3};
    }

    public static gki0 valueOf(String str) {
        return (gki0) Enum.valueOf(gki0.class, str);
    }

    public static gki0[] values() {
        return (gki0[]) d.clone();
    }
}
