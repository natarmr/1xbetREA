package androidx.compose.runtime;

import a.igk0;
import a.jf4;
import a.m2a;
import a.rek0;
import a.ua80;
import a.ujn;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        igk0 igk0Var;
        if (classLoader == null) {
            classLoader = c.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            igk0Var = m2a.v;
        } else if (i == 1) {
            igk0Var = rek0.c;
        } else {
            if (i != 2) {
                jf4.n(ua80.e(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            igk0Var = ujn.A;
        }
        return new ParcelableSnapshotMutableState(value, igk0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
