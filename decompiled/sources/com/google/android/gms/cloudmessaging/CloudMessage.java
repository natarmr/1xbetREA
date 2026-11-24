package com.google.android.gms.cloudmessaging;

import a.equ0;
import a.q5x;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new equ0((byte) 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f45477a;

    public CloudMessage(Intent intent) {
        this.f45477a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45477a, i);
        q5x.q0(parcel, iP0);
    }
}
