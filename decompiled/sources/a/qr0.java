package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class qr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29186a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ qr0(Function1 function1, byte b) {
        this.f29186a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29186a;
        ou8 ou8Var = ou8.f25865a;
        iu8 iu8Var = iu8.f15384a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new vp0(str));
                break;
            case 1:
                frl frlVar = (frl) obj;
                frlVar.getClass();
                function1.invoke(new gs1(xr1.f41347a, frlVar == frl.f10024a));
                break;
            case 2:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                long j = st0Var.f32750a;
                mtr mtrVar = st0Var.d;
                function1.invoke(new hs1(j, mtrVar != null ? mtrVar.b : false, bv1.GAMES));
                break;
            case 3:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new is1(st0Var2.f32750a, bv1.DESCRIPTION));
                break;
            case 4:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new n22(bemVar));
                break;
            case 5:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(new da2(bemVar2));
                break;
            case 6:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                function1.invoke(new rd2(bemVar3));
                break;
            case 7:
                bem bemVar4 = (bem) obj;
                bemVar4.getClass();
                function1.invoke(new tf2(bemVar4));
                break;
            case 8:
                bem bemVar5 = (bem) obj;
                bemVar5.getClass();
                function1.invoke(new tf2(bemVar5));
                break;
            case 9:
                bem bemVar6 = (bem) obj;
                bemVar6.getClass();
                function1.invoke(new eg2(bemVar6));
                break;
            case 10:
                bem bemVar7 = (bem) obj;
                bemVar7.getClass();
                function1.invoke(new jk2(bemVar7));
                break;
            case 11:
                bem bemVar8 = (bem) obj;
                bemVar8.getClass();
                function1.invoke(new jk2(bemVar8));
                break;
            case 12:
                bem bemVar9 = (bem) obj;
                bemVar9.getClass();
                function1.invoke(new km2(bemVar9));
                break;
            case 13:
                bem bemVar10 = (bem) obj;
                bemVar10.getClass();
                function1.invoke(new km2(bemVar10));
                break;
            case 14:
                function1.invoke(new n8f0(((Number) obj).longValue()));
                break;
            case 15:
                rd8 rd8Var = (rd8) obj;
                rd8Var.getClass();
                function1.invoke(new pc8(rd8Var.f30278a));
                break;
            case 16:
                function1.invoke(new fu8(((Number) obj).longValue()));
                break;
            case 17:
                function1.invoke(new du8(((Number) obj).longValue()));
                break;
            case 18:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(ou8Var);
                } else if (iIntValue == 1) {
                    function1.invoke(iu8Var);
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new pu8(str2));
                break;
            case 20:
                int iIntValue2 = ((Number) obj).intValue();
                if (iIntValue2 == 0) {
                    function1.invoke(ou8Var);
                } else if (iIntValue2 == 1) {
                    function1.invoke(iu8Var);
                }
                break;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                function1.invoke(bool);
                break;
            case 22:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                function1.invoke(bool2);
                break;
            case 23:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                function1.invoke(bool3);
                break;
            case 24:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                function1.invoke(bool4);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(str3);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                o37 o37Var = (o37) obj;
                o37Var.getClass();
                if (o37Var instanceof e27) {
                    String str4 = ((e27) o37Var).f7071a;
                    str4.getClass();
                    function1.invoke(new ui7(str4));
                } else if (o37Var instanceof f27) {
                    String str5 = ((f27) o37Var).f8798a;
                    str5.getClass();
                    function1.invoke(new yi7(str5));
                } else if (o37Var instanceof h27) {
                    String str6 = ((h27) o37Var).f12318a;
                    str6.getClass();
                    function1.invoke(new zi7(str6));
                } else if (o37Var instanceof g27) {
                    String str7 = ((g27) o37Var).f10549a;
                    str7.getClass();
                    function1.invoke(new hj7(str7));
                } else if (o37Var instanceof r27) {
                    function1.invoke(ri7.f30526a);
                } else if (o37Var instanceof t27) {
                    t27 t27Var = (t27) o37Var;
                    function1.invoke(new vi7(t27Var.f33202a, t27Var.b));
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bem bemVar11 = (bem) obj;
                bemVar11.getClass();
                function1.invoke(new mxq0(bemVar11));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bem bemVar12 = (bem) obj;
                bemVar12.getClass();
                function1.invoke(new mxq0(bemVar12));
                break;
            default:
                bem bemVar13 = (bem) obj;
                bemVar13.getClass();
                function1.invoke(new mxq0(bemVar13));
                break;
        }
        return Unit.f46060a;
    }
}
