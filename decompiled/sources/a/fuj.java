package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fuj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vzj f10165a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        vzj vzjVar;
        int i = bao0.f2270a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            rwj rwjVar = tvk.f34603a;
            vs10 vs10Var = ys10.f43147a;
            vzjVar = ((vs10Var.x() instanceof ch40) || !(vs10Var instanceof vzj)) ? euj.k : (vzj) vs10Var;
        } else {
            vzjVar = euj.k;
        }
        f10165a = vzjVar;
    }
}
