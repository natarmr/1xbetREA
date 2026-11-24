package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42125a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ y7(Function1 function1, byte b) {
        this.f42125a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42125a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                wy30 wy30Var = (wy30) obj;
                wy30Var.getClass();
                function1.invoke(new pu30(wy30Var));
                break;
            case 1:
                wy30 wy30Var2 = (wy30) obj;
                wy30Var2.getClass();
                function1.invoke(new pu30(wy30Var2));
                break;
            case 2:
                wy30 wy30Var3 = (wy30) obj;
                wy30Var3.getClass();
                function1.invoke(new pu30(wy30Var3));
                break;
            case 3:
                wy30 wy30Var4 = (wy30) obj;
                wy30Var4.getClass();
                function1.invoke(new pu30(wy30Var4));
                break;
            case 4:
                wy30 wy30Var5 = (wy30) obj;
                wy30Var5.getClass();
                function1.invoke(new pu30(wy30Var5));
                break;
            case 5:
                wy30 wy30Var6 = (wy30) obj;
                wy30Var6.getClass();
                function1.invoke(new pu30(wy30Var6));
                break;
            case 6:
                wy30 wy30Var7 = (wy30) obj;
                wy30Var7.getClass();
                function1.invoke(new pu30(wy30Var7));
                break;
            case 7:
                wy30 wy30Var8 = (wy30) obj;
                wy30Var8.getClass();
                function1.invoke(new pu30(wy30Var8));
                break;
            case 8:
                g9 g9Var = (g9) obj;
                g9Var.getClass();
                function1.invoke(new hyi0(g9Var));
                break;
            case 9:
                vdj0 vdj0Var = (vdj0) obj;
                vdj0Var.getClass();
                function1.invoke(new ryi0(vdj0Var));
                break;
            case 10:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                krx krxVar = (krx) cpVar.u;
                DsMenuCell dsMenuCell = krxVar.f18789a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new xb(function1, cpVar, (byte) 0));
                dyb.O(krxVar.b, new xb(function1, cpVar, (byte) 1));
                cpVar.t(new j9(cpVar, (byte) 9));
                break;
            case 11:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new mm(str));
                break;
            case 12:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(str2);
                break;
            case 13:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new wv(((w5q0) x5q0Var).f38596a));
                }
                break;
            case 14:
                ((jtl) obj).getClass();
                function1.invoke(a10.f45a);
                break;
            case 15:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                dyb.O(((vrx) cpVar2.u).f37923a, new xb(function1, cpVar2, (byte) 2));
                cpVar2.t(new j9(cpVar2, (byte) 14));
                break;
            case 16:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                dyb.O(((wrx) cpVar3.u).f39668a, new xb(function1, cpVar3, (byte) 3));
                cpVar3.t(new j9(cpVar3, (byte) 15));
                break;
            case 17:
                eol eolVar = (eol) obj;
                eolVar.getClass();
                function1.invoke(new dd0(eolVar));
                break;
            case 18:
                ((Integer) obj).getClass();
                function1.invoke(bf0.f2478a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new ve0(((Long) obj).longValue()));
                break;
            case 20:
                bkl bklVar = (bkl) obj;
                bklVar.getClass();
                function1.invoke(new cf0(bklVar));
                break;
            case 21:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                function1.invoke(new kxq0(new xj0(cvlVar.f5035a)));
                break;
            case 22:
                ((Integer) obj).intValue();
                function1.invoke(ml0.f21966a);
                break;
            case 23:
                function1.invoke(new nl0(((Integer) obj).intValue()));
                break;
            case 24:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (jtlVar instanceof ql1) {
                    function1.invoke(xp0.f41245a);
                }
                if (jtlVar instanceof va0) {
                    function1.invoke(sp0.f32567a);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fxb.D(ivb0.b, new i11((byte) 2, ((Long) obj).longValue(), function1)).a();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fxb.D(ivb0.b, new i11((byte) 0, ((Long) obj).longValue(), function1)).a();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fxb.D(ivb0.b, new i11((byte) 1, ((Long) obj).longValue(), function1)).a();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fxb.D(ivb0.b, new i11((byte) 3, ((Long) obj).longValue(), function1)).a();
                break;
            default:
                ((Integer) obj).getClass();
                fxb.D(ivb0.b, new nr0(function1, (byte) 11)).a();
                break;
        }
        return Unit.f46060a;
    }
}
