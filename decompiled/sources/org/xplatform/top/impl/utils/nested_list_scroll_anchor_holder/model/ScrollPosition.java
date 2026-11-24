package org.xplatform.top.impl.utils.nested_list_scroll_anchor_holder.model;

import a.rz4;
import a.sne0;
import a.twn;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;", "Landroid/os/Parcelable;", TokenNames.K, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ScrollPosition<K extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ScrollPosition<?>> CREATOR = new sne0((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f47160a;
    public final int b;
    public final int c;

    public ScrollPosition(Parcelable parcelable, int i, int i2) {
        parcelable.getClass();
        this.f47160a = parcelable;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollPosition)) {
            return false;
        }
        ScrollPosition scrollPosition = (ScrollPosition) obj;
        return Intrinsics.d(this.f47160a, scrollPosition.f47160a) && this.b == scrollPosition.b && this.c == scrollPosition.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f47160a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollPosition(key=");
        sb.append(this.f47160a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", offset=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47160a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
