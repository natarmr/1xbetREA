package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45369a;
    public final ArrayList b;

    public BackStackState(Parcel parcel) {
        this.f45369a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f45369a);
        parcel.writeTypedList(this.b);
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f45369a = arrayList;
        this.b = arrayList2;
    }
}
