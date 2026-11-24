package org.xplatform.feed.notifictation.presentation.models;

import a.lbi0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubscriptionEventSettingsUiModel implements Parcelable {
    public static final Parcelable.Creator<SubscriptionEventSettingsUiModel> CREATOR = new lbi0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionEventUiModel f46680a;
    public boolean b;

    public SubscriptionEventSettingsUiModel(SubscriptionEventUiModel subscriptionEventUiModel, boolean z) {
        subscriptionEventUiModel.getClass();
        this.f46680a = subscriptionEventUiModel;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionEventSettingsUiModel)) {
            return false;
        }
        SubscriptionEventSettingsUiModel subscriptionEventSettingsUiModel = (SubscriptionEventSettingsUiModel) obj;
        return Intrinsics.d(this.f46680a, subscriptionEventSettingsUiModel.f46680a) && this.b == subscriptionEventSettingsUiModel.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f46680a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscriptionEventSettingsUiModel(event=" + this.f46680a + ", isEnabled=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f46680a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
