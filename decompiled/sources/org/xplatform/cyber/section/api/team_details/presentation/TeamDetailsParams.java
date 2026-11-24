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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TeamDetailsParams implements Parcelable {
    public static final Parcelable.Creator<TeamDetailsParams> CREATOR = new l7n0((byte) 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46569a;
    public final long b;
    public final String c;

    public TeamDetailsParams(long j, long j2, String str) {
        str.getClass();
        this.f46569a = j;
        this.b = j2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamDetailsParams)) {
            return false;
        }
        TeamDetailsParams teamDetailsParams = (TeamDetailsParams) obj;
        return this.f46569a == teamDetailsParams.f46569a && this.b == teamDetailsParams.b && Intrinsics.d(this.c, teamDetailsParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f46569a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46569a, "TeamDetailsParams(subSportId=", ", teamId=");
        kng0.z(sbQ, this.b, ", teamName=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46569a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
    }
}
