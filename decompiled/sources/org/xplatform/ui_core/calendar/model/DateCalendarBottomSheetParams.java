package org.xplatform.ui_core.calendar.model;

import a.h9g;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DateCalendarBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<DateCalendarBottomSheetParams> CREATOR = new h9g(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47182a;
    public final SimpleDate b;
    public final SimpleDate c;
    public final SimpleDate d;

    public DateCalendarBottomSheetParams(String str, SimpleDate simpleDate, SimpleDate simpleDate2, SimpleDate simpleDate3) {
        str.getClass();
        simpleDate.getClass();
        simpleDate2.getClass();
        this.f47182a = str;
        this.b = simpleDate;
        this.c = simpleDate2;
        this.d = simpleDate3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateCalendarBottomSheetParams)) {
            return false;
        }
        DateCalendarBottomSheetParams dateCalendarBottomSheetParams = (DateCalendarBottomSheetParams) obj;
        return Intrinsics.d(this.f47182a, dateCalendarBottomSheetParams.f47182a) && Intrinsics.d(this.b, dateCalendarBottomSheetParams.b) && Intrinsics.d(this.c, dateCalendarBottomSheetParams.c) && Intrinsics.d(this.d, dateCalendarBottomSheetParams.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f47182a.hashCode() * 31)) * 31)) * 31;
        SimpleDate simpleDate = this.d;
        return iHashCode + (simpleDate == null ? 0 : simpleDate.hashCode());
    }

    public final String toString() {
        return "DateCalendarBottomSheetParams(title=" + this.f47182a + ", minDate=" + this.b + ", maxDate=" + this.c + ", initialDate=" + this.d + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47182a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
