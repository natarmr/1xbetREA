package a;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nww0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24256a;
    public final /* synthetic */ uww0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nww0(uww0 uww0Var, String str, byte b) {
        this.f24256a = b;
        this.b = uww0Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f24256a;
        String str = this.c;
        uww0 uww0Var = this.b;
        switch (b) {
            case 0:
                return new lzw0(new nww0(uww0Var, str, (byte) 1));
            case 1:
                zlw0 zlw0Var = uww0Var.c.c;
                m6x0.T(zlw0Var);
                hvw0 hvw0VarP2 = zlw0Var.p2(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((kxw0) uww0Var.b).d.s1();
                map.put("gmp_version", 161000L);
                if (hvw0VarP2 != null) {
                    String strO = hvw0VarP2.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(hvw0VarP2.Q()));
                    map.put("dynamite_version", Long.valueOf(hvw0VarP2.b()));
                }
                return map;
            default:
                fck0 fck0Var = new fck0(uww0Var, str, false, (byte) 25);
                o3x0 o3x0Var = new o3x0("internal.remoteConfig", (byte) 0);
                o3x0Var.b.put("getValue", new lzw0(o3x0Var, fck0Var));
                return o3x0Var;
        }
    }
}
