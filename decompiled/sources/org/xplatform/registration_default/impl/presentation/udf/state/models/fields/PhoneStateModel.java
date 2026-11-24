package org.xplatform.registration_default.impl.presentation.udf.state.models.fields;

import a.b1j;
import a.brm0;
import a.d860;
import a.kng0;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhoneStateModel implements Parcelable {
    public static final Parcelable.Creator<PhoneStateModel> CREATOR = new d860((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46877a;
    public final String b;
    public final String c;
    public final Integer d;

    public PhoneStateModel(String str, String str2, String str3, Integer num) {
        brm0.B(str, str2, str3);
        this.f46877a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneStateModel)) {
            return false;
        }
        PhoneStateModel phoneStateModel = (PhoneStateModel) obj;
        return Intrinsics.d(this.f46877a, phoneStateModel.f46877a) && Intrinsics.d(this.b, phoneStateModel.b) && Intrinsics.d(this.c, phoneStateModel.c) && Intrinsics.d(this.d, phoneStateModel.d);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f46877a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", maxMaskLength=", Separators.RPAREN, b1j.n("PhoneStateModel(phone=", this.f46877a, ", phoneCode=", this.b, ", rawPhoneMask="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46877a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num);
        }
    }
}
