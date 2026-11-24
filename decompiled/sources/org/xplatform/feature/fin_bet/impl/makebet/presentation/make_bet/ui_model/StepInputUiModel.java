package org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model;

import a.brm0;
import a.lbi0;
import a.ohs0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StepInputUiModel implements Parcelable {
    public static final Parcelable.Creator<StepInputUiModel> CREATOR = new lbi0((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f46647a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public StepInputUiModel(double d, double d2, double d3, double d4, double d5, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.f46647a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
    }

    public static StepInputUiModel a(StepInputUiModel stepInputUiModel, double d, double d2, double d3, double d4, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        double d5 = (i & 1) != 0 ? stepInputUiModel.f46647a : d;
        double d6 = (i & 2) != 0 ? stepInputUiModel.b : d2;
        double d7 = (i & 4) != 0 ? stepInputUiModel.c : d3;
        double d8 = (i & 8) != 0 ? stepInputUiModel.d : d4;
        double d9 = stepInputUiModel.e;
        String str2 = (i & 32) != 0 ? stepInputUiModel.f : str;
        boolean z7 = stepInputUiModel.g;
        boolean z8 = (i & 128) != 0 ? stepInputUiModel.h : z;
        boolean z9 = (i & 256) != 0 ? stepInputUiModel.i : z2;
        boolean z10 = (i & 512) != 0 ? stepInputUiModel.j : z3;
        boolean z11 = (i & 1024) != 0 ? stepInputUiModel.k : z4;
        boolean z12 = (i & 2048) != 0 ? stepInputUiModel.l : z5;
        boolean z13 = (i & 4096) != 0 ? stepInputUiModel.m : z6;
        stepInputUiModel.getClass();
        str2.getClass();
        return new StepInputUiModel(d5, d6, d7, d8, d9, str2, z7, z8, z9, z10, z11, z12, z13);
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
        return Double.compare(this.f46647a, stepInputUiModel.f46647a) == 0 && Double.compare(this.b, stepInputUiModel.b) == 0 && Double.compare(this.c, stepInputUiModel.c) == 0 && Double.compare(this.d, stepInputUiModel.d) == 0 && Double.compare(this.e, stepInputUiModel.e) == 0 && Intrinsics.d(this.f, stepInputUiModel.f) && this.g == stepInputUiModel.g && this.h == stepInputUiModel.h && this.i == stepInputUiModel.i && this.j == stepInputUiModel.j && this.k == stepInputUiModel.k && this.l == stepInputUiModel.l && this.m == stepInputUiModel.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f46647a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f46647a, "StepInputUiModel(currentValue=", ", initValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", stepValue=", ", minValue=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", maxValue=", ", currencySymbol=");
        brm0.C(this.f, ", isUnlimitedBet=", ", hasInitValue=", sbP, this.g);
        ua80.u(", isActionButtonEnabled=", ", isUserInput=", sbP, this.h, this.i);
        ua80.u(", isStepControlsVisible=", ", isSavedStateModel=", sbP, this.j, this.k);
        return ohs0.p(", marketIsOpen=", Separators.RPAREN, sbP, this.l, this.m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.f46647a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
    }
}
