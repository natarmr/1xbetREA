package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class zu90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45000a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ wdr c;

    public /* synthetic */ zu90(byte b, wdr wdrVar, Object obj) {
        this.f45000a = b;
        this.c = wdrVar;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f45000a;
        Object obj2 = this.b;
        wdr wdrVar = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((so90) wdrVar).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                return ((so90) wdrVar).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                return ((so90) wdrVar).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                return ((so90) wdrVar).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 4:
                return ((er90) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                int iIntValue5 = ((Number) obj).intValue();
                return ((jfa0) wdrVar).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 6:
                return ((er90) wdrVar).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 7:
                return ((er90) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 8:
                int iIntValue6 = ((Number) obj).intValue();
                return ((jfa0) wdrVar).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 9:
                int iIntValue7 = ((Number) obj).intValue();
                return ((jfa0) wdrVar).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 10:
                int iIntValue8 = ((Number) obj).intValue();
                return ((jfa0) wdrVar).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 11:
                return ((kma0) wdrVar).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 12:
                return ((kma0) wdrVar).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 13:
                ((vo30) obj).getClass();
                ((Function1) wdrVar).invoke(new tdb0(((neb0) ((oeb0) obj2)).b));
                return Unit.f46060a;
            case 14:
                return ((kma0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 15:
                return ((peb0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                int iIntValue9 = ((Number) obj).intValue();
                return ((j3b0) wdrVar).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 17:
                int iIntValue10 = ((Number) obj).intValue();
                return ((t4c0) wdrVar).invoke(Integer.valueOf(iIntValue10), ((List) obj2).get(iIntValue10));
            case 18:
                int iIntValue11 = ((Number) obj).intValue();
                return ((t4c0) wdrVar).invoke(Integer.valueOf(iIntValue11), ((List) obj2).get(iIntValue11));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ljc0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 20:
                int iIntValue12 = ((Number) obj).intValue();
                return ((ksc0) wdrVar).invoke(Integer.valueOf(iIntValue12), ((List) obj2).get(iIntValue12));
            case 21:
                int iIntValue13 = ((Number) obj).intValue();
                return ((t4c0) wdrVar).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            case 22:
                return ((ljc0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((ljc0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((ljc0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((bod0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((bod0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue14 = ((Number) obj).intValue();
                return ((ksc0) wdrVar).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((bue0) wdrVar).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            default:
                return ((bue0) wdrVar).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}
