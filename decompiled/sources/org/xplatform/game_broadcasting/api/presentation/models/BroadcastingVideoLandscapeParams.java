package org.xplatform.game_broadcasting.api.presentation.models;

import a.kng0;
import a.qo7;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BroadcastingVideoLandscapeParams implements Parcelable {
    public static final Parcelable.Creator<BroadcastingVideoLandscapeParams> CREATOR = new qo7((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46689a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;

    public BroadcastingVideoLandscapeParams(long j, long j2, long j3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f46689a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BroadcastingVideoLandscapeParams)) {
            return false;
        }
        BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = (BroadcastingVideoLandscapeParams) obj;
        return this.f46689a == broadcastingVideoLandscapeParams.f46689a && this.b == broadcastingVideoLandscapeParams.b && Intrinsics.d(this.c, broadcastingVideoLandscapeParams.c) && this.d == broadcastingVideoLandscapeParams.d && Intrinsics.d(this.e, broadcastingVideoLandscapeParams.e) && this.f == broadcastingVideoLandscapeParams.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f46689a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46689a, "BroadcastingVideoLandscapeParams(gameId=", ", sportId=");
        kng0.z(sbQ, this.b, ", videoId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", broadcastingUrl=");
        return c.c(this.e, ", fromWindow=", Separators.RPAREN, sbQ, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46689a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
