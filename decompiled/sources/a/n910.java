package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n910 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n910 f23116a;
    public static final n910 b;
    public static final n910 c;
    public static final /* synthetic */ n910[] d;

    static {
        n910 n910Var = new n910("DEFAULT", 0);
        f23116a = n910Var;
        n910 n910Var2 = new n910("HEAP", 1);
        b = n910Var2;
        n910 n910Var3 = new n910("SELECTED", 2);
        c = n910Var3;
        d = new n910[]{n910Var, n910Var2, n910Var3};
    }

    public static n910 valueOf(String str) {
        return (n910) Enum.valueOf(n910.class, str);
    }

    public static n910[] values() {
        return (n910[]) d.clone();
    }
}
