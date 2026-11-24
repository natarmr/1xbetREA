package org.xplatform.security.api.presentation.models;

import a.obk0;
import a.swp0;
import a.we50;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        swp0 swp0Var = (swp0) parcel.readSerializable();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add(obk0.valueOf(parcel.readString()));
        }
        int i3 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i3);
        for (int i4 = 0; i4 != i3; i4++) {
            arrayList2.add(obk0.valueOf(parcel.readString()));
        }
        return new ConfirmRestoreByAuthenticatorType.Confirmation(string, string2, string3, swp0Var, arrayList, arrayList2, we50.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ConfirmRestoreByAuthenticatorType.Confirmation[i];
    }
}
