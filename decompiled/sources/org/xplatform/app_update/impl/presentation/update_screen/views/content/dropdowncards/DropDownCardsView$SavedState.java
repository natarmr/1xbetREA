package org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards;

import a.cs0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/DropDownCardsView$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class DropDownCardsView$SavedState implements Parcelable {
    public static final Parcelable.Creator<DropDownCardsView$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46342a;
    public final boolean b;
    public final List c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;

    public DropDownCardsView$SavedState(Parcelable parcelable, boolean z, List list, int i, float f, float f2, int i2) {
        list.getClass();
        this.f46342a = parcelable;
        this.b = z;
        this.c = list;
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46342a, i);
        parcel.writeInt(this.b ? 1 : 0);
        Iterator itT = cs0.t(this.c, parcel);
        while (itT.hasNext()) {
            parcel.writeParcelable((Parcelable) itT.next(), i);
        }
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeInt(this.g);
    }
}
