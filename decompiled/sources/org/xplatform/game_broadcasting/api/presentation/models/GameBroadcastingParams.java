package org.xplatform.game_broadcasting.api.presentation.models;

import a.brm0;
import a.hne;
import a.kng0;
import a.rw2;
import a.rz4;
import a.twn;
import a.ua80;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GameBroadcastingParams implements Parcelable {
    public static final Parcelable.Creator<GameBroadcastingParams> CREATOR = new yoo(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46691a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final String f;
    public final long g;
    public final String h;

    public GameBroadcastingParams(long j, boolean z, boolean z2, long j2, int i, String str, long j3, String str2) {
        str.getClass();
        this.f46691a = j;
        this.b = z;
        this.c = z2;
        this.d = j2;
        this.e = i;
        this.f = str;
        this.g = j3;
        this.h = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameBroadcastingParams)) {
            return false;
        }
        GameBroadcastingParams gameBroadcastingParams = (GameBroadcastingParams) obj;
        return this.f46691a == gameBroadcastingParams.f46691a && this.b == gameBroadcastingParams.b && this.c == gameBroadcastingParams.c && this.d == gameBroadcastingParams.d && this.e == gameBroadcastingParams.e && Intrinsics.d(this.f, gameBroadcastingParams.f) && this.g == gameBroadcastingParams.g && Intrinsics.d(this.h, gameBroadcastingParams.h);
    }

    public final int hashCode() {
        int iB = rw2.b(ua80.b(twn.a(this.e, rw2.b(brm0.e(brm0.e(Long.hashCode(this.f46691a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
        String str = this.h;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46691a, "GameBroadcastingParams(mainId=", ", live=", this.b);
        rz4.A(sbR, ", finished=", this.c, ", sportId=");
        ua80.v(sbR, this.d, ", zoneId=", this.e);
        hne.B(sbR, ", videoId=", this.f, ", subSportId=");
        kng0.z(sbR, this.g, ", video=", this.h);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46691a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
    }
}
