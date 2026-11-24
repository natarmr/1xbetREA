package org.xplatform.authqr.impl.qr.presentation.confirmation.secret_question.params;

import a.axq;
import a.d860;
import a.swp0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QrConfirmSecretQuestionFragmentScreenParams implements Parcelable {
    public static final Parcelable.Creator<QrConfirmSecretQuestionFragmentScreenParams> CREATOR = new d860((byte) 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46363a;
    public final swp0 b;
    public final String c;

    public QrConfirmSecretQuestionFragmentScreenParams(swp0 swp0Var, String str, String str2) {
        str.getClass();
        swp0Var.getClass();
        str2.getClass();
        this.f46363a = str;
        this.b = swp0Var;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrConfirmSecretQuestionFragmentScreenParams)) {
            return false;
        }
        QrConfirmSecretQuestionFragmentScreenParams qrConfirmSecretQuestionFragmentScreenParams = (QrConfirmSecretQuestionFragmentScreenParams) obj;
        return Intrinsics.d(this.f46363a, qrConfirmSecretQuestionFragmentScreenParams.f46363a) && Intrinsics.d(this.b, qrConfirmSecretQuestionFragmentScreenParams.b) && Intrinsics.d(this.c, qrConfirmSecretQuestionFragmentScreenParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f46363a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrConfirmSecretQuestionFragmentScreenParams(message=");
        sb.append(this.f46363a);
        sb.append(", temporaryToken=");
        sb.append(this.b);
        sb.append(", type=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46363a);
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
    }
}
