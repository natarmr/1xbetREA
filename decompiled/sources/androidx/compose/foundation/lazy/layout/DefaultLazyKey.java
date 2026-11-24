package androidx.compose.foundation.lazy.layout;

import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45343a;

    public DefaultLazyKey(int i) {
        this.f45343a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f45343a == ((DefaultLazyKey) obj).f45343a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45343a);
    }

    public final String toString() {
        return ua80.e(this.f45343a, "DefaultLazyKey(index=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45343a);
    }
}
