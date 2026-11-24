package org.xplatform.feed.notifictation.presentation.models;

import a.hne;
import a.kng0;
import a.rw2;
import a.ua80;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GameNotificationScreenParams implements Parcelable {
    public static final Parcelable.Creator<GameNotificationScreenParams> CREATOR = new yoo((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46677a;
    public final long b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;

    public GameNotificationScreenParams(long j, long j2, long j3, long j4, String str, boolean z) {
        str.getClass();
        this.f46677a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = j4;
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
        if (!(obj instanceof GameNotificationScreenParams)) {
            return false;
        }
        GameNotificationScreenParams gameNotificationScreenParams = (GameNotificationScreenParams) obj;
        return this.f46677a == gameNotificationScreenParams.f46677a && this.b == gameNotificationScreenParams.b && Intrinsics.d(this.c, gameNotificationScreenParams.c) && this.d == gameNotificationScreenParams.d && this.e == gameNotificationScreenParams.e && this.f == gameNotificationScreenParams.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + rw2.b(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f46677a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46677a, "GameNotificationScreenParams(gameId=", ", constId=");
        kng0.z(sbQ, this.b, ", matchName=", this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", subSportId=");
        hne.t(this.e, ", live=", sbQ, this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46677a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
