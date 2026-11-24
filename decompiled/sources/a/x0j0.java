package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x0j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40073a;

    public x0j0(String str) {
        str.getClass();
        this.f40073a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0j0) && Intrinsics.d(this.f40073a, ((x0j0) obj).f40073a);
    }

    public final int hashCode() {
        return this.f40073a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShareApp(url=", this.f40073a, Separators.RPAREN);
    }
}
