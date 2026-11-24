package org.xplatform.aggregator.impl.category.presentation.models;

import a.b1j;
import a.brm0;
import a.twn;
import a.ua80;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/presentation/models/FilterUiModel;", "Lorg/xplatform/aggregator/impl/category/presentation/models/FilterItemUi;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FilterUiModel implements FilterItemUi {
    public static final Parcelable.Creator<FilterUiModel> CREATOR = new yoo((byte) 10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46278a;
    public final String b;
    public final boolean c;
    public final String d;

    public FilterUiModel(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.f46278a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    public final FilterItemUi O(boolean z) {
        String str = this.f46278a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        return new FilterUiModel(str, str2, this.d, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterUiModel)) {
            return false;
        }
        FilterUiModel filterUiModel = (FilterUiModel) obj;
        return Intrinsics.d(this.f46278a, filterUiModel.f46278a) && Intrinsics.d(this.b, filterUiModel.b) && this.c == filterUiModel.c && Intrinsics.d(this.d, filterUiModel.d);
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF46278a() {
        return this.f46278a;
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(this.f46278a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final String toString() {
        return twn.q(", imageLink=", this.d, Separators.RPAREN, b1j.n("FilterUiModel(id=", this.f46278a, ", name=", this.b, ", checked="), this.c);
    }

    @Override // org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi
    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46278a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
