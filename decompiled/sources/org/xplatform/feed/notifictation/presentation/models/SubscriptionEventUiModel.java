package org.xplatform.feed.notifictation.presentation.models;

import a.axq;
import a.l7n0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubscriptionEventUiModel implements Parcelable {
    public static final Parcelable.Creator<SubscriptionEventUiModel> CREATOR = new l7n0((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46681a;
    public final String b;

    public SubscriptionEventUiModel(long j, String str) {
        str.getClass();
        this.f46681a = j;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionEventUiModel)) {
            return false;
        }
        SubscriptionEventUiModel subscriptionEventUiModel = (SubscriptionEventUiModel) obj;
        return this.f46681a == subscriptionEventUiModel.f46681a && Intrinsics.d(this.b, subscriptionEventUiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46681a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46681a, "SubscriptionEventUiModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46681a);
        parcel.writeString(this.b);
    }
}
