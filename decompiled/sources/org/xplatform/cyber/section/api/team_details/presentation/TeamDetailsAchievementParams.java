package org.xplatform.cyber.section.api.team_details.presentation;

import a.axq;
import a.l7n0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TeamDetailsAchievementParams implements Parcelable {
    public static final Parcelable.Creator<TeamDetailsAchievementParams> CREATOR = new l7n0((byte) 10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46568a;
    public final String b;

    public TeamDetailsAchievementParams(long j, String str) {
        str.getClass();
        this.f46568a = j;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamDetailsAchievementParams)) {
            return false;
        }
        TeamDetailsAchievementParams teamDetailsAchievementParams = (TeamDetailsAchievementParams) obj;
        return this.f46568a == teamDetailsAchievementParams.f46568a && Intrinsics.d(this.b, teamDetailsAchievementParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46568a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46568a, "TeamDetailsAchievementParams(subSportId=", ", teamName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46568a);
        parcel.writeString(this.b);
    }
}
