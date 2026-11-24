package org.xplatform.security.impl.presentation.password.change.input_password;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return PasswordChangeViewModel$ScreenUiState.Default.b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PasswordChangeViewModel$ScreenUiState.Default[i];
    }
}
