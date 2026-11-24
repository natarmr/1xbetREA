package a;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xal implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40561a;

    public /* synthetic */ xal(byte b) {
        this.f40561a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40561a) {
            case 0:
                return new dms();
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return Boolean.TRUE;
            case 4:
                return new zw3(s710.f31729a, (byte) 0);
            case 5:
                return new zw3(s710.f31729a, (byte) 0);
            case 6:
                return new zw3(s710.f31729a, (byte) 0);
            case 7:
                int i = DragonsGoldGameView.u;
                return Unit.f46060a;
            case 8:
                int i2 = DragonsGoldGameView.u;
                return Unit.f46060a;
            case 9:
                return new zw3(s710.f31729a, (byte) 0);
            case 10:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(tbl.f33669a, (byte) 0);
            case 13:
                return new zw3(tbl.f33669a, (byte) 0);
            case 14:
                return new Handler(Looper.getMainLooper());
            case 15:
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return new LinkedHashMap();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new LinkedHashMap();
            case 20:
                return new LinkedHashMap();
            case 21:
                return 3;
            case 22:
                return androidx.compose.runtime.e.b(0);
            case 23:
                return androidx.compose.runtime.e.e(iun.f15405a);
            case 24:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
