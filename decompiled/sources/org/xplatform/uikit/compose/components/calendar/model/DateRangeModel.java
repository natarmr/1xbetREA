package org.xplatform.uikit.compose.components.calendar.model;

import a.h9g;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DateRangeModel implements Parcelable {
    public static final Parcelable.Creator<DateRangeModel> CREATOR = new h9g(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f47284a;
    public final SimpleDate b;

    public DateRangeModel(SimpleDate simpleDate, SimpleDate simpleDate2) {
        this.f47284a = simpleDate;
        this.b = simpleDate2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRangeModel)) {
            return false;
        }
        DateRangeModel dateRangeModel = (DateRangeModel) obj;
        return Intrinsics.d(this.f47284a, dateRangeModel.f47284a) && Intrinsics.d(this.b, dateRangeModel.b);
    }

    public final int hashCode() {
        SimpleDate simpleDate = this.f47284a;
        int iHashCode = (simpleDate == null ? 0 : simpleDate.hashCode()) * 31;
        SimpleDate simpleDate2 = this.b;
        return iHashCode + (simpleDate2 != null ? simpleDate2.hashCode() : 0);
    }

    public final String toString() {
        return "DateRangeModel(startRange=" + this.f47284a + ", endRange=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        SimpleDate simpleDate = this.f47284a;
        if (simpleDate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleDate.writeToParcel(parcel, i);
        }
        SimpleDate simpleDate2 = this.b;
        if (simpleDate2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleDate2.writeToParcel(parcel, i);
        }
    }
}
