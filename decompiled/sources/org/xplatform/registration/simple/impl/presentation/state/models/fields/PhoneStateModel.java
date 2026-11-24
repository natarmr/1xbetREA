package org.xplatform.registration.simple.impl.presentation.state.models.fields;

import a.axq;
import a.b1j;
import a.brm0;
import a.d860;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhoneStateModel implements Parcelable {
    public static final Parcelable.Creator<PhoneStateModel> CREATOR = new d860((byte) 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46856a;
    public final String b;
    public final String c;

    public PhoneStateModel(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f46856a = str;
        this.b = str2;
        this.c = str3;
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
        return Intrinsics.d(this.f46856a, phoneStateModel.f46856a) && Intrinsics.d(this.b, phoneStateModel.b) && Intrinsics.d(this.c, phoneStateModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f46856a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PhoneStateModel(phone=", this.f46856a, ", phoneCode=", this.b, ", rawPhoneMask="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46856a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
