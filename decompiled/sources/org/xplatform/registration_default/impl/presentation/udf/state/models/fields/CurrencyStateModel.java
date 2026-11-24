package org.xplatform.registration_default.impl.presentation.udf.state.models.fields;

import a.axq;
import a.okc;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CurrencyStateModel implements Parcelable {
    public static final Parcelable.Creator<CurrencyStateModel> CREATOR = new okc((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46875a;
    public final String b;
    public final String c;

    public CurrencyStateModel(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46875a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyStateModel)) {
            return false;
        }
        CurrencyStateModel currencyStateModel = (CurrencyStateModel) obj;
        return this.f46875a == currencyStateModel.f46875a && Intrinsics.d(this.b, currencyStateModel.b) && Intrinsics.d(this.c, currencyStateModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f46875a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f46875a, "CurrencyStateModel(id=", ", name=", this.b, ", code="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46875a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
