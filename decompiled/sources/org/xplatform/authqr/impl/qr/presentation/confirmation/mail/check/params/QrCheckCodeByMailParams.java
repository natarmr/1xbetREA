package org.xplatform.authqr.impl.qr.presentation.confirmation.mail.check.params;

import a.d860;
import a.swp0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/params/QrCheckCodeByMailParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QrCheckCodeByMailParams implements Parcelable {
    public static final Parcelable.Creator<QrCheckCodeByMailParams> CREATOR = new d860((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f46361a;
    public final long b;

    public QrCheckCodeByMailParams(swp0 swp0Var, long j) {
        swp0Var.getClass();
        this.f46361a = swp0Var;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCheckCodeByMailParams)) {
            return false;
        }
        QrCheckCodeByMailParams qrCheckCodeByMailParams = (QrCheckCodeByMailParams) obj;
        return Intrinsics.d(this.f46361a, qrCheckCodeByMailParams.f46361a) && this.b == qrCheckCodeByMailParams.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f46361a.hashCode() * 31);
    }

    public final String toString() {
        return "QrCheckCodeByMailParams(temporaryToken=" + this.f46361a + ", smsTime=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46361a);
        parcel.writeLong(this.b);
    }
}
