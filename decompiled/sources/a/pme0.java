package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pme0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27229a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ pme0(Function1 function1, byte b) {
        this.f27229a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27229a;
        klg0 klg0Var = klg0.f18486a;
        v5q0 v5q0Var = v5q0.f36837a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(hme0.f13302a);
                break;
            case 1:
                function1.invoke(fve0.f10211a);
                break;
            case 2:
                function1.invoke(awe0.f1570a);
                break;
            case 3:
                function1.invoke(y5f0.f42043a);
                break;
            case 4:
                function1.invoke(e6f0.f7280a);
                break;
            case 5:
                function1.invoke(l9f0.f19649a);
                break;
            case 6:
                function1.invoke(s8f0.f31797a);
                break;
            case 7:
                function1.invoke(wdf0.f38971a);
                break;
            case 8:
                function1.invoke(bgf0.f2553a);
                break;
            case 9:
                function1.invoke(ggf0.f11252a);
                break;
            case 10:
                function1.invoke(uhf0.f35675a);
                break;
            case 11:
                function1.invoke(shf0.f32209a);
                break;
            case 12:
                function1.invoke(j3g0.f15831a);
                break;
            case 13:
                function1.invoke(m3g0.f21114a);
                break;
            case 14:
                function1.invoke(o3g0.f24584a);
                break;
            case 15:
                function1.invoke(h3g0.f12384a);
                break;
            case 16:
                function1.invoke(i3g0.f14095a);
                break;
            case 17:
                function1.invoke(z6g0.f43865a);
                break;
            case 18:
                function1.invoke(c6g0.f3817a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(e6g0.f7282a);
                break;
            case 20:
                function1.invoke(l5g0.f19454a);
                break;
            case 21:
                function1.invoke(h5g0.f12478a);
                break;
            case 22:
                function1.invoke(j5g0.f15932a);
                break;
            case 23:
                function1.invoke(u5q0.f35109a);
                break;
            case 24:
                function1.invoke(v5q0Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(v5q0Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(v5q0Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(v5q0Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(klg0Var);
                break;
            default:
                function1.invoke(klg0Var);
                break;
        }
        return Unit.f46060a;
    }
}
