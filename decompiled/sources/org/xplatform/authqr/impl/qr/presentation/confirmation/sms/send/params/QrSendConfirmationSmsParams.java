package org.xplatform.authqr.impl.qr.presentation.confirmation.sms.send.params;

import a.cs0;
import a.d860;
import a.obk0;
import a.swp0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QrSendConfirmationSmsParams implements Parcelable {
    public static final Parcelable.Creator<QrSendConfirmationSmsParams> CREATOR = new d860((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f46366a;
    public final List b;

    public QrSendConfirmationSmsParams(swp0 swp0Var, List list) {
        swp0Var.getClass();
        list.getClass();
        this.f46366a = swp0Var;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrSendConfirmationSmsParams)) {
            return false;
        }
        QrSendConfirmationSmsParams qrSendConfirmationSmsParams = (QrSendConfirmationSmsParams) obj;
        return Intrinsics.d(this.f46366a, qrSendConfirmationSmsParams.f46366a) && Intrinsics.d(this.b, qrSendConfirmationSmsParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46366a.hashCode() * 31);
    }

    public final String toString() {
        return "QrSendConfirmationSmsParams(temporaryToken=" + this.f46366a + ", availableActivationTypeList=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46366a);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeString(((obk0) itT.next()).name());
        }
    }
}
