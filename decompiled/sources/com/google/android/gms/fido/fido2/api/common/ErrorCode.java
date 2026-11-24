package com.google.android.gms.fido.fido2.api.common;

import a.t0o;
import a.ua80;
import a.zcx0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new zcx0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f45505a;

    /* JADX WARN: Multi-variable type inference failed */
    ErrorCode(int i) {
        this.f45505a = i;
    }

    public static ErrorCode a(int i) throws t0o {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.f45505a) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        throw new t0o(ua80.e(i, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45505a);
    }
}
