package org.xplatform.uikit.components.successbetalert.model;

import a.l7n0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TmpBetDoneUiModel implements Parcelable {
    public static final Parcelable.Creator<TmpBetDoneUiModel> CREATOR = new l7n0((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BetDoneScreenStyleEnum f47268a;
    public final BetDoneIconStyleEnum b;

    public TmpBetDoneUiModel(BetDoneScreenStyleEnum betDoneScreenStyleEnum, BetDoneIconStyleEnum betDoneIconStyleEnum) {
        betDoneScreenStyleEnum.getClass();
        betDoneIconStyleEnum.getClass();
        this.f47268a = betDoneScreenStyleEnum;
        this.b = betDoneIconStyleEnum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmpBetDoneUiModel)) {
            return false;
        }
        TmpBetDoneUiModel tmpBetDoneUiModel = (TmpBetDoneUiModel) obj;
        return this.f47268a == tmpBetDoneUiModel.f47268a && this.b == tmpBetDoneUiModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f47268a.hashCode() * 31);
    }

    public final String toString() {
        return "TmpBetDoneUiModel(betDoneScreenStyleEnum=" + this.f47268a + ", betDoneIconStyleEnum=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f47268a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
