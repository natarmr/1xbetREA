package org.xplatform.playersduel.impl.presentation.players_duel.screen;

import a.brm0;
import a.d860;
import a.hne;
import a.kng0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PlayersDuelParams implements Parcelable {
    public static final Parcelable.Creator<PlayersDuelParams> CREATOR = new d860((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46826a;
    public final long b;
    public final boolean c;
    public final long d;

    public PlayersDuelParams(long j, long j2, long j3, boolean z) {
        this.f46826a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayersDuelParams)) {
            return false;
        }
        PlayersDuelParams playersDuelParams = (PlayersDuelParams) obj;
        return this.f46826a == playersDuelParams.f46826a && this.b == playersDuelParams.b && this.c == playersDuelParams.c && this.d == playersDuelParams.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + brm0.e(rw2.b(Long.hashCode(this.f46826a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46826a, "PlayersDuelParams(gameId=", ", subGameId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        return rw2.n(sbQ, this.d, ", sportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46826a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
    }
}
