package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bcx implements fcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2374a;

    public bcx(a4x a4xVar) {
        a4xVar.getClass();
        this.f2374a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcx) && Intrinsics.d(this.f2374a, ((bcx) obj).f2374a);
    }

    public final int hashCode() {
        return this.f2374a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2374a, "Content(injuriesList=", Separators.RPAREN);
    }
}
