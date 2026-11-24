package org.xplatform.ui_core.calendar.model;

import a.b1j;
import a.h9g;
import a.kng0;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DateRangeCalendarBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<DateRangeCalendarBottomSheetParams> CREATOR = new h9g(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47183a;
    public final String b;
    public final String c;
    public final SimpleDate d;
    public final SimpleDate e;
    public final Integer f;
    public final int g;
    public final DateRangeModel h;

    public DateRangeCalendarBottomSheetParams(String str, String str2, String str3, SimpleDate simpleDate, SimpleDate simpleDate2, Integer num, int i, DateRangeModel dateRangeModel) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        simpleDate.getClass();
        simpleDate2.getClass();
        this.f47183a = str;
        this.b = str2;
        this.c = str3;
        this.d = simpleDate;
        this.e = simpleDate2;
        this.f = num;
        this.g = i;
        this.h = dateRangeModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRangeCalendarBottomSheetParams)) {
            return false;
        }
        DateRangeCalendarBottomSheetParams dateRangeCalendarBottomSheetParams = (DateRangeCalendarBottomSheetParams) obj;
        return Intrinsics.d(this.f47183a, dateRangeCalendarBottomSheetParams.f47183a) && Intrinsics.d(this.b, dateRangeCalendarBottomSheetParams.b) && Intrinsics.d(this.c, dateRangeCalendarBottomSheetParams.c) && Intrinsics.d(this.d, dateRangeCalendarBottomSheetParams.d) && Intrinsics.d(this.e, dateRangeCalendarBottomSheetParams.e) && Intrinsics.d(this.f, dateRangeCalendarBottomSheetParams.f) && this.g == dateRangeCalendarBottomSheetParams.g && Intrinsics.d(this.h, dateRangeCalendarBottomSheetParams.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f47183a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        Integer num = this.f;
        int iA = twn.a(this.g, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        DateRangeModel dateRangeModel = this.h;
        return iA + (dateRangeModel != null ? dateRangeModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DateRangeCalendarBottomSheetParams(title=", this.f47183a, ", rangeEmptyText=", this.b, ", endRangeEmptyText=");
        sbN.append(this.c);
        sbN.append(", minDate=");
        sbN.append(this.d);
        sbN.append(", maxDate=");
        sbN.append(this.e);
        sbN.append(", minDurationDays=");
        sbN.append(this.f);
        sbN.append(", maxDurationDays=");
        sbN.append(this.g);
        sbN.append(", initialRange=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47183a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num);
        }
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, i);
    }
}
