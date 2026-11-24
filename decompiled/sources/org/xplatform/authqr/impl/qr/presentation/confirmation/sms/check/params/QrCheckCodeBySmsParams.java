package org.xplatform.authqr.impl.qr.presentation.confirmation.sms.check.params;

import a.cs0;
import a.d860;
import a.obk0;
import a.rw2;
import a.swp0;
import a.yed0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QrCheckCodeBySmsParams implements Parcelable {
    public static final Parcelable.Creator<QrCheckCodeBySmsParams> CREATOR = new d860((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f46365a;
    public final long b;
    public final yed0 c;
    public final List d;

    public QrCheckCodeBySmsParams(swp0 swp0Var, long j, yed0 yed0Var, List list) {
        swp0Var.getClass();
        yed0Var.getClass();
        list.getClass();
        this.f46365a = swp0Var;
        this.b = j;
        this.c = yed0Var;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCheckCodeBySmsParams)) {
            return false;
        }
        QrCheckCodeBySmsParams qrCheckCodeBySmsParams = (QrCheckCodeBySmsParams) obj;
        return Intrinsics.d(this.f46365a, qrCheckCodeBySmsParams.f46365a) && this.b == qrCheckCodeBySmsParams.b && this.c == qrCheckCodeBySmsParams.c && Intrinsics.d(this.d, qrCheckCodeBySmsParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f46365a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "QrCheckCodeBySmsParams(temporaryToken=" + this.f46365a + ", smsTimeSeconds=" + this.b + ", activationType=" + this.c + ", availableActivationTypeList=" + this.d + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46365a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
        Iterator itT = cs0.t(this.d, parcel);
        while (itT.hasNext()) {
            parcel.writeString(((obk0) itT.next()).name());
        }
    }
}
