package org.xplatform.make_bet.impl.presentation.model;

import a.axq;
import a.brm0;
import a.okc;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CoefStepInputUiModel implements Parcelable {
    public static final Parcelable.Creator<CoefStepInputUiModel> CREATOR = new okc((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f46771a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public CoefStepInputUiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, boolean z, boolean z2, boolean z3, boolean z4) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        this.f46771a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = bigDecimal5;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static CoefStepInputUiModel a(CoefStepInputUiModel coefStepInputUiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            bigDecimal = coefStepInputUiModel.f46771a;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        if ((i & 2) != 0) {
            bigDecimal2 = coefStepInputUiModel.b;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = coefStepInputUiModel.c;
        BigDecimal bigDecimal6 = coefStepInputUiModel.d;
        BigDecimal bigDecimal7 = coefStepInputUiModel.e;
        if ((i & 32) != 0) {
            z = coefStepInputUiModel.f;
        }
        boolean z5 = z;
        boolean z6 = (i & 64) != 0 ? coefStepInputUiModel.g : z2;
        boolean z7 = (i & 128) != 0 ? coefStepInputUiModel.h : z3;
        boolean z8 = (i & 256) != 0 ? coefStepInputUiModel.i : z4;
        coefStepInputUiModel.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        bigDecimal6.getClass();
        bigDecimal7.getClass();
        return new CoefStepInputUiModel(bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, z5, z6, z7, z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoefStepInputUiModel)) {
            return false;
        }
        CoefStepInputUiModel coefStepInputUiModel = (CoefStepInputUiModel) obj;
        return Intrinsics.d(this.f46771a, coefStepInputUiModel.f46771a) && Intrinsics.d(this.b, coefStepInputUiModel.b) && Intrinsics.d(this.c, coefStepInputUiModel.c) && Intrinsics.d(this.d, coefStepInputUiModel.d) && Intrinsics.d(this.e, coefStepInputUiModel.e) && this.f == coefStepInputUiModel.f && this.g == coefStepInputUiModel.g && this.h == coefStepInputUiModel.h && this.i == coefStepInputUiModel.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(brm0.e(axq.a(axq.a(axq.a(axq.a(this.f46771a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoefStepInputUiModel(currentValue=");
        sb.append(this.f46771a);
        sb.append(", initValue=");
        sb.append(this.b);
        sb.append(", stepValue=");
        sb.append(this.c);
        sb.append(", minValue=");
        sb.append(this.d);
        sb.append(", maxValue=");
        sb.append(this.e);
        sb.append(", isUserInput=");
        sb.append(this.f);
        sb.append(", maxHintIsVisible=");
        ua80.u(", minHintIsVisible=", ", isSavedStateModel=", sb, this.g, this.h);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46771a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
