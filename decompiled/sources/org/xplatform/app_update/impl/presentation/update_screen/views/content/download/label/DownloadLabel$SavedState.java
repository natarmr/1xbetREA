package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/DownloadLabel$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class DownloadLabel$SavedState implements Parcelable {
    public static final Parcelable.Creator<DownloadLabel$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46340a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;

    public DownloadLabel$SavedState(Parcelable parcelable, String str, int i, int i2, boolean z) {
        str.getClass();
        this.f46340a = parcelable;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46340a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
