package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class baq implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2272a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ baq(Function1 function1, byte b) {
        this.f2272a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2272a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj).intValue();
                function1.invoke(w8q.f38735a);
                break;
            case 1:
                ynd0 ynd0Var = (ynd0) obj;
                ynd0Var.getClass();
                function1.invoke(new d520(ynd0Var));
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new l420(str));
                break;
            case 3:
                a8q0 a8q0Var = (a8q0) obj;
                a8q0Var.getClass();
                function1.invoke(new z320(a8q0Var));
                break;
            case 4:
                function1.invoke(new y320(((Float) obj).floatValue()));
                break;
            case 5:
                a8q0 a8q0Var2 = (a8q0) obj;
                a8q0Var2.getClass();
                function1.invoke(new v320(a8q0Var2));
                break;
            case 6:
                function1.invoke(new u320(((Float) obj).floatValue()));
                break;
            case 7:
                a8q0 a8q0Var3 = (a8q0) obj;
                a8q0Var3.getClass();
                function1.invoke(new u420(a8q0Var3));
                break;
            case 8:
                function1.invoke(new t420(((Float) obj).floatValue()));
                break;
            case 9:
                ((jtl) obj).getClass();
                function1.invoke(pjr.f27103a);
                break;
            case 10:
                function1.invoke(Integer.valueOf((int) (((qkx) obj).f28908a & 4294967295L)));
                break;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new tt30(str2));
                break;
            case 12:
                function1.invoke(new yas(((Long) obj).longValue()));
                break;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new zas(str3));
                break;
            case 14:
                Long l = (Long) obj;
                l.longValue();
                function1.invoke(l);
                break;
            case 15:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new jhs(bemVar));
                break;
            case 16:
                o49 o49Var = (o49) obj;
                o49Var.getClass();
                function1.invoke(new iis(o49Var));
                break;
            case 17:
                o49 o49Var2 = (o49) obj;
                o49Var2.getClass();
                function1.invoke(new jis(o49Var2));
                break;
            case 18:
                e0k0 e0k0Var = (e0k0) obj;
                e0k0Var.getClass();
                function1.invoke(new pis(e0k0Var));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new qis(str4));
                break;
            case 20:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new nis(str5));
                break;
            case 21:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new rlr(hdbVar));
                break;
            case 22:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new slr(ussVar));
                break;
            case 23:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new tlr(str6));
                break;
            case 24:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new zlr(nusVar));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new ulr(imsVar));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(lus.f20688a);
                } else if (iIntValue == 1) {
                    function1.invoke(mus.f22427a);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                long jLongValue = ((Long) obj).longValue();
                ggt.b.getClass();
                ggt ggtVar = (ggt) ggt.c.get(Integer.valueOf((int) jLongValue));
                if (ggtVar == null) {
                    ggtVar = ggt.NONE;
                }
                function1.invoke(new a9f0(ggtVar));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                long jLongValue2 = ((Long) obj).longValue();
                hgt.b.getClass();
                hgt hgtVar = (hgt) hgt.c.get(Integer.valueOf((int) jLongValue2));
                if (hgtVar == null) {
                    hgtVar = hgt.NONE;
                }
                function1.invoke(new nve0(hgtVar));
                break;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                igt.b.getClass();
                igt igtVar = (igt) igt.c.get(Integer.valueOf((int) jLongValue3));
                if (igtVar == null) {
                    igtVar = igt.NONE;
                }
                function1.invoke(new x2f0(igtVar));
                break;
        }
        return Unit.f46060a;
    }
}
