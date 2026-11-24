package org.xplatform.sportgame.bets_on_players.api.navigation;

import a.brm0;
import a.kng0;
import a.qo7;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetsOnPlayersScreenParams implements Parcelable {
    public static final Parcelable.Creator<BetsOnPlayersScreenParams> CREATOR = new qo7((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46987a;
    public final boolean b;
    public final long c;

    public BetsOnPlayersScreenParams(long j, boolean z, long j2) {
        this.f46987a = j;
        this.b = z;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetsOnPlayersScreenParams)) {
            return false;
        }
        BetsOnPlayersScreenParams betsOnPlayersScreenParams = (BetsOnPlayersScreenParams) obj;
        return this.f46987a == betsOnPlayersScreenParams.f46987a && this.b == betsOnPlayersScreenParams.b && this.c == betsOnPlayersScreenParams.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(Long.hashCode(this.f46987a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(kng0.r(this.f46987a, "BetsOnPlayersScreenParams(gameId=", ", live=", this.b), this.c, ", sportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46987a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
    }
}
