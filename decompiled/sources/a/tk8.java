package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tk8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34082a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ tk8(Function1 function1, byte b) {
        this.f34082a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34082a;
        sh8 sh8Var = sh8.f32200a;
        ju8 ju8Var = ju8.f17140a;
        nu8 nu8Var = nu8.f24137a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(sh8Var);
                return Unit.f46060a;
            case 1:
                function1.invoke(kk8.f18423a);
                return Unit.f46060a;
            case 2:
                function1.invoke(zh8.f44379a);
                return Unit.f46060a;
            case 3:
                function1.invoke(th8.f33950a);
                return Unit.f46060a;
            case 4:
                function1.invoke(bi8.f2648a);
                return Unit.f46060a;
            case 5:
                function1.invoke(mk8.f21933a);
                return Unit.f46060a;
            case 6:
                function1.invoke(wh8.f39154a);
                dyb.u0();
                return Boolean.TRUE;
            case 7:
                function1.invoke(ai8.f911a);
                return Unit.f46060a;
            case 8:
                function1.invoke(yh8.f42626a);
                return Unit.f46060a;
            case 9:
                function1.invoke(sh8Var);
                return Unit.f46060a;
            case 10:
                function1.invoke(ku8.f18900a);
                return Unit.f46060a;
            case 11:
                function1.invoke(hu8.f13667a);
                return Unit.f46060a;
            case 12:
                function1.invoke(lu8.f20661a);
                return Unit.f46060a;
            case 13:
                function1.invoke(zt8.f44944a);
                return Unit.f46060a;
            case 14:
                function1.invoke(qu8.f29335a);
                return Unit.f46060a;
            case 15:
                function1.invoke(mu8.f22402a);
                return Unit.f46060a;
            case 16:
                function1.invoke(ju8Var);
                return Unit.f46060a;
            case 17:
                function1.invoke(nu8Var);
                return Unit.f46060a;
            case 18:
                function1.invoke(au8.f1465a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(fv8.f10203a);
                return Unit.f46060a;
            case 20:
                function1.invoke(hv8.f13714a);
                return Unit.f46060a;
            case 21:
                function1.invoke(eu8.f8407a);
                return Unit.f46060a;
            case 22:
                function1.invoke(ju8Var);
                return Unit.f46060a;
            case 23:
                function1.invoke(nu8Var);
                return Unit.f46060a;
            case 24:
                function1.invoke(ju8Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(nu8Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(vy8.f38235a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(nz8.f24360a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(lz8.f20893a);
                return Unit.f46060a;
            default:
                function1.invoke(r09.f29620a);
                return Unit.f46060a;
        }
    }
}
