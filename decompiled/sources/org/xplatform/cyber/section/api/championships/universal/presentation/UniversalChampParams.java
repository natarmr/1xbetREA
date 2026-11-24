package org.xplatform.cyber.section.api.championships.universal.presentation;

import a.axq;
import a.rdr0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UniversalChampParams implements Parcelable {
    public static final Parcelable.Creator<UniversalChampParams> CREATOR = new rdr0((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46551a;
    public final String b;
    public final long c;

    public UniversalChampParams(long j, long j2, String str) {
        str.getClass();
        this.f46551a = j;
        this.b = str;
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
        if (!(obj instanceof UniversalChampParams)) {
            return false;
        }
        UniversalChampParams universalChampParams = (UniversalChampParams) obj;
        return this.f46551a == universalChampParams.f46551a && Intrinsics.d(this.b, universalChampParams.b) && this.c == universalChampParams.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(Long.hashCode(this.f46551a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(axq.o(this.f46551a, "UniversalChampParams(champId=", ", champName=", this.b), this.c, ", subSportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46551a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
