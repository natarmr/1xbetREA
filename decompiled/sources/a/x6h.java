package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class x6h implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40363a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ x6h(Function1 function1, byte b) {
        this.f40363a = b;
        this.b = function1;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f40363a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(obj);
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                function1.invoke(obj);
                break;
            case 3:
                function1.invoke(obj);
                break;
            case 4:
                function1.invoke(obj);
                break;
            case 5:
                function1.invoke(obj);
                break;
            case 6:
                function1.invoke((dja) obj);
                break;
            case 7:
                function1.invoke((dja) obj);
                break;
            case 8:
                function1.invoke((py20) obj);
                break;
            case 9:
                function1.invoke(obj);
                break;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                function1.invoke(bool2);
                break;
            case 12:
                function1.invoke(obj);
                break;
            case 13:
                function1.invoke(obj);
                break;
            case 14:
                function1.invoke(obj);
                break;
            case 15:
                function1.invoke(obj);
                break;
            case 16:
                function1.invoke(obj);
                break;
            case 17:
                function1.invoke(obj);
                break;
            case 18:
                function1.invoke(new voc0(!((Boolean) obj).booleanValue()));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(obj);
                break;
            case 20:
                function1.invoke(obj);
                break;
            case 21:
                function1.invoke(obj);
                break;
            case 22:
                function1.invoke(obj);
                break;
            case 23:
                function1.invoke(obj);
                break;
            case 24:
                function1.invoke(obj);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(qol0.f29079a);
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(obj);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Pair pair = (Pair) obj;
                int iIntValue = ((Number) pair.f46059a).intValue();
                if (!((Boolean) pair.b).booleanValue()) {
                    function1.invoke(new yu30(iIntValue));
                }
                break;
            default:
                Pair pair2 = (Pair) obj;
                int iIntValue2 = ((Number) pair2.f46059a).intValue();
                if (!((Boolean) pair2.b).booleanValue()) {
                    function1.invoke(new yu30(iIntValue2));
                }
                break;
        }
        return Unit.f46060a;
    }
}
