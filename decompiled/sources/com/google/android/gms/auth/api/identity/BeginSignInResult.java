package com.google.android.gms.auth.api.identity;

import a.equ0;
import a.q5x;
import a.s0x;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new equ0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f45469a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        s0x.H(pendingIntent);
        this.f45469a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45469a, i);
        q5x.q0(parcel, iP0);
    }
}
