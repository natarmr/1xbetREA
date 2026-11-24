package a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rtj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31081a;

    public /* synthetic */ rtj(byte b) {
        this.f31081a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31081a) {
            case 0:
                Paint paint = new Paint(5);
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case 1:
                Paint paint2 = new Paint(5);
                paint2.setStyle(Paint.Style.STROKE);
                return paint2;
            case 2:
                Paint paint3 = new Paint(5);
                paint3.setAntiAlias(true);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                return paint3;
            case 3:
                return Float.valueOf(1.0f);
            case 4:
                return new zw3(s710.f31729a, (byte) 0);
            case 5:
                return new zw3(s710.f31729a, (byte) 0);
            case 6:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 7:
                return new zw3(s710.f31729a, (byte) 0);
            case 8:
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                return new zw3(okx.f25427a, (byte) 0);
            case 11:
                return new zw3(elk.f8002a, (byte) 0);
            case 12:
                int i = atk.J;
                return bid.f2654a;
            case 13:
                return new zw3(q680.f28189a, (byte) 0);
            case 14:
                return new zw3(vn80.f37708a, (byte) 0);
            case 15:
                return oyk._childSerializers$_anonymous_();
            case 16:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 17:
                return new zw3(okx.f25427a, (byte) 0);
            case 18:
                return new zw3(okx.f25427a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 20:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 21:
                return new zw3(t3l.f33274a, (byte) 0);
            case 22:
                return new zw3(b6l.f2060a, (byte) 0);
            case 23:
                return new zw3(q3l.f28057a, (byte) 0);
            case 24:
                return new zw3(oal.f24932a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ral.f30140a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(cxb0.f5116a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(xmg.f41122a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                int i2 = ebl.g0;
                return ius.f15411a;
        }
    }
}
