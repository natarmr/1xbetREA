package org.xplatform.game_broadcasting.api.presentation.models;

import a.kng0;
import a.qo7;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BroadcastingZoneLandscapeParams implements Parcelable {
    public static final Parcelable.Creator<BroadcastingZoneLandscapeParams> CREATOR = new qo7((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46690a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;

    public BroadcastingZoneLandscapeParams(long j, long j2, int i, long j3, boolean z) {
        this.f46690a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BroadcastingZoneLandscapeParams)) {
            return false;
        }
        BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams = (BroadcastingZoneLandscapeParams) obj;
        return this.f46690a == broadcastingZoneLandscapeParams.f46690a && this.b == broadcastingZoneLandscapeParams.b && this.c == broadcastingZoneLandscapeParams.c && this.d == broadcastingZoneLandscapeParams.d && this.e == broadcastingZoneLandscapeParams.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(twn.a(this.c, rw2.b(Long.hashCode(this.f46690a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46690a, "BroadcastingZoneLandscapeParams(gameId=", ", sportId=");
        ua80.v(sbQ, this.b, ", zoneId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", fromWindow=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46690a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
