package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vtf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38004a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vtf(Object obj, Object obj2, byte b) {
        this.f38004a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38004a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return ((vlf) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return ((jyf) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((jyf) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                return ((p1h) obj3).invoke(Integer.valueOf(iIntValue3), ((a4x) obj2).get(iIntValue3));
            case 4:
                return ((m7h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                return ((m7h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                wwv0 wwv0Var = (wwv0) obj;
                wwv0Var.getClass();
                ((p1h) obj3).invoke(wwv0Var, (lwv0) obj2);
                return Unit.f46060a;
            case 7:
                int iIntValue4 = ((Number) obj).intValue();
                return ((p1h) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 8:
                int iIntValue5 = ((Number) obj).intValue();
                return ((p1h) obj3).invoke(Integer.valueOf(iIntValue5), ((a4x) obj2).get(iIntValue5));
            case 9:
                int iIntValue6 = ((Number) obj).intValue();
                return ((p1h) obj3).invoke(Integer.valueOf(iIntValue6), ((a4x) obj2).get(iIntValue6));
            case 10:
                int iIntValue7 = ((Number) obj).intValue();
                return ((p1h) obj3).invoke(Integer.valueOf(iIntValue7), ((a4x) obj2).get(iIntValue7));
            case 11:
                return ((m7h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                return ((m7h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 13:
                return ((m7h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                int iIntValue8 = ((Number) obj).intValue();
                return ((zuh) obj3).invoke(Integer.valueOf(iIntValue8), ((a4x) obj2).get(iIntValue8));
            case 15:
                int iIntValue9 = ((Number) obj).intValue();
                return ((zuh) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 16:
                ali aliVar = (ali) obj3;
                ffk ffkVar = (ffk) obj2;
                g45 g45Var = ffkVar.l;
                g950 g950Var = (g950) obj;
                g950Var.getClass();
                d3d0 d3d0Var = (d3d0) ((LinkedHashMap) aliVar.f1068a).get(g950Var);
                if (d3d0Var != null) {
                    return f0o.u0((eu00) ((f6i) g45Var.f10647a).e, ffkVar, g950Var, (cu00) aliVar.c, new vek((eu00) ((f6i) g45Var.f10647a).e, new lhf(ffkVar, d3d0Var, (byte) 16)), gmk0.x0);
                }
                return null;
            case 17:
                return ((vbk) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 18:
                return ((vbk) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((vbk) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 20:
                return ((vbk) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 21:
                return ((vbk) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 22:
                return ((vbk) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((vbk) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((vbk) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue10 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue10), ((List) obj2).get(iIntValue10));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue11 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue11), ((List) obj2).get(iIntValue11));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue12 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue12), ((List) obj2).get(iIntValue12));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iIntValue13 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            default:
                int iIntValue14 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
        }
    }
}
