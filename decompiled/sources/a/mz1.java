package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22630a;
    public final /* synthetic */ wz1 b;
    public final /* synthetic */ myr0 c;

    public /* synthetic */ mz1(wz1 wz1Var, myr0 myr0Var, byte b) {
        this.f22630a = b;
        this.b = wz1Var;
        this.c = myr0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22630a;
        myr0 myr0Var = this.c;
        wz1 wz1Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                nz1 nz1Var = new nz1(wz1Var, myr0Var, (byte) 0);
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(nz1Var)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            default:
                nz1 nz1Var2 = new nz1(wz1Var, myr0Var, (byte) 1);
                k0w0Var.getClass();
                c8d c8dVar2 = (c8d) k0w0Var.b(new a1w0(nz1Var2)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
        }
        return Unit.f46060a;
    }
}
