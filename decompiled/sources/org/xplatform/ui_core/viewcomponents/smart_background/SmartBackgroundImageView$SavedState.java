package org.xplatform.ui_core.viewcomponents.smart_background;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class SmartBackgroundImageView$SavedState implements Parcelable {
    public static final Parcelable.Creator<SmartBackgroundImageView$SavedState> CREATOR = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f47198a;
    public final int b;
    public final int c;
    public final String d;

    public SmartBackgroundImageView$SavedState(Parcelable parcelable, int i, int i2, String str) {
        str.getClass();
        this.f47198a = parcelable;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47198a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
