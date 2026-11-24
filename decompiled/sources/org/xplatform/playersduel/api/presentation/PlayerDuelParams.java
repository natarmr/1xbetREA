package org.xplatform.playersduel.api.presentation;

import a.brm0;
import a.d860;
import a.kng0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PlayerDuelParams implements Parcelable {
    public static final Parcelable.Creator<PlayerDuelParams> CREATOR = new d860((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46823a;
    public final boolean b;
    public final long c;

    public PlayerDuelParams(long j, boolean z, long j2) {
        this.f46823a = j;
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
        if (!(obj instanceof PlayerDuelParams)) {
            return false;
        }
        PlayerDuelParams playerDuelParams = (PlayerDuelParams) obj;
        return this.f46823a == playerDuelParams.f46823a && this.b == playerDuelParams.b && this.c == playerDuelParams.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(Long.hashCode(this.f46823a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(kng0.r(this.f46823a, "PlayerDuelParams(gameId=", ", live=", this.b), this.c, ", sportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46823a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
    }
}
