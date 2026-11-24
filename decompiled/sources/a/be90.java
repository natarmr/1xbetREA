package a;

import android.widget.CalendarView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class be90 implements CalendarView.OnDateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2439a;
    public final /* synthetic */ Calendar b;
    public final /* synthetic */ ix5 c;

    public /* synthetic */ be90(Calendar calendar, ix5 ix5Var, byte b) {
        this.f2439a = b;
        this.b = calendar;
        this.c = ix5Var;
    }

    @Override // android.widget.CalendarView.OnDateChangeListener
    public final void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
        byte b = this.f2439a;
        ix5 ix5Var = this.c;
        Calendar calendar = this.b;
        switch (b) {
            case 0:
                de90 de90Var = (de90) ix5Var;
                xi70 xi70Var = de90.k2;
                calendarView.getClass();
                calendar.set(i, i2, i3);
                de90Var.J0().b.setDate(calendar.getTimeInMillis(), false, true);
                if (!de90Var.V0()) {
                    de90Var.a1(calendar);
                } else {
                    de90Var.Y0(calendar);
                }
                break;
            default:
                eei0 eei0Var = (eei0) ix5Var;
                lme0 lme0Var = eei0.i2;
                calendarView.getClass();
                calendar.set(i, i2, i3);
                if (!eei0Var.g2) {
                    eei0Var.W0(calendar);
                } else {
                    eei0Var.V0(calendar);
                }
                break;
        }
    }
}
