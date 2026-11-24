package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30003a;

    public r81(String str) {
        str.getClass();
        this.f30003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r81) && Intrinsics.d(this.f30003a, ((r81) obj).f30003a);
    }

    public final int hashCode() {
        return this.f30003a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWebViewUnavailable(message=", this.f30003a, Separators.RPAREN);
    }
}
