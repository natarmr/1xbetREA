package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i0a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13941a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ i0a0(Function1 function1, byte b) {
        this.f13941a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13941a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(b0a0.f1758a);
                break;
            case 1:
                function1.invoke(r1a0.f29669a);
                break;
            case 2:
                function1.invoke(u1a0.f34894a);
                break;
            case 3:
                function1.invoke(c3a0.f3664a);
                break;
            case 4:
                function1.invoke(e3a0.f7124a);
                break;
            case 5:
                function1.invoke(l5a0.f19444a);
                break;
            case 6:
                function1.invoke(n5a0.f22934a);
                break;
            case 7:
                function1.invoke(l7a0.f19550a);
                break;
            case 8:
                function1.invoke(m7a0.f21311a);
                break;
            case 9:
                function1.invoke(vca0.f37179a);
                break;
            case 10:
                function1.invoke(uca0.f35419a);
                break;
            case 11:
                function1.invoke(wga0.f39105a);
                break;
            case 12:
                function1.invoke(vga0.f37373a);
                break;
            case 13:
                function1.invoke(kha0.f18281a);
                break;
            case 14:
                function1.invoke(jha0.f16517a);
                break;
            case 15:
                function1.invoke(yka0.f42779a);
                break;
            case 16:
                function1.invoke(ika0.f14916a);
                break;
            case 17:
                function1.invoke(jka0.c);
                break;
            case 18:
                function1.invoke(zja0.f44474a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(bka0.f2739a);
                break;
            case 20:
                function1.invoke(k9f0.f17913a);
                break;
            case 21:
                function1.invoke(yve0.f43315a);
                break;
            case 22:
                function1.invoke(h3f0.f12382a);
                break;
            case 23:
                function1.invoke(new xve0(wpa0.YES));
                break;
            case 24:
                function1.invoke(new xve0(wpa0.NO));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(mqa0.f22215a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(oqa0.f25679a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(nra0.f23992a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ora0.f25727a);
                break;
            default:
                function1.invoke(rra0.f30973a);
                break;
        }
        return Unit.f46060a;
    }
}
