package a;

import android.view.View;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.BorderDateTimeModel;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lpe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20437a;
    public final /* synthetic */ ppe0 b;

    public /* synthetic */ lpe0(ppe0 ppe0Var, byte b) {
        this.f20437a = b;
        this.b = ppe0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20437a;
        ppe0 ppe0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = ppe0.S1;
                ((View) obj).getClass();
                cge0 cge0Var = hpe0.g2;
                androidx.fragment.app.e eVarC = ppe0Var.C();
                eVarC.getClass();
                cge0Var.getClass();
                hpe0 hpe0Var = new hpe0();
                hpe0Var.e2.x(hpe0Var, hpe0.h2[0], "selectDateFilterDialogKey");
                hpe0Var.H0(eVarC, "DateFilterBottomSheetDialog");
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zie0 zie0Var2 = ppe0.S1;
                if (zBooleanValue) {
                    tpe0 tpe0VarH0 = ppe0Var.H0();
                    p7m0 p7m0Var = tpe0VarH0.j;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    p7m0 p7m0Var2 = tpe0VarH0.i;
                    vpe0 vpe0Var = vpe0.b;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, vpe0Var);
                    sac.V(jiu0.a(tpe0VarH0), new rpe0(tpe0VarH0, (byte) 2), null, null, new spe0(tpe0VarH0, null, (byte) 1), 14);
                } else {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(1);
                    int i2 = calendar.get(2) + 1;
                    int i3 = calendar.get(5);
                    SimpleDate simpleDate = new SimpleDate(2000, 0, 1);
                    SimpleDate simpleDate2 = new SimpleDate(i, i2, i3);
                    nwd nwdVar = xej.l2;
                    String strH = ppe0Var.H(R.string.calendar_date_module_set_period);
                    strH.getClass();
                    BorderDateTimeModel borderDateTimeModel = new BorderDateTimeModel(simpleDate, null);
                    BorderDateTimeModel borderDateTimeModel2 = new BorderDateTimeModel(simpleDate2, null);
                    ulq0 ulq0Var = ulq0.f35886a;
                    DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams = new DateRangeWithTimeCalendarBottomSheetParams(strH, borderDateTimeModel, borderDateTimeModel2, null, null, 112);
                    androidx.fragment.app.e eVarC2 = ppe0Var.C();
                    eVarC2.getClass();
                    nwdVar.getClass();
                    nwd.f(dateRangeWithTimeCalendarBottomSheetParams, eVarC2);
                }
                break;
        }
        return Unit.f46060a;
    }
}
