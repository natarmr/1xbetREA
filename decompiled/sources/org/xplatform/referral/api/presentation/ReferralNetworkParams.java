package org.xplatform.referral.api.presentation;

import a.sne0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ReferralNetworkParams implements Parcelable {
    public static final Parcelable.Creator<ReferralNetworkParams> CREATOR = new sne0((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralNetworkInfo f46844a;

    public ReferralNetworkParams(ReferralNetworkInfo referralNetworkInfo) {
        referralNetworkInfo.getClass();
        this.f46844a = referralNetworkInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f46844a.writeToParcel(parcel, i);
    }
}
