package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class b8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2132a;
    public final /* synthetic */ List b;

    public b8(List list) {
        this.f2132a = (byte) 4;
        tb tbVar = tb.f33636a;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2132a;
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
                int iIntValue = ((Number) obj).intValue();
                return tb.f33636a.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return list.get(((Number) obj).intValue());
            case 7:
                return sre0.f32672a.b(((ph0) list.get(((Number) obj).intValue())).getClass());
            case 8:
                return sre0.f32672a.b(((ph0) list.get(((Number) obj).intValue())).getClass());
            case 9:
                return sre0.f32672a.b(((ph0) list.get(((Number) obj).intValue())).getClass());
            case 10:
                return sre0.f32672a.b(((ph0) list.get(((Number) obj).intValue())).getClass());
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                list.get(((Number) obj).intValue());
                return null;
            case 13:
                return list.get(((Number) obj).intValue());
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
                return sre0.f32672a.b(((ot1) list.get(((Number) obj).intValue())).getClass());
            case 18:
                return list.get(((Number) obj).intValue());
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
                return sre0.f32672a.b(((qa5) list.get(((Number) obj).intValue())).getClass());
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case 24:
                list.get(((Number) obj).intValue());
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return list.get(((Number) obj).intValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                list.get(((Number) obj).intValue());
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                list.get(((Number) obj).intValue());
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                list.get(((Number) obj).intValue());
                return null;
            default:
                return list.get(((Number) obj).intValue());
        }
    }

    public /* synthetic */ b8(List list, byte b) {
        this.f2132a = b;
        this.b = list;
    }
}
