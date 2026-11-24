package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h26 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12316a;

    public /* synthetic */ h26(byte b) {
        this.f12316a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12316a) {
            case 0:
                obj.getClass();
                return Unit.f46060a;
            case 1:
                obj.getClass();
                return Boolean.FALSE;
            case 2:
                obj.getClass();
                return Unit.f46060a;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 4:
                ((a9q0) obj).getClass();
                return Unit.f46060a;
            case 5:
                obj.getClass();
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fD = h7k0.d(fhlVar.d()) / 2.0f;
                fhl.E(fhlVar, ijg.l, fD, 0L, 0.0f, null, 124);
                fhl.E(fhlVar, StaticColors.INSTANCE.m98getGreen0d7_KjU(), fD * 0.5f, 0L, 0.0f, null, 124);
                return Unit.f46060a;
            case 9:
                ((xgl0) obj).getClass();
                return Unit.f46060a;
            case 10:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 11:
                cws cwsVar = (cws) obj;
                cwsVar.getClass();
                return Integer.valueOf(cwsVar.f5095a);
            case 12:
                ((cws) obj).getClass();
                return sre0.f32672a.b(cws.class);
            case 13:
                hq6 hq6Var = (hq6) obj;
                hq6Var.getClass();
                return hq6Var.c.getKey();
            case 14:
                ((hq6) obj).getClass();
                return sre0.f32672a.b(hq6.class);
            case 15:
                ((a8q0) obj).getClass();
                return Unit.f46060a;
            case 16:
                ((a8q0) obj).getClass();
                return Unit.f46060a;
            case 17:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 18:
                z5w z5wVar = (z5w) obj;
                z5wVar.getClass();
                return Boolean.valueOf(z5wVar != z5w.b);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str = (String) obj;
                str.getClass();
                if (!StringsKt.P(str, ':')) {
                    return str;
                }
                Object objI = ttm0.I(2, str);
                if (objI == null) {
                    objI = "";
                }
                Character chI = ttm0.I(0, str);
                return objI + Separators.COLON + (chI != null ? chI : "");
            case 20:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return (List) feeVar.c();
            case 21:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                Boolean bool = (Boolean) feeVar2.c();
                bool.booleanValue();
                return bool;
            case 22:
                fee feeVar3 = (fee) obj;
                feeVar3.getClass();
                Boolean bool2 = (Boolean) feeVar3.c();
                bool2.booleanValue();
                return bool2;
            case 23:
                fee feeVar4 = (fee) obj;
                feeVar4.getClass();
                return Long.valueOf(((Number) feeVar4.c()).longValue());
            case 24:
                fee feeVar5 = (fee) obj;
                feeVar5.getClass();
                a5w a5wVar = (a5w) feeVar5.c();
                return Boolean.valueOf((a5wVar instanceof kzv) && ((kzv) a5wVar).g == i0w.b);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fee feeVar6 = (fee) obj;
                feeVar6.getClass();
                return (List) feeVar6.c();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fee feeVar7 = (fee) obj;
                feeVar7.getClass();
                return (ql5) feeVar7.c();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fee feeVar8 = (fee) obj;
                feeVar8.getClass();
                return (Map) feeVar8.c();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fee feeVar9 = (fee) obj;
                feeVar9.getClass();
                Boolean bool3 = (Boolean) feeVar9.c();
                bool3.booleanValue();
                return bool3;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
        }
    }
}
