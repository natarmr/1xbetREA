package org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Parcelable parcelable = parcel.readParcelable(DropDownCardsView$SavedState.class.getClassLoader());
        boolean z = parcel.readInt() != 0;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add(parcel.readParcelable(DropDownCardsView$SavedState.class.getClassLoader()));
        }
        return new DropDownCardsView$SavedState(parcelable, z, arrayList, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DropDownCardsView$SavedState[i];
    }
}
