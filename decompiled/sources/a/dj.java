package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6160a;
    public final /* synthetic */ wj b;

    public /* synthetic */ dj(wj wjVar, byte b) {
        this.f6160a = b;
        this.b = wjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6160a;
        wj wjVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new nc((Object) wjVar, (byte) 3))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                wjVar.m.f(th, new dj(wjVar, (byte) 2));
                break;
            default:
                wjVar.x.g(new fj(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
