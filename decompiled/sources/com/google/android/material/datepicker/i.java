package com.google.android.material.datepicker;

import a.ett0;
import a.hhe0;
import a.jf4;
import a.jw20;
import a.xhe0;
import a.yge0;
import a.zq40;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends yge0 {
    public final CalendarConstraints d;
    public final c e;
    public final jw20 f;
    public final int g;
    public Month h;
    public int i = 0;

    public i(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, c cVar, jw20 jw20Var) {
        Month month = calendarConstraints.f45564a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.f45567a.compareTo(month3.f45567a) > 0) {
            jf4.o("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.f45567a.compareTo(month2.f45567a) > 0) {
            jf4.o("currentPage cannot be after lastPage");
            throw null;
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * h.d) + (f.K0(android.R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = calendarConstraints;
        this.e = cVar;
        this.f = jw20Var;
        this.h = month3;
        w(true);
    }

    public final int A(Month month) {
        return this.d.f45564a.i(month);
    }

    @Override // a.yge0
    public final int d() {
        return this.d.g;
    }

    @Override // a.yge0
    public final long e(int i) {
        Calendar calendarA = ett0.a(this.d.f45564a.f45567a);
        calendarA.add(2, i);
        return new Month(calendarA).f45567a.getTimeInMillis();
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        zq40 zq40Var = (zq40) xhe0Var;
        CalendarConstraints calendarConstraints = this.d;
        Calendar calendarA = ett0.a(calendarConstraints.f45564a.f45567a);
        calendarA.add(2, i);
        Month month = new Month(calendarA);
        zq40Var.u.setText(month.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) zq40Var.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f45571a)) {
            new h(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!f.K0(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            return new zq40(linearLayout, false);
        }
        linearLayout.setLayoutParams(new hhe0(-1, this.g));
        return new zq40(linearLayout, true);
    }

    public final Month z(int i) {
        Calendar calendarA = ett0.a(this.d.f45564a.f45567a);
        calendarA.add(2, i);
        return new Month(calendarA);
    }
}
