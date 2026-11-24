package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class png0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final png0 f27285a;
    public static final png0 b;
    public static final png0 c;
    public static final /* synthetic */ png0[] d;

    static {
        png0 png0Var = new png0("HEADER", 0);
        f27285a = png0Var;
        png0 png0Var2 = new png0("DEFAULT", 1);
        b = png0Var2;
        png0 png0Var3 = new png0("REF", 2);
        c = png0Var3;
        d = new png0[]{png0Var, png0Var2, png0Var3};
    }

    public static png0 valueOf(String str) {
        return (png0) Enum.valueOf(png0.class, str);
    }

    public static png0[] values() {
        return (png0[]) d.clone();
    }
}
