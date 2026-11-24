package a;

import java.util.Calendar;
import java.util.Date;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class g4i0 extends i3t0 {
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        v3i0 v3i0Var = (v3i0) obj;
        v3i0Var.getClass();
        if (v3i0Var.equals(u3i0.f34998a)) {
            G(a4i0.f225a);
            return;
        }
        if (!(v3i0Var instanceof t3i0)) {
            if (v3i0Var.equals(s3i0.f31560a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        xk9 xk9Var = ((t3i0) v3i0Var).f33269a;
        Calendar calendar = Calendar.getInstance();
        SimpleDateTime simpleDateTime = xk9Var.f41021a;
        calendar.getClass();
        simpleDateTime.getClass();
        wdx.I(simpleDateTime, calendar);
        calendar.setTimeInMillis(calendar.getTimeInMillis());
        Date time = calendar.getTime();
        time.getClass();
        SimpleDateTime simpleDateTime2 = xk9Var.b;
        simpleDateTime2.getClass();
        wdx.I(simpleDateTime2, calendar);
        calendar.setTimeInMillis(calendar.getTimeInMillis());
        Date time2 = calendar.getTime();
        time2.getClass();
        G(new b4i0(new i2i0(time, time2)));
    }
}
