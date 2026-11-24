package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f538a;
    public static final boolean b;
    public static final boolean c;

    static {
        Object g0g0Var;
        Object g0g0Var2;
        Object g0g0Var3;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        String str = (String) g0g0Var;
        boolean z = false;
        f538a = str != null && Boolean.parseBoolean(str);
        try {
            g0g0Var2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = null;
        }
        String str2 = (String) g0g0Var2;
        b = str2 != null && Boolean.parseBoolean(str2);
        try {
            g0g0Var3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var3 = new g0g0(th3);
        }
        String str3 = (String) (g0g0Var3 instanceof g0g0 ? null : g0g0Var3);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        c = z;
    }
}
