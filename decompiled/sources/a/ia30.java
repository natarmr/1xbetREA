package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ia30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14417a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ia30(Function1 function1, byte b) {
        this.f14417a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14417a;
        o420 o420Var = o420.f24612a;
        d62 d62Var = d62.f5532a;
        qb2 qb2Var = qb2.f28426a;
        qc2 qc2Var = qc2.f28467a;
        q62 q62Var = q62.f28179a;
        pb2 pb2Var = pb2.f26684a;
        rc2 rc2Var = rc2.f30218a;
        r62 r62Var = r62.f29914a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(fdb.f9351a);
                break;
            case 1:
                function1.invoke(edb.f7607a);
                break;
            case 2:
                function1.invoke(gdb.f11096a);
                break;
            case 3:
                function1.invoke(rb30.f30165a);
                break;
            case 4:
                function1.invoke(tb30.f33643a);
                break;
            case 5:
                function1.invoke(mb30.f21488a);
                break;
            case 6:
                function1.invoke(ob30.f24959a);
                break;
            case 7:
                function1.invoke(z420.f43748a);
                break;
            case 8:
                function1.invoke(o420Var);
                break;
            case 9:
                function1.invoke(o320.f24561a);
                break;
            case 10:
                function1.invoke(b520.f1980a);
                break;
            case 11:
                function1.invoke(o420Var);
                break;
            case 12:
                function1.invoke(j420.f15864a);
                break;
            case 13:
                function1.invoke(h420.f12413a);
                break;
            case 14:
                function1.invoke(i420.f14125a);
                break;
            case 15:
                function1.invoke(p420.f26329a);
                break;
            case 16:
                function1.invoke(d62Var);
                break;
            case 17:
                function1.invoke(qb2Var);
                break;
            case 18:
                function1.invoke(qc2Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(q62Var);
                break;
            case 20:
                function1.invoke(r62Var);
                break;
            case 21:
                function1.invoke(pb2Var);
                break;
            case 22:
                function1.invoke(rc2Var);
                break;
            case 23:
                function1.invoke(d62Var);
                break;
            case 24:
                function1.invoke(qb2Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(qc2Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(q62Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(pb2Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(rc2Var);
                break;
            default:
                function1.invoke(r62Var);
                break;
        }
        return Unit.f46060a;
    }
}
