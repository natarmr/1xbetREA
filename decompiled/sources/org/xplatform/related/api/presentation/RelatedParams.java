package org.xplatform.related.api.presentation;

import a.kng0;
import a.ms2;
import a.nr2;
import a.pb10;
import a.rw2;
import a.sne0;
import a.tef0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/related/api/presentation/RelatedParams;", "Landroid/os/Parcelable;", "a/tef0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RelatedParams implements Parcelable {
    public static final Parcelable.Creator<RelatedParams> CREATOR = new sne0(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46881a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final tef0 f;
    public final pb10 g;
    public final ms2 h;

    public RelatedParams(boolean z, long j, long j2, long j3, long j4, tef0 tef0Var, pb10 pb10Var, ms2 ms2Var) {
        tef0Var.getClass();
        pb10Var.getClass();
        ms2Var.getClass();
        this.f46881a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = tef0Var;
        this.g = pb10Var;
        this.h = ms2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedParams)) {
            return false;
        }
        RelatedParams relatedParams = (RelatedParams) obj;
        return this.f46881a == relatedParams.f46881a && this.b == relatedParams.b && this.c == relatedParams.c && this.d == relatedParams.d && this.e == relatedParams.e && this.f == relatedParams.f && this.g == relatedParams.g && Intrinsics.d(this.h, relatedParams.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(Boolean.hashCode(this.f46881a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedParams(live=");
        sb.append(this.f46881a);
        sb.append(", gameId=");
        sb.append(this.b);
        kng0.A(sb, ", sportId=", this.c, ", subSportId=");
        sb.append(this.d);
        kng0.A(sb, ", champId=", this.e, ", screenType=");
        sb.append(this.f);
        sb.append(", lottieSet=");
        sb.append(this.g);
        sb.append(", entryPoint=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46881a ? 1 : 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f.name());
        parcel.writeString(this.g.name());
        parcel.writeSerializable(this.h);
    }

    public RelatedParams(boolean z, long j, long j2, long j3, long j4, tef0 tef0Var) {
        this(z, j, j2, j3, j4, tef0Var, pb10.g, new nr2());
    }
}
