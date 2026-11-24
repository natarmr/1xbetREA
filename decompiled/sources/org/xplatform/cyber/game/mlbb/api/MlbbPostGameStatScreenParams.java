package org.xplatform.cyber.game.mlbb.api;

import a.f140;
import a.imw;
import a.rw2;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MlbbPostGameStatScreenParams implements Parcelable {
    public static final Parcelable.Creator<MlbbPostGameStatScreenParams> CREATOR = new imw((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46518a;
    public final long b;
    public final int c;

    public MlbbPostGameStatScreenParams(String str, long j, int i) {
        str.getClass();
        this.f46518a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MlbbPostGameStatScreenParams)) {
            return false;
        }
        MlbbPostGameStatScreenParams mlbbPostGameStatScreenParams = (MlbbPostGameStatScreenParams) obj;
        return Intrinsics.d(this.f46518a, mlbbPostGameStatScreenParams.f46518a) && this.b == mlbbPostGameStatScreenParams.b && this.c == mlbbPostGameStatScreenParams.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rw2.b(this.f46518a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(f140.o(this.b, "MlbbPostGameStatScreenParams(statId=", this.f46518a, ", subSportId="), ", globalChampId=", this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46518a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
