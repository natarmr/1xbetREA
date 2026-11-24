package org.xplatform.uikit.compose.components.calendar.model;

import a.lbi0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SimpleDateTime implements Parcelable {
    public static final Parcelable.Creator<SimpleDateTime> CREATOR = new lbi0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f47285a;
    public final TimeOfDay23 b;

    public SimpleDateTime(SimpleDate simpleDate, TimeOfDay23 timeOfDay23) {
        simpleDate.getClass();
        timeOfDay23.getClass();
        this.f47285a = simpleDate;
        this.b = timeOfDay23;
    }

    public static SimpleDateTime a(SimpleDateTime simpleDateTime, SimpleDate simpleDate, TimeOfDay23 timeOfDay23, int i) {
        if ((i & 1) != 0) {
            simpleDate = simpleDateTime.f47285a;
        }
        if ((i & 2) != 0) {
            timeOfDay23 = simpleDateTime.b;
        }
        simpleDateTime.getClass();
        simpleDate.getClass();
        timeOfDay23.getClass();
        return new SimpleDateTime(simpleDate, timeOfDay23);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDateTime)) {
            return false;
        }
        SimpleDateTime simpleDateTime = (SimpleDateTime) obj;
        return Intrinsics.d(this.f47285a, simpleDateTime.f47285a) && Intrinsics.d(this.b, simpleDateTime.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f47285a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDateTime(date=" + this.f47285a + ", time=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f47285a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
