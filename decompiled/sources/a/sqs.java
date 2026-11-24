package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sqs implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32643a;

    public /* synthetic */ sqs(byte b) {
        this.f32643a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32643a) {
            case 0:
                return new zw3(w6m0.f38631a, (byte) 0);
            case 1:
                return Unit.f46060a;
            case 2:
                return new zw3(qf90.f28621a, (byte) 0);
            case 3:
                return androidx.compose.runtime.e.e(bts.Video);
            case 4:
                return Integer.valueOf(View.generateViewId());
            case 5:
                return new zw3(vts.f38022a, (byte) 0);
            case 6:
                return new zw3(sts.f32787a, (byte) 0);
            case 7:
                iun iunVar = iun.f15405a;
                return new xus("", false, -1, new owq0(iunVar, iunVar, false), null);
            case 8:
                int i = GameVideoView.u;
                return Unit.f46060a;
            case 9:
                int i2 = GameVideoView.u;
                return Unit.f46060a;
            case 10:
                int i3 = c0t.b0;
                return ius.f15411a;
            case 11:
                return new dms();
            case 12:
                return new zw3(jq7.f16936a, (byte) 0);
            case 13:
                return new zw3(g0t.f10476a, (byte) 0);
            case 14:
                return new zw3(qcs.f28497a, (byte) 0);
            case 15:
                return new zw3(s710.f31729a, (byte) 0);
            case 16:
                return new zw3(s710.f31729a, (byte) 0);
            case 17:
                return new zw3(gmr.f11553a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                int i4 = GameZoneView.l;
                return Unit.f46060a;
            case 21:
                int i5 = GameZoneView.l;
                return Unit.f46060a;
            case 22:
                int i6 = GameZoneView.l;
                return Unit.f46060a;
            case 23:
                return Unit.f46060a;
            case 24:
                return new zw3(f600.f8986a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ak00.f1003a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(wbb.f38868a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(f6t.f9029a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            default:
                return new zw3(ysm0.f43175a, (byte) 0);
        }
    }
}
