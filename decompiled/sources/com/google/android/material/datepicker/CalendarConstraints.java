package com.google.android.material.datepicker;

import a.ett0;
import a.jf4;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f45564a;
    public final Month b;
    public final DateValidator c;
    public final Month d;
    public final int e;
    public final int f;
    public final int g;

    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f45564a = month;
        this.b = month2;
        this.d = month3;
        this.e = i;
        this.c = dateValidator;
        if (month3 != null && month.f45567a.compareTo(month3.f45567a) > 0) {
            jf4.o("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.f45567a.compareTo(month2.f45567a) > 0) {
            jf4.o("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > ett0.c(null).getMaximum(7)) {
            jf4.o("firstDayOfWeek is not valid");
            throw null;
        }
        this.g = month.i(month2) + 1;
        this.f = (month2.c - month.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f45564a.equals(calendarConstraints.f45564a) && this.b.equals(calendarConstraints.b) && Objects.equals(this.d, calendarConstraints.d) && this.e == calendarConstraints.e && this.c.equals(calendarConstraints.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45564a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f45564a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
