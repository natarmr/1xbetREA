package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cdn0 f4170a;
    public static final cdn0 b;
    public static final cdn0 c;
    public static final /* synthetic */ cdn0[] d;

    static {
        cdn0 cdn0Var = new cdn0("NO_ERROR", 0);
        f4170a = cdn0Var;
        cdn0 cdn0Var2 = new cdn0("CONTENT_ERROR", 1);
        b = cdn0Var2;
        cdn0 cdn0Var3 = new cdn0("CONTENT_EMPTY_ERROR", 2);
        c = cdn0Var3;
        d = new cdn0[]{cdn0Var, cdn0Var2, cdn0Var3};
    }

    public static cdn0 valueOf(String str) {
        return (cdn0) Enum.valueOf(cdn0.class, str);
    }

    public static cdn0[] values() {
        return (cdn0[]) d.clone();
    }
}
