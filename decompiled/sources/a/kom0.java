package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kom0 implements mom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18638a;

    public kom0(String str) {
        str.getClass();
        this.f18638a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kom0) && Intrinsics.d(this.f18638a, ((kom0) obj).f18638a);
    }

    public final int hashCode() {
        return this.f18638a.hashCode();
    }

    public final String toString() {
        return kng0.l("Live(status=", this.f18638a, Separators.RPAREN);
    }
}
