package org.xplatform.aggregator.impl.category.presentation.models;

import a.b1j;
import a.brm0;
import a.d860;
import a.f140;
import a.rh1;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/presentation/models/ProviderUIModel;", "Lorg/xplatform/aggregator/impl/category/presentation/models/FilterItemUi;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ProviderUIModel implements FilterItemUi {
    public static final Parcelable.Creator<ProviderUIModel> CREATOR = new d860((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46280a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final rh1 h;

    public ProviderUIModel(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, rh1 rh1Var) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        rh1Var.getClass();
        this.f46280a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = rh1Var;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    public final FilterItemUi O(boolean z) {
        String str = this.f46280a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        String str3 = this.e;
        str3.getClass();
        String str4 = this.f;
        str4.getClass();
        rh1 rh1Var = this.h;
        rh1Var.getClass();
        return new ProviderUIModel(str, str2, z, this.d, str3, str4, this.g, rh1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderUIModel)) {
            return false;
        }
        ProviderUIModel providerUIModel = (ProviderUIModel) obj;
        return Intrinsics.d(this.f46280a, providerUIModel.f46280a) && Intrinsics.d(this.b, providerUIModel.b) && this.c == providerUIModel.c && Intrinsics.d(this.d, providerUIModel.d) && Intrinsics.d(this.e, providerUIModel.e) && Intrinsics.d(this.f, providerUIModel.f) && this.g == providerUIModel.g && this.h == providerUIModel.h;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF46280a() {
        return this.f46280a;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(this.f46280a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.h.hashCode() + brm0.e(ua80.b(ua80.b((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ProviderUIModel(id=", this.f46280a, ", name=", this.b, ", checked=");
        f140.s(", imageLink=", this.d, ", imageSrc=", sbN, this.c);
        f140.v(sbN, this.e, ", providerName=", this.f, ", virtual=");
        sbN.append(this.g);
        sbN.append(", providerStyle=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46280a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h.name());
    }
}
