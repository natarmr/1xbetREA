package org.xplatform.ufc.api.game;

import a.f140;
import a.rdr0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ufc/api/game/UfcPostGameParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UfcPostGameParams implements Parcelable {
    public static final Parcelable.Creator<UfcPostGameParams> CREATOR = new rdr0((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47171a;
    public final long b;
    public final long c;

    public UfcPostGameParams(long j, long j2, String str) {
        str.getClass();
        this.f47171a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UfcPostGameParams)) {
            return false;
        }
        UfcPostGameParams ufcPostGameParams = (UfcPostGameParams) obj;
        return Intrinsics.d(this.f47171a, ufcPostGameParams.f47171a) && this.b == ufcPostGameParams.b && this.c == ufcPostGameParams.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f47171a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(f140.o(this.b, "UfcPostGameParams(statId=", this.f47171a, ", gameId="), this.c, ", sportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47171a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
