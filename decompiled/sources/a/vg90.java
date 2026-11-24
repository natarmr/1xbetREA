package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vg90 extends xg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37371a;

    public vg90(String str) {
        str.getClass();
        this.f37371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg90) && Intrinsics.d(this.f37371a, ((vg90) obj).f37371a);
    }

    public final int hashCode() {
        return this.f37371a.hashCode();
    }

    public final String toString() {
        return kng0.l("Granted(permission=", this.f37371a, Separators.RPAREN);
    }
}
