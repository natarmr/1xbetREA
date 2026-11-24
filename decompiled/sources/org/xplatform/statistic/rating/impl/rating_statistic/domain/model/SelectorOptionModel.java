package org.xplatform.statistic.rating.impl.rating_statistic.domain.model;

import a.b1j;
import a.brm0;
import a.ohs0;
import a.sne0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectorOptionModel implements Parcelable {
    public static final Parcelable.Creator<SelectorOptionModel> CREATOR = new sne0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47063a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public SelectorOptionModel(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f47063a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static SelectorOptionModel a(SelectorOptionModel selectorOptionModel, boolean z, boolean z2, int i) {
        String str = selectorOptionModel.f47063a;
        String str2 = selectorOptionModel.b;
        if ((i & 4) != 0) {
            z = selectorOptionModel.c;
        }
        if ((i & 8) != 0) {
            z2 = selectorOptionModel.d;
        }
        selectorOptionModel.getClass();
        str.getClass();
        str2.getClass();
        return new SelectorOptionModel(str, str2, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectorOptionModel)) {
            return false;
        }
        SelectorOptionModel selectorOptionModel = (SelectorOptionModel) obj;
        return Intrinsics.d(this.f47063a, selectorOptionModel.f47063a) && Intrinsics.d(this.b, selectorOptionModel.b) && this.c == selectorOptionModel.c && this.d == selectorOptionModel.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f47063a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isSelectedByUser=", Separators.RPAREN, b1j.n("SelectorOptionModel(selectorOptionName=", this.f47063a, ", selectorValue=", this.b, ", default="), this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47063a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
