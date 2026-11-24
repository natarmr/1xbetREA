package org.xplatform.coupon.impl.make_bet.presentation.model;

import a.ibw0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AutoMaxUiModel implements Parcelable {
    public static final Parcelable.Creator<AutoMaxUiModel> CREATOR = new ibw0((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46472a;
    public final double b;

    public AutoMaxUiModel(double d, boolean z) {
        this.f46472a = z;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoMaxUiModel)) {
            return false;
        }
        AutoMaxUiModel autoMaxUiModel = (AutoMaxUiModel) obj;
        return this.f46472a == autoMaxUiModel.f46472a && Double.compare(this.b, autoMaxUiModel.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Boolean.hashCode(this.f46472a) * 31);
    }

    public final String toString() {
        return "AutoMaxUiModel(isAutoMaxEnabled=" + this.f46472a + ", autoMaxValue=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46472a ? 1 : 0);
        parcel.writeDouble(this.b);
    }
}
