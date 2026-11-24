package org.xplatform.authqr.impl.qr.presentation.confirmation.mail.send.params;

import a.d860;
import a.swp0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QrSendConfirmationMailParams implements Parcelable {
    public static final Parcelable.Creator<QrSendConfirmationMailParams> CREATOR = new d860((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f46362a;

    public QrSendConfirmationMailParams(swp0 swp0Var) {
        swp0Var.getClass();
        this.f46362a = swp0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QrSendConfirmationMailParams) && Intrinsics.d(this.f46362a, ((QrSendConfirmationMailParams) obj).f46362a);
    }

    public final int hashCode() {
        return this.f46362a.hashCode();
    }

    public final String toString() {
        return "QrSendConfirmationMailParams(temporaryToken=" + this.f46362a + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46362a);
    }
}
