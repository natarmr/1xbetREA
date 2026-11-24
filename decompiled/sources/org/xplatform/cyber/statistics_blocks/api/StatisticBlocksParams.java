package org.xplatform.cyber.statistics_blocks.api;

import a.cs0;
import a.dam0;
import a.dw9;
import a.kng0;
import a.lbi0;
import a.rw2;
import a.sip;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StatisticBlocksParams implements Parcelable {
    public static final Parcelable.Creator<StatisticBlocksParams> CREATOR = new lbi0((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f46624a;
    public final dam0 b;
    public final long c;
    public final long d;
    public final String e;
    public final List f;
    public final List g;

    public StatisticBlocksParams(sip sipVar, dam0 dam0Var, long j, long j2, String str, List list, List list2) {
        sipVar.getClass();
        dam0Var.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f46624a = sipVar;
        this.b = dam0Var;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = list;
        this.g = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticBlocksParams)) {
            return false;
        }
        StatisticBlocksParams statisticBlocksParams = (StatisticBlocksParams) obj;
        return this.f46624a == statisticBlocksParams.f46624a && this.b == statisticBlocksParams.b && this.c == statisticBlocksParams.c && this.d == statisticBlocksParams.d && Intrinsics.d(this.e, statisticBlocksParams.e) && Intrinsics.d(this.f, statisticBlocksParams.f) && Intrinsics.d(this.g, statisticBlocksParams.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(ua80.b(rw2.b(rw2.b((this.b.hashCode() + (this.f46624a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticBlocksParams(feedKind=");
        sb.append(this.f46624a);
        sb.append(", statisticBlockScreenType=");
        sb.append(this.b);
        sb.append(", sportId=");
        sb.append(this.c);
        kng0.A(sb, ", subSportId=", this.d, ", sportName=");
        cs0.y(this.e, ", availableStatsIds=", ", disableStats=", sb, this.f);
        return dw9.r(sb, this.g, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46624a.name());
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        Iterator itT = cs0.t(this.f, parcel);
        while (itT.hasNext()) {
            parcel.writeInt(((Number) itT.next()).intValue());
        }
        Iterator itT2 = cs0.t(this.g, parcel);
        while (itT2.hasNext()) {
            parcel.writeInt(((Number) itT2.next()).intValue());
        }
    }
}
