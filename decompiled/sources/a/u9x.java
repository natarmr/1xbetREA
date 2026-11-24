package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u9x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35304a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ u9x(Function1 function1, byte b) {
        this.f35304a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35304a;
        z0y z0yVar = z0y.f43592a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(q97.f28334a);
                break;
            case 1:
                function1.invoke(rbx.f30211a);
                break;
            case 2:
                function1.invoke(sbx.f31959a);
                break;
            case 3:
                function1.invoke(yor0.f43001a);
                break;
            case 4:
                function1.invoke(epr0.f8201a);
                break;
            case 5:
                function1.invoke(cpr0.f4762a);
                break;
            case 6:
                function1.invoke(b1y.f1829a);
                break;
            case 7:
                function1.invoke(a1y.f97a);
                break;
            case 8:
                function1.invoke(z0yVar);
                break;
            case 9:
                function1.invoke(y0y.f41830a);
                break;
            case 10:
                function1.invoke(z0yVar);
                break;
            case 11:
                function1.invoke(v0y.f36603a);
                break;
            case 12:
                function1.invoke(l3y.f19378a);
                break;
            case 13:
                function1.invoke(f3y.f8886a);
                break;
            case 14:
                function1.invoke(i3y.f14121a);
                break;
            case 15:
                function1.invoke(h3y.f12408a);
                break;
            case 16:
                function1.invoke(k3y.f17642a);
                break;
            case 17:
                function1.invoke(l4y.f19433a);
                break;
            case 18:
                function1.invoke(f4y.f8935a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(i4y.f14166a);
                break;
            case 20:
                function1.invoke(h4y.f12455a);
                break;
            case 21:
                function1.invoke(k4y.f17692a);
                break;
            case 22:
                function1.invoke(j5y.f15957a);
                break;
            case 23:
                function1.invoke(i5y.f14216a);
                break;
            case 24:
                function1.invoke(h5y.f12504a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(d5y.f5528a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(wor0.f39511a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(vzx.f38319a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(tzx.f34825a);
                break;
            default:
                function1.invoke(d62.f5532a);
                break;
        }
        return Unit.f46060a;
    }
}
