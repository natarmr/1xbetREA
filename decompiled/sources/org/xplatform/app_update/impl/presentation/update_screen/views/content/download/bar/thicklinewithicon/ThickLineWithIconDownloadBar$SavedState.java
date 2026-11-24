package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon;

import a.axq;
import a.ohs0;
import a.twn;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/ThickLineWithIconDownloadBar$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class ThickLineWithIconDownloadBar$SavedState implements Parcelable {
    public static final Parcelable.Creator<ThickLineWithIconDownloadBar$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46335a;
    public final RectF b;
    public final ColorStateList c;
    public final RectF d;
    public final ColorStateList e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;

    public ThickLineWithIconDownloadBar$SavedState(Parcelable parcelable, RectF rectF, ColorStateList colorStateList, RectF rectF2, ColorStateList colorStateList2, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        rectF.getClass();
        rectF2.getClass();
        this.f46335a = parcelable;
        this.b = rectF;
        this.c = colorStateList;
        this.d = rectF2;
        this.e = colorStateList2;
        this.f = i;
        this.g = i2;
        this.h = f;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = i9;
        this.p = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThickLineWithIconDownloadBar$SavedState)) {
            return false;
        }
        ThickLineWithIconDownloadBar$SavedState thickLineWithIconDownloadBar$SavedState = (ThickLineWithIconDownloadBar$SavedState) obj;
        return Intrinsics.d(this.f46335a, thickLineWithIconDownloadBar$SavedState.f46335a) && Intrinsics.d(this.b, thickLineWithIconDownloadBar$SavedState.b) && Intrinsics.d(this.c, thickLineWithIconDownloadBar$SavedState.c) && Intrinsics.d(this.d, thickLineWithIconDownloadBar$SavedState.d) && Intrinsics.d(this.e, thickLineWithIconDownloadBar$SavedState.e) && this.f == thickLineWithIconDownloadBar$SavedState.f && this.g == thickLineWithIconDownloadBar$SavedState.g && Float.compare(this.h, thickLineWithIconDownloadBar$SavedState.h) == 0 && this.i == thickLineWithIconDownloadBar$SavedState.i && this.j == thickLineWithIconDownloadBar$SavedState.j && this.k == thickLineWithIconDownloadBar$SavedState.k && this.l == thickLineWithIconDownloadBar$SavedState.l && this.m == thickLineWithIconDownloadBar$SavedState.m && this.n == thickLineWithIconDownloadBar$SavedState.n && this.o == thickLineWithIconDownloadBar$SavedState.o && this.p == thickLineWithIconDownloadBar$SavedState.p;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f46335a;
        int iHashCode = (this.b.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31)) * 31;
        ColorStateList colorStateList = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31)) * 31;
        ColorStateList colorStateList2 = this.e;
        return Boolean.hashCode(this.p) + twn.a(this.o, twn.a(this.n, twn.a(this.m, twn.a(this.l, twn.a(this.k, twn.a(this.j, twn.a(this.i, c.a(twn.a(this.g, twn.a(this.f, (iHashCode2 + (colorStateList2 != null ? colorStateList2.hashCode() : 0)) * 31, 31), 31), this.h, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(parentState=");
        sb.append(this.f46335a);
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
        sb.append(this.g);
        sb.append(", secondaryLineCornerRadius=");
        sb.append(this.h);
        sb.append(", currentValue=");
        axq.r(this.i, this.j, ", valueFrom=", ", valueTo=", sb);
        axq.r(this.k, this.l, ", thumbWidth=", ", thumbHeight=", sb);
        axq.r(this.m, this.n, ", thumbOffset=", ", thumbRadius=", sb);
        return ohs0.k(this.o, ", isThumbWithinSecondaryLineBounds=", Separators.RPAREN, sb, this.p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46335a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
