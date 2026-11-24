package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PicCodeEditField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wm90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39394a;

    public /* synthetic */ wm90(byte b) {
        this.f39394a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39394a) {
            case 0:
                int i = PicCodeEditField.i;
                return new StringBuilder(4);
            case 1:
                return new gn90(iun.f15405a, null);
            case 2:
                return null;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                rwj rwjVar = tvk.f34603a;
                return dvj.c;
            case 6:
                return null;
            case 7:
                return new zw3(okx.f25427a, (byte) 0);
            case 8:
                return new wme0(sre0.f32672a.b(vx90.class), tx90.f34686a);
            case 9:
                return new wme0(sre0.f32672a.b(String.class), ysm0.f43175a);
            case 10:
                return new zw3(whp0.f39176a, (byte) 0);
            case 11:
                return new zw3(p48.f26339a, (byte) 0);
            case 12:
                return new zw3(sm90.f32434a, (byte) 0);
            case 13:
                iun iunVar = iun.f15405a;
                return new x48(true, false, false, iunVar, iunVar, 0);
            case 14:
                return new zw3(whp0.f39176a, (byte) 0);
            case 15:
                return new zw3(r4s0.f29853a, (byte) 0);
            case 16:
                return new zw3(cdo0.f4171a, (byte) 0);
            case 17:
                iun iunVar2 = iun.f15405a;
                return new k0a0(true, false, false, 0, iunVar2, hva.d, iunVar2, iunVar2);
            case 18:
                return new zw3(zcq0.f44177a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(u4a0.f35036a, (byte) 0);
            case 20:
                return new zw3(whp0.f39176a, (byte) 0);
            case 21:
                int i2 = g7a0.w;
                return p030.f26129a;
            case 22:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 23:
                return new zw3(dl30.f6259a, (byte) 0);
            case 24:
                return new s7a0(iun.f15405a, true, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(d040.f5254a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(aaa0.f516a, (byte) 0);
            default:
                return new zw3(fdo.f9367a, (byte) 0);
        }
    }
}
