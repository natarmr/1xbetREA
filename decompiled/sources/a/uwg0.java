package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class uwg0 extends kotlin.coroutines.a implements nne {
    public final /* synthetic */ byte b;
    public final /* synthetic */ cxg0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public uwg0(cxg0 cxg0Var, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                lwf lwfVar = lwf.h;
                this.c = cxg0Var;
                super(lwfVar);
                break;
            default:
                lwf lwfVar2 = lwf.h;
                this.c = cxg0Var;
                super(lwfVar2);
                break;
        }
    }

    @Override // a.nne
    public final void l(Throwable th, CoroutineContext coroutineContext) {
        switch (this.b) {
            case 0:
                boolean z = th instanceof zhi0;
                cxg0 cxg0Var = this.c;
                if (z) {
                    nj7 nj7Var = cxg0Var.k;
                    int errorCode = ((zhi0) th).c.getErrorCode();
                    b4j b4jVar = nj7Var.f23620a;
                    a1w a1wVar = a1w.f93a;
                    r6w r6wVar = r6w.j;
                    b4jVar.c(String.valueOf(errorCode), r6wVar);
                    nj7Var.b.f(errorCode, r6wVar.a());
                }
                cxg0Var.F(false);
                cxg0Var.i.b(th, new due0(2, cxg0Var, cxg0.class, "onFullSaleError", "onFullSaleError(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 15));
                break;
            default:
                boolean z2 = th instanceof zhi0;
                cxg0 cxg0Var2 = this.c;
                if (z2) {
                    nj7 nj7Var2 = cxg0Var2.k;
                    int errorCode2 = ((zhi0) th).c.getErrorCode();
                    b4j b4jVar2 = nj7Var2.f23620a;
                    a1w a1wVar2 = a1w.f93a;
                    r6w r6wVar2 = r6w.j;
                    b4jVar2.c(String.valueOf(errorCode2), r6wVar2);
                    nj7Var2.b.f(errorCode2, r6wVar2.a());
                }
                cxg0Var2.F(false);
                cxg0Var2.i.b(th, new due0(2, cxg0Var2, cxg0.class, "onSaleError", "onSaleError(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 16));
                break;
        }
    }
}
