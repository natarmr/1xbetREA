package org.xplatform.cyber.section.api.championships.regular.presentation;

import a.axq;
import a.h9g;
import a.kng0;
import a.rw2;
import a.rz4;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberChampParams implements Parcelable {
    public static final Parcelable.Creator<CyberChampParams> CREATOR = new h9g((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46549a;
    public final String b;
    public final long c;
    public final int d;

    public CyberChampParams(String str, long j, long j2, int i) {
        str.getClass();
        this.f46549a = j;
        this.b = str;
        this.c = j2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberChampParams)) {
            return false;
        }
        CyberChampParams cyberChampParams = (CyberChampParams) obj;
        return this.f46549a == cyberChampParams.f46549a && Intrinsics.d(this.b, cyberChampParams.b) && this.c == cyberChampParams.c && this.d == cyberChampParams.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rw2.b(ua80.b(Long.hashCode(this.f46549a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46549a, "CyberChampParams(champId=", ", champName=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", pageType=");
        return rz4.j(this.d, Separators.RPAREN, sbO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46549a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }

    public /* synthetic */ CyberChampParams(int i, long j, long j2) {
        this("", j, j2, i);
    }
}
