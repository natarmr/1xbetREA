package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.regions;

import a.imw;
import a.qgz;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardRegionModelParams implements Parcelable {
    public static final Parcelable.Creator<LeaderboardRegionModelParams> CREATOR = new imw(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qgz f46579a;

    public LeaderboardRegionModelParams(qgz qgzVar) {
        qgzVar.getClass();
        this.f46579a = qgzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaderboardRegionModelParams) && this.f46579a == ((LeaderboardRegionModelParams) obj).f46579a;
    }

    public final int hashCode() {
        return this.f46579a.hashCode();
    }

    public final String toString() {
        return "LeaderboardRegionModelParams(selectedRegion=" + this.f46579a + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46579a.name());
    }
}
