package org.xplatform.registration_default.impl.presentation.udf.state.models.fields;

import a.brm0;
import a.okc;
import a.rw2;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CountryStateModel implements Parcelable {
    public static final Parcelable.Creator<CountryStateModel> CREATOR = new okc((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46874a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;

    public CountryStateModel(int i, long j, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f46874a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryStateModel)) {
            return false;
        }
        CountryStateModel countryStateModel = (CountryStateModel) obj;
        return this.f46874a == countryStateModel.f46874a && Intrinsics.d(this.b, countryStateModel.b) && Intrinsics.d(this.c, countryStateModel.c) && this.d == countryStateModel.d && Intrinsics.d(this.e, countryStateModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(ua80.b(ua80.b(Integer.hashCode(this.f46874a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46874a, "CountryStateModel(id=", ", countryName=", this.b, ", fullFlagUrl=");
        c.i(sbR, this.d, this.c, ", currencyId=");
        return rw2.o(sbR, ", countryCode=", this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46874a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
    }
}
