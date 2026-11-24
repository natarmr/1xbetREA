package org.xplatform.cyber.calendar.api;

import a.cs0;
import a.h9g;
import a.ohs0;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberCalendarParams implements Parcelable {
    public static final Parcelable.Creator<CyberCalendarParams> CREATOR = new h9g((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46477a;
    public final int b;
    public final int c;
    public final boolean d;

    public CyberCalendarParams(int i, int i2, List list, boolean z) {
        list.getClass();
        this.f46477a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberCalendarParams)) {
            return false;
        }
        CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) obj;
        return Intrinsics.d(this.f46477a, cyberCalendarParams.f46477a) && this.b == cyberCalendarParams.b && this.c == cyberCalendarParams.c && this.d == cyberCalendarParams.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, twn.a(this.b, this.f46477a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberCalendarParams(disciplineList=");
        sb.append(this.f46477a);
        sb.append(", champYear=");
        sb.append(this.b);
        sb.append(", champMonth=");
        return ohs0.k(this.c, ", ufcCalendar=", Separators.RPAREN, sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46477a, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
