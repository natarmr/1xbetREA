package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yqz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43097a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ yqz(Function1 function1, byte b) {
        this.f43097a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43097a;
        ksz kszVar = ksz.f18837a;
        nuz nuzVar = nuz.f24168a;
        xvz xvzVar = xvz.f41585a;
        exz exzVar = exz.f8601a;
        l000 l000Var = l000.f19175a;
        qzz qzzVar = qzz.f29600a;
        s300 s300Var = s300.f31531a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                dyb.Q(new yqz(function1, (byte) 1));
                return Unit.f46060a;
            case 1:
                function1.invoke(nqz.f23977a);
                return Boolean.TRUE;
            case 2:
                function1.invoke(ssz.f32749a);
                return Unit.f46060a;
            case 3:
                function1.invoke(kszVar);
                return Unit.f46060a;
            case 4:
                function1.invoke(qsz.f29274a);
                return Unit.f46060a;
            case 5:
                function1.invoke(kszVar);
                return Unit.f46060a;
            case 6:
                function1.invoke(quz.f29364a);
                return Unit.f46060a;
            case 7:
                function1.invoke(nuzVar);
                return Unit.f46060a;
            case 8:
                function1.invoke(ruz.f31147a);
                return Unit.f46060a;
            case 9:
                function1.invoke(nuzVar);
                return Unit.f46060a;
            case 10:
                function1.invoke(xvzVar);
                return Unit.f46060a;
            case 11:
                function1.invoke(awz.f1597a);
                return Unit.f46060a;
            case 12:
                function1.invoke(xvzVar);
                return Unit.f46060a;
            case 13:
                function1.invoke(exzVar);
                return Unit.f46060a;
            case 14:
                function1.invoke(ixz.f15564a);
                return Unit.f46060a;
            case 15:
                function1.invoke(exzVar);
                return Unit.f46060a;
            case 16:
                function1.invoke(jxz.f17334a);
                return Unit.f46060a;
            case 17:
                function1.invoke(l000Var);
                return Unit.f46060a;
            case 18:
                dyb.Q(new yqz(function1, (byte) 20));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                dyb.Q(new yqz(function1, (byte) 21));
                return Unit.f46060a;
            case 20:
                function1.invoke(k000.f17440a);
                return Boolean.TRUE;
            case 21:
                function1.invoke(j000.f15660a);
                return Boolean.TRUE;
            case 22:
                function1.invoke(l000Var);
                return Unit.f46060a;
            case 23:
                function1.invoke(uzz.f36557a);
                return Unit.f46060a;
            case 24:
                function1.invoke(qzzVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(wzz.f40041a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(qzzVar);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(s300Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(v300.f36711a);
                return Unit.f46060a;
            default:
                function1.invoke(s300Var);
                return Unit.f46060a;
        }
    }
}
