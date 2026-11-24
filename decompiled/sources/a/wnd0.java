package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wnd0 implements ynd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39443a;

    public final boolean equals(Object obj) {
        if (obj instanceof wnd0) {
            return Intrinsics.d(this.f39443a, ((wnd0) obj).f39443a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39443a.hashCode();
    }

    public final String toString() {
        return kng0.l("Second(value=", this.f39443a, Separators.RPAREN);
    }
}
