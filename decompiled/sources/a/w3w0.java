package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3w0 f38519a;
    public static final w3w0 b;
    public static final /* synthetic */ w3w0[] c;

    static {
        w3w0 w3w0Var = new w3w0("ZONE_3D", 0);
        f38519a = w3w0Var;
        w3w0 w3w0Var2 = new w3w0("ZONE_2D", 1);
        b = w3w0Var2;
        c = new w3w0[]{w3w0Var, w3w0Var2};
    }

    public static w3w0 valueOf(String str) {
        return (w3w0) Enum.valueOf(w3w0.class, str);
    }

    public static w3w0[] values() {
        return (w3w0[]) c.clone();
    }
}
