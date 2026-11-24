package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class f80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9084a;
    public final Object b;

    public /* synthetic */ f80(Object obj, byte b) {
        this.f9084a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iHashCode;
        byte b = this.f9084a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((uzv0) obj).invoke();
            case 1:
                return (n80) obj;
            case 2:
                return (riu0) ((f80) obj).invoke();
            case 3:
                return (jq0) obj;
            case 4:
                return (riu0) ((f80) obj).invoke();
            case 5:
                return (riu0) ((f8) obj).invoke();
            case 6:
                return (riu0) ((s51) obj).invoke();
            case 7:
                return (riu0) ((s51) obj).invoke();
            case 8:
                return (qj1) obj;
            case 9:
                return (riu0) ((f80) obj).invoke();
            case 10:
                jdk0 jdk0Var = t42.p2;
                ((t42) obj).Q0().x(m42.f21145a);
                return Unit.f46060a;
            case 11:
                return (qo2) obj;
            case 12:
                return (riu0) ((f80) obj).invoke();
            case 13:
                int iHashCode2 = 0;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 14:
                return (vg3) obj;
            case 15:
                return (riu0) ((f80) obj).invoke();
            case 16:
                return (dm3) obj;
            case 17:
                return (riu0) ((f80) obj).invoke();
            case 18:
                return (tn3) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((f80) obj).invoke();
            case 20:
                return (rp3) obj;
            case 21:
                return (riu0) ((f80) obj).invoke();
            case 22:
                return (wp3) obj;
            case 23:
                return (riu0) ((f80) obj).invoke();
            case 24:
                return (a64) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((f80) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (pk4) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (qk4) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((f80) obj).invoke();
            default:
                return (riu0) ((f80) obj).invoke();
        }
    }
}
