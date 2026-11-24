package org.xplatform.coupon.impl.make_bet.presentation.model;

import a.brm0;
import a.lbi0;
import a.ohs0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StepInputUiModel implements Parcelable {
    public static final Parcelable.Creator<StepInputUiModel> CREATOR = new lbi0((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f46474a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final AutoMaxUiModel i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public StepInputUiModel(double d, double d2, double d3, double d4, double d5, String str, boolean z, boolean z2, AutoMaxUiModel autoMaxUiModel, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        autoMaxUiModel.getClass();
        this.f46474a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = autoMaxUiModel;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
    }

    public static StepInputUiModel a(StepInputUiModel stepInputUiModel, double d, double d2, double d3, double d4, double d5, String str, boolean z, boolean z2, AutoMaxUiModel autoMaxUiModel, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        double d6 = (i & 1) != 0 ? stepInputUiModel.f46474a : d;
        double d7 = (i & 2) != 0 ? stepInputUiModel.b : d2;
        double d8 = (i & 4) != 0 ? stepInputUiModel.c : d3;
        double d9 = (i & 8) != 0 ? stepInputUiModel.d : d4;
        double d10 = (i & 16) != 0 ? stepInputUiModel.e : d5;
        String str2 = (i & 32) != 0 ? stepInputUiModel.f : str;
        boolean z10 = (i & 64) != 0 ? stepInputUiModel.g : z;
        boolean z11 = (i & 128) != 0 ? stepInputUiModel.h : z2;
        AutoMaxUiModel autoMaxUiModel2 = (i & 256) != 0 ? stepInputUiModel.i : autoMaxUiModel;
        boolean z12 = (i & 512) != 0 ? stepInputUiModel.j : z3;
        boolean z13 = (i & 1024) != 0 ? stepInputUiModel.k : true;
        boolean z14 = (i & 2048) != 0 ? stepInputUiModel.l : z4;
        boolean z15 = (i & 4096) != 0 ? stepInputUiModel.m : z5;
        boolean z16 = (i & 8192) != 0 ? stepInputUiModel.n : z6;
        boolean z17 = stepInputUiModel.o;
        boolean z18 = (32768 & i) != 0 ? stepInputUiModel.p : z7;
        boolean z19 = (65536 & i) != 0 ? stepInputUiModel.q : z8;
        boolean z20 = (i & 131072) != 0 ? stepInputUiModel.r : z9;
        stepInputUiModel.getClass();
        str2.getClass();
        autoMaxUiModel2.getClass();
        return new StepInputUiModel(d6, d7, d8, d9, d10, str2, z10, z11, autoMaxUiModel2, z12, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public final double b() {
        return this.e / (this.r ? 2.0d : 1.0d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepInputUiModel)) {
            return false;
        }
        StepInputUiModel stepInputUiModel = (StepInputUiModel) obj;
        return Double.compare(this.f46474a, stepInputUiModel.f46474a) == 0 && Double.compare(this.b, stepInputUiModel.b) == 0 && Double.compare(this.c, stepInputUiModel.c) == 0 && Double.compare(this.d, stepInputUiModel.d) == 0 && Double.compare(this.e, stepInputUiModel.e) == 0 && Intrinsics.d(this.f, stepInputUiModel.f) && this.g == stepInputUiModel.g && this.h == stepInputUiModel.h && Intrinsics.d(this.i, stepInputUiModel.i) && this.j == stepInputUiModel.j && this.k == stepInputUiModel.k && this.l == stepInputUiModel.l && this.m == stepInputUiModel.m && this.n == stepInputUiModel.n && this.o == stepInputUiModel.o && this.p == stepInputUiModel.p && this.q == stepInputUiModel.q && this.r == stepInputUiModel.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.i.hashCode() + brm0.e(brm0.e(ua80.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f46474a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f46474a, "StepInputUiModel(currentValue=", ", initValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", stepValue=", ", minValue=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", maxValue=", ", currencySymbol=");
        brm0.C(this.f, ", isUnlimitedBet=", ", hasInitValue=", sbP, this.g);
        sbP.append(this.h);
        sbP.append(", autoMaxModel=");
        sbP.append(this.i);
        sbP.append(", isVisible=");
        ua80.u(", isEditEnabled=", ", isActionButtonEnabled=", sbP, this.j, this.k);
        ua80.u(", isUserInput=", ", isStepControlsVisible=", sbP, this.l, this.m);
        ua80.u(", isVipBet=", ", isSavedStateModel=", sbP, this.n, this.o);
        ua80.u(", isLoading=", ", isEachWay=", sbP, this.p, this.q);
        return rw2.p(sbP, this.r, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.f46474a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        this.i.writeToParcel(parcel, i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
    }
}
