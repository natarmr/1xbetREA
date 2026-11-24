package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class bt implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3157a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bt(Function1 function1, byte b) {
        this.f3157a = b;
        this.b = function1;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f3157a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(obj);
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(fd0.f9335a);
                }
                break;
            case 2:
                function1.invoke(obj);
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(uf2.f35559a);
                }
                break;
            case 4:
                function1.invoke(new wk2(((Boolean) obj).booleanValue()));
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(j48.f15871a);
                } else {
                    function1.invoke(i48.f14134a);
                }
                break;
            case 7:
                function1.invoke(new xt8(((Boolean) obj).booleanValue()));
                break;
            case 8:
                function1.invoke(obj);
                break;
            case 9:
                function1.invoke(obj);
                break;
            case 10:
                function1.invoke(obj);
                break;
            case 11:
                function1.invoke(obj);
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
                function1.invoke((dja) obj);
                break;
            case 16:
                function1.invoke(obj);
                break;
            case 17:
                function1.invoke(obj);
                break;
            case 18:
                function1.invoke(obj);
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
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function1.invoke(bool2);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(obj);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(obj);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
        return Unit.f46060a;
    }
}
