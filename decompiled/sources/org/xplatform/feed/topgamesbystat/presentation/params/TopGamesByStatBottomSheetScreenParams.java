package org.xplatform.feed.topgamesbystat.presentation.params;

import a.cs0;
import a.dw9;
import a.kng0;
import a.l7n0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopGamesByStatBottomSheetScreenParams implements Parcelable {
    public static final Parcelable.Creator<TopGamesByStatBottomSheetScreenParams> CREATOR = new l7n0((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46683a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public TopGamesByStatBottomSheetScreenParams(long j, long j2, long j3, String str, List list, boolean z) {
        list.getClass();
        str.getClass();
        this.f46683a = z;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopGamesByStatBottomSheetScreenParams)) {
            return false;
        }
        TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = (TopGamesByStatBottomSheetScreenParams) obj;
        return this.f46683a == topGamesByStatBottomSheetScreenParams.f46683a && Intrinsics.d(this.b, topGamesByStatBottomSheetScreenParams.b) && this.c == topGamesByStatBottomSheetScreenParams.c && this.d == topGamesByStatBottomSheetScreenParams.d && this.e == topGamesByStatBottomSheetScreenParams.e && Intrinsics.d(this.f, topGamesByStatBottomSheetScreenParams.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(rw2.b(rw2.b(dw9.a(Boolean.hashCode(this.f46683a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopGamesByStatBottomSheetScreenParams(live=");
        sb.append(this.f46683a);
        sb.append(", sportIds=");
        sb.append(this.b);
        sb.append(", gameId=");
        sb.append(this.c);
        kng0.A(sb, ", gameSportId=", this.d, ", subSportId=");
        kng0.z(sb, this.e, ", screenType=", this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46683a ? 1 : 0);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
    }
}
