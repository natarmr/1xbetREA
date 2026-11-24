package a;

import java.util.Calendar;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g52 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10696a;
    public final /* synthetic */ SimpleDate b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ SimpleDate d;

    public /* synthetic */ g52(SimpleDate simpleDate, Calendar calendar, SimpleDate simpleDate2, byte b) {
        this.f10696a = b;
        this.b = simpleDate;
        this.c = calendar;
        this.d = simpleDate2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long timeInMillis;
        long timeInMillis2;
        byte b = this.f10696a;
        long timeInMillis3 = 0;
        SimpleDate simpleDate = this.d;
        Calendar calendar = this.c;
        SimpleDate simpleDate2 = this.b;
        switch (b) {
            case 0:
                c52 c52Var = (c52) obj2;
                ((oyg0) obj).getClass();
                c52Var.getClass();
                if (simpleDate2 != null) {
                    calendar.getClass();
                    wdx.J(simpleDate2, calendar);
                    timeInMillis = calendar.getTimeInMillis();
                } else {
                    timeInMillis = 0;
                }
                long j = timeInMillis / 1000;
                if (simpleDate != null) {
                    calendar.getClass();
                    wdx.J(simpleDate, calendar);
                    timeInMillis3 = calendar.getTimeInMillis();
                }
                return c52.a(c52Var, null, null, new vdj(j, timeInMillis3 / 1000), 4079);
            default:
                i77 i77Var = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var.getClass();
                if (simpleDate2 != null) {
                    calendar.getClass();
                    wdx.J(simpleDate2, calendar);
                    timeInMillis2 = calendar.getTimeInMillis();
                } else {
                    timeInMillis2 = 0;
                }
                long j2 = timeInMillis2 / 1000;
                if (simpleDate != null) {
                    calendar.getClass();
                    wdx.J(simpleDate, calendar);
                    timeInMillis3 = calendar.getTimeInMillis();
                }
                return i77.a(i77Var, true, false, false, null, null, null, null, false, new vdj(j2, timeInMillis3 / 1000), null, false, false, false, null, null, null, null, false, null, true, false, false, null, null, null, null, null, -16779266, 2047);
        }
    }
}
