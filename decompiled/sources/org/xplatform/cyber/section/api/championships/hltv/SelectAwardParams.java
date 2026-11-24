package org.xplatform.cyber.section.api.championships.hltv;

import a.kng0;
import a.rw2;
import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectAwardParams implements Parcelable {
    public static final Parcelable.Creator<SelectAwardParams> CREATOR = new sne0(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46547a;
    public final long b;
    public final long c;

    public SelectAwardParams(long j, long j2, long j3) {
        this.f46547a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectAwardParams)) {
            return false;
        }
        SelectAwardParams selectAwardParams = (SelectAwardParams) obj;
        return this.f46547a == selectAwardParams.f46547a && this.b == selectAwardParams.b && this.c == selectAwardParams.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f46547a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46547a, "SelectAwardParams(selectedCategoryId=", ", selectedNominationId=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", feedGameId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46547a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
