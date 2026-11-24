package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class j13 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15712a;
    public final /* synthetic */ ArrayList b;

    public j13(ArrayList arrayList, byte b) {
        this.f15712a = b;
        switch (b) {
            case 5:
                dda ddaVar = dda.b;
                this.b = arrayList;
                break;
            case 7:
                eda edaVar = eda.b;
                this.b = arrayList;
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                r9l0 r9l0Var = r9l0.b;
                this.b = arrayList;
                break;
            default:
                fg8 fg8Var = fg8.b;
                this.b = arrayList;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15712a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        ou90Var.m((pu90) arrayList.get(i), 0, 0, 0.0f);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 2:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 3:
                return fg8.b.get(arrayList.get(((Number) obj).intValue()));
            case 4:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 5:
                return dda.b.get(arrayList.get(((Number) obj).intValue()));
            case 6:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 7:
                return eda.b.get(arrayList.get(((Number) obj).intValue()));
            case 8:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 9:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 10:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 11:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 12:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 13:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 14:
                return sre0.f32672a.b(((ah7) arrayList.get(((Number) obj).intValue())).getClass());
            case 15:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 16:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 17:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 18:
                arrayList.get(((Number) obj).intValue());
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 20:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 21:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 22:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 23:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 24:
                arrayList.get(((Number) obj).intValue());
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            default:
                return r9l0.b.get(arrayList.get(((Number) obj).intValue()));
        }
    }

    public /* synthetic */ j13(ArrayList arrayList, byte b, boolean z) {
        this.f15712a = b;
        this.b = arrayList;
    }
}
