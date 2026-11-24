package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1798a;

    public final boolean equals(Object obj) {
        if (obj instanceof b1b) {
            return Intrinsics.d(this.f1798a, ((b1b) obj).f1798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1798a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameName(value=", this.f1798a, Separators.RPAREN);
    }
}
