package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i240 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i240(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f14031a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14031a) {
            case 0:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 1:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 2:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 3:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 4:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 5:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 6:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 7:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 8:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 9:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 10:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 11:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 12:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 13:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 14:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 15:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 16:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 17:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 18:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 20:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 21:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 22:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 23:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case 24:
                return Integer.valueOf(((qho) this.receiver).b(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((j340) this.receiver).P(th);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((j340) this.receiver).P(th2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((j340) this.receiver).P(th3);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((j340) this.receiver).P(th4);
                return Unit.f46060a;
            default:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((j340) this.receiver).P(th5);
                return Unit.f46060a;
        }
    }
}
