package org.xplatform.login.core.presentation.model;

import a.ibw0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AuthDataErrorModel implements Parcelable {
    public static final Parcelable.Creator<AuthDataErrorModel> CREATOR = new ibw0((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f46752a;
    public final AuthDataModel b;

    public AuthDataErrorModel(Throwable th, AuthDataModel authDataModel) {
        authDataModel.getClass();
        this.f46752a = th;
        this.b = authDataModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthDataErrorModel)) {
            return false;
        }
        AuthDataErrorModel authDataErrorModel = (AuthDataErrorModel) obj;
        return Intrinsics.d(this.f46752a, authDataErrorModel.f46752a) && Intrinsics.d(this.b, authDataErrorModel.b);
    }

    public final int hashCode() {
        Throwable th = this.f46752a;
        return this.b.hashCode() + ((th == null ? 0 : th.hashCode()) * 31);
    }

    public final String toString() {
        return "AuthDataErrorModel(throwable=" + this.f46752a + ", authDataModel=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46752a);
        parcel.writeParcelable(this.b, i);
    }
}
