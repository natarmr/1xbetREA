package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r520 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29864a;

    public /* synthetic */ r520(byte b) {
        this.f29864a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29864a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 2:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 4:
                ru6 ru6Var = (ru6) obj;
                ru6Var.getClass();
                long j = ru6Var.d;
                long j2 = ru6Var.h;
                String plainString = new BigDecimal(String.valueOf(ru6Var.f)).toPlainString();
                long j3 = ru6Var.g;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(Separators.POUND);
                sb.append(j2);
                hne.B(sb, Separators.POUND, plainString, Separators.POUND);
                sb.append(j3);
                return sb.toString();
            case 5:
                ru6 ru6Var2 = (ru6) obj;
                ru6Var2.getClass();
                long j4 = ru6Var2.d;
                long j5 = ru6Var2.h;
                String plainString2 = new BigDecimal(String.valueOf(ru6Var2.f)).toPlainString();
                long j6 = ru6Var2.g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j4);
                sb2.append(Separators.POUND);
                sb2.append(j5);
                hne.B(sb2, Separators.POUND, plainString2, Separators.POUND);
                sb2.append(j6);
                return sb2.toString();
            case 6:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 7:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 9:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 10:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 11:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                th9.printStackTrace();
                return Unit.f46060a;
            case 12:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                th10.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                th11.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                th13.printStackTrace();
                return Unit.f46060a;
            case 16:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                th14.printStackTrace();
                return Unit.f46060a;
            case 17:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                th15.printStackTrace();
                return Unit.f46060a;
            case 18:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                th16.printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                th17.printStackTrace();
                return Unit.f46060a;
            case 20:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                th18.printStackTrace();
                return Unit.f46060a;
            case 21:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                th19.printStackTrace();
                return Unit.f46060a;
            case 22:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                th20.printStackTrace();
                return Unit.f46060a;
            case 23:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                th21.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th22 = (Throwable) obj;
                th22.getClass();
                th22.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th23 = (Throwable) obj;
                th23.getClass();
                th23.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th24 = (Throwable) obj;
                th24.getClass();
                th24.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th25 = (Throwable) obj;
                th25.getClass();
                th25.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th26 = (Throwable) obj;
                th26.getClass();
                th26.printStackTrace();
                return Unit.f46060a;
            default:
                Throwable th27 = (Throwable) obj;
                th27.getClass();
                th27.printStackTrace();
                return Unit.f46060a;
        }
    }
}
