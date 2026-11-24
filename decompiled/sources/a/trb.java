package a;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.chips.DsChips;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class trb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34416a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ trb(Function1 function1, byte b) {
        this.f34416a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34416a;
        byte b2 = 12;
        byte b3 = 13;
        byte b4 = 10;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((jtl) obj).getClass();
                function1.invoke(nrb.f23993a);
                return Unit.f46060a;
            case 1:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str = ((w5q0) x5q0Var).f38596a;
                    str.getClass();
                    function1.invoke(new mrb(str));
                }
                return Unit.f46060a;
            case 2:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    String str2 = ((w5q0) x5q0Var2).f38596a;
                    str2.getClass();
                    function1.invoke(new krb(str2));
                }
                return Unit.f46060a;
            case 3:
                x5q0 x5q0Var3 = (x5q0) obj;
                x5q0Var3.getClass();
                if (x5q0Var3 instanceof w5q0) {
                    String str3 = ((w5q0) x5q0Var3).f38596a;
                    str3.getClass();
                    function1.invoke(new lrb(str3));
                }
                return Unit.f46060a;
            case 4:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view = cpVar.f40887a;
                view.getClass();
                dyb.O(view, new xb(function1, cpVar, (byte) 9));
                cpVar.t(new ok(cpVar, cpVar, b4));
                return Unit.f46060a;
            case 5:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj;
                horizontalScrollView.getClass();
                View childAt = horizontalScrollView.getChildAt(0);
                childAt.getClass();
                zac zacVar = (zac) childAt;
                zacVar.setOnSelectChangeListener(new h6c(zacVar, function1, (byte) 3));
                return Unit.f46060a;
            case 6:
                Context context = (Context) obj;
                context.getClass();
                DsChips dsChips = new DsChips(context, null);
                dsChips.setOnChipClickListener(new ag0(function1, (byte) 22));
                return dsChips;
            case 7:
                x5q0 x5q0Var4 = (x5q0) obj;
                x5q0Var4.getClass();
                if (x5q0Var4 instanceof w5q0) {
                    function1.invoke(new ddc(((w5q0) x5q0Var4).f38596a));
                }
                return Unit.f46060a;
            case 8:
                ap8 ap8Var = (ap8) obj;
                ap8Var.getClass();
                function1.invoke(new lfc(ap8Var.f1239a));
                return Unit.f46060a;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new mfc(str4));
                return Unit.f46060a;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new tgc(str5));
                return Unit.f46060a;
            case 11:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                if (iqqVar.b()) {
                    function1.invoke(dhc.f6084a);
                }
                return Unit.f46060a;
            case 12:
                x5q0 x5q0Var5 = (x5q0) obj;
                x5q0Var5.getClass();
                if (x5q0Var5 instanceof w5q0) {
                    String str6 = ((w5q0) x5q0Var5).f38596a;
                    str6.getClass();
                    function1.invoke(new fhc(str6));
                }
                return Unit.f46060a;
            case 13:
                thm thmVar = (thm) obj;
                thmVar.getClass();
                if (thmVar instanceof ihm) {
                    function1.invoke(qmc.f28976a);
                } else if (thmVar instanceof phm) {
                    function1.invoke(new umc(((phm) thmVar).f27004a));
                } else if (thmVar instanceof jhm) {
                    function1.invoke(rmc.f30736a);
                } else if (thmVar instanceof qhm) {
                    function1.invoke(new vmc(((qhm) thmVar).f28746a));
                } else if (thmVar instanceof nhm) {
                    function1.invoke(tmc.f34186a);
                }
                return Unit.f46060a;
            case 14:
                function1.invoke(new wmc(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 15:
                p8d p8dVar = (p8d) obj;
                p8dVar.getClass();
                function1.invoke(p8dVar.f26547a);
                return Unit.f46060a;
            case 16:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                dyb.O(((ftx) cpVar2.u).f10137a, new xb(function1, cpVar2, b4));
                cpVar2.t(new rn5(cpVar2, (byte) 4));
                return Unit.f46060a;
            case 17:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                dyb.O(((ftx) cpVar3.u).f10137a, new xb(function1, cpVar3, (byte) 11));
                cpVar3.t(new rn5(cpVar3, (byte) 5));
                return Unit.f46060a;
            case 18:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                dyb.O(((etx) cpVar4.u).f8392a, new xb(function1, cpVar4, b2));
                cpVar4.t(new rn5(cpVar4, (byte) 6));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                dyb.O(((etx) cpVar5.u).f8392a, new xb(function1, cpVar5, b3));
                cpVar5.t(new rn5(cpVar5, (byte) 7));
                return Unit.f46060a;
            case 20:
                cp cpVar6 = (cp) obj;
                cpVar6.getClass();
                dyb.O(((ftx) cpVar6.u).f10137a, new xb(function1, cpVar6, (byte) 14));
                cpVar6.t(new rn5(cpVar6, (byte) 8));
                return Unit.f46060a;
            case 21:
                cp cpVar7 = (cp) obj;
                cpVar7.getClass();
                dyb.O(((ftx) cpVar7.u).f10137a, new xb(function1, cpVar7, (byte) 15));
                cpVar7.t(new rn5(cpVar7, b4));
                return Unit.f46060a;
            case 22:
                cp cpVar8 = (cp) obj;
                cpVar8.getClass();
                dyb.O(((ftx) cpVar8.u).f10137a, new xb(function1, cpVar8, (byte) 16));
                cpVar8.t(new rn5(cpVar8, b2));
                return Unit.f46060a;
            case 23:
                cp cpVar9 = (cp) obj;
                cpVar9.getClass();
                dyb.O(((gtx) cpVar9.u).f11902a, new xb(function1, cpVar9, (byte) 17));
                cpVar9.t(new rn5(cpVar9, b3));
                return Unit.f46060a;
            case 24:
                cp cpVar10 = (cp) obj;
                cpVar10.getClass();
                byte b5 = 18;
                ((scu0) cpVar10.u).b.setCancelButtonClickListener(new xb(function1, cpVar10, b5));
                cpVar10.t(new ok(cpVar10, cpVar10, b5));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new x1f(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                x5q0 x5q0Var6 = (x5q0) obj;
                x5q0Var6.getClass();
                if (x5q0Var6 instanceof w5q0) {
                    function1.invoke(new v1f(((w5q0) x5q0Var6).f38596a));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new zjf(hdbVar));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new akf(ussVar));
                return Unit.f46060a;
            default:
                function1.invoke(new lkf(((Long) obj).longValue()));
                return Unit.f46060a;
        }
    }
}
