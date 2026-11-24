package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class g5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10692a;
    public final Object b;
    public final Object c;

    public /* synthetic */ g5(Object obj, Object obj2, byte b) {
        this.f10692a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        iay iayVar;
        jys0 jys0VarN0;
        byte b = this.f10692a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                obj.getClass();
                return Boolean.valueOf(((q8a) obj3).P(obj, ((j5) obj2).f15909a));
            case 1:
                pys0 pys0Var = (pys0) obj3;
                iay[] iayVarArr = (iay[]) obj2;
                int iIntValue = ((Number) obj).intValue();
                if (pys0Var == null || (iayVar = (iay) pys0Var.f27812a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= iayVarArr.length) ? iay.f : iayVarArr[iIntValue];
                }
                return iayVar;
            case 2:
                q8a q8aVar = (q8a) obj3;
                yzs0 yzs0Var = (yzs0) obj2;
                j5 j5Var = (j5) obj;
                j5Var.getClass();
                aty atyVar = j5Var.f15909a;
                if ((q8aVar.i0() && atyVar != null && yzs0Var.m(atyVar)) || atyVar == null || (jys0VarN0 = yzs0Var.n0(atyVar)) == null) {
                    return null;
                }
                int iX = yzs0Var.x(jys0VarN0);
                ArrayList arrayList = new ArrayList(iX);
                for (int i = 0; i < iX; i++) {
                    jzs0 jzs0VarR0 = yzs0Var.r0(jys0VarN0, i);
                    aty atyVarC0 = yzs0Var.C0(yzs0Var.E(atyVar, i));
                    jay jayVar = j5Var.b;
                    arrayList.add(atyVarC0 == null ? new j5(null, jayVar, jzs0VarR0) : new j5(atyVarC0, u0.b(q8aVar.T(), jayVar, q8aVar.U(atyVarC0)), jzs0VarR0));
                }
                return arrayList;
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                return ((hhd) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 4:
                int iIntValue3 = ((Number) obj).intValue();
                return ((hhd) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 5:
                int iIntValue4 = ((Number) obj).intValue();
                return ((hhd) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 6:
                int iIntValue5 = ((Number) obj).intValue();
                return ((hhd) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 7:
                return ((b5) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 8:
                return ((b5) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                return ((b5) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 10:
                int iIntValue6 = ((Number) obj).intValue();
                return ((g20) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 11:
                int iIntValue7 = ((Number) obj).intValue();
                return ((g20) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 12:
                int iIntValue8 = ((Number) obj).intValue();
                return ((g20) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 13:
                int iIntValue9 = ((Number) obj).intValue();
                return ((g20) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 14:
                int iIntValue10 = ((Number) obj).intValue();
                return ((g20) obj3).invoke(Integer.valueOf(iIntValue10), ((a4x) obj2).get(iIntValue10));
            case 15:
                ((Function1) obj3).invoke(new up0(((kq0) ((rq0) obj2)).c, ((Number) obj).longValue()));
                return Unit.f46060a;
            case 16:
                return ((eo0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((eo0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 18:
                frl frlVar = (frl) obj;
                frlVar.getClass();
                ((Function1) obj3).invoke(new gs1(new wr1(((lw1) ((nw1) obj2)).f20739a), frlVar == frl.f10024a));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue11 = ((Number) obj).intValue();
                return ((xg1) obj3).invoke(Integer.valueOf(iIntValue11), ((a4x) obj2).get(iIntValue11));
            case 20:
                int iIntValue12 = ((Number) obj).intValue();
                return ((xg1) obj3).invoke(Integer.valueOf(iIntValue12), ((a4x) obj2).get(iIntValue12));
            case 21:
                int iIntValue13 = ((Number) obj).intValue();
                return ((xg1) obj3).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            case 22:
                int iIntValue14 = ((Number) obj).intValue();
                return ((xg1) obj3).invoke(Integer.valueOf(iIntValue14), ((a4x) obj2).get(iIntValue14));
            case 23:
                return ((dj1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((dj1) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((dj1) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((dj1) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((xd2) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((xd2) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            default:
                int iIntValue15 = ((Number) obj).intValue();
                return ((ma2) obj3).invoke(Integer.valueOf(iIntValue15), ((a4x) obj2).get(iIntValue15));
        }
    }
}
