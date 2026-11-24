package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t48 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33306a;
    public final /* synthetic */ mdm b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ t48(mdm mdmVar, Function1 function1, int i, byte b) {
        this.f33306a = b;
        this.b = mdmVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33306a;
        Function1 function1 = this.c;
        mdm mdmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                unh0.A(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 1:
                fre0.B(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 2:
                unh0.B(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 3:
                y860.x(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 4:
                ju70.r(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 5:
                aad.q(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 6:
                y9a.v(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 7:
                mrv.C(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 8:
                epv0.o(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 9:
                hew0.k(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 10:
                uc9.w(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 11:
                eeq.w(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 12:
                xia0.j(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 13:
                unh0.h(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 14:
                azw.b(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 15:
                o2e.v(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 16:
                x8f.A(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 17:
                qjj.s(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 18:
                knx.r(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ahy.s(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 20:
                cfx0.j(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 21:
                xf0.l(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 22:
                b34.s(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 23:
                dj8.t(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 24:
                rq8.m(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uc9.x(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                knx.y(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gq80.v(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                f1t0.r(mdmVar, function1, fetVar, x8x.L(1));
                break;
            default:
                w7n0.c(mdmVar, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
