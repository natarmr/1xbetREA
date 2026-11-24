package com.google.android.material.datepicker;

import a.cu;
import a.ett0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends BaseAdapter {
    public static final int d = ett0.c(null).getMaximum(4);
    public static final int e = (ett0.c(null).getMaximum(7) + ett0.c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f45571a;
    public cu b;
    public final CalendarConstraints c;

    public h(Month month, CalendarConstraints calendarConstraints) {
        this.f45571a = month;
        this.c = calendarConstraints;
        throw null;
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int firstDayOfWeek = this.c.e;
        Month month = this.f45571a;
        Calendar calendar = month.f45567a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < c() || i > f()) {
            return null;
        }
        int iC = (i - c()) + 1;
        Calendar calendarA = ett0.a(this.f45571a.f45567a);
        calendarA.set(5, iC);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final boolean e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= ((DateValidatorPointForward) this.c.c).f45565a;
        }
        return false;
    }

    public final int f() {
        return (c() + this.f45571a.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f45571a.d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new cu(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iC = i - c();
        if (iC >= 0) {
            Month month = this.f45571a;
            if (iC >= month.e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iC + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        ett0.b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
