package org.xplatform.app_start.impl.presentation.view.content.loader;

import a.wg3;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class AppStartLoaderView$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppStartLoaderView$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46316a;
    public final wg3 b;
    public final int c;

    public AppStartLoaderView$SavedState(Parcelable parcelable, wg3 wg3Var, int i) {
        wg3Var.getClass();
        this.f46316a = parcelable;
        this.b = wg3Var;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46316a, i);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c);
    }
}
