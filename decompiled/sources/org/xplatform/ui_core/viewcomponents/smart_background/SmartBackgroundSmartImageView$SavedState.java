package org.xplatform.ui_core.viewcomponents.smart_background;

import a.cs0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundSmartImageView$SavedState", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class SmartBackgroundSmartImageView$SavedState implements Parcelable {
    public static final Parcelable.Creator<SmartBackgroundSmartImageView$SavedState> CREATOR = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f47200a;
    public final List b;

    public SmartBackgroundSmartImageView$SavedState(Parcelable parcelable, ArrayList arrayList) {
        arrayList.getClass();
        this.f47200a = parcelable;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47200a, i);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeInt(((Number) itT.next()).intValue());
        }
    }
}
