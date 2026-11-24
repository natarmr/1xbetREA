package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jkv0 f16689a;
    public static final jkv0 b;
    public static final jkv0 c;
    public static final /* synthetic */ jkv0[] d;

    static {
        jkv0 jkv0Var = new jkv0("WIN", 0);
        f16689a = jkv0Var;
        jkv0 jkv0Var2 = new jkv0("LOSE", 1);
        b = jkv0Var2;
        jkv0 jkv0Var3 = new jkv0("DRAW", 2);
        c = jkv0Var3;
        d = new jkv0[]{jkv0Var, jkv0Var2, jkv0Var3};
    }

    public static jkv0 valueOf(String str) {
        return (jkv0) Enum.valueOf(jkv0.class, str);
    }

    public static jkv0[] values() {
        return (jkv0[]) d.clone();
    }
}
