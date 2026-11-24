package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ThickLineDownloadBar$SavedState(parcel.readParcelable(ThickLineDownloadBar$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), (RectF) parcel.readParcelable(ThickLineDownloadBar$SavedState.class.getClassLoader()), (ColorStateList) parcel.readParcelable(ThickLineDownloadBar$SavedState.class.getClassLoader()), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ThickLineDownloadBar$SavedState[i];
    }
}
