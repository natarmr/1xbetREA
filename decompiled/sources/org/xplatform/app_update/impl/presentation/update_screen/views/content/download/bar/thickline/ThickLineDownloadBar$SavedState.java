package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline;

import a.axq;
import a.kng0;
import a.twn;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/ThickLineDownloadBar$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class ThickLineDownloadBar$SavedState implements Parcelable {
    public static final Parcelable.Creator<ThickLineDownloadBar$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46333a;
    public final int b;
    public final int c;
    public final int d;
    public final RectF e;
    public final ColorStateList f;
    public final float g;

    public ThickLineDownloadBar$SavedState(Parcelable parcelable, int i, int i2, int i3, RectF rectF, ColorStateList colorStateList, float f) {
        rectF.getClass();
        this.f46333a = parcelable;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = rectF;
        this.f = colorStateList;
        this.g = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThickLineDownloadBar$SavedState)) {
            return false;
        }
        ThickLineDownloadBar$SavedState thickLineDownloadBar$SavedState = (ThickLineDownloadBar$SavedState) obj;
        return Intrinsics.d(this.f46333a, thickLineDownloadBar$SavedState.f46333a) && this.b == thickLineDownloadBar$SavedState.b && this.c == thickLineDownloadBar$SavedState.c && this.d == thickLineDownloadBar$SavedState.d && Intrinsics.d(this.e, thickLineDownloadBar$SavedState.e) && Intrinsics.d(this.f, thickLineDownloadBar$SavedState.f) && Float.compare(this.g, thickLineDownloadBar$SavedState.g) == 0;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f46333a;
        int iHashCode = (this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, (parcelable == null ? 0 : parcelable.hashCode()) * 31, 31), 31), 31)) * 31;
        ColorStateList colorStateList = this.f;
        return Float.hashCode(this.g) + ((iHashCode + (colorStateList != null ? colorStateList.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(parentState=");
        sb.append(this.f46333a);
        sb.append(", currentValue=");
        sb.append(this.b);
        sb.append(", valueFrom=");
        axq.r(this.c, this.d, ", valueTo=", ", primaryLineRectF=", sb);
        sb.append(this.e);
        sb.append(", primaryLineColorStateList=");
        sb.append(this.f);
        sb.append(", primaryLineCornerRadius=");
        return kng0.o(sb, this.g, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46333a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeFloat(this.g);
    }
}
