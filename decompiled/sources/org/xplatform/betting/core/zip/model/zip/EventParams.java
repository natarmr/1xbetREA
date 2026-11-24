package org.xplatform.betting.core.zip.model.zip;

import a.cs0;
import a.h9g;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/EventParams;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventParams implements Parcelable {
    public static final Parcelable.Creator<EventParams> CREATOR = new h9g((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46427a;
    public final List b;

    public EventParams(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f46427a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParams)) {
            return false;
        }
        EventParams eventParams = (EventParams) obj;
        return Intrinsics.d(this.f46427a, eventParams.f46427a) && Intrinsics.d(this.b, eventParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46427a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("EventParams(params=", ", playerNames=", this.f46427a, Separators.RPAREN, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.f46427a);
        parcel.writeStringList(this.b);
    }
}
