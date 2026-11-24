package org.xplatform.top.impl.presentation.ui.model;

import a.rdr0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Disciplines", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopSectionKey$Cyber$Disciplines implements TopSectionKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TopSectionKey$Cyber$Disciplines f47130a = new TopSectionKey$Cyber$Disciplines();
    public static final Parcelable.Creator<TopSectionKey$Cyber$Disciplines> CREATOR = new rdr0((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TopSectionKey$Cyber$Disciplines);
    }

    public final int hashCode() {
        return -607534436;
    }

    public final String toString() {
        return "Disciplines";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
