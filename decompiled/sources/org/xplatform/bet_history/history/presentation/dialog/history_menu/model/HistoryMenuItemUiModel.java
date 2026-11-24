package org.xplatform.bet_history.history.presentation.dialog.history_menu.model;

import a.kng0;
import a.twn;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HistoryMenuItemUiModel implements Parcelable {
    public static final Parcelable.Creator<HistoryMenuItemUiModel> CREATOR = new yoo((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46399a;
    public final int b;
    public final HistoryMenuItem c;

    public HistoryMenuItemUiModel(String str, int i, HistoryMenuItem historyMenuItem) {
        str.getClass();
        historyMenuItem.getClass();
        this.f46399a = str;
        this.b = i;
        this.c = historyMenuItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryMenuItemUiModel)) {
            return false;
        }
        HistoryMenuItemUiModel historyMenuItemUiModel = (HistoryMenuItemUiModel) obj;
        return Intrinsics.d(this.f46399a, historyMenuItemUiModel.f46399a) && this.b == historyMenuItemUiModel.b && this.c == historyMenuItemUiModel.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f46399a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "HistoryMenuItemUiModel(title=", this.f46399a, ", icon=", ", historyMenuItem=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46399a);
        parcel.writeInt(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
