package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rx20 implements ux20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f31243a;

    public rx20(jkm jkmVar) {
        jkmVar.getClass();
        this.f31243a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx20) && Intrinsics.d(this.f31243a, ((rx20) obj).f31243a);
    }

    public final int hashCode() {
        return this.f31243a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f31243a, Separators.RPAREN);
    }
}
