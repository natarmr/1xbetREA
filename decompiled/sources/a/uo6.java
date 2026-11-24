package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uo6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35996a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uo6(Function1 function1, byte b) {
        this.f35996a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35996a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj).intValue();
                function1.invoke(ln6.f20329a);
                break;
            case 1:
                ((jtl) obj).getClass();
                function1.invoke(nq6.f23944a);
                break;
            case 2:
                function1.invoke(new qq6(((Long) obj).longValue()));
                break;
            case 3:
                a8q0 a8q0Var = (a8q0) obj;
                a8q0Var.getClass();
                if (function1 != null) {
                    function1.invoke(a8q0Var);
                }
                break;
            case 4:
                a8q0 a8q0Var2 = (a8q0) obj;
                a8q0Var2.getClass();
                if (function1 != null) {
                    function1.invoke(a8q0Var2);
                }
                break;
            case 5:
                a8q0 a8q0Var3 = (a8q0) obj;
                a8q0Var3.getClass();
                if (function1 != null) {
                    function1.invoke(a8q0Var3);
                }
                break;
            case 6:
                a8q0 a8q0Var4 = (a8q0) obj;
                a8q0Var4.getClass();
                function1.invoke(a8q0Var4);
                break;
            case 7:
                a8q0 a8q0Var5 = (a8q0) obj;
                a8q0Var5.getClass();
                function1.invoke(a8q0Var5);
                break;
            case 8:
                a8q0 a8q0Var6 = (a8q0) obj;
                a8q0Var6.getClass();
                if (function1 != null) {
                    function1.invoke(a8q0Var6);
                }
                break;
            case 9:
                Float f = (Float) obj;
                f.floatValue();
                if (function1 != null) {
                    function1.invoke(f);
                }
                break;
            case 10:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new te7(((w5q0) x5q0Var).f38596a));
                }
                break;
            case 11:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    function1.invoke(new pe7(((w5q0) x5q0Var2).f38596a));
                }
                break;
            case 12:
                ((jtl) obj).getClass();
                function1.invoke(re7.f30320a);
                break;
            case 13:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, sh00.w)) {
                    function1.invoke(ptg0.f27563a);
                }
                break;
            case 14:
                ((x5q0) obj).getClass();
                function1.invoke(hve0.f13724a);
                break;
            case 15:
                function1.invoke(new ok8(((Integer) obj).intValue()));
                break;
            case 16:
                function1.invoke(new nk8(((Integer) obj).intValue()));
                break;
            case 17:
                function1.invoke(new xh8(((Long) obj).longValue()));
                break;
            case 18:
                dyb.Q(new tk8(function1, (byte) 6));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((jtl) obj).getClass();
                function1.invoke(jvn0.f17211a);
                break;
            case 20:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(ou8.f25865a);
                } else if (iIntValue == 1) {
                    function1.invoke(iu8.f15384a);
                }
                break;
            case 21:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new pu8(str));
                break;
            case 22:
                function1.invoke(new cu8(((Long) obj).longValue()));
                break;
            case 23:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new du8(st0Var.f32750a));
                break;
            case 24:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new fu8(st0Var2.f32750a));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jtl jtlVar2 = (jtl) obj;
                jtlVar2.getClass();
                if (Intrinsics.d(jtlVar2, hw8.f13758a)) {
                    function1.invoke(gv8.f11964a);
                } else if (Intrinsics.d(jtlVar2, mv8.f22445a)) {
                    function1.invoke(ev8.f8456a);
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new cu8(((Long) obj).longValue()));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new cu8(((Long) obj).longValue()));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                st0 st0Var3 = (st0) obj;
                st0Var3.getClass();
                function1.invoke(new du8(st0Var3.f32750a));
                break;
            default:
                st0 st0Var4 = (st0) obj;
                st0Var4.getClass();
                function1.invoke(new fu8(st0Var4.f32750a));
                break;
        }
        return Unit.f46060a;
    }
}
