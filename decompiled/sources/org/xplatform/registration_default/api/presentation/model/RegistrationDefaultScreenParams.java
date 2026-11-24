package org.xplatform.registration_default.api.presentation.model;

import a.q7f0;
import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RegistrationDefaultScreenParams implements Parcelable {
    public static final Parcelable.Creator<RegistrationDefaultScreenParams> CREATOR = new sne0((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7f0 f46869a;

    public RegistrationDefaultScreenParams(q7f0 q7f0Var) {
        q7f0Var.getClass();
        this.f46869a = q7f0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegistrationDefaultScreenParams) && this.f46869a == ((RegistrationDefaultScreenParams) obj).f46869a;
    }

    public final int hashCode() {
        return this.f46869a.hashCode();
    }

    public final String toString() {
        return "RegistrationDefaultScreenParams(registrationType=" + this.f46869a + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46869a.name());
    }
}
