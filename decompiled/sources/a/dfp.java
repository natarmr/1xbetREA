package a;

import android.graphics.Paint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dfp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6009a;

    public /* synthetic */ dfp(byte b) {
        this.f6009a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6009a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                int i = gfp.B;
                return vm60.f37664a;
            case 1:
                return Unit.f46060a;
            case 2:
                zcl zclVar = qmk.f28987a;
                return new ycl(24.0f);
            case 3:
                zcl zclVar2 = qmk.f28987a;
                return new ycl(32.0f);
            case 4:
                zcl zclVar3 = qmk.f28987a;
                return new ycl(32.0f);
            case 5:
                return new rgp(0L, iun.f15405a, true, false, false);
            case 6:
                return new hhp("", iun.f15405a);
            case 7:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 8:
                return null;
            case 9:
                int i2 = nnp.a0;
                return bidVar;
            case 10:
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                nek nekVar = rop.a2;
                return new zcz();
            case 13:
                return new zw3(ftp.f10124a, (byte) 0);
            case 14:
                return new zw3(ctp.f4950a, (byte) 0);
            case 15:
                return new zw3(ftp.f10124a, (byte) 0);
            case 16:
                return new zw3(esp.f8340a, (byte) 0);
            case 17:
                return new zw3(whp0.f39176a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                return new zw3(s710.f31729a, (byte) 0);
            case 21:
                return new zw3(s710.f31729a, (byte) 0);
            case 22:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 23:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 24:
                return new zw3(ubt.f35398a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(pwp.f27722a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(mrv.j0(oxp.f26023a), (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i3 = typ.E;
                return bidVar;
            default:
                int i4 = FinBetView.m1;
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                return paint;
        }
    }
}
