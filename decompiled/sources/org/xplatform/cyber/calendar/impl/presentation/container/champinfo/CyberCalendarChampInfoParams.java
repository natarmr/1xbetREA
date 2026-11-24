package org.xplatform.cyber.calendar.impl.presentation.container.champinfo;

import a.b1j;
import a.brm0;
import a.f140;
import a.kng0;
import a.ohs0;
import a.okc;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberCalendarChampInfoParams implements Parcelable {
    public static final Parcelable.Creator<CyberCalendarChampInfoParams> CREATOR = new okc((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46482a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;

    public CyberCalendarChampInfoParams(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f46482a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
        this.h = j2;
        this.i = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberCalendarChampInfoParams)) {
            return false;
        }
        CyberCalendarChampInfoParams cyberCalendarChampInfoParams = (CyberCalendarChampInfoParams) obj;
        return Intrinsics.d(this.f46482a, cyberCalendarChampInfoParams.f46482a) && Intrinsics.d(this.b, cyberCalendarChampInfoParams.b) && Intrinsics.d(this.c, cyberCalendarChampInfoParams.c) && Intrinsics.d(this.d, cyberCalendarChampInfoParams.d) && Intrinsics.d(this.e, cyberCalendarChampInfoParams.e) && Intrinsics.d(this.f, cyberCalendarChampInfoParams.f) && this.g == cyberCalendarChampInfoParams.g && this.h == cyberCalendarChampInfoParams.h && this.i == cyberCalendarChampInfoParams.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f46482a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberCalendarChampInfoParams(tournamentName=", this.f46482a, ", date=", this.b, ", disciplineName=");
        f140.v(sbN, this.c, ", disciplineIcon=", this.d, ", prizePool=");
        f140.v(sbN, this.e, ", location=", this.f, ", feedId=");
        sbN.append(this.g);
        kng0.A(sbN, ", subSportId=", this.h, ", globalId=");
        return brm0.k(this.i, Separators.RPAREN, sbN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46482a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
    }
}
