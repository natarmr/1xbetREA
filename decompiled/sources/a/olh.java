package a;

import android.content.Context;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class olh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25454a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ olh(Function1 function1, byte b) {
        this.f25454a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n0x n0xVar;
        String str;
        String str2;
        String str3;
        byte b = this.f25454a;
        byte b2 = 3;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new qih(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 1:
                dfm0 dfm0Var = (dfm0) obj;
                dfm0Var.getClass();
                if (dfm0Var instanceof lvh) {
                    function1.invoke(new huh((lvh) dfm0Var));
                }
                return Unit.f46060a;
            case 2:
                dfm0 dfm0Var2 = (dfm0) obj;
                dfm0Var2.getClass();
                if (dfm0Var2 instanceof lvh) {
                    function1.invoke(new huh((lvh) dfm0Var2));
                }
                return Unit.f46060a;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new gxh(str4));
                return Unit.f46060a;
            case 4:
                function1.invoke(new fxh(((Long) obj).longValue()));
                return Unit.f46060a;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                tableViewImpl.setAdapter(new jxh(tableViewImpl, new olh(function1, b2)));
                return tableViewImpl;
            case 6:
                o0x o0xVar = (o0x) obj;
                o0xVar.getClass();
                n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                if (n0xVar != null && (str = n0xVar.f22722a) != null) {
                    function1.invoke(str);
                }
                return Unit.f46060a;
            case 7:
                o0x o0xVar2 = (o0x) obj;
                o0xVar2.getClass();
                n0xVar = o0xVar2 instanceof n0x ? (n0x) o0xVar2 : null;
                if (n0xVar != null && (str2 = n0xVar.f22722a) != null) {
                    function1.invoke(str2);
                }
                return Unit.f46060a;
            case 8:
                o0x o0xVar3 = (o0x) obj;
                o0xVar3.getClass();
                n0xVar = o0xVar3 instanceof n0x ? (n0x) o0xVar3 : null;
                if (n0xVar != null && (str3 = n0xVar.f22722a) != null) {
                    function1.invoke(str3);
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj).getClass();
                fxb.D(ivb0.b, new ouh(function1, (byte) 12)).a();
                return Unit.f46060a;
            case 10:
                fxb.D(ivb0.b, new i11((byte) 7, ((Long) obj).longValue(), function1)).a();
                return Unit.f46060a;
            case 11:
                fxb.D(ivb0.b, new i11((byte) 8, ((Long) obj).longValue(), function1)).a();
                return Unit.f46060a;
            case 12:
                function1.invoke(new p3j(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 13:
                SimpleDate simpleDate = (SimpleDate) obj;
                simpleDate.getClass();
                function1.invoke(new w2w0(simpleDate.f47286a, simpleDate.b - 1));
                return Unit.f46060a;
            case 14:
                View view = (View) obj;
                view.getClass();
                function1.invoke(view);
                return Unit.f46060a;
            case 15:
                View view2 = (View) obj;
                view2.getClass();
                function1.invoke(view2);
                return Unit.f46060a;
            case 16:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((wtx) cpVar.u).f39765a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new xb(function1, cpVar, (byte) 22));
                cpVar.t(new kgh(cpVar, b2));
                return Unit.f46060a;
            case 17:
                y8m y8mVar = (y8m) obj;
                y8mVar.getClass();
                function1.invoke(new nhw(y8mVar.d));
                return Unit.f46060a;
            case 18:
                function1.invoke(new xgw(((Long) obj).longValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new zgw(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 20:
                function1.invoke(new ohw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 21:
                function1.invoke(new tgw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 22:
                function1.invoke(new wgw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 23:
                function1.invoke(new vgw(((Long) obj).longValue()));
                return Unit.f46060a;
            case 24:
                function1.invoke(new ugw(((Long) obj).longValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    function1.invoke(rgw.f30458a);
                } else if (iIntValue == 2) {
                    function1.invoke(hhw.f13085a);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new x7k(((w5q0) x5q0Var).f38596a));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((jtl) obj).getClass();
                function1.invoke(v7k.f36929a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.h)) {
                    function1.invoke(rak.f30138a);
                } else if (Intrinsics.d(jtlVar, rk.p)) {
                    function1.invoke(qak.f28398a);
                }
                return Unit.f46060a;
            default:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(sak.f31892a);
                }
                return Unit.f46060a;
        }
    }
}
