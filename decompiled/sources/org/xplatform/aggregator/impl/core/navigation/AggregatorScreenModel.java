package org.xplatform.aggregator.impl.core.navigation;

import a.b1j;
import a.gm1;
import a.ibw0;
import a.kng0;
import a.rw2;
import a.s0s;
import a.tm1;
import a.ua80;
import a.wgh0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorScreenModel implements Parcelable {
    public static final Parcelable.Creator<AggregatorScreenModel> CREATOR = new ibw0((byte) 10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46283a;
    public final String b;
    public final long c;
    public final tm1 d;
    public final wgh0 e;
    public final long f;
    public final long g;
    public final String h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public AggregatorScreenModel(String str, String str2, long j, tm1 tm1Var, wgh0 wgh0Var, long j2, long j3, String str3, boolean z, int i) {
        long j4;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        long j5 = (i & 4) != 0 ? -1L : j;
        tm1 tm1Var2 = (i & 8) != 0 ? gm1.f11520a : tm1Var;
        wgh0 wgh0Var2 = (i & 16) != 0 ? wgh0.UNKNOWN : wgh0Var;
        long j6 = -2;
        if ((i & 32) != 0) {
            s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
            j4 = -2;
        } else {
            j4 = j2;
        }
        if ((i & 64) != 0) {
            s0s s0sVar2 = s0s.ONE_X_LIVE_AGGREGATOR;
        } else {
            j6 = j3;
        }
        this(str, str2, j5, tm1Var2, wgh0Var2, j4, j6, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatorScreenModel)) {
            return false;
        }
        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
        return Intrinsics.d(this.f46283a, aggregatorScreenModel.f46283a) && Intrinsics.d(this.b, aggregatorScreenModel.b) && this.c == aggregatorScreenModel.c && Intrinsics.d(this.d, aggregatorScreenModel.d) && this.e == aggregatorScreenModel.e && this.f == aggregatorScreenModel.f && this.g == aggregatorScreenModel.g && Intrinsics.d(this.h, aggregatorScreenModel.h) && this.i == aggregatorScreenModel.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(rw2.b(rw2.b((this.e.hashCode() + ((this.d.hashCode() + rw2.b(ua80.b(this.f46283a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorScreenModel(title=", this.f46283a, ", subtitle=", this.b, ", partitionId=");
        sbN.append(this.c);
        sbN.append(", screenType=");
        sbN.append(this.d);
        sbN.append(", searchScreenType=");
        sbN.append(this.e);
        sbN.append(", categoryId=");
        sbN.append(this.f);
        kng0.A(sbN, ", partType=", this.g, ", subStringValue=");
        return c.c(this.h, ", openedFromMenu=", Separators.RPAREN, sbN, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46283a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeString(this.e.name());
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public AggregatorScreenModel(String str, String str2, long j, tm1 tm1Var, wgh0 wgh0Var, long j2, long j3, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        tm1Var.getClass();
        wgh0Var.getClass();
        str3.getClass();
        this.f46283a = str;
        this.b = str2;
        this.c = j;
        this.d = tm1Var;
        this.e = wgh0Var;
        this.f = j2;
        this.g = j3;
        this.h = str3;
        this.i = z;
    }
}
