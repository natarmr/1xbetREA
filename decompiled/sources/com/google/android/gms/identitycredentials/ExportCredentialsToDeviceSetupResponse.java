package com.google.android.gms.identitycredentials;

import a.q5x;
import a.yoo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExportCredentialsToDeviceSetupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExportCredentialsToDeviceSetupResponse> CREATOR = new yoo((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f45518a;

    public ExportCredentialsToDeviceSetupResponse(Bundle bundle) {
        bundle.getClass();
        this.f45518a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iP0 = q5x.p0(parcel, 20293);
        q5x.d0(parcel, 1, this.f45518a);
        q5x.q0(parcel, iP0);
    }
}
