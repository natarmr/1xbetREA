package org.xplatform.consultantchat.presentation.dialogs.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add(parcel.readSerializable());
        }
        return new FileBottomDialogResult.ImageResult(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FileBottomDialogResult.ImageResult[i];
    }
}
