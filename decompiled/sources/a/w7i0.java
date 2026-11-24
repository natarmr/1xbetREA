package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w7i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38674a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ w7i0(Function1 function1, byte b) {
        this.f38674a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38674a;
        k8i0 k8i0Var = k8i0.f17873a;
        bli0 bli0Var = bli0.f2797a;
        i6j0 i6j0Var = i6j0.f14242a;
        l6j0 l6j0Var = l6j0.f19509a;
        m6j0 m6j0Var = m6j0.f21273a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(i7i0.f14293a);
                break;
            case 1:
                function1.invoke(k8i0Var);
                break;
            case 2:
                function1.invoke(k8i0Var);
                break;
            case 3:
                function1.invoke(bli0Var);
                break;
            case 4:
                function1.invoke(bli0Var);
                break;
            case 5:
                function1.invoke(gli0.f11492a);
                break;
            case 6:
                if (function1 != null) {
                    function1.invoke(zui0.f45011a);
                }
                break;
            case 7:
                if (function1 != null) {
                    function1.invoke(yui0.f43270a);
                }
                break;
            case 8:
                function1.invoke(gyi0.f12132a);
                break;
            case 9:
                function1.invoke(pyi0.f27802a);
                break;
            case 10:
                function1.invoke(myi0.f22605a);
                break;
            case 11:
                function1.invoke(tyi0.f34758a);
                break;
            case 12:
                function1.invoke(yzi0.f43515a);
                break;
            case 13:
                function1.invoke(k6j0.f17774a);
                break;
            case 14:
                function1.invoke(i6j0Var);
                break;
            case 15:
                function1.invoke(i6j0Var);
                break;
            case 16:
                function1.invoke(l6j0Var);
                break;
            case 17:
                function1.invoke(l6j0Var);
                break;
            case 18:
                function1.invoke(m6j0Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(m6j0Var);
                break;
            case 20:
                function1.invoke(uaj0.f35332a);
                break;
            case 21:
                function1.invoke(ebj0.f7521a);
                break;
            case 22:
                function1.invoke(dbj0.f5808a);
                break;
            case 23:
                function1.invoke(jlj0.f16722a);
                break;
            case 24:
                function1.invoke(jmj0.f16769a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(emj0.f8049a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(imj0.f15029a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(kmj0.f18542a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(lmj0.f20298a);
                break;
            default:
                function1.invoke(v900.f37010a);
                break;
        }
        return Unit.f46060a;
    }
}
