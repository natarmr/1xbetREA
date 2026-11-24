package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class oot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oot0 f25610a;
    public static final oot0 b;
    public static final oot0 c;
    public static final /* synthetic */ oot0[] d;
    public static final /* synthetic */ c0o e;

    static {
        oot0 oot0Var = new oot0("SESSION_CONFIG", 0);
        f25610a = oot0Var;
        oot0 oot0Var2 = new oot0("DEFAULT", 1);
        b = oot0Var2;
        oot0 oot0Var3 = new oot0("CAMERA2_CAMERA_CONTROL", 2);
        c = oot0Var3;
        oot0[] oot0VarArr = {oot0Var, oot0Var2, oot0Var3};
        d = oot0VarArr;
        e = new c0o(oot0VarArr);
    }

    public static oot0 valueOf(String str) {
        return (oot0) Enum.valueOf(oot0.class, str);
    }

    public static oot0[] values() {
        return (oot0[]) d.clone();
    }
}
