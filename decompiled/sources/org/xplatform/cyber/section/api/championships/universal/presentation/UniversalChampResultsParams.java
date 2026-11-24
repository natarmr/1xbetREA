package org.xplatform.cyber.section.api.championships.universal.presentation;

import a.axq;
import a.brm0;
import a.kng0;
import a.rdr0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UniversalChampResultsParams implements Parcelable {
    public static final Parcelable.Creator<UniversalChampResultsParams> CREATOR = new rdr0((byte) 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46553a;
    public final String b;
    public final long c;
    public final long d;

    public UniversalChampResultsParams(long j, long j2, long j3, String str) {
        str.getClass();
        this.f46553a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalChampResultsParams)) {
            return false;
        }
        UniversalChampResultsParams universalChampResultsParams = (UniversalChampResultsParams) obj;
        return this.f46553a == universalChampResultsParams.f46553a && Intrinsics.d(this.b, universalChampResultsParams.b) && this.c == universalChampResultsParams.c && this.d == universalChampResultsParams.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(ua80.b(Long.hashCode(this.f46553a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46553a, "UniversalChampResultsParams(champId=", ", champName=", this.b);
        kng0.A(sbO, ", subSportId=", this.c, ", selectedDateTimeStamp=");
        return brm0.k(this.d, Separators.RPAREN, sbO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46553a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}
