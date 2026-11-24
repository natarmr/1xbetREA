package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class agg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final agg0 f824a;
    public static final agg0 b;
    public static final agg0 c;
    public static final /* synthetic */ agg0[] d;

    static {
        agg0 agg0Var = new agg0("ATTACK", 0);
        f824a = agg0Var;
        agg0 agg0Var2 = new agg0("DEFEND", 1);
        b = agg0Var2;
        agg0 agg0Var3 = new agg0("DEFAULT", 2);
        c = agg0Var3;
        d = new agg0[]{agg0Var, agg0Var2, agg0Var3};
    }

    public static agg0 valueOf(String str) {
        return (agg0) Enum.valueOf(agg0.class, str);
    }

    public static agg0[] values() {
        return (agg0[]) d.clone();
    }
}
