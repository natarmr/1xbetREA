package org.xplatform.special_event.impl.special_event_tab.presentation.model;

import a.brm0;
import a.cs0;
import a.dw9;
import a.lbi0;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SpecialEventTabScreenParams implements Parcelable {
    public static final Parcelable.Creator<SpecialEventTabScreenParams> CREATOR = new lbi0((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46974a;
    public final String b;
    public final SpecialEventTab c;
    public final boolean d;
    public final List e;

    public SpecialEventTabScreenParams(int i, String str, SpecialEventTab specialEventTab, boolean z, List list) {
        str.getClass();
        specialEventTab.getClass();
        list.getClass();
        this.f46974a = i;
        this.b = str;
        this.c = specialEventTab;
        this.d = z;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialEventTabScreenParams)) {
            return false;
        }
        SpecialEventTabScreenParams specialEventTabScreenParams = (SpecialEventTabScreenParams) obj;
        return this.f46974a == specialEventTabScreenParams.f46974a && Intrinsics.d(this.b, specialEventTabScreenParams.b) && Intrinsics.d(this.c, specialEventTabScreenParams.c) && this.d == specialEventTabScreenParams.d && Intrinsics.d(this.e, specialEventTabScreenParams.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + ua80.b(Integer.hashCode(this.f46974a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46974a, "SpecialEventTabScreenParams(eventId=", ", eventTitle=", this.b, ", tab=");
        sbR.append(this.c);
        sbR.append(", hasCalendar=");
        sbR.append(this.d);
        sbR.append(", tabContentIds=");
        return dw9.r(sbR, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46974a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itT = cs0.t(this.e, parcel);
        while (itT.hasNext()) {
            parcel.writeInt(((Number) itT.next()).intValue());
        }
    }
}
