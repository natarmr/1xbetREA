package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39984a;

    public wyp(String str) {
        str.getClass();
        this.f39984a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyp) && Intrinsics.d(this.f39984a, ((wyp) obj).f39984a);
    }

    public final int hashCode() {
        return this.f39984a.hashCode();
    }

    public final String toString() {
        return kng0.l("V1(info=", this.f39984a, Separators.RPAREN);
    }
}
