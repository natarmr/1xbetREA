package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarDaysOfWeekView;

/* JADX INFO: loaded from: classes3.dex */
public final class ibg implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f14485a;
    public final CyberCalendarPeriodView b;
    public final CyberCalendarDaysOfWeekView c;
    public final View d;

    public ibg(LinearLayout linearLayout, CyberCalendarPeriodView cyberCalendarPeriodView, CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView, View view) {
        this.f14485a = linearLayout;
        this.b = cyberCalendarPeriodView;
        this.c = cyberCalendarDaysOfWeekView;
        this.d = view;
    }

    public static ibg a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.cyber_calendar_week_of_month_view, viewGroup, false);
        int i = R.id.calendarPeriodView;
        CyberCalendarPeriodView cyberCalendarPeriodView = (CyberCalendarPeriodView) yum0.f(viewInflate, R.id.calendarPeriodView);
        if (cyberCalendarPeriodView != null) {
            i = R.id.daysOfWeekView;
            CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView = (CyberCalendarDaysOfWeekView) yum0.f(viewInflate, R.id.daysOfWeekView);
            if (cyberCalendarDaysOfWeekView != null) {
                i = R.id.weekSeparator;
                View viewF = yum0.f(viewInflate, R.id.weekSeparator);
                if (viewF != null) {
                    return new ibg((LinearLayout) viewInflate, cyberCalendarPeriodView, cyberCalendarDaysOfWeekView, viewF);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14485a;
    }
}
