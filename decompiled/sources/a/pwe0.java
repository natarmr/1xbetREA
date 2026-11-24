package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class pwe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27708a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pwe0(Object obj, Object obj2, byte b) {
        this.f27708a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27708a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((k8e0) obj3).invoke(Integer.valueOf(iIntValue), ((a4x) obj2).get(iIntValue));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                return ((k8e0) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                return ((k8e0) obj3).invoke(Integer.valueOf(iIntValue3), ((a4x) obj2).get(iIntValue3));
            case 3:
                return ((bue0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((bue0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                return ((wtf0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 6:
                return ((wtf0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 7:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (bemVar instanceof wdm) {
                    cge0 cge0Var = n7g0.p2;
                    ((k3t0) ((n7g0) obj3).o2.getValue()).x(new n0g0((dyl0) obj2));
                }
                return Unit.f46060a;
            case 8:
                int iIntValue4 = ((Number) obj).intValue();
                return ((vtf0) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 9:
                return ((wtf0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 10:
                int iIntValue5 = ((Number) obj).intValue();
                return ((vtf0) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 11:
                return ((wtf0) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 12:
                return ((w0h0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 13:
                return ((w0h0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                int iIntValue6 = ((Number) obj).intValue();
                return ((x0h0) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 15:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                bmh0 bmh0Var = ((pkh0) obj3).f27134a;
                if (iqqVar.b() && (bmh0Var instanceof amh0)) {
                    ((Function1) obj2).invoke(new mkh0((amh0) bmh0Var));
                }
                return Unit.f46060a;
            case 16:
                return ((w0h0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                int iIntValue7 = ((Number) obj).intValue();
                return ((x0h0) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 18:
                int iIntValue8 = ((Number) obj).intValue();
                return ((x0h0) obj3).invoke(Integer.valueOf(iIntValue8), ((a4x) obj2).get(iIntValue8));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((eoh0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 20:
                ((eoh0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "cashback_cell";
            case 21:
                ((h2l0) obj).getClass();
                ((Function1) obj3).invoke(new fec(((dre) obj2).f6555a));
                return Unit.f46060a;
            case 22:
                return ((eoh0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((eoh0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((wvi0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((thj0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((thj0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ejk0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((h2l0) obj).getClass();
                ((Function1) obj3).invoke(new vxq0(new x4l0(((ger0) obj2).c.f19243a)));
                return Unit.f46060a;
            default:
                return ((ejk0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}
