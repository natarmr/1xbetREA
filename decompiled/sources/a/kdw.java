package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.color.IndividualColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kdw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18125a;

    public /* synthetic */ kdw(byte b) {
        this.f18125a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18125a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                return new zw3(xdw.f40716a, (byte) 0);
            case 1:
                return new zw3(tdw.f33790a, (byte) 0);
            case 2:
                return new zw3(wcw.f38945a, (byte) 0);
            case 3:
                int i = ukw.X;
                return bidVar;
            case 4:
                int i2 = tkw.C;
                return bidVar;
            case 5:
                return new zw3(e040.f6972a, (byte) 0);
            case 6:
                return Unit.f46060a;
            case 7:
                return new zw3(jmw.f16786a, (byte) 0);
            case 8:
                return new zw3(msd0.f22314a, (byte) 0);
            case 9:
                return new low(true, false, false, new gow(iun.f15405a));
            case 10:
                zfn zfnVar = gpw.f11703a;
                return fmm.f9790a;
            case 11:
                return new crw(lak0.c, true, false, false, true);
            case 12:
                return new zw3(d040.f5254a, (byte) 0);
            case 13:
                return new zw3(zow.f44734a, (byte) 0);
            case 14:
                return new zw3(spw.f32604a, (byte) 0);
            case 15:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 16:
                return k6z.f17794a;
            case 17:
                return k6z.f17794a;
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                rwj rwjVar = tvk.f34603a;
                return ys10.f43147a.x();
            case 21:
                return (bbe0) jut0.f17176a.getValue();
            case 22:
                return new zw3(moa.f22125a, (byte) 0);
            case 23:
                return new zw3(moa.f22125a, (byte) 0);
            case 24:
                zfn zfnVar2 = a6x.f338a;
                return ptj.f27567a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                long j = y3d.g;
                return new IndividualColors(j, j, j, j, j, j, j, j, j, j, j, j, j, null);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(lcx.f19820a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return new acx(iun.f15405a, true, false, false);
        }
    }
}
