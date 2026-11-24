package org.xplatform.referral.api.presentation;

import a.cs0;
import a.sne0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.xplatform.referral.api.domain.model.ReferralUser;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/referral/api/presentation/ReferralsListParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ReferralsListParams implements Parcelable {
    public static final Parcelable.Creator<ReferralsListParams> CREATOR = new sne0((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46845a;

    public ReferralsListParams(List list) {
        list.getClass();
        this.f46845a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46845a, parcel);
        while (itT.hasNext()) {
            ((ReferralUser) itT.next()).writeToParcel(parcel, i);
        }
    }
}
