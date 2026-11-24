package androidx.compose.runtime;

import a.cgk0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "La/cgk0;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ParcelableSnapshotMutableIntState extends cgk0 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new b((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(l());
    }
}
