package org.xplatform.sportgame.advanced.api;

import a.brm0;
import a.kng0;
import a.lbi0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportGameAdvancedScreenParams implements Parcelable {
    public static final Parcelable.Creator<SportGameAdvancedScreenParams> CREATOR = new lbi0((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46985a;
    public final boolean b;
    public final long c;
    public final GameBroadcastType d;
    public final long e;
    public final long f;

    public SportGameAdvancedScreenParams(long j, boolean z, long j2, GameBroadcastType gameBroadcastType, long j3, long j4) {
        gameBroadcastType.getClass();
        this.f46985a = j;
        this.b = z;
        this.c = j2;
        this.d = gameBroadcastType;
        this.e = j3;
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
        if (!(obj instanceof SportGameAdvancedScreenParams)) {
            return false;
        }
        SportGameAdvancedScreenParams sportGameAdvancedScreenParams = (SportGameAdvancedScreenParams) obj;
        return this.f46985a == sportGameAdvancedScreenParams.f46985a && this.b == sportGameAdvancedScreenParams.b && this.c == sportGameAdvancedScreenParams.c && this.d == sportGameAdvancedScreenParams.d && this.e == sportGameAdvancedScreenParams.e && this.f == sportGameAdvancedScreenParams.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b((this.d.hashCode() + rw2.b(brm0.e(Long.hashCode(this.f46985a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46985a, "SportGameAdvancedScreenParams(sportId=", ", live=", this.b);
        kng0.A(sbR, ", gameId=", this.c, ", gameBroadcastType=");
        sbR.append(this.d);
        sbR.append(", subGameId=");
        sbR.append(this.e);
        return rw2.n(sbR, this.f, ", champId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46985a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }
}
