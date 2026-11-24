package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dng0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6367a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dng0(Function1 function1, byte b) {
        this.f6367a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6367a;
        dj7 dj7Var = dj7.f6169a;
        r110 r110Var = r110.f29656a;
        bwd0 bwd0Var = bwd0.f3319a;
        kyt0 kyt0Var = kyt0.f19123a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(mlg0.f21989a);
                break;
            case 1:
                function1.invoke(ii7.f14816a);
                break;
            case 2:
                function1.invoke(hi7.f13100a);
                break;
            case 3:
                function1.invoke(dj7Var);
                break;
            case 4:
                function1.invoke(dj7Var);
                break;
            case 5:
                function1.invoke(ktg0.f18864a);
                break;
            case 6:
                function1.invoke(u110.f34882a);
                break;
            case 7:
                function1.invoke(r110Var);
                break;
            case 8:
                function1.invoke(r110Var);
                break;
            case 9:
                function1.invoke(v110.f36607a);
                break;
            case 10:
                function1.invoke(bwd0Var);
                break;
            case 11:
                function1.invoke(ewd0.f8519a);
                break;
            case 12:
                function1.invoke(bwd0Var);
                break;
            case 13:
                function1.invoke(fwd0.f10253a);
                break;
            case 14:
                function1.invoke(kyt0Var);
                break;
            case 15:
                function1.invoke(nyt0.f24345a);
                break;
            case 16:
                function1.invoke(kyt0Var);
                break;
            case 17:
                function1.invoke(oyt0.f26074a);
                break;
            case 18:
                function1.invoke(veh0.f37289a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(fkh0.f9692a);
                break;
            case 20:
                function1.invoke(nkh0.f23681a);
                break;
            case 21:
                function1.invoke(czh0.f5224a);
                break;
            case 22:
                function1.invoke(yyh0.f43466a);
                break;
            case 23:
                function1.invoke(ydc.f42427a);
                break;
            case 24:
                function1.invoke(aec.f720a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(cec.f4203a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(eec.f7665a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gle0 gle0Var = d3i0.n2;
                function1.invoke(u2i0.f34948a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gle0 gle0Var2 = d3i0.n2;
                function1.invoke(t2i0.f33216a);
                break;
            default:
                function1.invoke(i7i0.f14293a);
                break;
        }
        return Unit.f46060a;
    }
}
