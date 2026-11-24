package org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params;

import a.brm0;
import a.f140;
import a.j2i0;
import a.sne0;
import a.ua80;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectDateTimeScreenParams implements Parcelable {
    public static final Parcelable.Creator<SelectDateTimeScreenParams> CREATOR = new sne0((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46661a;
    public final Date b;
    public final String c;
    public final j2i0 d;
    public final String e;
    public final boolean f;
    public final Date g;
    public final boolean h;
    public final boolean i;

    public SelectDateTimeScreenParams(long j, Date date, String str, j2i0 j2i0Var, String str2, boolean z, Date date2, boolean z2, boolean z3) {
        date.getClass();
        str.getClass();
        j2i0Var.getClass();
        str2.getClass();
        date2.getClass();
        this.f46661a = j;
        this.b = date;
        this.c = str;
        this.d = j2i0Var;
        this.e = str2;
        this.f = z;
        this.g = date2;
        this.h = z2;
        this.i = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDateTimeScreenParams)) {
            return false;
        }
        SelectDateTimeScreenParams selectDateTimeScreenParams = (SelectDateTimeScreenParams) obj;
        return this.f46661a == selectDateTimeScreenParams.f46661a && Intrinsics.d(this.b, selectDateTimeScreenParams.b) && Intrinsics.d(this.c, selectDateTimeScreenParams.c) && this.d == selectDateTimeScreenParams.d && Intrinsics.d(this.e, selectDateTimeScreenParams.e) && this.f == selectDateTimeScreenParams.f && Intrinsics.d(this.g, selectDateTimeScreenParams.g) && this.h == selectDateTimeScreenParams.h && this.i == selectDateTimeScreenParams.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(brm0.i(this.g, brm0.e(ua80.b((this.d.hashCode() + ua80.b(brm0.i(this.b, Long.hashCode(this.f46661a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectDateTimeScreenParams(chosenDate=");
        sb.append(this.f46661a);
        sb.append(", currentDate=");
        sb.append(this.b);
        sb.append(", requestKey=");
        sb.append(this.c);
        sb.append(", dateType=");
        sb.append(this.d);
        w6x.z(", dismissKey=", this.e, ", isAscendingDate=", sb, this.f);
        sb.append(", dateLimit=");
        sb.append(this.g);
        sb.append(", limit=");
        sb.append(this.h);
        return f140.n(sb, ", onlyDate=", this.i, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46661a);
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
