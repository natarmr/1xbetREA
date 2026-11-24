package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle;

import a.axq;
import a.njc;
import a.twn;
import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/CircleDownloadBar$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class CircleDownloadBar$SavedState implements Parcelable {
    public static final Parcelable.Creator<CircleDownloadBar$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46331a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final RectF g;
    public final PointF h;
    public final njc i;
    public final float j;
    public final float k;
    public final float l;

    public CircleDownloadBar$SavedState(Parcelable parcelable, int i, int i2, int i3, int i4, int i5, RectF rectF, PointF pointF, njc njcVar, float f, float f2, float f3) {
        rectF.getClass();
        pointF.getClass();
        njcVar.getClass();
        this.f46331a = parcelable;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = rectF;
        this.h = pointF;
        this.i = njcVar;
        this.j = f;
        this.k = f2;
        this.l = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleDownloadBar$SavedState)) {
            return false;
        }
        CircleDownloadBar$SavedState circleDownloadBar$SavedState = (CircleDownloadBar$SavedState) obj;
        return Intrinsics.d(this.f46331a, circleDownloadBar$SavedState.f46331a) && this.b == circleDownloadBar$SavedState.b && this.c == circleDownloadBar$SavedState.c && this.d == circleDownloadBar$SavedState.d && this.e == circleDownloadBar$SavedState.e && this.f == circleDownloadBar$SavedState.f && Intrinsics.d(this.g, circleDownloadBar$SavedState.g) && Intrinsics.d(this.h, circleDownloadBar$SavedState.h) && this.i == circleDownloadBar$SavedState.i && Float.compare(this.j, circleDownloadBar$SavedState.j) == 0 && Float.compare(this.k, circleDownloadBar$SavedState.k) == 0 && Float.compare(this.l, circleDownloadBar$SavedState.l) == 0;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f46331a;
        return Float.hashCode(this.l) + c.a(c.a((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, (parcelable == null ? 0 : parcelable.hashCode()) * 31, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31, this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(parentState=");
        sb.append(this.f46331a);
        sb.append(", currentValue=");
        sb.append(this.b);
        sb.append(", valueFrom=");
        axq.r(this.c, this.d, ", valueTo=", ", viewHeight=", sb);
        axq.r(this.e, this.f, ", viewWidth=", ", circleRectF=", sb);
        sb.append(this.g);
        sb.append(", circleCenter=");
        sb.append(this.h);
        sb.append(", startAngle=");
        sb.append(this.i);
        sb.append(", innerRadius=");
        sb.append(this.j);
        sb.append(", outerRadius=");
        sb.append(this.k);
        sb.append(", lineThickness=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46331a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i.name());
        parcel.writeFloat(this.j);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.l);
    }
}
