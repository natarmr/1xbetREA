package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(parcel);
        appCompatSpinner$SavedState.f45293a = parcel.readByte() != 0;
        return appCompatSpinner$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppCompatSpinner$SavedState[i];
    }
}
