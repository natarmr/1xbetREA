package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vnd0 implements ynd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37715a;

    public final boolean equals(Object obj) {
        if (obj instanceof vnd0) {
            return Intrinsics.d(this.f37715a, ((vnd0) obj).f37715a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37715a.hashCode();
    }

    public final String toString() {
        return kng0.l("Max(value=", this.f37715a, Separators.RPAREN);
    }
}
