package a;

import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class yxf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43418a;
    public final Object b;

    public /* synthetic */ yxf0(Object obj, byte b) {
        this.f43418a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43418a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (ayf0) obj;
            case 1:
                return (riu0) ((yxf0) obj).invoke();
            case 2:
                return (riu0) ((txf0) obj).invoke();
            case 3:
                return (cbg0) obj;
            case 4:
                return (riu0) ((yxf0) obj).invoke();
            case 5:
                return (bmg0) obj;
            case 6:
                return (riu0) ((yxf0) obj).invoke();
            case 7:
                return (lmg0) obj;
            case 8:
                return (riu0) ((yxf0) obj).invoke();
            case 9:
                return (mug0) obj;
            case 10:
                return (riu0) ((yxf0) obj).invoke();
            case 11:
                return (zug0) obj;
            case 12:
                return (riu0) ((yxf0) obj).invoke();
            case 13:
                return (cr30) ((c3h0) obj).b.invoke(cty.b0);
            case 14:
                return (l6h0) obj;
            case 15:
                return (riu0) ((yxf0) obj).invoke();
            case 16:
                return (l7h0) obj;
            case 17:
                return (riu0) ((yxf0) obj).invoke();
            case 18:
                return (Fragment) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (Fragment) ((yxf0) obj).b;
            case 20:
                return new q0h0((p0h0) ((hoh0) obj).invoke());
            case 21:
                return (joh0) obj;
            case 22:
                return (riu0) ((yxf0) obj).invoke();
            case 23:
                return new q0h0((p0h0) ((kph0) obj).invoke());
            case 24:
                return (oph0) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((yxf0) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new q0h0((p0h0) ((aqh0) obj).invoke());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (cqh0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((yxf0) obj).invoke();
            default:
                return (m9i0) obj;
        }
    }
}
