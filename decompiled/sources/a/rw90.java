package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ew90 f31208a;

    public rw90(boolean z) {
        this(new ew90(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rw90) {
            return Intrinsics.d(this.f31208a, ((rw90) obj).f31208a);
        }
        return false;
    }

    public final int hashCode() {
        ew90 ew90Var = this.f31208a;
        if (ew90Var != null) {
            return ew90Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f31208a + Separators.RPAREN;
    }

    public rw90(ew90 ew90Var) {
        this.f31208a = ew90Var;
    }
}
