package org.xplatform.cyber.section.api.presentation;

import a.ggz;
import a.imw;
import a.kng0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderBoardScreenParams implements Parcelable {
    public static final Parcelable.Creator<LeaderBoardScreenParams> CREATOR = new imw((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46564a;
    public final long b;
    public final ggz c;

    public LeaderBoardScreenParams(long j, long j2, ggz ggzVar) {
        ggzVar.getClass();
        this.f46564a = j;
        this.b = j2;
        this.c = ggzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardScreenParams)) {
            return false;
        }
        LeaderBoardScreenParams leaderBoardScreenParams = (LeaderBoardScreenParams) obj;
        return this.f46564a == leaderBoardScreenParams.f46564a && this.b == leaderBoardScreenParams.b && this.c == leaderBoardScreenParams.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f46564a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46564a, "LeaderBoardScreenParams(subSportId=", ", sportId=");
        sbQ.append(this.b);
        sbQ.append(", entryPoint=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46564a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
    }
}
