package org.xplatform.bet_history.edit_coupon.presentation.model;

import a.b1j;
import a.d860;
import a.dw9;
import a.kng0;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OptionSelectBottomSheetDialogModel implements Parcelable {
    public static final Parcelable.Creator<OptionSelectBottomSheetDialogModel> CREATOR = new d860(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46390a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;

    public OptionSelectBottomSheetDialogModel(int i, String str, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        arrayList.getClass();
        this.f46390a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionSelectBottomSheetDialogModel)) {
            return false;
        }
        OptionSelectBottomSheetDialogModel optionSelectBottomSheetDialogModel = (OptionSelectBottomSheetDialogModel) obj;
        return Intrinsics.d(this.f46390a, optionSelectBottomSheetDialogModel.f46390a) && Intrinsics.d(this.b, optionSelectBottomSheetDialogModel.b) && this.c == optionSelectBottomSheetDialogModel.c && Intrinsics.d(this.d, optionSelectBottomSheetDialogModel.d) && Intrinsics.d(this.e, optionSelectBottomSheetDialogModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f46390a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OptionSelectBottomSheetDialogModel(title=", this.f46390a, ", requestKey=", this.b, ", initialSelectedPosition=");
        kng0.w(this.c, ", selectedPositionResultKey=", this.d, ", optionItemsList=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46390a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
    }
}
