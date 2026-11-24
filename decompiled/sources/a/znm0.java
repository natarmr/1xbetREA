package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class znm0 implements bom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44684a;

    public znm0(String str) {
        str.getClass();
        this.f44684a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znm0) && Intrinsics.d(this.f44684a, ((znm0) obj).f44684a);
    }

    public final int hashCode() {
        return this.f44684a.hashCode();
    }

    public final String toString() {
        return kng0.l("Live(status=", this.f44684a, Separators.RPAREN);
    }
}
