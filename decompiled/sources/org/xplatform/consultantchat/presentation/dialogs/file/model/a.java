package org.xplatform.consultantchat.presentation.dialogs.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new FileBottomDialogResult.FileResult((File) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FileBottomDialogResult.FileResult[i];
    }
}
