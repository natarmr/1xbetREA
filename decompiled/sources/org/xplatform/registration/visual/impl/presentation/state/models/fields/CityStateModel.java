package org.xplatform.registration.visual.impl.presentation.state.models.fields;

import a.okc;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CityStateModel implements Parcelable {
    public static final Parcelable.Creator<CityStateModel> CREATOR = new okc((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46862a;
    public final String b;

    public CityStateModel(int i, String str) {
        str.getClass();
        this.f46862a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityStateModel)) {
            return false;
        }
        CityStateModel cityStateModel = (CityStateModel) obj;
        return this.f46862a == cityStateModel.f46862a && Intrinsics.d(this.b, cityStateModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f46862a) * 31);
    }

    public final String toString() {
        return c.b(this.f46862a, "CityStateModel(id=", ", cityName=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46862a);
        parcel.writeString(this.b);
    }
}
