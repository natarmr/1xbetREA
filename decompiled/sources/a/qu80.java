package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qu80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29336a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ qu80(Function1 function1, byte b) {
        this.f29336a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29336a;
        zt80 zt80Var = zt80.f44945a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(bu80.f3220a);
                break;
            case 1:
                function1.invoke(xt80.f41453a);
                break;
            case 2:
                function1.invoke(zt80Var);
                break;
            case 3:
                function1.invoke(zt80Var);
                break;
            case 4:
                function1.invoke(st80.f32762a);
                break;
            case 5:
                function1.invoke(hy80.f13848a);
                break;
            case 6:
                function1.invoke(ky80.f19095a);
                break;
            case 7:
                function1.invoke(h9f0.f12673a);
                break;
            case 8:
                function1.invoke(vve0.f38095a);
                break;
            case 9:
                function1.invoke(e3f0.f7132a);
                break;
            case 10:
                function1.invoke(v490.f36766a);
                break;
            case 11:
                function1.invoke(z490.f43759a);
                break;
            case 12:
                function1.invoke(x390.f40207a);
                break;
            case 13:
                function1.invoke(v390.f36723a);
                break;
            case 14:
                function1.invoke(u390.f34986a);
                break;
            case 15:
                function1.invoke(s390.f31546a);
                break;
            case 16:
                function1.invoke(t390.f33256a);
                break;
            case 17:
                function1.invoke(y390.f41940a);
                break;
            case 18:
                function1.invoke(j490.f15873a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(g490.f10654a);
                break;
            case 20:
                function1.invoke(p490.f26342a);
                break;
            case 21:
                function1.invoke(d490.f5444a);
                break;
            case 22:
                function1.invoke(h490.f12424a);
                break;
            case 23:
                function1.invoke(e490.f7171a);
                break;
            case 24:
                function1.invoke(i9f0.f14382a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(wve0.f39834a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(f3f0.f8860a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(xpw.f41286a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(du30.f6682a);
                break;
            default:
                function1.invoke(a0a0.f17a);
                break;
        }
        return Unit.f46060a;
    }
}
