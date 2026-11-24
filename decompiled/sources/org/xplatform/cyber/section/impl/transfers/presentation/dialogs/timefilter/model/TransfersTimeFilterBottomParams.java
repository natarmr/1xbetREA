package org.xplatform.cyber.section.impl.transfers.presentation.dialogs.timefilter.model;

import a.cs0;
import a.rdr0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TransfersTimeFilterBottomParams implements Parcelable {
    public static final Parcelable.Creator<TransfersTimeFilterBottomParams> CREATOR = new rdr0((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTimeFilterUiModel f46622a;
    public final List b;

    public TransfersTimeFilterBottomParams(TransferTimeFilterUiModel transferTimeFilterUiModel, List list) {
        transferTimeFilterUiModel.getClass();
        list.getClass();
        this.f46622a = transferTimeFilterUiModel;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransfersTimeFilterBottomParams)) {
            return false;
        }
        TransfersTimeFilterBottomParams transfersTimeFilterBottomParams = (TransfersTimeFilterBottomParams) obj;
        return Intrinsics.d(this.f46622a, transfersTimeFilterBottomParams.f46622a) && Intrinsics.d(this.b, transfersTimeFilterBottomParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46622a.hashCode() * 31);
    }

    public final String toString() {
        return "TransfersTimeFilterBottomParams(selectedTimeFilter=" + this.f46622a + ", timeFilters=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46622a, i);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeParcelable((Parcelable) itT.next(), i);
        }
    }
}
