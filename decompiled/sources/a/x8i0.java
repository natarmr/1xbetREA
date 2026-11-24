package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x8i0 implements y8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40463a;

    public x8i0(String str) {
        str.getClass();
        this.f40463a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8i0) && Intrinsics.d(this.f40463a, ((x8i0) obj).f40463a);
    }

    public final int hashCode() {
        return this.f40463a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowRequirementsDialog(message=", this.f40463a, Separators.RPAREN);
    }
}
