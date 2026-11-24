package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o3l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24591a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3l0(Object obj, Object obj2, byte b) {
        this.f24591a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24591a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return ((ejk0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 5:
                int iIntValue5 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 6:
                int iIntValue6 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 7:
                int iIntValue7 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 8:
                int iIntValue8 = ((Number) obj).intValue();
                return ((jak0) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 9:
                int iIntValue9 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 10:
                int iIntValue10 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue10), ((List) obj2).get(iIntValue10));
            case 11:
                int iIntValue11 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue11), ((List) obj2).get(iIntValue11));
            case 12:
                int iIntValue12 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue12), ((List) obj2).get(iIntValue12));
            case 13:
                int iIntValue13 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            case 14:
                int iIntValue14 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
            case 15:
                int iIntValue15 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue15), ((List) obj2).get(iIntValue15));
            case 16:
                int iIntValue16 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue16), ((List) obj2).get(iIntValue16));
            case 17:
                h2l0 h2l0Var = (h2l0) obj;
                h2l0Var.getClass();
                if (csl0.f4896a[h2l0Var.ordinal()] == 1) {
                    ((Function1) ((pz40) obj2).getValue()).invoke(new prl0((msl0) obj3));
                }
                return Unit.f46060a;
            case 18:
                int iIntValue17 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue17), ((List) obj2).get(iIntValue17));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue18 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue18), ((List) obj2).get(iIntValue18));
            case 20:
                int iIntValue19 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue19), ((List) obj2).get(iIntValue19));
            case 21:
                int iIntValue20 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue20), ((List) obj2).get(iIntValue20));
            case 22:
                int iIntValue21 = ((Number) obj).intValue();
                return ((gcl0) obj3).invoke(Integer.valueOf(iIntValue21), ((List) obj2).get(iIntValue21));
            case 23:
                wwv0 wwv0Var = (wwv0) obj;
                wwv0Var.getClass();
                ((gcl0) obj3).invoke(wwv0Var, (lwv0) obj2);
                return Unit.f46060a;
            case 24:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (bemVar instanceof wdm) {
                    ((i3t0) obj3).x(new yzl0((dyl0) obj2));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((f8l0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((f8l0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue22 = ((Number) obj).intValue();
                return ((acm0) obj3).invoke(Integer.valueOf(iIntValue22), ((ArrayList) obj2).get(iIntValue22));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iIntValue23 = ((Number) obj).intValue();
                return ((acm0) obj3).invoke(Integer.valueOf(iIntValue23), ((a4x) obj2).get(iIntValue23));
            default:
                return ((f8l0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}
