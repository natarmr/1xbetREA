package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nrj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24004a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nrj0(Function1 function1, byte b) {
        this.f24004a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24004a;
        q420 q420Var = q420.f28077a;
        s420 s420Var = s420.f31584a;
        r420 r420Var = r420.f29815a;
        s1k0 s1k0Var = s1k0.f31461a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Boolean.FALSE);
                break;
            case 1:
                function1.invoke(j520.f15913a);
                break;
            case 2:
                function1.invoke(r420Var);
                break;
            case 3:
                function1.invoke(i320.f14077a);
                break;
            case 4:
                function1.invoke(q420Var);
                break;
            case 5:
                function1.invoke(h320.f12365a);
                break;
            case 6:
                function1.invoke(s420Var);
                break;
            case 7:
                function1.invoke(q420Var);
                break;
            case 8:
                function1.invoke(s420Var);
                break;
            case 9:
                function1.invoke(r420Var);
                break;
            case 10:
                function1.invoke(w420.f38525a);
                break;
            case 11:
                function1.invoke(p1k0.f26206a);
                break;
            case 12:
                function1.invoke(q1k0.f27958a);
                break;
            case 13:
                function1.invoke(s1k0Var);
                break;
            case 14:
                function1.invoke(o1k0.f24484a);
                break;
            case 15:
                function1.invoke(y1k0.f41859a);
                break;
            case 16:
                function1.invoke(z1k0.f43626a);
                break;
            case 17:
                function1.invoke(v1k0.f36636a);
                break;
            case 18:
                function1.invoke(s1k0Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(r1k0.f29685a);
                break;
            case 20:
                function1.invoke(t4k0.f33324a);
                break;
            case 21:
                function1.invoke(v4k0.f36785a);
                break;
            case 22:
                function1.invoke(q62.f28179a);
                break;
            case 23:
                function1.invoke(d62.f5532a);
                break;
            case 24:
                function1.invoke(qc2.f28467a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(rc2.f30218a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(r62.f29914a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(pb2.f26684a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(qb2.f28426a);
                break;
            default:
                function1.invoke(ock0.f25031a);
                break;
        }
        return Unit.f46060a;
    }
}
