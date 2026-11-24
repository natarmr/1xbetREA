package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xz8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41743a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xz8(Function1 function1, byte b) {
        this.f41743a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41743a;
        byte b2 = 1;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, wz8.f40011a)) {
                    function1.invoke(pz8.f27832a);
                } else if (Intrinsics.d(jtlVar, rz8.f31345a)) {
                    function1.invoke(mz8.f22640a);
                }
                return Unit.f46060a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(s09.f31401a);
                } else if (iIntValue == 1) {
                    function1.invoke(u09.f34844a);
                }
                return Unit.f46060a;
            case 2:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new t09(str));
                return Unit.f46060a;
            case 3:
                eol eolVar = (eol) obj;
                eolVar.getClass();
                function1.invoke(new l09(eolVar.f8144a));
                return Unit.f46060a;
            case 4:
                Integer num = (Integer) obj;
                num.getClass();
                function1.invoke(num);
                return Unit.f46060a;
            case 5:
                ((Integer) obj).intValue();
                function1.invoke(da9.f5736a);
                return Unit.f46060a;
            case 6:
                function1.invoke(new ga9(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 7:
                ((jtl) obj).getClass();
                function1.invoke(ca9.f3997a);
                return Unit.f46060a;
            case 8:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                dyb.O(((isx) cpVar.u).f15328a, new xb(function1, cpVar, (byte) 8));
                cpVar.t(new rn5(cpVar, b2));
                return Unit.f46060a;
            case 9:
                g7z g7zVar = (g7z) obj;
                function1.invoke(g7zVar);
                g7zVar.a();
                return Unit.f46060a;
            case 10:
                function1.invoke(new ot9(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 11:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new nt9(((w5q0) x5q0Var).f38596a));
                }
                return Unit.f46060a;
            case 12:
                thm thmVar = (thm) obj;
                thmVar.getClass();
                if (thmVar instanceof ihm) {
                    function1.invoke(ira.f15246a);
                } else if (thmVar instanceof khm) {
                    function1.invoke(new lra(((khm) thmVar).f18300a));
                } else if (thmVar instanceof mhm) {
                    function1.invoke(pra.f27455a);
                } else if (thmVar instanceof rhm) {
                    function1.invoke(jra.f16993a);
                } else if (!(thmVar instanceof shm) && !(thmVar instanceof lhm)) {
                    if (thmVar instanceof phm) {
                        function1.invoke(new nra(((phm) thmVar).f27004a));
                    } else if (thmVar.equals(jhm.f16534a)) {
                        function1.invoke(kra.f18754a);
                    } else if (thmVar instanceof qhm) {
                        function1.invoke(new ora(((qhm) thmVar).f28746a));
                    } else if (thmVar.equals(nhm.f23539a)) {
                        function1.invoke(mra.f22259a);
                    } else if (!thmVar.equals(ohm.f25271a)) {
                        t9f.b();
                        return null;
                    }
                }
                return Unit.f46060a;
            case 13:
                ((jtl) obj).getClass();
                function1.invoke(tta.f34501a);
                return Unit.f46060a;
            case 14:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(qxa.f29473a);
                }
                return Unit.f46060a;
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new sxa(str2));
                return Unit.f46060a;
            case 16:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                function1.invoke(new kxa(m9nVar.getId()));
                return Unit.f46060a;
            case 17:
                thm thmVar2 = (thm) obj;
                thmVar2.getClass();
                if (thmVar2 instanceof jhm) {
                    function1.invoke(s4b.f31596a);
                } else if (thmVar2 instanceof ihm) {
                    function1.invoke(r4b.f29828a);
                } else if (thmVar2 instanceof phm) {
                    function1.invoke(new u4b(((phm) thmVar2).f27004a));
                } else if (thmVar2 instanceof qhm) {
                    function1.invoke(new v4b(((qhm) thmVar2).f28746a));
                } else if (thmVar2 instanceof shm) {
                    function1.invoke(new w4b(((shm) thmVar2).f32219a));
                } else if (thmVar2 instanceof nhm) {
                    function1.invoke(t4b.f33311a);
                } else if (thmVar2 instanceof ohm) {
                    function1.invoke(p4b.f26345a);
                }
                return Unit.f46060a;
            case 18:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                function1.invoke(new a6b(new y030(xgl0Var)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xgl0 xgl0Var2 = (xgl0) obj;
                xgl0Var2.getClass();
                function1.invoke(new a6b(new z030(xgl0Var2)));
                return Unit.f46060a;
            case 20:
                xgl0 xgl0Var3 = (xgl0) obj;
                xgl0Var3.getClass();
                function1.invoke(new a6b(new y030(xgl0Var3)));
                return Unit.f46060a;
            case 21:
                xgl0 xgl0Var4 = (xgl0) obj;
                xgl0Var4.getClass();
                function1.invoke(new a6b(new z030(xgl0Var4)));
                return Unit.f46060a;
            case 22:
                xgl0 xgl0Var5 = (xgl0) obj;
                xgl0Var5.getClass();
                function1.invoke(new a6b(new z030(xgl0Var5)));
                return Unit.f46060a;
            case 23:
                xgl0 xgl0Var6 = (xgl0) obj;
                xgl0Var6.getClass();
                function1.invoke(new a6b(new y030(xgl0Var6)));
                return Unit.f46060a;
            case 24:
                xgl0 xgl0Var7 = (xgl0) obj;
                xgl0Var7.getClass();
                function1.invoke(new a6b(new y030(xgl0Var7)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xgl0 xgl0Var8 = (xgl0) obj;
                xgl0Var8.getClass();
                function1.invoke(new a6b(new z030(xgl0Var8)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jtl jtlVar2 = (jtl) obj;
                jtlVar2.getClass();
                if (Intrinsics.d(jtlVar2, rk.y)) {
                    function1.invoke(nmp.f23783a);
                } else if (Intrinsics.d(jtlVar2, rk.x)) {
                    function1.invoke(cmp.f4617a);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                function1.invoke(hczVar);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new hjb(bemVar));
                return Unit.f46060a;
            default:
                f7v0 f7v0Var = (f7v0) obj;
                f7v0Var.getClass();
                function1.invoke(new kjb(f7v0Var));
                return Unit.f46060a;
        }
    }
}
