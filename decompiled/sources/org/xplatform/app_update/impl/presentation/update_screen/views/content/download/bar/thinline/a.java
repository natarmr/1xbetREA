package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ThinLineDownloadBar$SavedState(parcel.readParcelable(ThinLineDownloadBar$SavedState.class.getClassLoader()), (RectF) parcel.readParcelable(ThinLineDownloadBar$SavedState.class.getClassLoader()), (ColorStateList) parcel.readParcelable(ThinLineDownloadBar$SavedState.class.getClassLoader()), (RectF) parcel.readParcelable(ThinLineDownloadBar$SavedState.class.getClassLoader()), (ColorStateList) parcel.readParcelable(ThinLineDownloadBar$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ThinLineDownloadBar$SavedState[i];
    }
}
