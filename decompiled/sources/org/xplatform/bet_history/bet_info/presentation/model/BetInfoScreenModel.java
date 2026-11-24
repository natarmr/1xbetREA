package org.xplatform.bet_history.bet_info.presentation.model;

import a.f8w;
import a.ibw0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetInfoScreenModel implements Parcelable {
    public static final Parcelable.Creator<BetInfoScreenModel> CREATOR = new ibw0((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f46385a;
    public final long b;
    public final f8w c;
    public final boolean d;

    public BetInfoScreenModel(HistoryTypeModel historyTypeModel, long j, f8w f8wVar, boolean z) {
        historyTypeModel.getClass();
        f8wVar.getClass();
        this.f46385a = historyTypeModel;
        this.b = j;
        this.c = f8wVar;
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
        if (!(obj instanceof BetInfoScreenModel)) {
            return false;
        }
        BetInfoScreenModel betInfoScreenModel = (BetInfoScreenModel) obj;
        return this.f46385a == betInfoScreenModel.f46385a && this.b == betInfoScreenModel.b && this.c == betInfoScreenModel.c && this.d == betInfoScreenModel.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + rw2.b(this.f46385a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "BetInfoScreenModel(historyTypeModel=" + this.f46385a + ", balanceId=" + this.b + ", historyTypeScreen=" + this.c + ", useCacheData=" + this.d + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f46385a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
        parcel.writeInt(this.d ? 1 : 0);
    }
}
