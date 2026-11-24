package org.xplatform.aggregator.impl.category.presentation.models;

import a.b1j;
import a.brm0;
import a.cs0;
import a.f140;
import a.lbi0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;", "Lorg/xplatform/aggregator/impl/category/presentation/models/FilterItemUi;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SortingOptionUiModel implements FilterItemUi {
    public static final Parcelable.Creator<SortingOptionUiModel> CREATOR = new lbi0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46281a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public SortingOptionUiModel(String str, String str2, String str3, String str4, String str5, boolean z) {
        cs0.x(str, str2, str4, str5);
        this.f46281a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    public final FilterItemUi O(boolean z) {
        String str = this.f46281a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        String str3 = this.e;
        str3.getClass();
        String str4 = this.f;
        str4.getClass();
        return new SortingOptionUiModel(str, str2, this.d, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortingOptionUiModel)) {
            return false;
        }
        SortingOptionUiModel sortingOptionUiModel = (SortingOptionUiModel) obj;
        return Intrinsics.d(this.f46281a, sortingOptionUiModel.f46281a) && Intrinsics.d(this.b, sortingOptionUiModel.b) && this.c == sortingOptionUiModel.c && Intrinsics.d(this.d, sortingOptionUiModel.d) && Intrinsics.d(this.e, sortingOptionUiModel.e) && Intrinsics.d(this.f, sortingOptionUiModel.f);
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF46281a() {
        return this.f46281a;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(this.f46281a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + ua80.b((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SortingOptionUiModel(id=", this.f46281a, ", name=", this.b, ", checked=");
        f140.s(", imageLink=", this.d, ", attribute=", sbN, this.c);
        return ua80.m(sbN, this.e, ", direction=", this.f, Separators.RPAREN);
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46281a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
