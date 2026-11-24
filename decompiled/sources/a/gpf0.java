package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gpf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gpf0 f11681a;
    public static final gpf0 b;
    public static final gpf0 c;
    public static final /* synthetic */ gpf0[] d;

    static {
        gpf0 gpf0Var = new gpf0("SAFES", 0);
        f11681a = gpf0Var;
        gpf0 gpf0Var2 = new gpf0("DOORS", 1);
        b = gpf0Var2;
        gpf0 gpf0Var3 = new gpf0("FINISHED", 2);
        c = gpf0Var3;
        d = new gpf0[]{gpf0Var, gpf0Var2, gpf0Var3};
    }

    public static gpf0 valueOf(String str) {
        return (gpf0) Enum.valueOf(gpf0.class, str);
    }

    public static gpf0[] values() {
        return (gpf0[]) d.clone();
    }
}
