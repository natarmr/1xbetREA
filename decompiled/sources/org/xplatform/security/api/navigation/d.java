package org.xplatform.security.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return EndFlowNavigation.ToRsSelfExclusionScreen.f46927a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new EndFlowNavigation.ToRsSelfExclusionScreen[i];
    }
}
