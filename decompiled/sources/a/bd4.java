package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bd4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2382a;

    public bd4(String str) {
        str.getClass();
        this.f2382a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd4) && Intrinsics.d(this.f2382a, ((bd4) obj).f2382a);
    }

    public final int hashCode() {
        return this.f2382a.hashCode();
    }

    public final String toString() {
        return kng0.l("NotAllowedLocation(message=", this.f2382a, Separators.RPAREN);
    }
}
