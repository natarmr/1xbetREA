package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a2x implements d2x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f145a;

    public a2x(dyw dywVar) {
        dywVar.getClass();
        this.f145a = dywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2x) && Intrinsics.d(this.f145a, ((a2x) obj).f145a);
    }

    public final int hashCode() {
        return this.f145a.hashCode();
    }

    public final String toString() {
        return "Cached(image=" + this.f145a + Separators.RPAREN;
    }
}
