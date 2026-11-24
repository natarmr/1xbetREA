package a;

import android.media.AudioAttributes;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class th50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33947a;

    public /* synthetic */ th50(byte b) {
        this.f33947a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33947a) {
            case 0:
                return new zw3(jh50.f16513a, (byte) 0);
            case 1:
                return new inv(ysm0.f43175a, mrv.j0(new zw3(ki50.f18321a, (byte) 0)), (byte) 1);
            case 2:
                return new qj50(iun.f15405a);
            case 3:
                sje sjeVarA = d5c.a(kotlin.coroutines.g.f46065a);
                d5c.G(sjeVarA, null);
                return sjeVarA;
            case 4:
                return bj9.f2695a;
            case 5:
                return m7t0.f21336a;
            case 6:
                return ujn.h;
            case 7:
                return new zw3(okx.f25427a, (byte) 0);
            case 8:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 9:
                return new zw3(whp0.f39176a, (byte) 0);
            case 10:
                return new zw3(mw50.f22487a, (byte) 0);
            case 11:
                return Unit.f46060a;
            case 12:
                evz evzVar = b160.O1;
                return new bdz();
            case 13:
                int i = v360.x0;
                return vm60.f37664a;
            case 14:
                int i2 = v360.x0;
                return bid.f2654a;
            case 15:
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return new AudioAttributes.Builder().setUsage(5).build();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new g0o("androidx.savedstate.serialization.serializers.NullValue", m860.INSTANCE, new Annotation[0]);
            case 20:
                return new zo9(new OkHttpClient());
            case 21:
                return Unit.f46060a;
            case 22:
                return new g0o("org.xplatform.feed.navigation.OnboardingRoute", vj60.INSTANCE, new Annotation[0]);
            case 23:
                return new sk60(null);
            case 24:
                return new LinkedBlockingDeque();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ew60(zn60.MainScreen, y1p.MAIN);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new un60(null, false, iun.f15405a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(yp60.f43017a, (byte) 0);
            default:
                return new zw3(aq60.f1284a, (byte) 0);
        }
    }
}
