package a;

import android.graphics.Paint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jtz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17124a;

    public /* synthetic */ jtz(byte b) {
        this.f17124a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17124a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return new zw3(un40.f35943a, (byte) 0);
            case 8:
                return new zw3(vn40.f37700a, (byte) 0);
            case 9:
                return new zw3(wn40.f39431a, (byte) 0);
            case 10:
                return new zw3(xn40.f41155a, (byte) 0);
            case 11:
                return new zw3(yn40.f42920a, (byte) 0);
            case 12:
                return new zw3(ohu.f25281a, (byte) 0);
            case 13:
                return new zw3(zn40.f44657a, (byte) 0);
            case 14:
                return new zw3(tiq0.f34018a, (byte) 0);
            case 15:
                return new zw3(uiq0.f35745a, (byte) 0);
            case 16:
                return new zw3(viq0.f37493a, (byte) 0);
            case 17:
                return new zw3(wiq0.f39230a, (byte) 0);
            case 18:
                return new zw3(xiq0.f40958a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(yiq0.f42707a, (byte) 0);
            case 20:
                return Unit.f46060a;
            case 21:
                int i = LineChartView.k1;
                return Unit.f46060a;
            case 22:
                return new zw3(x500.f40290a, (byte) 0);
            case 23:
                return new zw3(gdo.f11112a, (byte) 0);
            case 24:
                return new Paint();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(y800.f42173a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(i800.f14319a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            default:
                return new zw3(e800.f7351a, (byte) 0);
        }
    }
}
