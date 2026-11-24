package a;

import java.util.Calendar;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes4.dex */
public final class e4i0 implements v6t0 {
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        SimpleDateTime simpleDateTimeH0;
        h4i0 h4i0Var = (h4i0) obj;
        h4i0Var.getClass();
        Calendar calendar = Calendar.getInstance();
        long j = h4i0Var.f12433a;
        calendar.setTimeInMillis(j);
        TimeOfDay23 timeOfDay23 = new TimeOfDay23(calendar.get(11), calendar.get(12));
        ChoosenDate choosenDate = h4i0Var.c;
        SimpleDateTime simpleDateTimeH1 = null;
        if (choosenDate != null) {
            boolean z = choosenDate instanceof ChoosenDate.Interval;
            if (z) {
                simpleDateTimeH0 = bsr0.h0(((ChoosenDate.Interval) choosenDate).f46659a.getTime(), calendar);
            } else if (choosenDate instanceof ChoosenDate.SingleDate) {
                simpleDateTimeH0 = bsr0.h0(((ChoosenDate.SingleDate) choosenDate).f46660a.getTime(), calendar);
            }
            if (z) {
                simpleDateTimeH1 = bsr0.h0(((ChoosenDate.Interval) choosenDate).b.getTime(), calendar);
            } else if (!(choosenDate instanceof ChoosenDate.SingleDate)) {
                t9f.b();
                return null;
            }
            SimpleDateTime simpleDateTime = simpleDateTimeH1;
            yg40 yg40Var = yg40.ONE;
            return new d4i0(bsr0.g0(j, calendar), timeOfDay23, bsr0.g0(h4i0Var.b, calendar), simpleDateTimeH0, simpleDateTime, h4i0Var.d);
        }
        t9f.b();
        return null;
    }
}
