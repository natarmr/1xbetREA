package org.xplatform.uikit.compose.components.picker.model;

import a.dw9;
import a.lbi0;
import a.rz4;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SimpleDate implements Parcelable {
    public static final Parcelable.Creator<SimpleDate> CREATOR = new lbi0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47286a;
    public final int b;
    public final int c;

    public SimpleDate(int i, int i2, int i3) {
        this.f47286a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDate)) {
            return false;
        }
        SimpleDate simpleDate = (SimpleDate) obj;
        return this.f47286a == simpleDate.f47286a && this.b == simpleDate.b && this.c == simpleDate.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f47286a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("SimpleDate(year=", this.f47286a, ", monthOfYear=", ", dayOfMonth=", this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f47286a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
