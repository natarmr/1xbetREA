package org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new TableViewImpl.SavedState(parcel.readParcelable(TableViewImpl.SavedState.class.getClassLoader()), parcel.readParcelable(TableViewImpl.SavedState.class.getClassLoader()), parcel.readParcelable(TableViewImpl.SavedState.class.getClassLoader()), parcel.readParcelable(TableViewImpl.SavedState.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TableViewImpl.SavedState[i];
    }
}
