package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v460 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v460 f36763a;
    public static final v460 b;
    public static final /* synthetic */ v460[] c;

    static {
        v460 v460Var = new v460("Min", 0);
        f36763a = v460Var;
        v460 v460Var2 = new v460("Max", 1);
        b = v460Var2;
        c = new v460[]{v460Var, v460Var2};
    }

    public static v460 valueOf(String str) {
        return (v460) Enum.valueOf(v460.class, str);
    }

    public static v460[] values() {
        return (v460[]) c.clone();
    }
}
