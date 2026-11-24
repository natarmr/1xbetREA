package org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params;

import a.brm0;
import a.jhq0;
import a.kng0;
import a.rw2;
import a.sne0;
import a.ua80;
import a.ygq0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectTimeFilterScreenParams implements Parcelable {
    public static final Parcelable.Creator<SelectTimeFilterScreenParams> CREATOR = new sne0((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f46663a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final Date f;
    public final boolean g;
    public final jhq0 h;

    public SelectTimeFilterScreenParams(ygq0 ygq0Var, long j, long j2, boolean z, boolean z2, Date date, boolean z3, jhq0 jhq0Var) {
        ygq0Var.getClass();
        date.getClass();
        jhq0Var.getClass();
        this.f46663a = ygq0Var;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = z2;
        this.f = date;
        this.g = z3;
        this.h = jhq0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectTimeFilterScreenParams)) {
            return false;
        }
        SelectTimeFilterScreenParams selectTimeFilterScreenParams = (SelectTimeFilterScreenParams) obj;
        return this.f46663a == selectTimeFilterScreenParams.f46663a && this.b == selectTimeFilterScreenParams.b && this.c == selectTimeFilterScreenParams.c && this.d == selectTimeFilterScreenParams.d && this.e == selectTimeFilterScreenParams.e && Intrinsics.d(this.f, selectTimeFilterScreenParams.f) && this.g == selectTimeFilterScreenParams.g && this.h == selectTimeFilterScreenParams.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(brm0.i(this.f, brm0.e(brm0.e(rw2.b(rw2.b(this.f46663a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectTimeFilterScreenParams(timeFilter=");
        sb.append(this.f46663a);
        sb.append(", startTime=");
        sb.append(this.b);
        kng0.A(sb, ", endTime=", this.c, ", isAscendingDate=");
        ua80.u(", cyber=", ", dateLimit=", sb, this.d, this.e);
        sb.append(this.f);
        sb.append(", limit=");
        sb.append(this.g);
        sb.append(", timeFilterPeriodType=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46663a.name());
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeSerializable(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h.name());
    }
}
