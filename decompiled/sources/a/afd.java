package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f773a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ afd(Function1 function1, byte b) {
        this.f773a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f773a;
        z5h z5hVar = z5h.f43815a;
        nih nihVar = nih.f23587a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(ved.f37280a);
                break;
            case 1:
                function1.invoke(new fid(true));
                break;
            case 2:
                function1.invoke(new fid(false));
                break;
            case 3:
                function1.invoke(bwd.f3318a);
                break;
            case 4:
                function1.invoke(awd.f1568a);
                break;
            case 5:
                function1.invoke(zvd.f45049a);
                break;
            case 6:
                function1.invoke(u1f.f34898a);
                break;
            case 7:
                function1.invoke(ikf.f14923a);
                break;
            case 8:
                function1.invoke(bkf.f2744a);
                break;
            case 9:
                function1.invoke(hkf.f13205a);
                break;
            case 10:
                function1.invoke(fkf.f9688a);
                break;
            case 11:
                function1.invoke(ekf.f7948a);
                break;
            case 12:
                function1.invoke(gkf.f11440a);
                break;
            case 13:
                function1.invoke(kkf.f18435a);
                break;
            case 14:
                function1.invoke(seg.f32075a);
                break;
            case 15:
                function1.invoke(pfg.f26903a);
                break;
            case 16:
                function1.invoke(fig.f9585a);
                break;
            case 17:
                function1.invoke(gig.f11344a);
                break;
            case 18:
                function1.invoke(hig.f13111a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(qhw.f28762a);
                break;
            case 20:
                function1.invoke(y5h.f42045a);
                break;
            case 21:
                function1.invoke(z5hVar);
                break;
            case 22:
                function1.invoke(z5hVar);
                break;
            case 23:
                function1.invoke(l6h.f19505a);
                break;
            case 24:
                function1.invoke(j6h.f15986a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(pih.f27042a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(oih.f25311a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(lih.f20105a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(nihVar);
                break;
            default:
                function1.invoke(nihVar);
                break;
        }
        return Unit.f46060a;
    }
}
