package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class omf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25501a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ omf(Function1 function1, byte b) {
        this.f25501a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25501a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new ckf(str));
                break;
            case 1:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new mkf(nusVar));
                break;
            case 2:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new dkf(imsVar));
                break;
            case 3:
                Integer num = (Integer) obj;
                num.getClass();
                function1.invoke(num);
                break;
            case 4:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                wdm wdmVar = bemVar instanceof wdm ? (wdm) bemVar : null;
                function1.invoke(Long.valueOf(wdmVar != null ? wdmVar.f38979a : 0L));
                break;
            case 5:
                function1.invoke(new qfg(((Long) obj).longValue()));
                break;
            case 6:
                function1.invoke(new ofg(((Integer) obj).intValue()));
                break;
            case 7:
                function1.invoke(new pxq0(new jlg(((Long) obj).longValue())));
                break;
            case 8:
                function1.invoke(new pxq0(new klg(((Long) obj).longValue())));
                break;
            case 9:
                function1.invoke(new pxq0(new olg(((Long) obj).longValue())));
                break;
            case 10:
                function1.invoke(new pxq0(new nlg(((Long) obj).longValue())));
                break;
            case 11:
                function1.invoke(new pxq0(new llg(((Long) obj).longValue())));
                break;
            case 12:
                function1.invoke(new pxq0(new jlg(((Long) obj).longValue())));
                break;
            case 13:
                function1.invoke(new pxq0(new klg(((Long) obj).longValue())));
                break;
            case 14:
                function1.invoke(new pxq0(new olg(((Long) obj).longValue())));
                break;
            case 15:
                function1.invoke(new pxq0(new nlg(((Long) obj).longValue())));
                break;
            case 16:
                function1.invoke(new pxq0(new llg(((Long) obj).longValue())));
                break;
            case 17:
                function1.invoke(new eig(((Long) obj).longValue()));
                break;
            case 18:
                Long l = (Long) obj;
                l.longValue();
                function1.invoke(l);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new dig(((Long) obj).longValue()));
                break;
            case 20:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                function1.invoke(new pxq0(new mlg(cvlVar.f5035a)));
                break;
            case 21:
                nus nusVar2 = (nus) obj;
                nusVar2.getClass();
                function1.invoke(nusVar2);
                break;
            case 22:
                ims imsVar2 = (ims) obj;
                imsVar2.getClass();
                function1.invoke(imsVar2);
                break;
            case 23:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(hdbVar);
                break;
            case 24:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((dux) cpVar.u).f6717a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new xb(function1, cpVar, (byte) 21));
                cpVar.t(new rn5(cpVar, (byte) 27));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    xgl0 xgl0Var = ((vgl0) wgl0Var).f37387a;
                    int i = xgl0Var.e;
                    long j = xgl0Var.f40846a;
                    long j2 = xgl0Var.f;
                    double d = xgl0Var.b;
                    tqt tqtVar = uoy.b;
                    byte b2 = xgl0Var.g;
                    tqtVar.getClass();
                    function1.invoke(new e6h(new eu6(i, j, j2, d, tqt.j(b2), xgl0Var.h)));
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xgl0 xgl0Var2 = (xgl0) obj;
                xgl0Var2.getClass();
                int i2 = xgl0Var2.e;
                long j3 = xgl0Var2.f40846a;
                long j4 = xgl0Var2.f;
                double d2 = xgl0Var2.b;
                tqt tqtVar2 = uoy.b;
                byte b3 = xgl0Var2.g;
                tqtVar2.getClass();
                function1.invoke(new f6h(new eu6(i2, j3, j4, d2, tqt.j(b3), xgl0Var2.h)));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new m6h(((Long) obj).longValue()));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new g6h(((Long) obj).longValue()));
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new rih(str2));
                break;
        }
        return Unit.f46060a;
    }
}
