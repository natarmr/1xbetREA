package com.google.android.gms.identitycredentials;

import a.d860;
import a.q5x;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PendingImportCredentialsHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PendingImportCredentialsHandle> CREATOR = new d860((byte) 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f45522a;

    public PendingImportCredentialsHandle(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.f45522a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45522a, i);
        q5x.q0(parcel, iP0);
    }
}
