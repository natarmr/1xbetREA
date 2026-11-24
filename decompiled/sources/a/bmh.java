package a;

import android.text.TextPaint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bmh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2836a;

    public /* synthetic */ bmh(byte b) {
        this.f2836a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2836a) {
            case 0:
                return new zw3(djh.f6185a, (byte) 0);
            case 1:
                return new fmh(new bqr(0L, 0L, ""), null, new qlh(null, null), null);
            case 2:
                return q7m0.a(null);
            case 3:
                return new zw3(jsh.f17051a, (byte) 0);
            case 4:
                return new zw3(jsh.f17051a, (byte) 0);
            case 5:
                return new zw3(idg.f14584a, (byte) 0);
            case 6:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 7:
                return new zw3(ncc.f23285a, (byte) 0);
            case 8:
                return new zw3(c4a0.f3716a, (byte) 0);
            case 9:
                return new zw3(mcm0.f21560a, (byte) 0);
            case 10:
                return new zw3(d040.f5254a, (byte) 0);
            case 11:
                return new TextPaint();
            case 12:
                int i = DSLottieEmptyContainer.d;
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                return new zw3(b0j.f1767a, (byte) 0);
            case 17:
                return new z0j(-1, 0, 0L);
            case 18:
                return new b2j(null, true);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return Unit.f46060a;
            case 21:
                return new zw3(b8j.f2160a, (byte) 0);
            case 22:
                qud qudVar = bej.i2;
                return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            case 23:
                qud qudVar2 = bej.i2;
                return Unit.f46060a;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return androidx.compose.runtime.e.e(am.f1086a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return androidx.compose.runtime.e.e(ifj.f14690a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                iun iunVar = iun.f15405a;
                return new hgj(iunVar, iunVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                usd usdVar = ngj.n2;
                igj igjVar = new igj();
                x2i x2iVar = new x2i((byte) 16);
                int i2 = 3;
                gbn gbnVar = new gbn(new zuh((byte) 14), new pue(i2, (byte) 26), new e3j(x2iVar, (byte) 5), zdh.i);
                dp dpVar = igjVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new zuh((byte) 13), new pue(i2, (byte) 25), new x2i((byte) 15), zdh.h));
                return igjVar;
            default:
                return new zw3(ygj.f42586a, (byte) 0);
        }
    }
}
