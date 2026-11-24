package a;

import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class cej implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4215a;
    public final CalendarView b;
    public final View c;
    public final TextView d;
    public final TextView e;

    public cej(ConstraintLayout constraintLayout, CalendarView calendarView, View view, TextView textView, TextView textView2) {
        this.f4215a = constraintLayout;
        this.b = calendarView;
        this.c = view;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4215a;
    }
}
