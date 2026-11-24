package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h61 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12507a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ h61(Function1 function1, byte b) {
        this.f12507a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12507a;
        vh1 vh1Var = vh1.f37410a;
        ai1 ai1Var = ai1.f902a;
        fs1 fs1Var = fs1.f10043a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ayq0 ayq0Var = (ayq0) obj;
                ayq0Var.getClass();
                function1.invoke(new kxq0(new yj0(ayq0Var.f1682a, ayq0Var.b, ayq0Var.c, ayq0Var.e, ayq0Var.f, ayq0Var.g, ayq0Var.h)));
                break;
            case 1:
                function1.invoke(new u61(((Integer) obj).intValue()));
                break;
            case 2:
                new bjj(ymx.INTERVAL_1000, true, new i11((byte) 5, ((Long) obj).longValue(), function1)).a();
                break;
            case 3:
                new bjj(ymx.INTERVAL_1000, true, new i11((byte) 4, ((Long) obj).longValue(), function1)).a();
                break;
            case 4:
                bpl bplVar = (bpl) obj;
                bplVar.getClass();
                fxb.D(ivb0.b, new qe1(function1, bplVar, (byte) 0)).a();
                break;
            case 5:
                ((Integer) obj).intValue();
                function1.invoke(bd1.f2378a);
                break;
            case 6:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, sh00.t)) {
                    function1.invoke(ai1Var);
                } else if (Intrinsics.d(jtlVar, rk.i)) {
                    function1.invoke(vh1Var);
                }
                break;
            case 7:
                jtl jtlVar2 = (jtl) obj;
                jtlVar2.getClass();
                if (Intrinsics.d(jtlVar2, sh00.t)) {
                    function1.invoke(ai1Var);
                } else if (Intrinsics.d(jtlVar2, rk.i)) {
                    function1.invoke(vh1Var);
                }
                break;
            case 8:
                jtl jtlVar3 = (jtl) obj;
                jtlVar3.getClass();
                if (Intrinsics.d(jtlVar3, sh00.t)) {
                    function1.invoke(ai1Var);
                } else if (Intrinsics.d(jtlVar3, rk.i)) {
                    function1.invoke(vh1Var);
                }
                break;
            case 9:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(ci1.f4390a);
                } else if (iIntValue == 1) {
                    function1.invoke(ei1.f7835a);
                }
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new di1(str));
                break;
            case 11:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                long j = st0Var.f32750a;
                mtr mtrVar = st0Var.d;
                function1.invoke(new w7d0(mtrVar != null ? mtrVar.b : false, j));
                break;
            case 12:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new x7d0(st0Var2.f32750a));
                break;
            case 13:
                eol eolVar = (eol) obj;
                eolVar.getClass();
                fxb.D(ivb0.b, new nk1(function1, eolVar, (byte) 0)).a();
                break;
            case 14:
                st0 st0Var3 = (st0) obj;
                st0Var3.getClass();
                long j2 = st0Var3.f32750a;
                mtr mtrVar2 = st0Var3.d;
                function1.invoke(new kxq0(new dk0(mtrVar2 != null ? mtrVar2.b : false, j2)));
                break;
            case 15:
                st0 st0Var4 = (st0) obj;
                st0Var4.getClass();
                new bjj(ymx.INTERVAL_1000, true, new dt0(function1, st0Var4, (byte) 10)).a();
                break;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new zm1(str2));
                break;
            case 17:
                ((jtl) obj).getClass();
                function1.invoke(fs1Var);
                break;
            case 18:
                ((jtl) obj).getClass();
                function1.invoke(fs1Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new qs1(((Integer) obj).intValue()));
                break;
            case 20:
                st0 st0Var5 = (st0) obj;
                st0Var5.getClass();
                long j3 = st0Var5.f32750a;
                mtr mtrVar3 = st0Var5.d;
                function1.invoke(new hs1(j3, mtrVar3 != null ? mtrVar3.b : false, bv1.GAMES));
                break;
            case 21:
                st0 st0Var6 = (st0) obj;
                st0Var6.getClass();
                function1.invoke(new is1(st0Var6.f32750a, bv1.GAMES));
                break;
            case 22:
                ((jtl) obj).getClass();
                function1.invoke(fs1Var);
                break;
            case 23:
                function1.invoke(new qs1(((Integer) obj).intValue()));
                break;
            case 24:
                function1.invoke(new qs1(((Integer) obj).intValue()));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new qs1(((Integer) obj).intValue()));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((jtl) obj).getClass();
                function1.invoke(fs1Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj).intValue();
                function1.invoke(rx1.f31241a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof iim) {
                    function1.invoke(new y92(((iim) kimVar).f14835a));
                } else if (kimVar.equals(eim.f7867a)) {
                    function1.invoke(u92.f35261a);
                } else if (kimVar.equals(gim.f11355a)) {
                    function1.invoke(x92.f40489a);
                } else if (kimVar instanceof fim) {
                    int i = ((fim) kimVar).f9595a;
                    if (i == 1) {
                        function1.invoke(w92.f38755a);
                    } else if (i == 2) {
                        function1.invoke(aa2.f503a);
                    }
                }
                break;
            default:
                jtl jtlVar4 = (jtl) obj;
                jtlVar4.getClass();
                function1.invoke(new mb2(jtlVar4));
                break;
        }
        return Unit.f46060a;
    }
}
