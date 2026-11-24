package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class eit implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7876a;
    public final /* synthetic */ fit b;
    public final /* synthetic */ GenerateCouponTypeUiModel c;

    public /* synthetic */ eit(fit fitVar, GenerateCouponTypeUiModel generateCouponTypeUiModel, byte b) {
        this.f7876a = b;
        this.b = fitVar;
        this.c = generateCouponTypeUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7876a;
        GenerateCouponTypeUiModel generateCouponTypeUiModel = this.c;
        fit fitVar = this.b;
        switch (b) {
            case 0:
                int i = generateCouponTypeUiModel.b;
                ddk ddkVar = fit.m2;
                fitVar.P0(i);
                break;
            default:
                int i2 = generateCouponTypeUiModel.b;
                ddk ddkVar2 = fit.m2;
                fitVar.P0(i2);
                break;
        }
        return Unit.f46060a;
    }
}
