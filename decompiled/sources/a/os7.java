package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class os7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25770a;

    public /* synthetic */ os7(byte b) {
        this.f25770a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25770a) {
            case 0:
                return new zw3(rs7.f31017a, (byte) 0);
            case 1:
                return new zw3(eh40.f7792a, (byte) 0);
            case 2:
                return new zw3(m9a0.f21400a, (byte) 0);
            case 3:
                return null;
            case 4:
                return ro4.g0(0.62f, 250.0f, null, 4);
            case 5:
                return new uts0(280, 240, ihn.d);
            case 6:
                return new uts0(Response.TEMPORARILY_UNAVAILABLE, 10, ry7.f31300a);
            case 7:
                return ro4.m0(300, 0, ihn.f14788a, 2);
            case 8:
                return Float.valueOf(1.0f);
            case 9:
                return Float.valueOf(0.0f);
            case 10:
                zcl zclVar = qmk.f28987a;
                return new ycl(0.0f);
            case 11:
                zcl zclVar2 = qmk.f28987a;
                return new ycl(0.0f);
            case 12:
                return new zw3(o08.f24409a, (byte) 0);
            case 13:
                return new zw3(o08.f24409a, (byte) 0);
            case 14:
                return new zw3(m18.f20994a, (byte) 0);
            case 15:
                return Float.valueOf(14.66f);
            case 16:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 17:
                return Unit.f46060a;
            case 18:
                return Integer.MAX_VALUE;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(bhs.f2623a, (byte) 0);
            case 20:
                return new zw3(qxb0.f29476a, (byte) 0);
            case 21:
                return new zw3(qxb0.f29476a, (byte) 0);
            case 22:
                return new zw3(jzb0.f17404a, (byte) 0);
            case 23:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 24:
                return new zw3(lng0.f20344a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(gzl0.f12185a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(bru.f3097a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new hd8(new ic8(iun.f15405a, "", ""), false, false, false, null);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(okx.f25427a, (byte) 0);
            default:
                List list = Collections.EMPTY_LIST;
                list.getClass();
                return new df8(true, true, false, false, list, null, null);
        }
    }
}
