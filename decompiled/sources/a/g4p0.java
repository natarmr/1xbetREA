package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g4p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10679a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ g4p0(Function1 function1, byte b) {
        this.f10679a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10679a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(x3p0.f40231a);
                return Unit.f46060a;
            case 1:
                function1.invoke(n5p0.f22955a);
                return Unit.f46060a;
            case 2:
                function1.invoke(o5p0.f24698a);
                return Unit.f46060a;
            case 3:
                function1.invoke(d7p0.f5605a);
                return Unit.f46060a;
            case 4:
                function1.invoke(e7p0.f7339a);
                return Unit.f46060a;
            case 5:
                function1.invoke(kap0.f17975a);
                return Unit.f46060a;
            case 6:
                function1.invoke(iap0.f14450a);
                return Unit.f46060a;
            case 7:
                function1.invoke(g8p0.f10877a);
                return Unit.f46060a;
            case 8:
                function1.invoke(pgp0.f26963a);
                return Unit.f46060a;
            case 9:
                function1.invoke(qgp0.f28698a);
                return Unit.f46060a;
            case 10:
                function1.invoke(ckp0.f4518a);
                return Unit.f46060a;
            case 11:
                function1.invoke(fkp0.f9704a);
                return Unit.f46060a;
            case 12:
                function1.invoke(cnp0.f4667a);
                return Unit.f46060a;
            case 13:
                function1.invoke(dnp0.f6381a);
                return Unit.f46060a;
            case 14:
                function1.invoke(pn6.f27270a);
                return Unit.f46060a;
            case 15:
                function1.invoke(gop0.f11643a);
                return Unit.f46060a;
            case 16:
                function1.invoke(hop0.f13406a);
                return Unit.f46060a;
            case 17:
                function1.invoke(wdn.c);
                return Unit.f46060a;
            case 18:
                function1.invoke(wdn.d);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(tqk0.f34385a);
                return Unit.f46060a;
            case 20:
                function1.invoke(vrp0.f37912a);
                return Unit.f46060a;
            case 21:
                function1.invoke(xrp0.f41380a);
                return Unit.f46060a;
            case 22:
                function1.invoke(zxp0.f45172a);
                return Unit.f46060a;
            case 23:
                function1.invoke(ayp0.f1680a);
                dyb.u0();
                return Boolean.TRUE;
            case 24:
                function1.invoke(cyp0.f5189a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(eyp0.f8638a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(yxp0.f43435a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(qxp0.f29497a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(sxp0.f32989a);
                return Unit.f46060a;
            default:
                function1.invoke(rxp0.f31276a);
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
