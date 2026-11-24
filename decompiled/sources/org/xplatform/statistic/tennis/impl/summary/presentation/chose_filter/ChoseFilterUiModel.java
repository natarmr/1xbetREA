package org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter;

import a.b1j;
import a.qo7;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChoseFilterUiModel implements Parcelable {
    public static final Parcelable.Creator<ChoseFilterUiModel> CREATOR = new qo7((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47100a;
    public final String b;
    public final boolean c;

    public ChoseFilterUiModel(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f47100a = str;
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
        if (!(obj instanceof ChoseFilterUiModel)) {
            return false;
        }
        ChoseFilterUiModel choseFilterUiModel = (ChoseFilterUiModel) obj;
        return Intrinsics.d(this.f47100a, choseFilterUiModel.f47100a) && Intrinsics.d(this.b, choseFilterUiModel.b) && this.c == choseFilterUiModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f47100a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ChoseFilterUiModel(filterName=", this.f47100a, ", filterValue=", this.b, ", isSelected="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47100a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
