package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model;

import a.axq;
import a.imw;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardDisciplineFilter implements Parcelable {
    public static final Parcelable.Creator<LeaderboardDisciplineFilter> CREATOR = new imw(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46577a;
    public final String b;
    public final String c;

    public LeaderboardDisciplineFilter(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46577a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardDisciplineFilter)) {
            return false;
        }
        LeaderboardDisciplineFilter leaderboardDisciplineFilter = (LeaderboardDisciplineFilter) obj;
        return this.f46577a == leaderboardDisciplineFilter.f46577a && Intrinsics.d(this.b, leaderboardDisciplineFilter.b) && Intrinsics.d(this.c, leaderboardDisciplineFilter.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f46577a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f46577a, "LeaderboardDisciplineFilter(subSportId=", ", image=", this.b), ", title=", this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46577a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
