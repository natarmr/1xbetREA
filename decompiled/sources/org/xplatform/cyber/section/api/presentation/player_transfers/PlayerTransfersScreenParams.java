package org.xplatform.cyber.section.api.presentation.player_transfers;

import a.axq;
import a.d860;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PlayerTransfersScreenParams implements Parcelable {
    public static final Parcelable.Creator<PlayerTransfersScreenParams> CREATOR = new d860((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46566a;
    public final String b;

    public PlayerTransfersScreenParams(long j, String str) {
        str.getClass();
        this.f46566a = j;
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
        if (!(obj instanceof PlayerTransfersScreenParams)) {
            return false;
        }
        PlayerTransfersScreenParams playerTransfersScreenParams = (PlayerTransfersScreenParams) obj;
        return this.f46566a == playerTransfersScreenParams.f46566a && Intrinsics.d(this.b, playerTransfersScreenParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46566a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46566a, "PlayerTransfersScreenParams(subSportId=", ", playerName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46566a);
        parcel.writeString(this.b);
    }
}
