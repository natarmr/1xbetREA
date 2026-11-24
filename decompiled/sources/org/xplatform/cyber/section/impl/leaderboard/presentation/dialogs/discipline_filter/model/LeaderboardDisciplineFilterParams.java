package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model;

import a.cs0;
import a.imw;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardDisciplineFilterParams implements Parcelable {
    public static final Parcelable.Creator<LeaderboardDisciplineFilterParams> CREATOR = new imw(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46578a;
    public final List b;

    public LeaderboardDisciplineFilterParams(long j, List list) {
        list.getClass();
        this.f46578a = j;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardDisciplineFilterParams)) {
            return false;
        }
        LeaderboardDisciplineFilterParams leaderboardDisciplineFilterParams = (LeaderboardDisciplineFilterParams) obj;
        return this.f46578a == leaderboardDisciplineFilterParams.f46578a && Intrinsics.d(this.b, leaderboardDisciplineFilterParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46578a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f46578a, "LeaderboardDisciplineFilterParams(selectedSubSportId=", ", disciplines=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46578a);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            ((LeaderboardDisciplineFilter) itT.next()).writeToParcel(parcel, i);
        }
    }
}
