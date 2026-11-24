package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r080 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r080 f29619a;
    public static final r080 b;
    public static final r080 c;
    public static final /* synthetic */ r080[] d;
    public static final /* synthetic */ c0o e;

    static {
        r080 r080Var = new r080("None", 0);
        f29619a = r080Var;
        r080 r080Var2 = new r080("Confirm", 1);
        b = r080Var2;
        r080 r080Var3 = new r080("Reject", 2);
        c = r080Var3;
        r080[] r080VarArr = {r080Var, r080Var2, r080Var3};
        d = r080VarArr;
        e = new c0o(r080VarArr);
    }

    public static r080 valueOf(String str) {
        return (r080) Enum.valueOf(r080.class, str);
    }

    public static r080[] values() {
        return (r080[]) d.clone();
    }
}
