package a;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a04 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8a;

    public /* synthetic */ a04(byte b) {
        this.f8a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object g0g0Var;
        switch (this.f8a) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return new zw3(b0g0.f1763a, (byte) 0);
            case 2:
                try {
                    e0g0 e0g0Var = j0g0.b;
                    System.loadLibrary("antifraud_audio");
                    g0g0Var = Unit.f46060a;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return Boolean.valueOf(!(g0g0Var instanceof g0g0));
            case 3:
                return new zw3(h84.f12608a, (byte) 0);
            case 4:
                return new zw3(h84.f12608a, (byte) 0);
            case 5:
                iun iunVar = iun.f15405a;
                return new d94(iunVar, iunVar, false, null, false);
            case 6:
                return new pek0();
            case 7:
                rek0 rek0Var = ig4.O1;
                return Unit.f46060a;
            case 8:
                lc00 lc00VarB = kotlin.collections.a.b();
                pz40 pz40Var = s6t0.f31722a;
                lc00VarB.add(new e900(q3d.j(new y3d(s6t0.b().b.getUpdateGradientStart()), new y3d(s6t0.b().b.getUpdateGradientEnd())), null, 0L, 9187343241974906880L));
                lc00VarB.add(new skk0(StaticColors.INSTANCE.m71getBlack300d7_KjU()));
                return new lg4(kotlin.collections.a.a(lc00VarB));
            case 9:
                return new um4(false, false, false);
            case 10:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 11:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 12:
                return new po4();
            case 13:
                return new t5a();
            case 14:
                return new zw3(nq4.f23940a, (byte) 0);
            case 15:
                return new zw3(nq4.f23940a, (byte) 0);
            case 16:
                return new er4();
            case 17:
                return q3d.j(a860.b, a860.d, a860.f);
            case 18:
                return new zw3(okx.f25427a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new skk0(fbc.d(1308617531));
            case 20:
                return new zw3(a8b.f418a, (byte) 0);
            case 21:
                return new zw3(lps.f20455a, (byte) 0);
            case 22:
                return new zw3(nzb0.f24365a, (byte) 0);
            case 23:
                return new zw3(a8b.f418a, (byte) 0);
            case 24:
                return new zw3(lps.f20455a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(nzb0.f24365a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(b65.f2036a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(w65.f38610a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return k85.a();
            default:
                return new zw3(juo0.f17166a, (byte) 0);
        }
    }
}
