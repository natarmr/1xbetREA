package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/DownloadDescription$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class DownloadDescription$SavedState implements Parcelable {
    public static final Parcelable.Creator<DownloadDescription$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46339a;
    public final String b;

    public DownloadDescription$SavedState(Parcelable parcelable, String str) {
        str.getClass();
        this.f46339a = parcelable;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46339a, i);
        parcel.writeString(this.b);
    }
}
