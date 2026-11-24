package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nas0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23206a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nas0(Function1 function1, byte b) {
        this.f23206a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23206a;
        fss0 fss0Var = fss0.f10080a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(aas0.f545a);
                break;
            case 1:
                function1.invoke(fes0.f9420a);
                break;
            case 2:
                function1.invoke(ges0.f11171a);
                break;
            case 3:
                function1.invoke(jes0.f16391a);
                break;
            case 4:
                function1.invoke(hes0.f12938a);
                break;
            case 5:
                function1.invoke(ies0.f14650a);
                break;
            case 6:
                function1.invoke(jjs0.f16634a);
                break;
            case 7:
                function1.invoke(kjs0.f18402a);
                break;
            case 8:
                function1.invoke(jis0.f16591a);
                break;
            case 9:
                function1.invoke(eis0.f7875a);
                break;
            case 10:
                function1.invoke(his0.f13131a);
                break;
            case 11:
                function1.invoke(fss0Var);
                break;
            case 12:
                function1.invoke(gss0.f11846a);
                break;
            case 13:
                function1.invoke(fss0Var);
                break;
            case 14:
                function1.invoke(v900.f37010a);
                break;
            case 15:
                function1.invoke(gid.f11340a);
                break;
            case 16:
                function1.invoke(t4t0.f33339a);
                break;
            case 17:
                function1.invoke(s4t0.f31625a);
                break;
            case 18:
                function1.invoke(z4t0.f43788a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(v4t0.f36797a);
                break;
            case 20:
                function1.invoke(w17.f38384a);
                break;
            case 21:
                function1.invoke(z17.f43604a);
                break;
            case 22:
                function1.invoke(r9t0.f30103a);
                break;
            case 23:
                function1.invoke(p9t0.f26625a);
                break;
            case 24:
                function1.invoke(q9t0.f28365a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(lat0.f19722a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(mat0.f21476a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(gbt0.f11029a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ebt0.f7535a);
                break;
            default:
                function1.invoke(h8t0.f12645a);
                break;
        }
        return Unit.f46060a;
    }
}
