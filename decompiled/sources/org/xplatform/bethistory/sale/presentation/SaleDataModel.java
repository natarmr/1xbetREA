package org.xplatform.bethistory.sale.presentation;

import a.axq;
import a.brm0;
import a.ohs0;
import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SaleDataModel implements Parcelable {
    public static final Parcelable.Creator<SaleDataModel> CREATOR = new sne0(17);
    public static final SaleDataModel m = new SaleDataModel(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f46415a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;

    public SaleDataModel(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        this.f46415a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
        this.j = d10;
        this.k = d11;
        this.l = d12;
    }

    public static SaleDataModel a(SaleDataModel saleDataModel, double d, double d2, double d3, double d4, double d5, double d6, int i) {
        double d7 = saleDataModel.f46415a;
        double d8 = (i & 2) != 0 ? saleDataModel.b : d;
        double d9 = (i & 4) != 0 ? saleDataModel.c : d2;
        double d10 = (i & 8) != 0 ? saleDataModel.d : d3;
        double d11 = (i & 16) != 0 ? saleDataModel.e : d4;
        double d12 = saleDataModel.f;
        double d13 = d8;
        double d14 = d9;
        double d15 = d10;
        double d16 = d11;
        double d17 = saleDataModel.g;
        double d18 = (i & 128) != 0 ? saleDataModel.h : d5;
        double d19 = saleDataModel.i;
        double d20 = saleDataModel.j;
        double d21 = saleDataModel.k;
        double d22 = (i & 2048) != 0 ? saleDataModel.l : d6;
        saleDataModel.getClass();
        return new SaleDataModel(d7, d13, d14, d15, d16, d12, d17, d18, d19, d20, d21, d22);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleDataModel)) {
            return false;
        }
        SaleDataModel saleDataModel = (SaleDataModel) obj;
        return Double.compare(this.f46415a, saleDataModel.f46415a) == 0 && Double.compare(this.b, saleDataModel.b) == 0 && Double.compare(this.c, saleDataModel.c) == 0 && Double.compare(this.d, saleDataModel.d) == 0 && Double.compare(this.e, saleDataModel.e) == 0 && Double.compare(this.f, saleDataModel.f) == 0 && Double.compare(this.g, saleDataModel.g) == 0 && Double.compare(this.h, saleDataModel.h) == 0 && Double.compare(this.i, saleDataModel.i) == 0 && Double.compare(this.j, saleDataModel.j) == 0 && Double.compare(this.k, saleDataModel.k) == 0 && Double.compare(this.l, saleDataModel.l) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.l) + brm0.d(this.k, brm0.d(this.j, brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f46415a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f46415a, "SaleDataModel(availableBetSum=", ", limitSumPartSale=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", maxSaleSum=", ", minSaleSum=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", currentSaleSum=", ", minAutoSaleOrder=");
        sbP.append(this.f);
        ohs0.A(sbP, this.g, ", maxAutoSaleOrder=", ", currentAutoSaleSum=");
        sbP.append(this.h);
        ohs0.A(sbP, this.i, ", minBetSum=", ", minBetValue=");
        sbP.append(this.j);
        ohs0.A(sbP, this.k, ", maxBetValue=", ", currentBetSum=");
        return axq.l(sbP, this.l, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.f46415a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        parcel.writeDouble(this.h);
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.j);
        parcel.writeDouble(this.k);
        parcel.writeDouble(this.l);
    }
}
