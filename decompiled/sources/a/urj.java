package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoSettingsScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class urj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36165a;
    public final /* synthetic */ PromoScreenFactoryImpl$getPromoSettingsScreen$1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ urj(PromoScreenFactoryImpl$getPromoSettingsScreen$1 promoScreenFactoryImpl$getPromoSettingsScreen$1, boolean z, byte b) {
        this.f36165a = b;
        this.b = promoScreenFactoryImpl$getPromoSettingsScreen$1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36165a;
        byte b2 = 1;
        boolean z = this.c;
        PromoScreenFactoryImpl$getPromoSettingsScreen$1 promoScreenFactoryImpl$getPromoSettingsScreen$1 = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new urj(promoScreenFactoryImpl$getPromoSettingsScreen$1, z, b2));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((c8d) k0w0Var.h(promoScreenFactoryImpl$getPromoSettingsScreen$1).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, z));
                break;
        }
        return Unit.f46060a;
    }
}
