package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class v12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v12 f36608a;
    public static final v12 b;
    public static final v12 c;
    public static final v12 d;
    public static final /* synthetic */ v12[] e;

    static {
        v12 v12Var = new v12("Top", 0);
        f36608a = v12Var;
        v12 v12Var2 = new v12("Middle", 1);
        b = v12Var2;
        v12 v12Var3 = new v12("Bottom", 2);
        c = v12Var3;
        v12 v12Var4 = new v12("Single", 3);
        d = v12Var4;
        e = new v12[]{v12Var, v12Var2, v12Var3, v12Var4};
    }

    public static v12 valueOf(String str) {
        return (v12) Enum.valueOf(v12.class, str);
    }

    public static v12[] values() {
        return (v12[]) e.clone();
    }
}
