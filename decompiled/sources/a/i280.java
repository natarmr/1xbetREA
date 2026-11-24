package a;

import android.graphics.PathMeasure;
import android.text.InputFilter;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i280 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14035a;

    public /* synthetic */ i280(byte b) {
        this.f14035a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14035a;
        ab0 ab0Var = ab0.f555a;
        switch (b) {
            case 0:
                return new zw3(g180.f10500a, (byte) 0);
            case 1:
                return new zw3(x580.f40302a, (byte) 0);
            case 2:
                return new zw3(v180.f36618a, (byte) 0);
            case 3:
                return new zw3(f180.f8755a, (byte) 0);
            case 4:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 5:
                return new zw3(z280.f43658a, (byte) 0);
            case 6:
                return new zw3(y580.f42034a, (byte) 0);
            case 7:
                int i = v580.u;
                return cbv0.f4079a;
            case 8:
                return new y780("", 0, iun.f15405a, null, "", null, "", null, "", "", false, "", true, false, false, false);
            case 9:
                xi70 xi70Var = z880.U1;
                return new InputFilter.LengthFilter(25);
            case 10:
                return Unit.f46060a;
            case 11:
                return new tf80();
            case 12:
                List listC = kotlin.collections.a.c(new kls0(0, iun.f15405a));
                dp00 dp00Var = dp00.f;
                listC.getClass();
                dp00Var.getClass();
                return new rh80(gp00.f11660a, listC, 0, 0, dp00Var, null);
            case 13:
                return k6z.f17794a;
            case 14:
                return null;
            case 15:
                int i2 = jt80.s0;
                return ab0Var;
            case 16:
                int i3 = rv80.V;
                return ab0Var;
            case 17:
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new az80(true, null, iunVar, lunVar);
            case 18:
                return new y03(new PathMeasure());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 21:
                return new zw3(s710.f31729a, (byte) 0);
            case 22:
                return new zw3(s710.f31729a, (byte) 0);
            case 23:
                return new zw3(s710.f31729a, (byte) 0);
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new y690(x690.f40352a, 0L, false);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jh70 jh70Var = o890.f2;
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rwj rwjVar = tvk.f34603a;
                return d5c.a(ys10.f43147a.x());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(yc90.f42376a, (byte) 0);
            default:
                return 0;
        }
    }
}
