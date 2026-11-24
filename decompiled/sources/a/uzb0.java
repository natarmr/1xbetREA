package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uzb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uzb0 f36529a;
    public static final uzb0 b;
    public static final uzb0 c;
    public static final /* synthetic */ uzb0[] d;

    static {
        uzb0 uzb0Var = new uzb0("BY_POPULARITY", 0);
        f36529a = uzb0Var;
        uzb0 uzb0Var2 = new uzb0("ALPHABETICALLY_ASC", 1);
        b = uzb0Var2;
        uzb0 uzb0Var3 = new uzb0("ALPHABETICALLY_DESC", 2);
        c = uzb0Var3;
        d = new uzb0[]{uzb0Var, uzb0Var2, uzb0Var3};
    }

    public static uzb0 valueOf(String str) {
        return (uzb0) Enum.valueOf(uzb0.class, str);
    }

    public static uzb0[] values() {
        return (uzb0[]) d.clone();
    }
}
