package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter;

import a.cs0;
import a.imw;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardTimeFilterModelParams implements Parcelable {
    public static final Parcelable.Creator<LeaderboardTimeFilterModelParams> CREATOR = new imw(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46581a;
    public final int b;

    public LeaderboardTimeFilterModelParams(AbstractList abstractList, int i) {
        abstractList.getClass();
        this.f46581a = abstractList;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardTimeFilterModelParams)) {
            return false;
        }
        LeaderboardTimeFilterModelParams leaderboardTimeFilterModelParams = (LeaderboardTimeFilterModelParams) obj;
        return Intrinsics.d(this.f46581a, leaderboardTimeFilterModelParams.f46581a) && this.b == leaderboardTimeFilterModelParams.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f46581a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardTimeFilterModelParams(years=" + this.f46581a + ", selectedYear=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46581a, parcel);
        while (itT.hasNext()) {
            ((LeaderboardTimeFilterYearsModel) itT.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
    }
}
