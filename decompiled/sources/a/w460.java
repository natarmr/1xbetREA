package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w460 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w460 f38530a;
    public static final w460 b;
    public static final /* synthetic */ w460[] c;

    static {
        w460 w460Var = new w460("Width", 0);
        f38530a = w460Var;
        w460 w460Var2 = new w460("Height", 1);
        b = w460Var2;
        c = new w460[]{w460Var, w460Var2};
    }

    public static w460 valueOf(String str) {
        return (w460) Enum.valueOf(w460.class, str);
    }

    public static w460[] values() {
        return (w460[]) c.clone();
    }
}
