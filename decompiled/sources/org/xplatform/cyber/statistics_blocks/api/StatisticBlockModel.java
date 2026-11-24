package org.xplatform.cyber.statistics_blocks.api;

import a.a8z;
import a.ahi0;
import a.lbi0;
import a.m2x;
import a.maz;
import a.rw2;
import a.t9m0;
import a.twn;
import a.wez;
import a.x9m0;
import a.y9m0;
import a.z9m0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;", "Landroid/os/Parcelable;", "Companion", "a/y9m0", "a/z9m0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StatisticBlockModel implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f46623a;
    public final int b;
    public final boolean c;
    public static final z9m0 Companion = new z9m0();
    public static final Parcelable.Creator<StatisticBlockModel> CREATOR = new lbi0(20);
    public static final a8z[] d = {maz.a(wez.f39042a, new x9m0(0)), null, null};

    public /* synthetic */ StatisticBlockModel(int i, t9m0 t9m0Var, int i2, boolean z) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, y9m0.f42256a.getDescriptor());
            throw null;
        }
        this.f46623a = t9m0Var;
        this.b = i2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticBlockModel)) {
            return false;
        }
        StatisticBlockModel statisticBlockModel = (StatisticBlockModel) obj;
        return this.f46623a == statisticBlockModel.f46623a && this.b == statisticBlockModel.b && this.c == statisticBlockModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f46623a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticBlockModel(statId=");
        sb.append(this.f46623a);
        sb.append(", statPosition=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46623a.name());
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public StatisticBlockModel(t9m0 t9m0Var, int i, boolean z) {
        t9m0Var.getClass();
        this.f46623a = t9m0Var;
        this.b = i;
        this.c = z;
    }
}
