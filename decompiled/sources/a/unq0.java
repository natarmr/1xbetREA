package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class unq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final unq0 f35976a;
    public static final unq0 b;
    public static final unq0 c;
    public static final /* synthetic */ unq0[] d;
    public static final /* synthetic */ c0o e;

    static {
        unq0 unq0Var = new unq0("DECREMENTING", 0);
        f35976a = unq0Var;
        unq0 unq0Var2 = new unq0("INCREMENTING_STANDART", 1);
        b = unq0Var2;
        unq0 unq0Var3 = new unq0("INCREMENTING_EXTENDED", 2);
        c = unq0Var3;
        unq0[] unq0VarArr = {unq0Var, unq0Var2, unq0Var3};
        d = unq0VarArr;
        e = new c0o(unq0VarArr);
    }

    public static unq0 valueOf(String str) {
        return (unq0) Enum.valueOf(unq0.class, str);
    }

    public static unq0[] values() {
        return (unq0[]) d.clone();
    }
}
