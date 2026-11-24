package org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model;

import a.b1j;
import a.ua80;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HistoryDateFilterTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<HistoryDateFilterTypeUiModel> CREATOR = new yoo((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46398a;
    public final String b;
    public final HistoryDateFilterTypeModel c;
    public final boolean d;

    public HistoryDateFilterTypeUiModel(String str, String str2, HistoryDateFilterTypeModel historyDateFilterTypeModel, boolean z) {
        str.getClass();
        str2.getClass();
        historyDateFilterTypeModel.getClass();
        this.f46398a = str;
        this.b = str2;
        this.c = historyDateFilterTypeModel;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryDateFilterTypeUiModel)) {
            return false;
        }
        HistoryDateFilterTypeUiModel historyDateFilterTypeUiModel = (HistoryDateFilterTypeUiModel) obj;
        return Intrinsics.d(this.f46398a, historyDateFilterTypeUiModel.f46398a) && Intrinsics.d(this.b, historyDateFilterTypeUiModel.b) && this.c == historyDateFilterTypeUiModel.c && this.d == historyDateFilterTypeUiModel.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(this.f46398a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HistoryDateFilterTypeUiModel(title=", this.f46398a, ", subtitle=", this.b, ", historyDateFilterTypeModel=");
        sbN.append(this.c);
        sbN.append(", isActive=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46398a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
