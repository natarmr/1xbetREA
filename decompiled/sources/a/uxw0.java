package a;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class uxw0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36462a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ oyw0 e;

    public /* synthetic */ uxw0(oyw0 oyw0Var, String str, String str2, String str3, byte b) {
        this.f36462a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = oyw0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f36462a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        oyw0 oyw0Var = this.e;
        switch (b) {
            case 0:
                m6x0 m6x0Var = oyw0Var.f26078a;
                m6x0Var.V();
                zlw0 zlw0Var = m6x0Var.c;
                m6x0.T(zlw0Var);
                return zlw0Var.j2(str3, str2, str);
            case 1:
                m6x0 m6x0Var2 = oyw0Var.f26078a;
                m6x0Var2.V();
                zlw0 zlw0Var2 = m6x0Var2.c;
                m6x0.T(zlw0Var2);
                return zlw0Var2.j2(str3, str2, str);
            case 2:
                m6x0 m6x0Var3 = oyw0Var.f26078a;
                m6x0Var3.V();
                zlw0 zlw0Var3 = m6x0Var3.c;
                m6x0.T(zlw0Var3);
                return zlw0Var3.n2(str3, str2, str);
            default:
                m6x0 m6x0Var4 = oyw0Var.f26078a;
                m6x0Var4.V();
                zlw0 zlw0Var4 = m6x0Var4.c;
                m6x0.T(zlw0Var4);
                return zlw0Var4.n2(str3, str2, str);
        }
    }
}
