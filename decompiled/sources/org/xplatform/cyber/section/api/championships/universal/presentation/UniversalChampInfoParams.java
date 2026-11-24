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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UniversalChampInfoParams implements Parcelable {
    public static final Parcelable.Creator<UniversalChampInfoParams> CREATOR = new rdr0((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46550a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;

    public UniversalChampInfoParams(long j, long j2, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f46550a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalChampInfoParams)) {
            return false;
        }
        UniversalChampInfoParams universalChampInfoParams = (UniversalChampInfoParams) obj;
        return this.f46550a == universalChampInfoParams.f46550a && Intrinsics.d(this.b, universalChampInfoParams.b) && this.c == universalChampInfoParams.c && Intrinsics.d(this.d, universalChampInfoParams.d) && Intrinsics.d(this.e, universalChampInfoParams.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(rw2.b(ua80.b(Long.hashCode(this.f46550a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46550a, "UniversalChampInfoParams(champId=", ", champName=", this.b);
        kng0.A(sbO, ", subSportId=", this.c, ", netGameId=");
        return ua80.m(sbO, this.d, ", tourTime=", this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46550a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
