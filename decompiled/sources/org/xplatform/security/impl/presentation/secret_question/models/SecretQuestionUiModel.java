package org.xplatform.security.impl.presentation.secret_question.models;

import a.rw2;
import a.sne0;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SecretQuestionUiModel implements Parcelable {
    public static final Parcelable.Creator<SecretQuestionUiModel> CREATOR = new sne0((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46957a;
    public final String b;
    public final boolean c;

    public SecretQuestionUiModel(String str, int i, boolean z) {
        str.getClass();
        this.f46957a = i;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretQuestionUiModel)) {
            return false;
        }
        SecretQuestionUiModel secretQuestionUiModel = (SecretQuestionUiModel) obj;
        return this.f46957a == secretQuestionUiModel.f46957a && Intrinsics.d(this.b, secretQuestionUiModel.b) && this.c == secretQuestionUiModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f46957a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f46957a, "SecretQuestionUiModel(id=", ", text=", this.b, ", selected="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46957a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
