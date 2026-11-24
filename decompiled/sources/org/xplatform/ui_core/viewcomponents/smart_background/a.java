package org.xplatform.ui_core.viewcomponents.smart_background;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f47202a;

    public /* synthetic */ a(byte b) {
        this.f47202a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f47202a) {
            case 0:
                parcel.getClass();
                return new SmartBackgroundImageView$SavedState(parcel.readParcelable(SmartBackgroundImageView$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 1:
                parcel.getClass();
                return new SmartBackgroundLottieView$SavedState(parcel.readParcelable(SmartBackgroundLottieView$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 2:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(SmartBackgroundSmartImageView$SavedState.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                return new SmartBackgroundSmartImageView$SavedState(parcelable, arrayList);
            default:
                parcel.getClass();
                return new SmartBackgroundVideoView$SavedState(parcel.readString(), parcel.readString(), parcel.readParcelable(SmartBackgroundVideoView$SavedState.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f47202a) {
            case 0:
                return new SmartBackgroundImageView$SavedState[i];
            case 1:
                return new SmartBackgroundLottieView$SavedState[i];
            case 2:
                return new SmartBackgroundSmartImageView$SavedState[i];
            default:
                return new SmartBackgroundVideoView$SavedState[i];
        }
    }
}
