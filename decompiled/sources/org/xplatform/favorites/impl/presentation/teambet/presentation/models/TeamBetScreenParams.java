package org.xplatform.favorites.impl.presentation.teambet.presentation.models;

import a.axq;
import a.kng0;
import a.l7n0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TeamBetScreenParams implements Parcelable {
    public static final Parcelable.Creator<TeamBetScreenParams> CREATOR = new l7n0((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46640a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public TeamBetScreenParams(long j, long j2, long j3, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46640a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamBetScreenParams)) {
            return false;
        }
        TeamBetScreenParams teamBetScreenParams = (TeamBetScreenParams) obj;
        return this.f46640a == teamBetScreenParams.f46640a && Intrinsics.d(this.b, teamBetScreenParams.b) && this.c == teamBetScreenParams.c && this.d == teamBetScreenParams.d && Intrinsics.d(this.e, teamBetScreenParams.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(rw2.b(ua80.b(Long.hashCode(this.f46640a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46640a, "TeamBetScreenParams(teamId=", ", teamName=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbO, this.d, ", statId=", this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46640a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
    }
}
