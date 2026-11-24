package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCodesScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pqh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27417a;
    public final /* synthetic */ irh0 b;

    public /* synthetic */ pqh0(irh0 irh0Var, byte b) {
        this.f27417a = b;
        this.b = irh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27417a;
        irh0 irh0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                irh0Var.w.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new PromoScreenFactoryImpl$getPromoCodesScreen$1()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            default:
                c8d c8dVar2 = (c8d) k0w0Var.h(svs0.c(irh0Var.x)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
        }
        return Unit.f46060a;
    }
}
