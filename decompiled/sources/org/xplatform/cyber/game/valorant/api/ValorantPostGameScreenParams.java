package org.xplatform.cyber.game.valorant.api;

import a.f140;
import a.rdr0;
import a.rw2;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ValorantPostGameScreenParams implements Parcelable {
    public static final Parcelable.Creator<ValorantPostGameScreenParams> CREATOR = new rdr0((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46543a;
    public final long b;
    public final int c;
    public final int d;

    public ValorantPostGameScreenParams(String str, int i, int i2, long j) {
        str.getClass();
        this.f46543a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValorantPostGameScreenParams)) {
            return false;
        }
        ValorantPostGameScreenParams valorantPostGameScreenParams = (ValorantPostGameScreenParams) obj;
        return Intrinsics.d(this.f46543a, valorantPostGameScreenParams.f46543a) && this.b == valorantPostGameScreenParams.b && this.c == valorantPostGameScreenParams.c && this.d == valorantPostGameScreenParams.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, rw2.b(this.f46543a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ValorantPostGameScreenParams(statId=", this.f46543a, ", subSportId=");
        rw2.s(this.c, this.d, ", selectedMapIndex=", ", globalChampId=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46543a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
