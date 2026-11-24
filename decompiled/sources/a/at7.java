package a;

import android.view.KeyEvent;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class at7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1422a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ at7(Object obj, Object obj2, byte b) {
        this.f1422a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.f1422a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return ((nk7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                return ((nk7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                int iIntValue = ((Number) obj).intValue();
                return ((i87) obj3).invoke(Integer.valueOf(iIntValue), ((ArrayList) obj2).get(iIntValue));
            case 3:
                ((nk7) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
                return "bonus_item";
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                return ((i87) obj3).invoke(Integer.valueOf(iIntValue2), ((ArrayList) obj2).get(iIntValue2));
            case 5:
                return ((cp8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                return ((cp8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 7:
                ((cp8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return vz8.class;
            case 8:
                int iIntValue3 = ((Number) obj).intValue();
                return ((im8) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 9:
                int iIntValue4 = ((Number) obj).intValue();
                return ((im8) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 10:
                return ((d69) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 11:
                return ((d69) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                int iIntValue5 = ((Number) obj).intValue();
                return ((im8) obj3).invoke(Integer.valueOf(iIntValue5), ((a4x) obj2).get(iIntValue5));
            case 13:
                int iIntValue6 = ((Number) obj).intValue();
                return ((pua) obj3).invoke(Integer.valueOf(iIntValue6), ((a4x) obj2).get(iIntValue6));
            case 14:
                int iIntValue7 = ((Number) obj).intValue();
                return ((pua) obj3).invoke(Integer.valueOf(iIntValue7), ((a4x) obj2).get(iIntValue7));
            case 15:
                return ((m1b) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                int iIntValue8 = ((Number) obj).intValue();
                return ((pua) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 17:
                int iIntValue9 = ((Number) obj).intValue();
                return ((pua) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 18:
                wwv0 wwv0Var = (wwv0) obj;
                wwv0Var.getClass();
                ((sfc) obj3).invoke(wwv0Var, (jgc) obj2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue10 = ((Number) obj).intValue();
                return ((sfc) obj3).invoke(Integer.valueOf(iIntValue10), ((List) obj2).get(iIntValue10));
            case 20:
                int iIntValue11 = ((Number) obj).intValue();
                return ((sfc) obj3).invoke(Integer.valueOf(iIntValue11), ((a4x) obj2).get(iIntValue11));
            case 21:
                int iIntValue12 = ((Number) obj).intValue();
                return ((qbd) obj3).invoke(Integer.valueOf(iIntValue12), ((ArrayList) obj2).get(iIntValue12));
            case 22:
                return ((y2d) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 23:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (bemVar instanceof wdm) {
                    ((Function1) obj3).invoke(new ced((aed) obj2));
                }
                return Unit.f46060a;
            case 24:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                if (bemVar2 instanceof wdm) {
                    ((Function1) obj3).invoke(new ued((xdd) obj2));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue13 = ((Number) obj).intValue();
                return ((bqd) obj3).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue14 = ((Number) obj).intValue();
                return ((bqd) obj3).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue15 = ((Number) obj).intValue();
                return ((bqd) obj3).invoke(Integer.valueOf(iIntValue15), ((List) obj2).get(iIntValue15));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                KeyEvent keyEvent = ((gky) obj).f11467a;
                if (((djz) obj3).a() == dmv.b && keyEvent.getKeyCode() == 4) {
                    int iH = n7x.H(keyEvent);
                    z = true;
                    if (iH == 1) {
                        ((k7q0) obj2).d(null);
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((View) obj).getClass();
                ((Function1) obj3).invoke(Long.valueOf(((vte) ((cp) obj2).u()).f38002a));
                return Unit.f46060a;
        }
    }
}
