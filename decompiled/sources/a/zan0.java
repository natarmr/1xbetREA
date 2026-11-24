package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zan0 f44079a;
    public static final zan0 b;
    public static final zan0 c;
    public static final /* synthetic */ zan0[] d;

    static {
        zan0 zan0Var = new zan0("NO_ERROR", 0);
        f44079a = zan0Var;
        zan0 zan0Var2 = new zan0("CONTENT_ERROR", 1);
        b = zan0Var2;
        zan0 zan0Var3 = new zan0("CONTENT_EMPTY_ERROR", 2);
        c = zan0Var3;
        d = new zan0[]{zan0Var, zan0Var2, zan0Var3};
    }

    public static zan0 valueOf(String str) {
        return (zan0) Enum.valueOf(zan0.class, str);
    }

    public static zan0[] values() {
        return (zan0[]) d.clone();
    }
}
