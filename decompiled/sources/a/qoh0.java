package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCodesScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qoh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29074a;
    public final /* synthetic */ iph0 b;

    public /* synthetic */ qoh0(iph0 iph0Var, byte b) {
        this.f29074a = b;
        this.b = iph0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29074a;
        iph0 iph0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                iph0Var.x.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new PromoScreenFactoryImpl$getPromoCodesScreen$1()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            default:
                c8d c8dVar2 = (c8d) k0w0Var.h(svs0.c(iph0Var.y)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
        }
        return Unit.f46060a;
    }
}
