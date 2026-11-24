package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wc2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38905a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wc2(Function1 function1, byte b) {
        this.f38905a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38905a;
        eim eimVar = eim.f7867a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                function1.invoke(new nc2(jtlVar));
                break;
            case 1:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof iim) {
                    function1.invoke(new nd2(((iim) kimVar).f14835a));
                } else if (kimVar.equals(eimVar)) {
                    function1.invoke(md2.f21576a);
                } else if ((kimVar instanceof fim) && ((fim) kimVar).f9595a == 2) {
                    function1.invoke(pd2.f26786a);
                }
                break;
            case 2:
                kim kimVar2 = (kim) obj;
                kimVar2.getClass();
                if (kimVar2 instanceof jim) {
                    function1.invoke(new xe2(((jim) kimVar2).f16582a));
                } else if (kimVar2 instanceof iim) {
                    function1.invoke(new ue2(((iim) kimVar2).f14835a));
                } else if (kimVar2.equals(eimVar)) {
                    function1.invoke(pe2.f26829a);
                } else if (kimVar2.equals(gim.f11355a)) {
                    function1.invoke(se2.f32057a);
                } else if (kimVar2 instanceof fim) {
                    int i = ((fim) kimVar2).f9595a;
                    if (i == 1) {
                        function1.invoke(re2.f30315a);
                    } else if (i == 2) {
                        function1.invoke(we2.f38998a);
                    }
                }
                break;
            case 3:
                function1.invoke(new wl2(((Long) obj).longValue()));
                break;
            case 4:
                Object tag = ((View) obj).getTag(R.id.binding_reference);
                tag.getClass();
                function1.invoke((yfu0) tag);
                break;
            case 5:
                Object tag2 = ((View) obj).getTag(R.id.binding_reference);
                tag2.getClass();
                function1.invoke((yfu0) tag2);
                break;
            case 6:
                q84 q84Var = (q84) obj;
                q84Var.getClass();
                function1.invoke(new d74(q84Var));
                break;
            case 7:
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                confirmationNewPlaceResultType.getClass();
                function1.invoke(new da4(confirmationNewPlaceResultType));
                break;
            case 8:
                iqt0 iqt0Var = (iqt0) obj;
                iqt0Var.getClass();
                function1.invoke(new ba4(iqt0Var));
                break;
            case 9:
                function1.invoke(new ja4((ghk0) obj));
                break;
            case 10:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str = ((w5q0) x5q0Var).f38596a;
                    str.getClass();
                    function1.invoke(new ka4(str));
                }
                break;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new ma4(str2));
                break;
            case 12:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    String str3 = ((w5q0) x5q0Var2).f38596a;
                    str3.getClass();
                    function1.invoke(new la4(str3));
                }
                break;
            case 13:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                dyb.O(((gtx) cpVar.u).f11902a, new xb(function1, cpVar, (byte) 4));
                cpVar.t(new j9(cpVar, (byte) 22));
                break;
            case 14:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                DsMenuCell dsMenuCell = ((bwx) cpVar2.u).f3349a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new xb(function1, cpVar2, (byte) 5));
                cpVar2.t(new j9(cpVar2, (byte) 24));
                break;
            case 15:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                DsMenuCell dsMenuCell2 = ((bwx) cpVar3.u).f3349a;
                dsMenuCell2.getClass();
                dyb.O(dsMenuCell2, new xb(function1, cpVar3, (byte) 6));
                cpVar3.t(new j9(cpVar3, (byte) 26));
                break;
            case 16:
                a8q0 a8q0Var = (a8q0) obj;
                a8q0Var.getClass();
                function1.invoke(new v320(a8q0Var));
                break;
            case 17:
                a8q0 a8q0Var2 = (a8q0) obj;
                a8q0Var2.getClass();
                function1.invoke(new z320(a8q0Var2));
                break;
            case 18:
                a8q0 a8q0Var3 = (a8q0) obj;
                a8q0Var3.getClass();
                function1.invoke(new v320(a8q0Var3));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a8q0 a8q0Var4 = (a8q0) obj;
                a8q0Var4.getClass();
                function1.invoke(new z320(a8q0Var4));
                break;
            case 20:
                View view = (View) obj;
                view.getClass();
                if (function1 != null) {
                    function1.invoke(view);
                }
                break;
            case 21:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                fxb.D(ivb0.b, new dt0(function1, st0Var, (byte) 12)).a();
                break;
            case 22:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                fxb.D(ivb0.b, new dt0(function1, st0Var2, (byte) 11)).a();
                break;
            case 23:
                Long l = (Long) obj;
                l.longValue();
                function1.invoke(l);
                break;
            case 24:
                Long l2 = (Long) obj;
                l2.longValue();
                function1.invoke(l2);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                DsMenuCell dsMenuCell3 = ((esx) cpVar4.u).f8349a;
                dsMenuCell3.getClass();
                dyb.O(dsMenuCell3, new xb(function1, cpVar4, (byte) 7));
                cpVar4.t(new j9(cpVar4, (byte) 29));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                View view2 = (View) obj;
                view2.getClass();
                if (function1 != null) {
                    function1.invoke(view2);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                View view3 = (View) obj;
                view3.getClass();
                if (function1 != null) {
                    function1.invoke(view3);
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ny20 ny20Var = (ny20) obj;
                ny20Var.getClass();
                jy20 jy20Var = ny20Var instanceof jy20 ? (jy20) ny20Var : null;
                g130 g130Var = jy20Var != null ? jy20Var.f17339a : null;
                if (g130Var instanceof c130) {
                    function1.invoke(new oi6((c130) g130Var));
                }
                break;
            default:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    function1.invoke(new mi6(((vgl0) wgl0Var).f37387a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
