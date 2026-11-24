package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t07 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33105a;

    public /* synthetic */ t07(byte b) {
        this.f33105a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33105a) {
            case 0:
                return new zw3(b17.f1794a, (byte) 0);
            case 1:
                return new zw3(d17.f5297a, (byte) 0);
            case 2:
                return new zw3(s710.f31729a, (byte) 0);
            case 3:
                return new Object();
            case 4:
                return new Object();
            case 5:
                return new zw3(j97.f16123a, (byte) 0);
            case 6:
                return new uua0(sre0.f32672a.b(kuw.class), new Annotation[0]);
            case 7:
                return Unit.f46060a;
            case 8:
                izc[] izcVarArrValues = izc.values();
                izcVarArrValues.getClass();
                return new g0o("org.xplatform.betting.core.zip.model.zip.CoefState", (Enum[]) izcVarArrValues);
            case 9:
                return zfa0.Companion.serializer();
            case 10:
                return new zw3(bgo.f2564a, (byte) 0);
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(okx.f25427a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(okx.f25427a, (byte) 0);
            case 15:
                return new zw3(okx.f25427a, (byte) 0);
            case 16:
                return new zw3(okx.f25427a, (byte) 0);
            case 17:
                return new zw3(ggo.f11260a, (byte) 0);
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return new zw3(mrv.j0(new zw3(kv6.f18941a, (byte) 0)), (byte) 0);
            case 21:
                return new zw3(pg7.f26939a, (byte) 0);
            case 22:
                return new uua0(sre0.f32672a.b(kuw.class), new Annotation[0]);
            case 23:
                return new zw3(cgo.f4322a, (byte) 0);
            case 24:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            default:
                return new zw3(ps7.f27501a, (byte) 0);
        }
    }
}
