package com.google.android.material.datepicker;

import a.ett0;
import a.jf4;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f45567a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = ett0.a(calendar);
        this.f45567a = calendarA;
        this.b = calendarA.get(2);
        this.c = calendarA.get(1);
        this.d = calendarA.getMaximum(7);
        this.e = calendarA.getActualMaximum(5);
        this.f = calendarA.getTimeInMillis();
    }

    public static Month a(int i, int i2) {
        Calendar calendarC = ett0.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i2);
        return new Month(calendarC);
    }

    public static Month b(long j) {
        Calendar calendarC = ett0.c(null);
        calendarC.setTimeInMillis(j);
        return new Month(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f45567a.compareTo(month.f45567a);
    }

    public final String d() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        long timeInMillis = this.f45567a.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = ett0.f8391a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        String str2 = instanceForSkeleton.format(new Date(timeInMillis));
        this.g = str2;
        return str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final int i(Month month) {
        if (this.f45567a instanceof GregorianCalendar) {
            return (month.b - this.b) + ((month.c - this.c) * 12);
        }
        jf4.o("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
