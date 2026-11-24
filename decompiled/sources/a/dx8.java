package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class dx8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6835a;
    public final /* synthetic */ List b;

    public /* synthetic */ dx8(List list, byte b) {
        this.f6835a = b;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6835a;
        List list = this.b;
        switch (b) {
            case 0:
                return list.get(((Number) obj).intValue());
            case 1:
                return list.get(((Number) obj).intValue());
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                list.get(((Number) obj).intValue());
                return null;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return list.get(((Number) obj).intValue());
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                list.get(((Number) obj).intValue());
                return null;
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                return sre0.f32672a.b(((ks9) list.get(((Number) obj).intValue())).getClass());
            case 17:
                list.get(((Number) obj).intValue());
                return null;
            case 18:
                list.get(((Number) obj).intValue());
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                list.get(((Number) obj).intValue());
                return null;
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                list.get(((Number) obj).intValue());
                return null;
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case 24:
                return sre0.f32672a.b(((a2n) list.get(((Number) obj).intValue())).getClass());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return sre0.f32672a.b(((a2n) list.get(((Number) obj).intValue())).getClass());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return list.get(((Number) obj).intValue());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                list.get(((Number) obj).intValue());
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
