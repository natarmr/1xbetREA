package org.xplatform.cyber.section.api.presentation;

import a.brm0;
import a.kng0;
import a.rdr0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TransferScreenParams implements Parcelable {
    public static final Parcelable.Creator<TransferScreenParams> CREATOR = new rdr0((byte) 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46565a;
    public final long b;

    public TransferScreenParams(long j, long j2) {
        this.f46565a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferScreenParams)) {
            return false;
        }
        TransferScreenParams transferScreenParams = (TransferScreenParams) obj;
        return this.f46565a == transferScreenParams.f46565a && this.b == transferScreenParams.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f46565a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f46565a, "TransferScreenParams(subSportId=", ", sportId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46565a);
        parcel.writeLong(this.b);
    }
}
