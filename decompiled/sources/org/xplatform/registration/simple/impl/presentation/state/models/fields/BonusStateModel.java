package org.xplatform.registration.simple.impl.presentation.state.models.fields;

import a.axq;
import a.qo7;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BonusStateModel implements Parcelable {
    public static final Parcelable.Creator<BonusStateModel> CREATOR = new qo7((byte) 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46850a;
    public final String b;
    public final String c;

    public BonusStateModel(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46850a = i;
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
        if (!(obj instanceof BonusStateModel)) {
            return false;
        }
        BonusStateModel bonusStateModel = (BonusStateModel) obj;
        return this.f46850a == bonusStateModel.f46850a && Intrinsics.d(this.b, bonusStateModel.b) && Intrinsics.d(this.c, bonusStateModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f46850a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f46850a, "BonusStateModel(id=", ", bonusName=", this.b, ", description="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46850a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
