package a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y7w0 extends u5w0 {
    @Override // a.u5w0
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) z5w0.a(parcel);
        z5w0.b(parcel);
        b(bundle);
        return true;
    }

    public abstract void b(Bundle bundle);
}
