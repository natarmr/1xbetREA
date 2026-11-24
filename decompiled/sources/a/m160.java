package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class m160 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20991a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m160(Object obj, Object obj2, byte b) {
        this.f20991a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qgv0 qgv0Var;
        byte b = this.f20991a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((rj50) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 1:
                return ((mb50) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((rj50) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 3:
                return ((mb50) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((mb50) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                ((Function1) obj3).invoke(new bz50((tdp) obj2, (String) obj));
                return Unit.f46060a;
            case 6:
                return ((mb50) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 7:
                int iIntValue3 = ((Number) obj).intValue();
                return ((rj50) obj3).invoke(Integer.valueOf(iIntValue3), ((ArrayList) obj2).get(iIntValue3));
            case 8:
                int iIntValue4 = ((Number) obj).intValue();
                return (iIntValue4 != 1 || (qgv0Var = (qgv0) obj2) == null) ? sre0.f32672a.b(((o8w) ((ArrayList) obj3).get(iIntValue4)).getClass()) : qgv0Var;
            case 9:
                return ((mb50) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 10:
                return ((mb50) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 11:
                int iIntValue5 = ((Number) obj).intValue();
                return ((zc70) obj3).invoke(Integer.valueOf(iIntValue5), ((a4x) obj2).get(iIntValue5));
            case 12:
                return ((wk60) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 13:
                return ((r580) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                int iIntValue6 = ((Number) obj).intValue();
                return ((zc70) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 15:
                int iIntValue7 = ((Number) obj).intValue();
                return ((zc70) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 16:
                int iIntValue8 = ((Number) obj).intValue();
                return ((zc70) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 17:
                int iIntValue9 = ((Number) obj).intValue();
                return ((zc70) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 18:
                mp9 mp9Var = (mp9) obj;
                mp9Var.getClass();
                ((g8x) obj3).y((mp9) obj2, mp9Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ev80) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 20:
                return ((ev80) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 21:
                return ((ev80) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 22:
                int iIntValue10 = ((Number) obj).intValue();
                return ((ht80) obj3).invoke(Integer.valueOf(iIntValue10), ((List) obj2).get(iIntValue10));
            case 23:
                int iIntValue11 = ((Number) obj).intValue();
                return ((ht80) obj3).invoke(Integer.valueOf(iIntValue11), ((List) obj2).get(iIntValue11));
            case 24:
                int iIntValue12 = ((Number) obj).intValue();
                return ((ht80) obj3).invoke(Integer.valueOf(iIntValue12), ((List) obj2).get(iIntValue12));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue13 = ((Number) obj).intValue();
                return ((ht80) obj3).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue14 = ((Number) obj).intValue();
                return ((ht80) obj3).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue15 = ((Number) obj).intValue();
                return ((ht80) obj3).invoke(Integer.valueOf(iIntValue15), ((List) obj2).get(iIntValue15));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iIntValue16 = ((Number) obj).intValue();
                return ((ch90) obj3).invoke(Integer.valueOf(iIntValue16), ((a4x) obj2).get(iIntValue16));
            default:
                int iIntValue17 = ((Number) obj).intValue();
                return ((so90) obj3).invoke(Integer.valueOf(iIntValue17), ((SnapshotStateList) obj2).get(iIntValue17));
        }
    }
}
