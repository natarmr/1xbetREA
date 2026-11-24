package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lui0 f20675a;
    public static final lui0 b;
    public static final lui0 c;
    public static final /* synthetic */ lui0[] d;

    static {
        lui0 lui0Var = new lui0("ENABLE", 0);
        f20675a = lui0Var;
        lui0 lui0Var2 = new lui0("DISABLE", 1);
        b = lui0Var2;
        lui0 lui0Var3 = new lui0("HIDE", 2);
        c = lui0Var3;
        d = new lui0[]{lui0Var, lui0Var2, lui0Var3};
    }

    public static lui0 valueOf(String str) {
        return (lui0) Enum.valueOf(lui0.class, str);
    }

    public static lui0[] values() {
        return (lui0[]) d.clone();
    }
}
