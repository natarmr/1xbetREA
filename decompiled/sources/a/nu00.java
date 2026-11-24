package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nu00 implements vu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24125a;

    public nu00(String str) {
        str.getClass();
        this.f24125a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nu00) && Intrinsics.d(this.f24125a, ((nu00) obj).f24125a);
    }

    public final int hashCode() {
        return this.f24125a.hashCode();
    }

    public final String toString() {
        return kng0.l("Identification(errorMessage=", this.f24125a, Separators.RPAREN);
    }
}
