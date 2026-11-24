package org.xplatform.ui_core.calendar.model;

import a.h9g;
import a.ohs0;
import a.ulq0;
import a.yg40;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DateRangeWithTimeCalendarBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<DateRangeWithTimeCalendarBottomSheetParams> CREATOR = new h9g(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47184a;
    public final BorderDateTimeModel b;
    public final BorderDateTimeModel c;
    public final ulq0 d;
    public final yg40 e;
    public final Long f;
    public final Long g;

    public DateRangeWithTimeCalendarBottomSheetParams(String str, BorderDateTimeModel borderDateTimeModel, BorderDateTimeModel borderDateTimeModel2, ulq0 ulq0Var, yg40 yg40Var, Long l, Long l2) {
        str.getClass();
        borderDateTimeModel.getClass();
        borderDateTimeModel2.getClass();
        ulq0Var.getClass();
        yg40Var.getClass();
        this.f47184a = str;
        this.b = borderDateTimeModel;
        this.c = borderDateTimeModel2;
        this.d = ulq0Var;
        this.e = yg40Var;
        this.f = l;
        this.g = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRangeWithTimeCalendarBottomSheetParams)) {
            return false;
        }
        DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams = (DateRangeWithTimeCalendarBottomSheetParams) obj;
        return Intrinsics.d(this.f47184a, dateRangeWithTimeCalendarBottomSheetParams.f47184a) && Intrinsics.d(this.b, dateRangeWithTimeCalendarBottomSheetParams.b) && Intrinsics.d(this.c, dateRangeWithTimeCalendarBottomSheetParams.c) && this.d == dateRangeWithTimeCalendarBottomSheetParams.d && this.e == dateRangeWithTimeCalendarBottomSheetParams.e && Intrinsics.d(this.f, dateRangeWithTimeCalendarBottomSheetParams.f) && Intrinsics.d(this.g, dateRangeWithTimeCalendarBottomSheetParams.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f47184a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Long l = this.f;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateRangeWithTimeCalendarBottomSheetParams(title=");
        sb.append(this.f47184a);
        sb.append(", minDate=");
        sb.append(this.b);
        sb.append(", maxDate=");
        sb.append(this.c);
        sb.append(", timeState=");
        sb.append(this.d);
        sb.append(", minuteStep=");
        sb.append(this.e);
        sb.append(", initialStartDate=");
        sb.append(this.f);
        sb.append(", initialEndDate=");
        return ohs0.r(sb, this.g, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47184a);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d.name());
        parcel.writeString(this.e.name());
        Long l = this.f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.g;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public /* synthetic */ DateRangeWithTimeCalendarBottomSheetParams(String str, BorderDateTimeModel borderDateTimeModel, BorderDateTimeModel borderDateTimeModel2, Long l, Long l2, int i) {
        this(str, borderDateTimeModel, borderDateTimeModel2, ulq0.b, yg40.ONE, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2);
    }
}
