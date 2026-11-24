package org.xplatform.feed.notifictation.presentation.models;

import a.d860;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PeriodSubscriptionSettingsScreenUiModel implements Parcelable {
    public static final Parcelable.Creator<PeriodSubscriptionSettingsScreenUiModel> CREATOR = new d860((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionPeriodUiModel f46679a;
    public final ArrayList b;

    public PeriodSubscriptionSettingsScreenUiModel(SubscriptionPeriodUiModel subscriptionPeriodUiModel, ArrayList arrayList) {
        subscriptionPeriodUiModel.getClass();
        this.f46679a = subscriptionPeriodUiModel;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodSubscriptionSettingsScreenUiModel)) {
            return false;
        }
        PeriodSubscriptionSettingsScreenUiModel periodSubscriptionSettingsScreenUiModel = (PeriodSubscriptionSettingsScreenUiModel) obj;
        return Intrinsics.d(this.f46679a, periodSubscriptionSettingsScreenUiModel.f46679a) && this.b.equals(periodSubscriptionSettingsScreenUiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46679a.hashCode() * 31);
    }

    public final String toString() {
        return "PeriodSubscriptionSettingsScreenUiModel(period=" + this.f46679a + ", eventsSettings=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f46679a.writeToParcel(parcel, i);
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SubscriptionEventSettingsUiModel) it.next()).writeToParcel(parcel, i);
        }
    }
}
