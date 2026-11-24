package org.xplatform.cyber.section.api.virtualrecommended;

import a.cs0;
import a.equ0;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VirtualRecommendedEventsParams implements Parcelable {
    public static final Parcelable.Creator<VirtualRecommendedEventsParams> CREATOR = new equ0((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46575a;

    public VirtualRecommendedEventsParams(List list) {
        list.getClass();
        this.f46575a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VirtualRecommendedEventsParams) && Intrinsics.d(this.f46575a, ((VirtualRecommendedEventsParams) obj).f46575a);
    }

    public final int hashCode() {
        return this.f46575a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f46575a, "VirtualRecommendedEventsParams(sportsId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46575a, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
    }
}
