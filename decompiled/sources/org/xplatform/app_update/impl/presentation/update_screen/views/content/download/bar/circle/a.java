package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle;

import a.njc;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new CircleDownloadBar$SavedState(parcel.readParcelable(CircleDownloadBar$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (RectF) parcel.readParcelable(CircleDownloadBar$SavedState.class.getClassLoader()), (PointF) parcel.readParcelable(CircleDownloadBar$SavedState.class.getClassLoader()), njc.valueOf(parcel.readString()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CircleDownloadBar$SavedState[i];
    }
}
