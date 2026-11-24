package org.xplatform.cyber.section.api.activeteams;

import a.axq;
import a.okc;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberActiveTeamsParams implements Parcelable {
    public static final Parcelable.Creator<CyberActiveTeamsParams> CREATOR = new okc((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46546a;

    public CyberActiveTeamsParams(long j) {
        this.f46546a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CyberActiveTeamsParams) && this.f46546a == ((CyberActiveTeamsParams) obj).f46546a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46546a);
    }

    public final String toString() {
        return axq.h(this.f46546a, "CyberActiveTeamsParams(subSportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46546a);
    }
}
