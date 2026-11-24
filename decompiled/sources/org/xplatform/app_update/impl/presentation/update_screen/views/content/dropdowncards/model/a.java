package org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DropDownCard.LeftCard(parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DropDownCard.LeftCard[i];
    }
}
