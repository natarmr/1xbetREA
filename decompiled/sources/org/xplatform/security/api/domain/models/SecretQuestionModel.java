package org.xplatform.security.api.domain.models;

import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/domain/models/SecretQuestionModel;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SecretQuestionModel implements Parcelable {
    public static final Parcelable.Creator<SecretQuestionModel> CREATOR = new sne0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46923a;
    public final String b;

    public SecretQuestionModel(int i, String str) {
        str.getClass();
        this.f46923a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretQuestionModel)) {
            return false;
        }
        SecretQuestionModel secretQuestionModel = (SecretQuestionModel) obj;
        return this.f46923a == secretQuestionModel.f46923a && Intrinsics.d(this.b, secretQuestionModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f46923a) * 31);
    }

    public final String toString() {
        return c.b(this.f46923a, "SecretQuestionModel(questionId=", ", questionText=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46923a);
        parcel.writeString(this.b);
    }
}
