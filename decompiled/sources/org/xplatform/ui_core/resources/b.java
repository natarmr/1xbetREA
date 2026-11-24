package org.xplatform.ui_core.resources;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        CharSequence[] charSequenceArr = new CharSequence[i2];
        for (int i3 = 0; i3 != i2; i3++) {
            charSequenceArr[i3] = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
        return new UiText.ByRes(i, charSequenceArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UiText.ByRes[i];
    }
}
