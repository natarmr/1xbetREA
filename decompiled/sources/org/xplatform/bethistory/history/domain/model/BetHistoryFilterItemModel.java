package org.xplatform.bethistory.history.domain.model;

import a.e4f;
import a.ibw0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetHistoryFilterItemModel implements Parcelable {
    public static final Parcelable.Creator<BetHistoryFilterItemModel> CREATOR = new ibw0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4f f46411a;
    public final boolean b;
    public final boolean c;

    public BetHistoryFilterItemModel(e4f e4fVar, boolean z, boolean z2) {
        e4fVar.getClass();
        this.f46411a = e4fVar;
        this.b = z;
        this.c = z2;
    }

    public static BetHistoryFilterItemModel a(BetHistoryFilterItemModel betHistoryFilterItemModel, boolean z, boolean z2, int i) {
        e4f e4fVar = betHistoryFilterItemModel.f46411a;
        if ((i & 2) != 0) {
            z = betHistoryFilterItemModel.b;
        }
        if ((i & 4) != 0) {
            z2 = betHistoryFilterItemModel.c;
        }
        betHistoryFilterItemModel.getClass();
        e4fVar.getClass();
        return new BetHistoryFilterItemModel(e4fVar, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BetHistoryFilterItemModel)) {
            BetHistoryFilterItemModel betHistoryFilterItemModel = (BetHistoryFilterItemModel) obj;
            if (this.f46411a == betHistoryFilterItemModel.f46411a && this.b == betHistoryFilterItemModel.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f46411a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetHistoryFilterItemModel(state=");
        sb.append(this.f46411a);
        sb.append(", checked=");
        sb.append(this.b);
        sb.append(", enable=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46411a.name());
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
