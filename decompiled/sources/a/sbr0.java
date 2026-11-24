package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sbr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31950a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ sbr0(Function1 function1, byte b) {
        this.f31950a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31950a;
        irk0 irk0Var = irk0.f15261a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(mbr0.f21522a);
                break;
            case 1:
                function1.invoke(ebr0.f7533a);
                break;
            case 2:
                function1.invoke(fbr0.f9276a);
                break;
            case 3:
                function1.invoke(new nkb0(t4l0.f33326a));
                break;
            case 4:
                function1.invoke(new nkb0(y4l0.f42008a));
                break;
            case 5:
                function1.invoke(lkb0.f20193a);
                break;
            case 6:
                function1.invoke(fhr0.f9556a);
                break;
            case 7:
                function1.invoke(chr0.f4374a);
                break;
            case 8:
                function1.invoke(bhr0.f2622a);
                break;
            case 9:
                function1.invoke(wgr0.f39131a);
                break;
            case 10:
                function1.invoke(qgr0.f28700a);
                break;
            case 11:
                function1.invoke(dhr0.f6104a);
                break;
            case 12:
                function1.invoke(tgr0.f33928a);
                break;
            case 13:
                function1.invoke(rgr0.f30451a);
                break;
            case 14:
                function1.invoke(orr0.f25749a);
                break;
            case 15:
                function1.invoke(rrr0.f30998a);
                break;
            case 16:
                function1.invoke(qtr0.f29311a);
                break;
            case 17:
                function1.invoke(ttr0.f34522a);
                break;
            case 18:
                function1.invoke(str0.f32786a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(ptr0.f27579a);
                break;
            case 20:
                function1.invoke(irk0Var);
                break;
            case 21:
                function1.invoke(irk0Var);
                break;
            case 22:
                function1.invoke(j3s0.f15852a);
                break;
            case 23:
                function1.invoke(l3s0.f19374a);
                break;
            case 24:
                function1.invoke(u5s0.f35111a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(w5s0.f38599a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(r6s0.f29950a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(s6s0.f31720a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(x9s0.f40523a);
                break;
            default:
                function1.invoke(new y9s0(null));
                break;
        }
        return Unit.f46060a;
    }
}
