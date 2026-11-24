package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n19 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22738a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ n19(Function1 function1, byte b) {
        this.f22738a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22738a;
        fa9 fa9Var = fa9.f9197a;
        kmp kmpVar = kmp.f18552a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(p09.f26137a);
                break;
            case 1:
                function1.invoke(i09.f13938a);
                break;
            case 2:
                function1.invoke(w09.f38339a);
                break;
            case 3:
                function1.invoke(o09.f24410a);
                break;
            case 4:
                function1.invoke(q09.f27885a);
                break;
            case 5:
                function1.invoke(j09.f15672a);
                break;
            case 6:
                function1.invoke(m09.f20942a);
                break;
            case 7:
                function1.invoke(n09.f22690a);
                break;
            case 8:
                function1.invoke(aa9.f514a);
                break;
            case 9:
                function1.invoke(ba9.f2247a);
                break;
            case 10:
                function1.invoke(fa9Var);
                break;
            case 11:
                function1.invoke(fa9Var);
                break;
            case 12:
                function1.invoke(mt9.f22360a);
                break;
            case 13:
                function1.invoke(1);
                break;
            case 14:
                function1.invoke(2);
                break;
            case 15:
                function1.invoke(3);
                break;
            case 16:
                function1.invoke(4);
                break;
            case 17:
                function1.invoke(5);
                break;
            case 18:
                function1.invoke(era.f8271a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(gra.f11769a);
                break;
            case 20:
                function1.invoke(rta.f31069a);
                break;
            case 21:
                function1.invoke(ota.f25820a);
                break;
            case 22:
                function1.invoke(lxa.f20804a);
                break;
            case 23:
                function1.invoke(jxa.f17295a);
                break;
            case 24:
                function1.invoke(mxa.f22544a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(pmp.f27247a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(qmp.f28996a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(kmpVar);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(kmpVar);
                break;
            default:
                function1.invoke(ohb.f25257a);
                break;
        }
        return Unit.f46060a;
    }
}
