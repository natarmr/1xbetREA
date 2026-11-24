package a;

import android.view.View;
import android.widget.ImageView;
import org.xplatform.cyber.calendar.impl.presentation.container.CalendarEventTextView;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodEventItemView;

/* JADX INFO: loaded from: classes3.dex */
public final class m7g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberCalendarPeriodEventItemView f21319a;
    public final ImageView b;
    public final CalendarEventTextView c;

    public m7g(CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView, ImageView imageView, CalendarEventTextView calendarEventTextView) {
        this.f21319a = cyberCalendarPeriodEventItemView;
        this.b = imageView;
        this.c = calendarEventTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21319a;
    }
}
