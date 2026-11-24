package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xwy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41632a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xwy(Function1 function1, byte b) {
        this.f41632a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41632a;
        oqz oqzVar = oqz.f25711a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(rc2.f30218a);
                return Unit.f46060a;
            case 1:
                function1.invoke(pb2.f26684a);
                return Unit.f46060a;
            case 2:
                function1.invoke(q62.f28179a);
                return Unit.f46060a;
            case 3:
                function1.invoke(qc2.f28467a);
                return Unit.f46060a;
            case 4:
                function1.invoke(qb2.f28426a);
                return Unit.f46060a;
            case 5:
                function1.invoke(r62.f29914a);
                return Unit.f46060a;
            case 6:
                function1.invoke(byy.f3440a);
                return Unit.f46060a;
            case 7:
                function1.invoke(ayy.f1692a);
                return Unit.f46060a;
            case 8:
                function1.invoke(kzy.f19171a);
                return Unit.f46060a;
            case 9:
                function1.invoke(mzy.f22673a);
                return Unit.f46060a;
            case 10:
                function1.invoke(e0z.f7014a);
                return Unit.f46060a;
            case 11:
                function1.invoke(h0z.f12255a);
                return Unit.f46060a;
            case 12:
                function1.invoke(i0z.f13970a);
                return Unit.f46060a;
            case 13:
                function1.invoke(jfz.f16453a);
                return Unit.f46060a;
            case 14:
                function1.invoke(kfz.f18215a);
                return Unit.f46060a;
            case 15:
                function1.invoke(ffz.f9466a);
                return Unit.f46060a;
            case 16:
                function1.invoke(msz.f22346a);
                return Unit.f46060a;
            case 17:
                function1.invoke(rsz.f31054a);
                return Unit.f46060a;
            case 18:
                dyb.Q(new xwy(function1, (byte) 19));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(koz.f18652a);
                return Boolean.TRUE;
            case 20:
                function1.invoke(ioz.f15138a);
                return Unit.f46060a;
            case 21:
                dyb.Q(new xwy(function1, (byte) 22));
                return Unit.f46060a;
            case 22:
                function1.invoke(yoz.f43007a);
                return Boolean.TRUE;
            case 23:
                function1.invoke(zoz.f44737a);
                return Unit.f46060a;
            case 24:
                dyb.Q(new xwy(function1, (byte) 25));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(spz.f32607a);
                return Boolean.TRUE;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(tpz.f34359a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(oqzVar);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(sqz.f32651a);
                return Unit.f46060a;
            default:
                function1.invoke(oqzVar);
                return Unit.f46060a;
        }
    }
}
