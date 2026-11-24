package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8118a;

    public /* synthetic */ eo0(byte b) {
        this.f8118a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        switch (this.f8118a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new gn0(ob0Var);
            case 2:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 14, null, null, ohq0.f25277a, 6);
                return Unit.f46060a;
            case 3:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, 14, null, null, jiq0.f16588a, 6);
                return Unit.f46060a;
            case 4:
                rq0 rq0Var = (rq0) obj;
                rq0Var.getClass();
                return rq0Var.getId();
            case 5:
                rq0 rq0Var2 = (rq0) obj;
                rq0Var2.getClass();
                return rq0Var2.getClass();
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 9:
                String str = (String) obj;
                str.getClass();
                return Long.valueOf(str.length() == 0 ? 0L : 300L);
            case 10:
                h4r0 h4r0Var = (h4r0) obj;
                h4r0Var.getClass();
                return Long.valueOf(h4r0Var.f12448a);
            case 11:
                int iIntValue3 = ((Integer) obj).intValue();
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var3 = pb10.g;
                xuzVar3.getClass();
                return new mdm(xuz.a(pb10Var3, iIntValue3), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case 12:
                return epv0.O(((Integer) obj).intValue());
            case 13:
                d7v d7vVar = (d7v) obj;
                d7vVar.getClass();
                int iOrdinal = d7vVar.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.no_gifts_title;
                } else if (iOrdinal == 1) {
                    i = R.string.no_bonuses_title;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.no_free_spins_title;
                }
                return Integer.valueOf(i);
            case 14:
                ob0 ob0Var2 = (ob0) obj;
                ob0Var2.getClass();
                return new j11(ob0Var2);
            case 15:
                b41 b41Var = (b41) obj;
                b41Var.getClass();
                return b41Var;
            case 16:
                pek0 pek0Var = h51.Z1;
                ((eg60) obj).getClass();
                return Unit.f46060a;
            case 17:
                iz30 iz30Var = (iz30) obj;
                iz30Var.getClass();
                return new sx10(iz30Var, false);
            case 18:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.w(cy7.c() ? -1.0f : 1.0f);
                return Unit.f46060a;
            case 20:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 21:
                rek0 rek0Var = cb1.e2;
                ((yb1) obj).getClass();
                return Unit.f46060a;
            case 22:
                xb1 xb1Var = (xb1) obj;
                xb1Var.getClass();
                return new yb1(xb1Var.h);
            case 23:
                int iIntValue4 = ((Integer) obj).intValue();
                xuz xuzVar4 = pb10.c;
                pb10 pb10Var4 = pb10.g;
                xuzVar4.getClass();
                return new mdm(xuz.a(pb10Var4, iIntValue4), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
            case 24:
                int iIntValue5 = ((Integer) obj).intValue();
                xuz xuzVar5 = pb10.c;
                pb10 pb10Var5 = pb10.g;
                xuzVar5.getClass();
                return new mdm(xuz.a(pb10Var5, iIntValue5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wq5 wq5Var = (wq5) obj;
                wq5Var.getClass();
                return new ff1(wq5Var);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ob0 ob0Var3 = (ob0) obj;
                ob0Var3.getClass();
                return new ef1(ob0Var3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                th1 th1Var = (th1) obj;
                th1Var.getClass();
                return aad.d0(th1Var);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iIntValue6 = ((Integer) obj).intValue();
                xuz xuzVar6 = pb10.c;
                pb10 pb10Var6 = pb10.e;
                xuzVar6.getClass();
                return new mdm(xuz.a(pb10Var6, iIntValue6), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
            default:
                int iIntValue7 = ((Integer) obj).intValue();
                xuz xuzVar7 = pb10.c;
                pb10 pb10Var7 = pb10.g;
                xuzVar7.getClass();
                return new mdm(xuz.a(pb10Var7, iIntValue7), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
        }
    }
}
