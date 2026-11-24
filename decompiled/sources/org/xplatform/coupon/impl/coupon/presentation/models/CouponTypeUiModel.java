package org.xplatform.coupon.impl.coupon.presentation.models;

import a.brm0;
import a.ohs0;
import a.okc;
import a.p6t0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/coupon/impl/coupon/presentation/models/CouponTypeUiModel;", "La/p6t0;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CouponTypeUiModel implements p6t0, Parcelable {
    public static final Parcelable.Creator<CouponTypeUiModel> CREATOR = new okc((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46469a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public CouponTypeUiModel(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f46469a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponTypeUiModel)) {
            return false;
        }
        CouponTypeUiModel couponTypeUiModel = (CouponTypeUiModel) obj;
        return Intrinsics.d(this.f46469a, couponTypeUiModel.f46469a) && this.b == couponTypeUiModel.b && this.c == couponTypeUiModel.c && this.d == couponTypeUiModel.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof CouponTypeUiModel) && (p6t0Var2 instanceof CouponTypeUiModel)) {
            return Intrinsics.d(((CouponTypeUiModel) p6t0Var).f46469a, ((CouponTypeUiModel) p6t0Var2).f46469a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f46469a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        return ohs0.p(", lastItem=", Separators.RPAREN, brm0.u("CouponTypeUiModel(title=", this.f46469a, ", selected=", this.b, ", enabled="), this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46469a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
