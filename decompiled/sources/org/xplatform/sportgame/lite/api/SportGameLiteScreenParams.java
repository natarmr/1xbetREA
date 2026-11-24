package org.xplatform.sportgame.lite.api;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportGameLiteScreenParams implements Parcelable {
    public static final Parcelable.Creator<SportGameLiteScreenParams> CREATOR = new lbi0((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47004a;
    public final boolean b;
    public final long c;
    public final GameBroadcastType d;
    public final long e;

    public SportGameLiteScreenParams(long j, boolean z, long j2, GameBroadcastType gameBroadcastType, long j3) {
        gameBroadcastType.getClass();
        this.f47004a = j;
        this.b = z;
        this.c = j2;
        this.d = gameBroadcastType;
        this.e = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportGameLiteScreenParams)) {
            return false;
        }
        SportGameLiteScreenParams sportGameLiteScreenParams = (SportGameLiteScreenParams) obj;
        return this.f47004a == sportGameLiteScreenParams.f47004a && this.b == sportGameLiteScreenParams.b && this.c == sportGameLiteScreenParams.c && this.d == sportGameLiteScreenParams.d && this.e == sportGameLiteScreenParams.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + rw2.b(brm0.e(Long.hashCode(this.f47004a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f47004a, "SportGameLiteScreenParams(sportId=", ", live=", this.b);
        kng0.A(sbR, ", gameId=", this.c, ", gameBroadcastType=");
        sbR.append(this.d);
        sbR.append(", subGameId=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47004a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeLong(this.e);
    }
}
