package org.xplatform.uikit.compose.components.picker.model;

import a.l7n0;
import a.ohs0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TimeOfDay23 implements Parcelable {
    public static final Parcelable.Creator<TimeOfDay23> CREATOR = new l7n0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47287a;
    public final int b;

    public TimeOfDay23(int i, int i2) {
        this.f47287a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeOfDay23)) {
            return false;
        }
        TimeOfDay23 timeOfDay23 = (TimeOfDay23) obj;
        return this.f47287a == timeOfDay23.f47287a && this.b == timeOfDay23.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f47287a) * 31);
    }

    public final String toString() {
        return ohs0.m("TimeOfDay23(hour=", this.f47287a, ", minute=", Separators.RPAREN, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f47287a);
        parcel.writeInt(this.b);
    }
}
