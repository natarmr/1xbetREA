package a;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n72 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23020a;
    public final /* synthetic */ Calendar b;

    public /* synthetic */ n72(Calendar calendar, byte b) {
        this.f23020a = b;
        this.b = calendar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long lValueOf;
        byte b = this.f23020a;
        Long lValueOf2 = null;
        Calendar calendar = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                g72 g72Var = (g72) obj2;
                oyg0Var.getClass();
                g72Var.getClass();
                Date time = calendar.getTime();
                q7x.F(oyg0Var, time, "KEY_CURRENT_DATE");
                xun xunVar = xun.f41520a;
                q7x.F(oyg0Var, xunVar, "KEY_SELECTED_IDS");
                q7x.F(oyg0Var, Boolean.FALSE, "KEY_SELECTION_ENABLE");
                return g72.a(g72Var, null, time, false, null, false, false, false, false, false, xunVar, null, null, 425981);
            case 1:
                SimpleDate simpleDate = (SimpleDate) obj2;
                ((azg0) obj).getClass();
                if (simpleDate == null) {
                    return null;
                }
                wdx.J(simpleDate, calendar);
                return Long.valueOf(calendar.getTimeInMillis());
            case 2:
                DateRangeModel dateRangeModel = (DateRangeModel) obj2;
                ((azg0) obj).getClass();
                if (dateRangeModel != null) {
                    SimpleDate simpleDate2 = dateRangeModel.b;
                    SimpleDate simpleDate3 = dateRangeModel.f47284a;
                    if (simpleDate3 != null || simpleDate2 != null) {
                        if (simpleDate3 != null) {
                            wdx.J(simpleDate3, calendar);
                            lValueOf = Long.valueOf(calendar.getTimeInMillis());
                        } else {
                            lValueOf = null;
                        }
                        if (simpleDate2 != null) {
                            wdx.J(simpleDate2, calendar);
                            lValueOf2 = Long.valueOf(calendar.getTimeInMillis());
                        }
                        return q3d.j(lValueOf, lValueOf2);
                    }
                }
                return q3d.j(null, null);
            case 3:
                wk9 wk9Var = (wk9) obj2;
                ((azg0) obj).getClass();
                if (wk9Var != null) {
                    return new long[]{wdx.f0(wk9Var.f39296a, calendar), wdx.f0(wk9Var.b, calendar)};
                }
                return null;
            default:
                xk9 xk9Var = (xk9) obj2;
                ((azg0) obj).getClass();
                if (xk9Var != null) {
                    return new long[]{wdx.e0(xk9Var.f41021a, calendar), wdx.e0(xk9Var.b, calendar)};
                }
                return null;
        }
    }
}
