package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class cnn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4664a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ cnn(Function1 function1, byte b) {
        this.f4664a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4664a;
        kgw kgwVar = kgw.f18259a;
        mgw mgwVar = mgw.f21760a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(wjn.f39270a);
                break;
            case 1:
                function1.invoke(new khw("ITEM_VIRTUAL_BANNER"));
                break;
            case 2:
                function1.invoke(jgw.f16499a);
                break;
            case 3:
                function1.invoke(igw.f14752a);
                break;
            case 4:
                function1.invoke(mgwVar);
                break;
            case 5:
                function1.invoke(kgwVar);
                break;
            case 6:
                function1.invoke(q6s.f28216a);
                break;
            case 7:
                function1.invoke(r6s.f29949a);
                break;
            case 8:
                function1.invoke(kgwVar);
                break;
            case 9:
                function1.invoke(new khw("ITEM_VIRTUAL_BANNER"));
                break;
            case 10:
                function1.invoke(mgwVar);
                break;
            case 11:
                function1.invoke(ke10.f18131a);
                break;
            case 12:
                function1.invoke(me10.f21623a);
                break;
            case 13:
                function1.invoke(zf10.f44281a);
                break;
            case 14:
                function1.invoke(ag10.f807a);
                break;
            case 15:
                function1.invoke(yf10.f42520a);
                break;
            case 16:
                function1.invoke(bg10.f2533a);
                break;
            case 17:
                function1.invoke(o150.f24462a);
                break;
            case 18:
                function1.invoke(i150.f13981a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new b150(t150.c));
                break;
            case 20:
                function1.invoke(new l150(t150.c));
                break;
            case 21:
                function1.invoke(new l150(t150.b));
                break;
            case 22:
                function1.invoke(d450.f5439a);
                break;
            case 23:
                function1.invoke(o350.f24567a);
                break;
            case 24:
                function1.invoke(new i350(kqv.f18738a));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(r350.f29771a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(q350.f28035a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new t350(t150.b));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new j350(t150.c));
                break;
            default:
                function1.invoke(new t350(t150.c));
                break;
        }
        return Unit.f46060a;
    }
}
