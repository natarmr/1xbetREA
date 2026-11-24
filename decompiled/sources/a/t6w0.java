package a;

import org.xplatform.secret.impl.SecurityImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class t6w0 implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33440a;
    public final zix b;

    public /* synthetic */ t6w0(Object obj, zix zixVar, byte b) {
        this.f33440a = b;
        this.b = zixVar;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f33440a;
        zix zixVar = this.b;
        switch (b) {
            case 0:
                xjh0 xjh0Var = (xjh0) zixVar.f44459a;
                xjh0Var.getClass();
                vby vbyVarG = xjh0Var.g();
                x1x.y(vbyVarG);
                return vbyVarG;
            case 1:
                xjh0 xjh0Var2 = (xjh0) zixVar.f44459a;
                xjh0Var2.getClass();
                wsb0 wsb0VarF = xjh0Var2.f();
                x1x.y(wsb0VarF);
                return wsb0VarF;
            case 2:
                xjh0 xjh0Var3 = (xjh0) zixVar.f44459a;
                xjh0Var3.getClass();
                akh0 akh0VarC = xjh0Var3.c();
                x1x.y(akh0VarC);
                return akh0VarC;
            case 3:
                String str = (String) zixVar.f44459a;
                str.getClass();
                return new SecurityImpl(str);
            default:
                i6a i6aVar = (i6a) zixVar.f44459a;
                i6aVar.getClass();
                kii0 serviceProvider = i6aVar.getServiceProvider();
                x1x.y(serviceProvider);
                return serviceProvider;
        }
    }
}
