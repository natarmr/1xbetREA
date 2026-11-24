package org.xplatform.top.impl.presentation.ui.model;

import a.l7n0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Categories", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopSectionKey$Aggregator$Categories implements TopSectionKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TopSectionKey$Aggregator$Categories f47122a = new TopSectionKey$Aggregator$Categories();
    public static final Parcelable.Creator<TopSectionKey$Aggregator$Categories> CREATOR = new l7n0((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TopSectionKey$Aggregator$Categories);
    }

    public final int hashCode() {
        return -589389745;
    }

    public final String toString() {
        return "Categories";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
