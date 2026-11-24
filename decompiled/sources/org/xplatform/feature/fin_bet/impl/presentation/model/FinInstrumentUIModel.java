package org.xplatform.feature.fin_bet.impl.presentation.model;

import a.fcq;
import a.rw2;
import a.twn;
import a.ua80;
import a.vqd;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FinInstrumentUIModel implements Parcelable {
    public static final Parcelable.Creator<FinInstrumentUIModel> CREATOR = new yoo((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46648a;
    public final String b;
    public final int c;
    public final fcq d;
    public final boolean e;

    public FinInstrumentUIModel(int i, String str, int i2, fcq fcqVar, boolean z) {
        str.getClass();
        fcqVar.getClass();
        this.f46648a = i;
        this.b = str;
        this.c = i2;
        this.d = fcqVar;
        this.e = z;
    }

    public static FinInstrumentUIModel a(FinInstrumentUIModel finInstrumentUIModel, boolean z) {
        int i = finInstrumentUIModel.f46648a;
        String str = finInstrumentUIModel.b;
        int i2 = finInstrumentUIModel.c;
        fcq fcqVar = finInstrumentUIModel.d;
        str.getClass();
        fcqVar.getClass();
        return new FinInstrumentUIModel(i, str, i2, fcqVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinInstrumentUIModel)) {
            return false;
        }
        FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj;
        return this.f46648a == finInstrumentUIModel.f46648a && Intrinsics.d(this.b, finInstrumentUIModel.b) && this.c == finInstrumentUIModel.c && this.d == finInstrumentUIModel.d && this.e == finInstrumentUIModel.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + twn.a(this.c, ua80.b(Integer.hashCode(this.f46648a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46648a, "FinInstrumentUIModel(id=", ", name=", this.b, ", decimals=");
        sbR.append(this.c);
        sbR.append(", type=");
        sbR.append(this.d);
        sbR.append(", selected=");
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46648a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
    }
}
