package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xar0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40571a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xar0(Function1 function1, byte b) {
        this.f40571a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40571a;
        hss0 hss0Var = hss0.f13599a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    function1.invoke(new k9r0());
                } else if (iIntValue == 2) {
                    function1.invoke(j9r0.f16153a);
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new l9r0(str));
                break;
            case 2:
                function1.invoke(new m9r0(((Long) obj).longValue()));
                break;
            case 3:
                usm usmVar = (usm) obj;
                usmVar.getClass();
                function1.invoke(new nkb0(new z4l0(usmVar.f36218a)));
                break;
            case 4:
                kfk0 kfk0Var = (kfk0) obj;
                kfk0Var.getClass();
                function1.invoke(new gpr0(kfk0Var));
                break;
            case 5:
                function1.invoke(new rtr0(((Integer) obj).intValue()));
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(str2);
                break;
            case 7:
                function1.invoke(Integer.valueOf((int) (((qkx) obj).f28908a >> 32)));
                break;
            case 8:
                ((jtl) obj).getClass();
                function1.invoke(z9s0.f44036a);
                break;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new iis0(str3));
                break;
            case 10:
                if (((Integer) obj).intValue() == 3) {
                    function1.invoke(lis0.f20121a);
                }
                break;
            case 11:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new mis0(str4));
                break;
            case 12:
                function1.invoke(new fis0(((Long) obj).longValue()));
                break;
            case 13:
                function1.invoke(new fis0(((Long) obj).longValue()));
                break;
            case 14:
                function1.invoke(new iss0(((Long) obj).longValue()));
                break;
            case 15:
                ((Integer) obj).intValue();
                function1.invoke(hss0Var);
                break;
            case 16:
                ((Integer) obj).intValue();
                function1.invoke(hss0Var);
                break;
            case 17:
                nea0 nea0Var = (nea0) obj;
                nea0Var.getClass();
                function1.invoke(new x900(nea0Var.d));
                break;
            case 18:
                function1.invoke(new w900(((Long) obj).longValue()));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                function1.invoke(th);
                break;
            case 20:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                function1.invoke(th2);
                break;
            case 21:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                function1.invoke(th3);
                break;
            case 22:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((dux) cpVar.u).f6717a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new o7x(function1, cpVar, (byte) 16));
                cpVar.t(new kzi0(cpVar, (byte) 27));
                break;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new x4t0(str5));
                break;
            case 24:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new y4t0(imsVar));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new w4t0(hdbVar));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(b5t0.f2021a);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Integer num = (Integer) obj;
                num.intValue();
                function1.invoke(num);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                wdm wdmVar = bemVar instanceof wdm ? (wdm) bemVar : null;
                function1.invoke(Long.valueOf(wdmVar != null ? wdmVar.f38979a : 0L));
                break;
            default:
                function1.invoke(new hbt0(((Long) obj).longValue()));
                break;
        }
        return Unit.f46060a;
    }
}
