package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ThickLineWithIconDownloadBar$SavedState(parcel.readParcelable(ThickLineWithIconDownloadBar$SavedState.class.getClassLoader()), (RectF) parcel.readParcelable(ThickLineWithIconDownloadBar$SavedState.class.getClassLoader()), (ColorStateList) parcel.readParcelable(ThickLineWithIconDownloadBar$SavedState.class.getClassLoader()), (RectF) parcel.readParcelable(ThickLineWithIconDownloadBar$SavedState.class.getClassLoader()), (ColorStateList) parcel.readParcelable(ThickLineWithIconDownloadBar$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ThickLineWithIconDownloadBar$SavedState[i];
    }
}
