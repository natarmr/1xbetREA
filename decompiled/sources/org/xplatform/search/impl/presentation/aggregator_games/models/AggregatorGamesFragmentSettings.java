package org.xplatform.search.impl.presentation.aggregator_games.models;

import a.ibw0;
import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/impl/presentation/aggregator_games/models/AggregatorGamesFragmentSettings;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorGamesFragmentSettings implements Parcelable {
    public static final Parcelable.Creator<AggregatorGamesFragmentSettings> CREATOR = new ibw0((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46918a;

    public AggregatorGamesFragmentSettings(String str) {
        str.getClass();
        this.f46918a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AggregatorGamesFragmentSettings) && Intrinsics.d(this.f46918a, ((AggregatorGamesFragmentSettings) obj).f46918a);
    }

    public final int hashCode() {
        return this.f46918a.hashCode();
    }

    public final String toString() {
        return kng0.l("AggregatorGamesFragmentSettings(componentKey=", this.f46918a, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46918a);
    }
}
