package org.xplatform.betting.core.zip.model.zip;

import a.axq;
import a.ibw0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetPlayerZip implements Parcelable {
    public static final Parcelable.Creator<BetPlayerZip> CREATOR = new ibw0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46425a;
    public final String b;

    public BetPlayerZip(long j, String str) {
        str.getClass();
        this.f46425a = j;
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
        if (!(obj instanceof BetPlayerZip)) {
            return false;
        }
        BetPlayerZip betPlayerZip = (BetPlayerZip) obj;
        return this.f46425a == betPlayerZip.f46425a && Intrinsics.d(this.b, betPlayerZip.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46425a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46425a, "BetPlayerZip(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46425a);
        parcel.writeString(this.b);
    }
}
