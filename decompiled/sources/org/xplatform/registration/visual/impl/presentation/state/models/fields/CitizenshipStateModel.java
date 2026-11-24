package org.xplatform.registration.visual.impl.presentation.state.models.fields;

import a.qo7;
import a.rw2;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CitizenshipStateModel implements Parcelable {
    public static final Parcelable.Creator<CitizenshipStateModel> CREATOR = new qo7((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46861a;
    public final String b;
    public final boolean c;

    public CitizenshipStateModel(String str, int i, boolean z) {
        str.getClass();
        this.f46861a = i;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitizenshipStateModel)) {
            return false;
        }
        CitizenshipStateModel citizenshipStateModel = (CitizenshipStateModel) obj;
        return this.f46861a == citizenshipStateModel.f46861a && Intrinsics.d(this.b, citizenshipStateModel.b) && this.c == citizenshipStateModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f46861a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f46861a, "CitizenshipStateModel(id=", ", citizenshipName=", this.b, ", specific="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46861a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
