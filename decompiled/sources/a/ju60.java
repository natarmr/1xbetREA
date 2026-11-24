package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.top.api.presentation.header.TopHeaderTagType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ju60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17137a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ju60(Function1 function1, byte b) {
        this.f17137a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17137a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(nt60.f24081a);
                break;
            case 1:
                function1.invoke(ft60.f10095a);
                break;
            case 2:
                function1.invoke(uw60.f36379a);
                break;
            case 3:
                function1.invoke(new zw60());
                break;
            case 4:
                function1.invoke(iw60.f15473a);
                break;
            case 5:
                function1.invoke(ow60.f25956a);
                break;
            case 6:
                function1.invoke(tw60.f34634a);
                break;
            case 7:
                function1.invoke(pw60.f27697a);
                break;
            case 8:
                function1.invoke(yw60.f43356a);
                break;
            case 9:
                function1.invoke(gy60.f12112a);
                break;
            case 10:
                function1.invoke(a170.f58a);
                break;
            case 11:
                function1.invoke(g170.f10498a);
                break;
            case 12:
                function1.invoke(d170.f5298a);
                break;
            case 13:
                function1.invoke(h170.f12270a);
                break;
            case 14:
                function1.invoke(b170.f1795a);
                break;
            case 15:
                function1.invoke(i170.f13984a);
                break;
            case 16:
                function1.invoke(z070.f43552a);
                break;
            case 17:
                function1.invoke(f170.f8753a);
                break;
            case 18:
                function1.invoke(new tp60());
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(xo60.f41201a);
                break;
            case 20:
                function1.invoke(lp60.f20426a);
                break;
            case 21:
                function1.invoke(fp60.f9914a);
                break;
            case 22:
                function1.invoke(bp60.f2967a);
                break;
            case 23:
                function1.invoke(cp60.f4730a);
                break;
            case 24:
                function1.invoke(np60.f23897a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new uxq0(b470.f1946a));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new rxq0(TopHeaderTagType.OneXGamesTag.f47120a));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(i970.f14374a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(k970.f17901a);
                break;
            default:
                function1.invoke(c770.f3849a);
                break;
        }
        return Unit.f46060a;
    }
}
