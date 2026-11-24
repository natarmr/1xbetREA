package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o83 f24813a;
    public static final o83 b;
    public static final /* synthetic */ o83[] c;

    static {
        o83 o83Var = new o83("CALL_BY_NAME", 0);
        f24813a = o83Var;
        o83 o83Var2 = new o83("POSITIONAL_CALL", 1);
        b = o83Var2;
        c = new o83[]{o83Var, o83Var2};
    }

    public static o83 valueOf(String str) {
        return (o83) Enum.valueOf(o83.class, str);
    }

    public static o83[] values() {
        return (o83[]) c.clone();
    }
}
