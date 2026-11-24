package org.xplatform.statistic.grand_prix.presentation.model;

import a.b1j;
import a.rw2;
import a.sne0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SeasonItemUIModel implements Parcelable {
    public static final Parcelable.Creator<SeasonItemUIModel> CREATOR = new sne0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47031a;
    public final String b;
    public final boolean c;

    public SeasonItemUIModel(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f47031a = str;
        this.b = str2;
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
        if (!(obj instanceof SeasonItemUIModel)) {
            return false;
        }
        SeasonItemUIModel seasonItemUIModel = (SeasonItemUIModel) obj;
        return Intrinsics.d(this.f47031a, seasonItemUIModel.f47031a) && Intrinsics.d(this.b, seasonItemUIModel.b) && this.c == seasonItemUIModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f47031a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("SeasonItemUIModel(id=", this.f47031a, ", title=", this.b, ", selected="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47031a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
