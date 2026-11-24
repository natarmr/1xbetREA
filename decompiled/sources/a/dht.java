package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dht implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6107a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dht(Function1 function1, byte b) {
        this.f6107a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6107a;
        byte b2 = 28;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new rgt(((Long) obj).longValue()));
                return Unit.f46060a;
            case 1:
                function1.invoke(new tgt(((Long) obj).longValue()));
                return Unit.f46060a;
            case 2:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str = ((w5q0) x5q0Var).f38596a;
                    str.getClass();
                    function1.invoke(new kgt(str));
                }
                return Unit.f46060a;
            case 3:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    String str2 = ((w5q0) x5q0Var2).f38596a;
                    str2.getClass();
                    function1.invoke(new ugt(str2));
                }
                return Unit.f46060a;
            case 4:
                ((x5q0) obj).getClass();
                function1.invoke(ogt.f25235a);
                return Unit.f46060a;
            case 5:
                ((x5q0) obj).getClass();
                function1.invoke(qgt.f28702a);
                return Unit.f46060a;
            case 6:
                hps0 hps0Var = (hps0) obj;
                if (hps0Var instanceof amt) {
                    return Boolean.valueOf(((Boolean) function1.invoke(((amt) hps0Var).o)).booleanValue());
                }
                jf4.n("Node is not a GestureNode instance");
                return null;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new b8v(str3));
                return Unit.f46060a;
            case 8:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(vcv.f37206a);
                }
                return Unit.f46060a;
            case 9:
                function1.invoke(new thv(((Long) obj).longValue()));
                return Unit.f46060a;
            case 10:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view = cpVar.f40887a;
                view.getClass();
                dyb.O(view, new xb(function1, cpVar, (byte) 24));
                cpVar.t(new kgh(cpVar, b2));
                return Unit.f46060a;
            case 11:
                DsButton dsButton = (DsButton) obj;
                dsButton.getClass();
                dyb.O(dsButton, new dht(function1, (byte) 12));
                return Unit.f46060a;
            case 12:
                ((View) obj).getClass();
                function1.invoke(Boolean.TRUE);
                return Unit.f46060a;
            case 13:
                uew uewVar = (uew) obj;
                uewVar.getClass();
                function1.invoke(new ncw(uewVar));
                return Unit.f46060a;
            case 14:
                function1.invoke(new mcw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 15:
                jfw jfwVar = (jfw) obj;
                jfwVar.getClass();
                function1.invoke(new qcw(jfwVar));
                return Unit.f46060a;
            case 16:
                function1.invoke(new icw(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 17:
                function1.invoke(new lcw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 18:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                function1.invoke(Integer.valueOf(cvlVar.f5035a));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new dhw(bemVar));
                return Unit.f46060a;
            case 20:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(new dhw(bemVar2));
                return Unit.f46060a;
            case 21:
                function1.invoke(new pgw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 22:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                function1.invoke(new dhw(bemVar3));
                return Unit.f46060a;
            case 23:
                ((Integer) obj).intValue();
                function1.invoke(rqw.f30952a);
                return Unit.f46060a;
            case 24:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                DsMenuCell dsMenuCell = ((wtx) cpVar2.u).f39765a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new xb(function1, cpVar2, (byte) 25));
                cpVar2.t(new b1w(cpVar2, (byte) 5));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                DsMenuCell dsMenuCell2 = ((eux) cpVar3.u).f8443a;
                dsMenuCell2.getClass();
                dyb.O(dsMenuCell2, new xb(function1, cpVar3, (byte) 26));
                cpVar3.t(new b1w(cpVar3, (byte) 6));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                DsMenuCell dsMenuCell3 = ((bwx) cpVar4.u).f3349a;
                dsMenuCell3.getClass();
                dyb.O(dsMenuCell3, new xb(function1, cpVar4, (byte) 27));
                cpVar4.t(new b1w(cpVar4, (byte) 7));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                DsMenuCell dsMenuCell4 = ((wxx) cpVar5.u).f39950a;
                dsMenuCell4.getClass();
                dyb.O(dsMenuCell4, new xb(function1, cpVar5, (byte) 28));
                cpVar5.t(new b1w(cpVar5, (byte) 8));
                cpVar5.z(new bb(cpVar5, (byte) 9));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, sh00.r)) {
                    function1.invoke(s97.f31839a);
                } else if (Intrinsics.d(jtlVar, sh00.l)) {
                    function1.invoke(r97.f30063a);
                } else if (Intrinsics.d(jtlVar, sh00.x)) {
                    function1.invoke(t97.f33547a);
                }
                return Unit.f46060a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(ba7.f2245a);
                } else if (iIntValue == 1) {
                    function1.invoke(aa7.f511a);
                }
                return Unit.f46060a;
        }
    }
}
