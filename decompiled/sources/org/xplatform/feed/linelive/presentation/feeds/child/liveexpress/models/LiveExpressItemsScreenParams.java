package org.xplatform.feed.linelive.presentation.feeds.child.liveexpress.models;

import a.aj00;
import a.f140;
import a.imw;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveExpressItemsScreenParams implements Parcelable {
    public static final Parcelable.Creator<LiveExpressItemsScreenParams> CREATOR = new imw((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46667a;
    public final aj00 b;
    public final String c;
    public final String d;

    public LiveExpressItemsScreenParams(long j, aj00 aj00Var, String str, String str2) {
        aj00Var.getClass();
        str.getClass();
        str2.getClass();
        this.f46667a = j;
        this.b = aj00Var;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveExpressItemsScreenParams)) {
            return false;
        }
        LiveExpressItemsScreenParams liveExpressItemsScreenParams = (LiveExpressItemsScreenParams) obj;
        return this.f46667a == liveExpressItemsScreenParams.f46667a && Intrinsics.d(this.b, liveExpressItemsScreenParams.b) && Intrinsics.d(this.c, liveExpressItemsScreenParams.c) && Intrinsics.d(this.d, liveExpressItemsScreenParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f46667a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExpressItemsScreenParams(sportId=");
        sb.append(this.f46667a);
        sb.append(", tabType=");
        sb.append(this.b);
        f140.v(sb, ", title=", this.c, ", componentKey=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46667a);
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
