package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.banner_collection.DsBannerCollection;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class knl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18591a;

    public /* synthetic */ knl(byte b) {
        this.f18591a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18591a) {
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
                return Unit.f46060a;
            case 8:
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                return Unit.f46060a;
            case 15:
                int i = DsBannerCollection.t2;
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return new tvl();
            case 21:
                return Unit.f46060a;
            case 22:
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator((char) 160);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                return decimalFormat;
            case 23:
                return Unit.f46060a;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
        }
    }

    public /* synthetic */ knl(fw1 fw1Var, byte b) {
        this.f18591a = b;
    }
}
