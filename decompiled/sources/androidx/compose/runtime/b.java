package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45346a;

    public /* synthetic */ b(byte b) {
        this.f45346a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f45346a) {
            case 0:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 1:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            default:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f45346a) {
            case 0:
                return new ParcelableSnapshotMutableFloatState[i];
            case 1:
                return new ParcelableSnapshotMutableIntState[i];
            default:
                return new ParcelableSnapshotMutableLongState[i];
        }
    }
}
