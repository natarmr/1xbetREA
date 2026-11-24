package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class bit implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2673a;
    public final /* synthetic */ dit b;
    public final /* synthetic */ GenerateCouponTypeUiModel c;

    public /* synthetic */ bit(dit ditVar, GenerateCouponTypeUiModel generateCouponTypeUiModel, byte b) {
        this.f2673a = b;
        this.b = ditVar;
        this.c = generateCouponTypeUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2673a;
        GenerateCouponTypeUiModel generateCouponTypeUiModel = this.c;
        dit ditVar = this.b;
        switch (b) {
            case 0:
                int i = generateCouponTypeUiModel.b;
                xak xakVar = dit.m2;
                ditVar.P0(i);
                break;
            default:
                int i2 = generateCouponTypeUiModel.b;
                xak xakVar2 = dit.m2;
                ditVar.P0(i2);
                break;
        }
        return Unit.f46060a;
    }
}
