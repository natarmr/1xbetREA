package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class a580 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f258a;
    public final /* synthetic */ List b;

    public /* synthetic */ a580(List list, byte b) {
        this.f258a = b;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f258a;
        List list = this.b;
        switch (b) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
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
                list.get(((Number) obj).intValue());
                return null;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                return sre0.f32672a.b(((a2n) list.get(((Number) obj).intValue())).getClass());
            case 9:
                return sre0.f32672a.b(((xd90) list.get(((Number) obj).intValue())).getClass());
            case 10:
                return sre0.f32672a.b(((yd90) list.get(((Number) obj).intValue())).getClass());
            case 11:
                return sre0.f32672a.b(((wd90) list.get(((Number) obj).intValue())).getClass());
            case 12:
                return sre0.f32672a.b(((ae90) list.get(((Number) obj).intValue())).getClass());
            case 13:
                return sre0.f32672a.b(((zd90) list.get(((Number) obj).intValue())).getClass());
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                list.get(((Number) obj).intValue());
                return null;
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
                return sre0.f32672a.b(((h3a0) list.get(((Number) obj).intValue())).getClass());
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
                list.get(((Number) obj).intValue());
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return sre0.f32672a.b(((a2n) list.get(((Number) obj).intValue())).getClass());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                list.get(((Number) obj).intValue());
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return sre0.f32672a.b(((j2b0) list.get(((Number) obj).intValue())).getClass());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return sre0.f32672a.b(((oza0) list.get(((Number) obj).intValue())).getClass());
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
