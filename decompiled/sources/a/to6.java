package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class to6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34268a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ to6(Function1 function1, byte b) {
        this.f34268a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34268a;
        oe7 oe7Var = oe7.f25110a;
        qi8 qi8Var = qi8.f28778a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(gn6.f11571a);
                break;
            case 1:
                function1.invoke(nn6.f23805a);
                break;
            case 2:
                function1.invoke(lq6.f20471a);
                break;
            case 3:
                function1.invoke(pq6.f27399a);
                break;
            case 4:
                function1.invoke(q27.f27987a);
                break;
            case 5:
                function1.invoke(j17.f15719a);
                break;
            case 6:
                function1.invoke(n37.f22835a);
                break;
            case 7:
                function1.invoke(x17.f40106a);
                break;
            case 8:
                function1.invoke(k37.f17604a);
                break;
            case 9:
                function1.invoke(t17.f33156a);
                break;
            case 10:
                function1.invoke(m17.f20992a);
                break;
            case 11:
                function1.invoke(oe7Var);
                break;
            case 12:
                function1.invoke(oe7Var);
                break;
            case 13:
                function1.invoke(oi7.f25298a);
                break;
            case 14:
                function1.invoke(ji7.f16561a);
                break;
            case 15:
                function1.invoke(otg0.f25829a);
                break;
            case 16:
                function1.invoke(ntg0.f24099a);
                break;
            case 17:
                function1.invoke(ltg0.f20628a);
                break;
            case 18:
                function1.invoke(fp7.f9915a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(gp7.f11670a);
                break;
            case 20:
                function1.invoke(hp7.f13429a);
                break;
            case 21:
                function1.invoke(dp7.f6449a);
                break;
            case 22:
                function1.invoke(f48.f8900a);
                break;
            case 23:
                function1.invoke(h48.f12421a);
                break;
            case 24:
                function1.invoke(jc8.f16263a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(oc8.f25016a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(qc8.f28473a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(qi8Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(qi8Var);
                break;
            default:
                function1.invoke(ri8.f30528a);
                break;
        }
        return Unit.f46060a;
    }
}
