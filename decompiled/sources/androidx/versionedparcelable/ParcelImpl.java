package androidx.versionedparcelable;

import a.ccu0;
import a.d860;
import a.dcu0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new d860((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcu0 f45408a;

    public ParcelImpl(Parcel parcel) {
        this.f45408a = new ccu0(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new ccu0(parcel).i(this.f45408a);
    }
}
