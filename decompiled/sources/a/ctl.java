package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ctl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4943a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ctl(long j, vwb0 vwb0Var, n5a n5aVar) {
        this.f4943a = (byte) 22;
        this.c = vwb0Var;
        this.b = n5aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        byte b = this.f4943a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 4:
                int iIntValue5 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 5:
                int iIntValue6 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 6:
                int iIntValue7 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 7:
                int iIntValue8 = ((Number) obj).intValue();
                return ((j2l) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 8:
                int iIntValue9 = ((Number) obj).intValue();
                return ((f4m) obj3).invoke(Integer.valueOf(iIntValue9), ((a4x) obj2).get(iIntValue9));
            case 9:
                int iIntValue10 = ((Number) obj).intValue();
                return ((f4m) obj3).invoke(Integer.valueOf(iIntValue10), ((a4x) obj2).get(iIntValue10));
            case 10:
                int iIntValue11 = ((Number) obj).intValue();
                return ((f4m) obj3).invoke(Integer.valueOf(iIntValue11), ((List) obj2).get(iIntValue11));
            case 11:
                return ((xjl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                return ((xjl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 13:
                return ((xjl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                return ((xjl) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 15:
                int iIntValue12 = ((Number) obj).intValue();
                return ((f4m) obj3).invoke(Integer.valueOf(iIntValue12), ((List) obj2).get(iIntValue12));
            case 16:
                return ((aim) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((aim) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 18:
                o0x o0xVar = (o0x) obj;
                o0xVar.getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                if (n0xVar != null && (str = n0xVar.f22722a) != null) {
                    ((ngk0) obj3).put(Integer.valueOf(((wim) obj2).f39221a), str);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue13 = ((Number) obj).intValue();
                return ((f4m) obj3).invoke(Integer.valueOf(iIntValue13), ((a4x) obj2).get(iIntValue13));
            case 20:
                int iIntValue14 = ((Number) obj).intValue();
                return ((f4m) obj3).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
            case 21:
                return ((mmn) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 22:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                System.currentTimeMillis();
                ((vwb0) obj3).e("PREF_IS_EMULATOR", zBooleanValue);
                e0g0 e0g0Var = j0g0.b;
                ((n5a) obj2).resumeWith(bool);
                return Unit.f46060a;
            case 23:
                return ((mmn) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((mmn) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((wnk) obj).getClass();
                ((Function1) obj3).invoke((wnk) obj2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue15 = ((Number) obj).intValue();
                return ((x6o) obj3).invoke(Integer.valueOf(iIntValue15), ((ArrayList) obj2).get(iIntValue15));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue16 = ((Number) obj).intValue();
                return ((x6o) obj3).invoke(Integer.valueOf(iIntValue16), ((a4x) obj2).get(iIntValue16));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iIntValue17 = ((Number) obj).intValue();
                return ((x6o) obj3).invoke(Integer.valueOf(iIntValue17), ((ArrayList) obj2).get(iIntValue17));
            default:
                return ((mmn) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }

    public /* synthetic */ ctl(Object obj, Object obj2, byte b) {
        this.f4943a = b;
        this.c = obj;
        this.b = obj2;
    }
}
