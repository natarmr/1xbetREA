package org.xplatform.cyber.section.api.team_details.presentation;

import a.kng0;
import a.l7n0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TeamDetailsResultsParams implements Parcelable {
    public static final Parcelable.Creator<TeamDetailsResultsParams> CREATOR = new l7n0((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46570a;
    public final long b;
    public final Integer c;

    public TeamDetailsResultsParams(long j, long j2, Integer num) {
        this.f46570a = j;
        this.b = j2;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamDetailsResultsParams)) {
            return false;
        }
        TeamDetailsResultsParams teamDetailsResultsParams = (TeamDetailsResultsParams) obj;
        return this.f46570a == teamDetailsResultsParams.f46570a && this.b == teamDetailsResultsParams.b && Intrinsics.d(this.c, teamDetailsResultsParams.c);
    }

    public final int hashCode() {
        int iB = rw2.b(Long.hashCode(this.f46570a) * 31, 31, this.b);
        Integer num = this.c;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46570a, "TeamDetailsResultsParams(subSportId=", ", teamId=");
        sbQ.append(this.b);
        sbQ.append(", selectedDateIndex=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46570a);
        parcel.writeLong(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num);
        }
    }
}
