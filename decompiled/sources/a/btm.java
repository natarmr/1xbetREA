package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.coupon.impl.core.presentation.base.view.express_boost.ExpressBoostView;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class btm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3188a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ btm(Function1 function1, byte b) {
        this.f3188a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3188a;
        m6n m6nVar = m6n.f21279a;
        l6n l6nVar = l6n.f19514a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                function1.invoke(j6zVar);
                break;
            case 1:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                function1.invoke(j6zVar2);
                break;
            case 2:
                j6z j6zVar3 = (j6z) obj;
                j6zVar3.getClass();
                function1.invoke(j6zVar3);
                break;
            case 3:
                j6z j6zVar4 = (j6z) obj;
                j6zVar4.getClass();
                function1.invoke(j6zVar4);
                break;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(m6nVar);
                } else if (iIntValue == 1) {
                    function1.invoke(l6nVar);
                }
                break;
            case 5:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 == 0) {
                    function1.invoke(m6nVar);
                } else if (iIntValue2 == 1) {
                    function1.invoke(l6nVar);
                }
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                int i = DsTextField.m1;
                function1.invoke(bool);
                break;
            case 7:
                View view = (View) obj;
                view.getClass();
                if (function1 != null) {
                    function1.invoke(view);
                }
                break;
            case 8:
                ((Integer) obj).intValue();
                function1.invoke(rkn.f30657a);
                break;
            case 9:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((dux) cpVar.u).f6717a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new xb(function1, cpVar, (byte) 23));
                cpVar.t(new kgh(cpVar, (byte) 14));
                break;
            case 10:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str = ((w5q0) x5q0Var).f38596a;
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str.charAt(i2);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    function1.invoke(sb.toString());
                }
                break;
            case 11:
                function1.invoke(new b3o(((Integer) obj).intValue()));
                break;
            case 12:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new s2o(bemVar));
                break;
            case 13:
                int iIntValue3 = ((Integer) obj).intValue();
                if (iIntValue3 == 0) {
                    function1.invoke(z2o.f43679a);
                } else if (iIntValue3 == 1) {
                    function1.invoke(d3o.f5412a);
                } else if (iIntValue3 == 2) {
                    function1.invoke(c3o.f3686a);
                } else if (iIntValue3 == 3) {
                    function1.invoke(x2o.f40177a);
                }
                break;
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new a3o(str2));
                break;
            case 15:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new h4o(hdbVar));
                break;
            case 16:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new i4o(ussVar));
                break;
            case 17:
                function1.invoke(new q4o(((Long) obj).longValue()));
                break;
            case 18:
                function1.invoke(new q4o(((Long) obj).longValue()));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new q4o(((Long) obj).longValue()));
                break;
            case 20:
                function1.invoke(new q4o(((Long) obj).longValue()));
                break;
            case 21:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new r4o(nusVar));
                break;
            case 22:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new j4o(imsVar));
                break;
            case 23:
                function1.invoke(new q7o(((Long) obj).longValue()));
                break;
            case 24:
                wnk wnkVar = (wnk) obj;
                wnkVar.getClass();
                function1.invoke(new k7o(wnkVar));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                owr0 owr0Var = (owr0) obj;
                owr0Var.getClass();
                function1.invoke(new j7o(owr0Var));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                View view2 = (View) obj;
                int i3 = ExpressBoostView.r;
                view2.getClass();
                if (function1 != null) {
                    function1.invoke(view2);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(bqo.f3041a);
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new eqo(((Integer) obj).intValue()));
                break;
            default:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    function1.invoke(new sxo(((w5q0) x5q0Var2).f38596a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
