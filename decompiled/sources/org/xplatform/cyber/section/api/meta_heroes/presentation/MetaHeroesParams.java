package org.xplatform.cyber.section.api.meta_heroes.presentation;

import a.axq;
import a.imw;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MetaHeroesParams implements Parcelable {
    public static final Parcelable.Creator<MetaHeroesParams> CREATOR = new imw((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46559a;

    public MetaHeroesParams(long j) {
        this.f46559a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MetaHeroesParams) && this.f46559a == ((MetaHeroesParams) obj).f46559a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46559a);
    }

    public final String toString() {
        return axq.h(this.f46559a, "MetaHeroesParams(subSportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46559a);
    }
}
