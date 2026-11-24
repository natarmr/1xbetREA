package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ygw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4x0 f42607a;
    public static volatile String b;
    public static final owp0 c;

    static {
        wgw0 wgw0Var = wgw0.b;
        int i = f4x.c;
        n5x0 n5x0Var = new n5x0(wgw0Var, true, ycf0.j);
        fbv fbvVar = new fbv();
        fbvVar.b = n5x0Var;
        c = new owp0((Object) fbvVar, (byte) 26);
        f42607a = new y4x0("__phenotype_server_token", fbvVar, "");
        b = null;
    }

    public static String a() {
        return (String) f42607a.get();
    }
}
