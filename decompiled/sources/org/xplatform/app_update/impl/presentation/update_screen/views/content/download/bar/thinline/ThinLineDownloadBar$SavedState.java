package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline;

import a.axq;
import a.brm0;
import a.rw2;
import a.twn;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/ThinLineDownloadBar$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class ThinLineDownloadBar$SavedState implements Parcelable {
    public static final Parcelable.Creator<ThinLineDownloadBar$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46337a;
    public final RectF b;
    public final ColorStateList c;
    public final RectF d;
    public final ColorStateList e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;

    public ThinLineDownloadBar$SavedState(Parcelable parcelable, RectF rectF, ColorStateList colorStateList, RectF rectF2, ColorStateList colorStateList2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, boolean z2) {
        rectF.getClass();
        rectF2.getClass();
        this.f46337a = parcelable;
        this.b = rectF;
        this.c = colorStateList;
        this.d = rectF2;
        this.e = colorStateList2;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = z;
        this.q = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThinLineDownloadBar$SavedState)) {
            return false;
        }
        ThinLineDownloadBar$SavedState thinLineDownloadBar$SavedState = (ThinLineDownloadBar$SavedState) obj;
        return Intrinsics.d(this.f46337a, thinLineDownloadBar$SavedState.f46337a) && Intrinsics.d(this.b, thinLineDownloadBar$SavedState.b) && Intrinsics.d(this.c, thinLineDownloadBar$SavedState.c) && Intrinsics.d(this.d, thinLineDownloadBar$SavedState.d) && Intrinsics.d(this.e, thinLineDownloadBar$SavedState.e) && this.f == thinLineDownloadBar$SavedState.f && this.g == thinLineDownloadBar$SavedState.g && this.h == thinLineDownloadBar$SavedState.h && this.i == thinLineDownloadBar$SavedState.i && this.j == thinLineDownloadBar$SavedState.j && this.k == thinLineDownloadBar$SavedState.k && this.l == thinLineDownloadBar$SavedState.l && this.m == thinLineDownloadBar$SavedState.m && this.n == thinLineDownloadBar$SavedState.n && this.o == thinLineDownloadBar$SavedState.o && this.p == thinLineDownloadBar$SavedState.p && this.q == thinLineDownloadBar$SavedState.q;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f46337a;
        int iHashCode = (this.b.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31)) * 31;
        ColorStateList colorStateList = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31)) * 31;
        ColorStateList colorStateList2 = this.e;
        return Boolean.hashCode(this.q) + brm0.e(twn.a(this.o, twn.a(this.n, twn.a(this.m, twn.a(this.l, twn.a(this.k, twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, (iHashCode2 + (colorStateList2 != null ? colorStateList2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(parentState=");
        sb.append(this.f46337a);
        sb.append(", primaryLineRectF=");
        sb.append(this.b);
        sb.append(", primaryLineColorStateList=");
        sb.append(this.c);
        sb.append(", secondaryLineRectF=");
        sb.append(this.d);
        sb.append(", secondaryLineColorStateList=");
        sb.append(this.e);
        sb.append(", secondaryLineHeight=");
        sb.append(this.f);
        sb.append(", secondaryLineWidth=");
        axq.r(this.g, this.h, ", currentValue=", ", valueFrom=", sb);
        axq.r(this.i, this.j, ", valueTo=", ", thumbWidth=", sb);
        axq.r(this.k, this.l, ", thumbHeight=", ", thumbOffset=", sb);
        axq.r(this.m, this.n, ", thumbRadius=", ", maxThumbRadius=", sb);
        brm0.w(this.o, ", isThumbWithinSecondaryLineBounds=", ", isDynamicThumbRadius=", sb, this.p);
        return rw2.p(sb, this.q, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46337a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
    }
}
