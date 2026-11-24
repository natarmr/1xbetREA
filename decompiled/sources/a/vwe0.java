package a;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vwe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38148a;
    public final /* synthetic */ SimpleDate b;
    public final /* synthetic */ dq00 c;

    public /* synthetic */ vwe0(SimpleDate simpleDate, dq00 dq00Var, byte b) {
        this.f38148a = b;
        this.b = simpleDate;
        this.c = dq00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long lValueOf;
        byte b = this.f38148a;
        dq00 dq00Var = this.c;
        SimpleDate simpleDate = this.b;
        switch (b) {
            case 0:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0Var = aye0Var.h;
                Calendar calendar = Calendar.getInstance();
                calendar.getClass();
                wdx.J(simpleDate, calendar);
                q1f0 q1f0VarA = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, Long.valueOf(calendar.getTimeInMillis()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -257, 127);
                List listC = kotlin.collections.a.c(u0f0.g);
                dq00Var.getClass();
                Map mapD = dq00.d(aye0Var, listC);
                ((vzg0) dq00Var.b).e("DATE", q1f0VarA.i);
                return new Pair(q1f0VarA, mapD);
            case 1:
                aye0 aye0Var2 = (aye0) obj;
                aye0Var2.getClass();
                q1f0 q1f0Var2 = aye0Var2.h;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.getClass();
                wdx.J(simpleDate, calendar2);
                q1f0 q1f0VarA2 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, Long.valueOf(calendar2.getTimeInMillis()), null, false, false, null, -1, 123);
                List listC2 = kotlin.collections.a.c(u0f0.m1);
                dq00Var.getClass();
                Map mapD2 = dq00.d(aye0Var2, listC2);
                ((vzg0) dq00Var.b).e("PASSPORT_DATE_EXPIRE", q1f0VarA2.I);
                return new Pair(q1f0VarA2, mapD2);
            default:
                aye0 aye0Var3 = (aye0) obj;
                aye0Var3.getClass();
                q1f0 q1f0Var3 = aye0Var3.h;
                if (simpleDate != null) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.getClass();
                    wdx.J(simpleDate, calendar3);
                    lValueOf = Long.valueOf(calendar3.getTimeInMillis());
                } else {
                    lValueOf = null;
                }
                q1f0 q1f0VarA3 = q1f0.a(q1f0Var3, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, lValueOf, false, false, null, -1, 119);
                Map mapD3 = dq00.d(aye0Var3, kotlin.collections.a.c(u0f0.l1));
                ((vzg0) dq00Var.b).e("PASSPORT_DATE_ISSUE", q1f0VarA3.J);
                return new Pair(q1f0VarA3, mapD3);
        }
    }
}
