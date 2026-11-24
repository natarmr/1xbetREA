package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value;

import a.fcl;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/DownloadValue$SavedState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class DownloadValue$SavedState implements Parcelable {
    public static final Parcelable.Creator<DownloadValue$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f46341a;
    public final fcl b;
    public final int c;
    public final boolean d;

    public DownloadValue$SavedState(Parcelable parcelable, fcl fclVar, int i, boolean z) {
        this.f46341a = parcelable;
        this.b = fclVar;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46341a, i);
        fcl fclVar = this.b;
        if (fclVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fclVar.name());
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
