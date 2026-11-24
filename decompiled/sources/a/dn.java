package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6342a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dn(Function1 function1, byte b) {
        this.f6342a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6342a;
        uv uvVar = uv.f36324a;
        af0 af0Var = af0.f756a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(lm.f20271a);
                break;
            case 1:
                function1.invoke(om.f25480a);
                break;
            case 2:
                function1.invoke(qs.f29233a);
                break;
            case 3:
                function1.invoke(os.f25759a);
                break;
            case 4:
                function1.invoke(uvVar);
                break;
            case 5:
                function1.invoke(vv.f38073a);
                break;
            case 6:
                function1.invoke(uvVar);
                break;
            case 7:
                function1.invoke(a27.f110a);
                break;
            case 8:
                function1.invoke(l17.f19235a);
                break;
            case 9:
                function1.invoke(jx.f17277a);
                break;
            case 10:
                function1.invoke(ix.f15515a);
                break;
            case 11:
                function1.invoke(z00.f43541a);
                break;
            case 12:
                function1.invoke(c10.f3549a);
                break;
            case 13:
                function1.invoke(ed0.f7593a);
                break;
            case 14:
                function1.invoke(gf0.f11181a);
                break;
            case 15:
                function1.invoke(xe0.f40721a);
                break;
            case 16:
                function1.invoke(ze0.f44233a);
                break;
            case 17:
                function1.invoke(ye0.f42465a);
                break;
            case 18:
                function1.invoke(af0Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(af0Var);
                break;
            case 20:
                function1.invoke(ef0.f7700a);
                break;
            case 21:
                function1.invoke(te0.f33796a);
                break;
            case 22:
                function1.invoke(al0.f1046a);
                break;
            case 23:
                function1.invoke(bl0.f2773a);
                break;
            case 24:
                function1.invoke(ll0.f20225a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(jl0.f16694a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(fl0.f9718a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(kl0.f18463a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(dl0.f6256a);
                break;
            default:
                function1.invoke(ol0.f25431a);
                break;
        }
        return Unit.f46060a;
    }
}
