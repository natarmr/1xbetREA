package androidx.compose.runtime;

import a.hgk0;
import a.igk0;
import a.jf4;
import a.m2a;
import a.rek0;
import a.ujn;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", TokenNames.T, "La/hgk0;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ParcelableSnapshotMutableState<T> extends hgk0 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        m2a m2aVar = m2a.v;
        igk0 igk0Var = this.b;
        if (igk0Var.equals(m2aVar)) {
            i2 = 0;
        } else if (igk0Var.equals(rek0.c)) {
            i2 = 1;
        } else {
            if (!igk0Var.equals(ujn.A)) {
                jf4.n("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
