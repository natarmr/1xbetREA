package org.xplatform.uikit.components.text_field.end;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f47274a;

    public /* synthetic */ a(byte b) {
        this.f47274a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f47274a) {
            case 0:
                parcel.getClass();
                return new DSTextFieldEndChevron$SavedState(parcel.readParcelable(DSTextFieldEndChevron$SavedState.class.getClassLoader()), parcel.readInt());
            default:
                parcel.getClass();
                return new DSTextFieldEndPassword$SavedState(parcel.readParcelable(DSTextFieldEndPassword$SavedState.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f47274a) {
            case 0:
                return new DSTextFieldEndChevron$SavedState[i];
            default:
                return new DSTextFieldEndPassword$SavedState[i];
        }
    }
}
