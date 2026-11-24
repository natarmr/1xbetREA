package org.xplatform.app_start.impl.presentation.view.content.version;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_start/impl/presentation/view/content/version/AppStartVersionView$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class AppStartVersionView$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppStartVersionView$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46322a;

    public AppStartVersionView$SavedState(Parcelable parcelable) {
        this.f46322a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46322a, i);
    }
}
