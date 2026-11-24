package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class opm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25649a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ opm0(Function1 function1, byte b) {
        this.f25649a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25649a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(m17.f20992a);
                break;
            case 1:
                fxb.D(ivb0.b, new opm0(function1, (byte) 3)).a();
                break;
            case 2:
                fxb.D(ivb0.b, new opm0(function1, (byte) 5)).a();
                break;
            case 3:
                function1.invoke(ty20.g);
                break;
            case 4:
                function1.invoke(ty20.c);
                break;
            case 5:
                function1.invoke(xy20.f41686a);
                break;
            case 6:
                function1.invoke(wzm0.f40028a);
                break;
            case 7:
                function1.invoke(oan0.f24936a);
                break;
            case 8:
                function1.invoke(ran0.f30145a);
                break;
            case 9:
                function1.invoke(tcn0.f33726a);
                break;
            case 10:
                function1.invoke(rcn0.f30248a);
                break;
            case 11:
                function1.invoke(vcn0.f37195a);
                break;
            case 12:
                function1.invoke(xcn0.f40654a);
                break;
            case 13:
                function1.invoke(vdn0.f37241a);
                break;
            case 14:
                function1.invoke(tdn0.f33778a);
                break;
            case 15:
                function1.invoke(xdn0.f40703a);
                break;
            case 16:
                function1.invoke(ben0.f2459a);
                break;
            case 17:
                function1.invoke(srn0.f32687a);
                break;
            case 18:
                function1.invoke(rrn0.f30993a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(hvn0.f13734a);
                break;
            case 20:
                function1.invoke(nvn0.f24196a);
                break;
            case 21:
                function1.invoke(u6o0.f35147a);
                break;
            case 22:
                function1.invoke(h6r0.f12543a);
                break;
            case 23:
                function1.invoke(e6r0.f7301a);
                break;
            case 24:
                fxb.D(ivb0.b, new opm0(function1, (byte) 23)).a();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(m6r0.f21286a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ieo0.f14643a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(geo0.f11166a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(n37.f22835a);
                break;
            default:
                function1.invoke(j17.f15719a);
                break;
        }
        return Unit.f46060a;
    }
}
