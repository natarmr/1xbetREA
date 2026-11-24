package org.xplatform.cyber.section.api.tournament_bracket;

import a.axq;
import a.brm0;
import a.h9g;
import a.hne;
import a.kng0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberTournamentBracketParams implements Parcelable {
    public static final Parcelable.Creator<CyberTournamentBracketParams> CREATOR = new h9g((byte) 10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46571a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;

    public CyberTournamentBracketParams(long j, long j2, long j3, long j4, String str, boolean z) {
        str.getClass();
        this.f46571a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberTournamentBracketParams)) {
            return false;
        }
        CyberTournamentBracketParams cyberTournamentBracketParams = (CyberTournamentBracketParams) obj;
        return this.f46571a == cyberTournamentBracketParams.f46571a && Intrinsics.d(this.b, cyberTournamentBracketParams.b) && this.c == cyberTournamentBracketParams.c && this.d == cyberTournamentBracketParams.d && this.e == cyberTournamentBracketParams.e && this.f == cyberTournamentBracketParams.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + brm0.e(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f46571a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46571a, "CyberTournamentBracketParams(feedId=", ", statId=", this.b);
        kng0.A(sbO, ", subSportId=", this.c, ", globalChampId=");
        hne.t(this.d, ", openFromUniversalChamp=", sbO, this.e);
        return rw2.n(sbO, this.f, ", startDateTimestamp=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46571a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeLong(this.f);
    }
}
