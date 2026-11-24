package org.xplatform.special_event.impl.filter.navigation;

import a.lbi0;
import a.ms2;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportGameFilterSelectionScreenParams implements Parcelable {
    public static final Parcelable.Creator<SportGameFilterSelectionScreenParams> CREATOR = new lbi0((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46965a;
    public final String b;
    public final ms2 c;

    public SportGameFilterSelectionScreenParams(int i, String str, ms2 ms2Var) {
        str.getClass();
        ms2Var.getClass();
        this.f46965a = i;
        this.b = str;
        this.c = ms2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportGameFilterSelectionScreenParams)) {
            return false;
        }
        SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams = (SportGameFilterSelectionScreenParams) obj;
        return this.f46965a == sportGameFilterSelectionScreenParams.f46965a && Intrinsics.d(this.b, sportGameFilterSelectionScreenParams.b) && Intrinsics.d(this.c, sportGameFilterSelectionScreenParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f46965a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46965a, "SportGameFilterSelectionScreenParams(eventId=", ", entryPointScreenTag=", this.b, ", entryPoint=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46965a);
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
    }
}
