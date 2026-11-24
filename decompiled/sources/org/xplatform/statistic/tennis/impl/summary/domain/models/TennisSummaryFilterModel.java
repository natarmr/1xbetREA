package org.xplatform.statistic.tennis.impl.summary.domain.models;

import a.a8z;
import a.ahi0;
import a.l7n0;
import a.m2x;
import a.maz;
import a.mhp0;
import a.vxp0;
import a.wez;
import a.wxp0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;", "Landroid/os/Parcelable;", "Companion", "a/wxp0", "a/vxp0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TennisSummaryFilterModel implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47097a;
    public final TennisSurfaceType b;
    public static final wxp0 Companion = new wxp0();
    public static final Parcelable.Creator<TennisSummaryFilterModel> CREATOR = new l7n0((byte) 16);
    public static final a8z[] c = {null, maz.a(wez.f39042a, new mhp0(26))};
    public static final TennisSummaryFilterModel d = new TennisSummaryFilterModel("", TennisSurfaceType.UNKNOWN);

    public /* synthetic */ TennisSummaryFilterModel(int i, String str, TennisSurfaceType tennisSurfaceType) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, vxp0.f38212a.getDescriptor());
            throw null;
        }
        this.f47097a = str;
        this.b = tennisSurfaceType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TennisSummaryFilterModel)) {
            return false;
        }
        TennisSummaryFilterModel tennisSummaryFilterModel = (TennisSummaryFilterModel) obj;
        return Intrinsics.d(this.f47097a, tennisSummaryFilterModel.f47097a) && this.b == tennisSummaryFilterModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f47097a.hashCode() * 31);
    }

    public final String toString() {
        return "TennisSummaryFilterModel(season=" + this.f47097a + ", surfaceType=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47097a);
        this.b.writeToParcel(parcel, i);
    }

    public TennisSummaryFilterModel(String str, TennisSurfaceType tennisSurfaceType) {
        str.getClass();
        tennisSurfaceType.getClass();
        this.f47097a = str;
        this.b = tennisSurfaceType;
    }
}
