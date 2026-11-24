package org.xplatform.coupon.impl.generate_coupon.presentation.model.compose;

import a.kng0;
import a.rw2;
import a.twn;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GenerateCouponTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<GenerateCouponTypeUiModel> CREATOR = new yoo((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46470a;
    public final int b;
    public final boolean c;

    public GenerateCouponTypeUiModel(String str, int i, boolean z) {
        str.getClass();
        this.f46470a = str;
        this.b = i;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateCouponTypeUiModel)) {
            return false;
        }
        GenerateCouponTypeUiModel generateCouponTypeUiModel = (GenerateCouponTypeUiModel) obj;
        return Intrinsics.d(this.f46470a, generateCouponTypeUiModel.f46470a) && this.b == generateCouponTypeUiModel.b && this.c == generateCouponTypeUiModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f46470a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.p(this.b, "GenerateCouponTypeUiModel(title=", this.f46470a, ", id=", ", isSelected="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46470a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
