package org.xplatform.top.impl.presentation.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$OneXGames$Categories", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopSectionKey$Header$OneXGames$Categories implements TopSectionKey.Header {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TopSectionKey$Header$OneXGames$Categories f47144a = new TopSectionKey$Header$OneXGames$Categories();
    public static final Parcelable.Creator<TopSectionKey$Header$OneXGames$Categories> CREATOR = new m();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TopSectionKey$Header$OneXGames$Categories);
    }

    public final int hashCode() {
        return -1275657334;
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
