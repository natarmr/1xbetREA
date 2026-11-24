package org.xplatform.cyber.game.core.betting.domain.model;

import a.kng0;
import a.pb10;
import a.rw2;
import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RelatedParams implements Parcelable {
    public static final Parcelable.Creator<RelatedParams> CREATOR = new sne0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46502a;
    public final long b;
    public final long c;
    public final pb10 d;
    public final long e;
    public final long f;

    public RelatedParams(boolean z, long j, long j2, pb10 pb10Var, long j3, long j4) {
        pb10Var.getClass();
        this.f46502a = z;
        this.b = j;
        this.c = j2;
        this.d = pb10Var;
        this.e = j3;
        this.f = j4;
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
        return this.f46502a == relatedParams.f46502a && this.b == relatedParams.b && this.c == relatedParams.c && this.d == relatedParams.d && this.e == relatedParams.e && this.f == relatedParams.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b((this.d.hashCode() + rw2.b(rw2.b(Boolean.hashCode(this.f46502a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedParams(live=");
        sb.append(this.f46502a);
        sb.append(", gameId=");
        sb.append(this.b);
        kng0.A(sb, ", champId=", this.c, ", lottieSet=");
        sb.append(this.d);
        sb.append(", sportId=");
        sb.append(this.e);
        return rw2.n(sb, this.f, ", subSportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46502a ? 1 : 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d.name());
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }
}
