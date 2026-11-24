package org.xplatform.sportgame.classic.api.navigation;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportGameClassicScreenParams implements Parcelable {
    public static final Parcelable.Creator<SportGameClassicScreenParams> CREATOR = new lbi0((byte) 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46991a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final GameBroadcastType f;
    public final boolean g;

    public SportGameClassicScreenParams(long j, boolean z, long j2, long j3, long j4, GameBroadcastType gameBroadcastType, boolean z2) {
        gameBroadcastType.getClass();
        this.f46991a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = gameBroadcastType;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportGameClassicScreenParams)) {
            return false;
        }
        SportGameClassicScreenParams sportGameClassicScreenParams = (SportGameClassicScreenParams) obj;
        return this.f46991a == sportGameClassicScreenParams.f46991a && this.b == sportGameClassicScreenParams.b && this.c == sportGameClassicScreenParams.c && this.d == sportGameClassicScreenParams.d && this.e == sportGameClassicScreenParams.e && this.f == sportGameClassicScreenParams.f && this.g == sportGameClassicScreenParams.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + rw2.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f46991a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46991a, "SportGameClassicScreenParams(sportId=", ", live=", this.b);
        kng0.A(sbR, ", gameId=", this.c, ", subGameId=");
        sbR.append(this.d);
        kng0.A(sbR, ", champId=", this.e, ", gameBroadcastType=");
        sbR.append(this.f);
        sbR.append(", cyberClassicGameScreen=");
        sbR.append(this.g);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46991a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
