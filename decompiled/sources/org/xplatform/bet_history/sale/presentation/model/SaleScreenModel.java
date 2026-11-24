package org.xplatform.bet_history.sale.presentation.model;

import a.brm0;
import a.hne;
import a.rw2;
import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SaleScreenModel implements Parcelable {
    public static final Parcelable.Creator<SaleScreenModel> CREATOR = new sne0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46405a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final HistoryTypeModel e;

    public SaleScreenModel(String str, boolean z, long j, boolean z2, HistoryTypeModel historyTypeModel) {
        str.getClass();
        historyTypeModel.getClass();
        this.f46405a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = historyTypeModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleScreenModel)) {
            return false;
        }
        SaleScreenModel saleScreenModel = (SaleScreenModel) obj;
        return Intrinsics.d(this.f46405a, saleScreenModel.f46405a) && this.b == saleScreenModel.b && this.c == saleScreenModel.c && this.d == saleScreenModel.d && this.e == saleScreenModel.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(rw2.b(brm0.e(this.f46405a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SaleScreenModel(betId=", this.f46405a, ", isAutoSale=", this.b, ", balanceId=");
        hne.t(this.c, ", isUpdateOnExit=", sbU, this.d);
        sbU.append(", historyTypeModel=");
        sbU.append(this.e);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46405a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
    }
}
