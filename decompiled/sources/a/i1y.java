package a;

import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i1y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14023a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ i1y(Function1 function1, byte b) {
        this.f14023a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14023a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                a8q0 a8q0Var = (a8q0) obj;
                a8q0Var.getClass();
                function1.invoke(new x0y(a8q0Var));
                return Unit.f46060a;
            case 1:
                function1.invoke(new c1y(((Float) obj).floatValue()));
                return Unit.f46060a;
            case 2:
                a8q0 a8q0Var2 = (a8q0) obj;
                a8q0Var2.getClass();
                function1.invoke(new j3y(a8q0Var2));
                return Unit.f46060a;
            case 3:
                a8q0 a8q0Var3 = (a8q0) obj;
                a8q0Var3.getClass();
                function1.invoke(new j4y(a8q0Var3));
                return Unit.f46060a;
            case 4:
                a8q0 a8q0Var4 = (a8q0) obj;
                a8q0Var4.getClass();
                function1.invoke(new f5y(a8q0Var4));
                return Unit.f46060a;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(hpr0.f13456a);
                } else if (iIntValue == 1) {
                    function1.invoke(fpr0.f9942a);
                }
                return Unit.f46060a;
            case 6:
                a8q0 a8q0Var5 = (a8q0) obj;
                a8q0Var5.getClass();
                function1.invoke(a8q0Var5);
                return Unit.f46060a;
            case 7:
                a8q0 a8q0Var6 = (a8q0) obj;
                a8q0Var6.getClass();
                function1.invoke(a8q0Var6);
                return Unit.f46060a;
            case 8:
                a8q0 a8q0Var7 = (a8q0) obj;
                a8q0Var7.getClass();
                if (function1 != null) {
                    function1.invoke(a8q0Var7);
                }
                return Unit.f46060a;
            case 9:
                a8q0 a8q0Var8 = (a8q0) obj;
                a8q0Var8.getClass();
                if (function1 != null) {
                    function1.invoke(a8q0Var8);
                }
                return Unit.f46060a;
            case 10:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(wzx.f40040a);
                }
                return Unit.f46060a;
            case 11:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsSettingsCell dsSettingsCell = ((vvx) cpVar.u).f38123a;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new o7x(function1, cpVar, (byte) 1));
                cpVar.t(new b1w(cpVar, (byte) 12));
                return Unit.f46060a;
            case 12:
                ((x5q0) obj).getClass();
                function1.invoke(jq70.f16937a);
                return Unit.f46060a;
            case 13:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                function1.invoke(new f62(jtlVar));
                return Unit.f46060a;
            case 14:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof iim) {
                    function1.invoke(new m62(((iim) kimVar).f14835a));
                } else if (kimVar.equals(eim.f7867a)) {
                    function1.invoke(e62.f7260a);
                } else if (kimVar.equals(gim.f11355a)) {
                    function1.invoke(k62.f17746a);
                } else if (kimVar instanceof fim) {
                    int i = ((fim) kimVar).f9595a;
                    if (i == 1) {
                        function1.invoke(h62.f12509a);
                    } else if (i == 2) {
                        function1.invoke(o62.f24712a);
                    }
                }
                return Unit.f46060a;
            case 15:
                a0z a0zVar = (a0z) obj;
                a0zVar.getClass();
                function1.invoke(new cu30(a0zVar));
                return Unit.f46060a;
            case 16:
                a0z a0zVar2 = (a0z) obj;
                a0zVar2.getClass();
                function1.invoke(a0zVar2);
                return Unit.f46060a;
            case 17:
                ((lwk) obj).getClass();
                function1.invoke(c0z.f3547a);
                return new b1z(function1, (byte) 0);
            case 18:
                function1.invoke(new j0z(((Integer) obj).intValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new g0z(str));
                return Unit.f46060a;
            case 20:
                function1.invoke(new gfz(((Long) obj).longValue()));
                return Unit.f46060a;
            case 21:
                function1.invoke(new gfz(((Long) obj).longValue()));
                return Unit.f46060a;
            case 22:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str2 = ((w5q0) x5q0Var).f38596a;
                    str2.getClass();
                    function1.invoke(new nsz(str2));
                }
                return Unit.f46060a;
            case 23:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cxx cxxVar = (cxx) cpVar2.u;
                FrameLayout frameLayout = cxxVar.f5146a;
                frameLayout.getClass();
                dyb.O(frameLayout, new o7x(function1, cpVar2, (byte) 2));
                dyb.O(cxxVar.b, new o7x(function1, cpVar2, (byte) 3));
                cpVar2.t(new ctv(cpVar2, cpVar2, (byte) 5));
                return Unit.f46060a;
            case 24:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                DsMenuCell dsMenuCell = ((bwx) cpVar3.u).f3349a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new o7x(function1, cpVar3, (byte) 4));
                cpVar3.t(new b1w(cpVar3, (byte) 21));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new x900(str3));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new x900(str4));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new z900(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dfm0 dfm0Var = (dfm0) obj;
                dfm0Var.getClass();
                if (dfm0Var instanceof gqw) {
                    function1.invoke(new wpw((gqw) dfm0Var));
                }
                return Unit.f46060a;
            default:
                ynd0 ynd0Var = (ynd0) obj;
                ynd0Var.getClass();
                function1.invoke(new d520(ynd0Var));
                return Unit.f46060a;
        }
    }
}
