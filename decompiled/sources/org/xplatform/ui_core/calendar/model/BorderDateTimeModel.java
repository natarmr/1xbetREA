package org.xplatform.ui_core.calendar.model;

import a.qo7;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BorderDateTimeModel implements Parcelable {
    public static final Parcelable.Creator<BorderDateTimeModel> CREATOR = new qo7(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f47181a;
    public final TimeOfDay23 b;

    public BorderDateTimeModel(SimpleDate simpleDate, TimeOfDay23 timeOfDay23) {
        simpleDate.getClass();
        this.f47181a = simpleDate;
        this.b = timeOfDay23;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderDateTimeModel)) {
            return false;
        }
        BorderDateTimeModel borderDateTimeModel = (BorderDateTimeModel) obj;
        return Intrinsics.d(this.f47181a, borderDateTimeModel.f47181a) && Intrinsics.d(this.b, borderDateTimeModel.b);
    }

    public final int hashCode() {
        int iHashCode = this.f47181a.hashCode() * 31;
        TimeOfDay23 timeOfDay23 = this.b;
        return iHashCode + (timeOfDay23 == null ? 0 : timeOfDay23.hashCode());
    }

    public final String toString() {
        return "BorderDateTimeModel(date=" + this.f47181a + ", time=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47181a, i);
        parcel.writeParcelable(this.b, i);
    }
}
