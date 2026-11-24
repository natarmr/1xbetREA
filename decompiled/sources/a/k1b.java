package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k1b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17513a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k1b(Object obj, long j, boolean z, String str, boolean z2, byte b) {
        this.f17513a = b;
        this.f = obj;
        this.b = j;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17513a;
        boolean z = this.e;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(uxs0.c(((h2b) obj2).J, this.b, null, this.c, this.d, 6)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(z, bjkVar, bjkVar);
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(uxs0.c(((pm60) obj2).p, this.b, null, this.c, this.d, 6)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(z, bjkVar2, bjkVar2);
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar3 = (c8d) k0w0Var3.h(uxs0.c(((nn60) obj2).w, this.b, null, this.c, this.d, 6)).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(z, bjkVar3, bjkVar3);
                break;
            case 3:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar4 = (c8d) k0w0Var4.h(uxs0.c(((hv60) obj2).L, this.b, null, this.c, this.d, 6)).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(z, bjkVar4, bjkVar4);
                break;
            default:
                c8d c8dVar5 = (c8d) ((k0w0) obj).h(uxs0.c(((g9b0) obj2).D, this.b, null, this.c, this.d, 6)).f14945a;
                bjk bjkVar5 = cfx0.o;
                c8dVar5.f3908a = new v7d(z, bjkVar5, bjkVar5);
                break;
        }
        return Unit.f46060a;
    }
}
