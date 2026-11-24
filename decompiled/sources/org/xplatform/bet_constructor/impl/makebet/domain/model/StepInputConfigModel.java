package org.xplatform.bet_constructor.impl.makebet.domain.model;

import a.brm0;
import a.f140;
import a.kng0;
import a.lbi0;
import a.ohs0;
import a.rw2;
import a.ua80;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StepInputConfigModel implements Parcelable {
    public static final Parcelable.Creator<StepInputConfigModel> CREATOR = new lbi0((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f46382a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public StepInputConfigModel(double d, double d2, double d3, double d4, double d5, long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.f46382a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = j;
        this.g = str;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
    }

    public static StepInputConfigModel a(StepInputConfigModel stepInputConfigModel, double d, double d2, double d3, double d4, double d5, long j, String str, boolean z, boolean z2, boolean z3, int i) {
        double d6 = (i & 1) != 0 ? stepInputConfigModel.f46382a : d;
        double d7 = (i & 2) != 0 ? stepInputConfigModel.b : d2;
        double d8 = (i & 4) != 0 ? stepInputConfigModel.c : d3;
        double d9 = (i & 8) != 0 ? stepInputConfigModel.d : d4;
        double d10 = (i & 16) != 0 ? stepInputConfigModel.e : d5;
        long j2 = (i & 32) != 0 ? stepInputConfigModel.f : j;
        String str2 = (i & 64) != 0 ? stepInputConfigModel.g : str;
        boolean z4 = (i & 128) != 0 ? stepInputConfigModel.h : true;
        boolean z5 = (i & 256) != 0 ? stepInputConfigModel.i : z;
        boolean z6 = (i & 512) != 0 ? stepInputConfigModel.j : z2;
        boolean z7 = stepInputConfigModel.k;
        boolean z8 = (i & 2048) != 0 ? stepInputConfigModel.l : z3;
        stepInputConfigModel.getClass();
        str2.getClass();
        return new StepInputConfigModel(d6, d7, d8, d9, d10, j2, str2, z4, z5, z6, z7, z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepInputConfigModel)) {
            return false;
        }
        StepInputConfigModel stepInputConfigModel = (StepInputConfigModel) obj;
        return Double.compare(this.f46382a, stepInputConfigModel.f46382a) == 0 && Double.compare(this.b, stepInputConfigModel.b) == 0 && Double.compare(this.c, stepInputConfigModel.c) == 0 && Double.compare(this.d, stepInputConfigModel.d) == 0 && Double.compare(this.e, stepInputConfigModel.e) == 0 && this.f == stepInputConfigModel.f && Intrinsics.d(this.g, stepInputConfigModel.g) && this.h == stepInputConfigModel.h && this.i == stepInputConfigModel.i && this.j == stepInputConfigModel.j && this.k == stepInputConfigModel.k && this.l == stepInputConfigModel.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f46382a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f46382a, "StepInputConfigModel(currentValue=", ", initValue=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", stepValue=", ", minValue=");
        sbP.append(this.d);
        ohs0.A(sbP, this.e, ", maxValue=", ", balanceId=");
        kng0.z(sbP, this.f, ", currencySymbol=", this.g);
        w6x.A(", fromSavedInstance=", ", hasInitialBet=", sbP, this.h, this.i);
        w6x.A(", isLoading=", ", isAutoMax=", sbP, this.j, this.k);
        return f140.n(sbP, ", isStepActionButtonVisible=", this.l, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.f46382a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }
}
