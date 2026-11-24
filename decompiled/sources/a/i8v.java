package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i8v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14360a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ i8v(Function1 function1, byte b) {
        this.f14360a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14360a;
        ogw ogwVar = ogw.f25238a;
        s7w s7wVar = s7w.f31771a;
        phw phwVar = phw.f27017a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(z7v.f43938a);
                break;
            case 1:
                function1.invoke(a8v.f446a);
                break;
            case 2:
                function1.invoke(ucv.f35451a);
                break;
            case 3:
                function1.invoke(wcv.f38943a);
                break;
            case 4:
                function1.invoke(ogwVar);
                break;
            case 5:
                function1.invoke(ogwVar);
                break;
            case 6:
                function1.invoke(otv.f25848a);
                break;
            case 7:
                function1.invoke(qtv.f29317a);
                break;
            case 8:
                function1.invoke(Boolean.FALSE);
                break;
            case 9:
                function1.invoke(s7wVar);
                break;
            case 10:
                function1.invoke(s7wVar);
                break;
            case 11:
                function1.invoke(kcw.f18081a);
                break;
            case 12:
                function1.invoke(rcw.f30260a);
                break;
            case 13:
                function1.invoke(jcw.f16299a);
                break;
            case 14:
                function1.invoke(pcw.f26779a);
                break;
            case 15:
                function1.invoke(ihw.f14800a);
                break;
            case 16:
                function1.invoke(egw.f7782a);
                break;
            case 17:
                function1.invoke(qhw.f28762a);
                break;
            case 18:
                function1.invoke(cgw.f4333a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(phwVar);
                break;
            case 20:
                function1.invoke(phwVar);
                break;
            case 21:
                function1.invoke(ngw.f23504a);
                break;
            case 22:
                function1.invoke(omw.f25523a);
                break;
            case 23:
                function1.invoke(mmw.f22063a);
                break;
            case 24:
                function1.invoke(tnw.f34256a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(unw.f35982a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(uqw.f36137a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(tqw.f34398a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(fa7.f9193a);
                break;
            default:
                function1.invoke(v97.f37021a);
                break;
        }
        return Unit.f46060a;
    }
}
