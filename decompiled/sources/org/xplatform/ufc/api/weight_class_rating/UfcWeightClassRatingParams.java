package org.xplatform.ufc.api.weight_class_rating;

import a.f7v0;
import a.kgz;
import a.rdr0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UfcWeightClassRatingParams implements Parcelable {
    public static final Parcelable.Creator<UfcWeightClassRatingParams> CREATOR = new rdr0((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgz f47173a;
    public final f7v0 b;

    public UfcWeightClassRatingParams(kgz kgzVar, f7v0 f7v0Var) {
        kgzVar.getClass();
        f7v0Var.getClass();
        this.f47173a = kgzVar;
        this.b = f7v0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UfcWeightClassRatingParams)) {
            return false;
        }
        UfcWeightClassRatingParams ufcWeightClassRatingParams = (UfcWeightClassRatingParams) obj;
        return this.f47173a == ufcWeightClassRatingParams.f47173a && this.b == ufcWeightClassRatingParams.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f47173a.hashCode() * 31);
    }

    public final String toString() {
        return "UfcWeightClassRatingParams(gender=" + this.f47173a + ", weightClass=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47173a.name());
        parcel.writeString(this.b.name());
    }
}
