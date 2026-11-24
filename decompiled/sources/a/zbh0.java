package a;

import android.gov.nist.core.Separators;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zbh0 implements ach0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f44116a;

    public zbh0(Parcelable parcelable) {
        this.f44116a = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbh0) && Intrinsics.d(this.f44116a, ((zbh0) obj).f44116a);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f44116a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final String toString() {
        return "SavedLayoutManagerState(state=" + this.f44116a + Separators.RPAREN;
    }
}
