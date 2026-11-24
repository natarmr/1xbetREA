package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class x93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x93 f40490a;
    public static final x93 b;
    public static final x93 c;
    public static final /* synthetic */ x93[] d;

    static {
        x93 x93Var = new x93("NOT_ANSWERED", 0);
        f40490a = x93Var;
        x93 x93Var2 = new x93("ANSWER_NEGATIVE", 1);
        b = x93Var2;
        x93 x93Var3 = new x93("ANSWER_POSITIVE", 2);
        c = x93Var3;
        d = new x93[]{x93Var, x93Var2, x93Var3};
    }

    public static x93 valueOf(String str) {
        return (x93) Enum.valueOf(x93.class, str);
    }

    public static x93[] values() {
        return (x93[]) d.clone();
    }
}
