package org.xplatform.ui_core.viewcomponents.smart_background;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class SmartBackgroundVideoView$SavedState implements Parcelable {
    public static final Parcelable.Creator<SmartBackgroundVideoView$SavedState> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f47201a;
    public final String b;
    public final String c;

    public SmartBackgroundVideoView$SavedState(String str, String str2, Parcelable parcelable) {
        str.getClass();
        str2.getClass();
        this.f47201a = parcelable;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47201a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
