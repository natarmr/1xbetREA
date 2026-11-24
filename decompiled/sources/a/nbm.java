package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nbm implements pbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23248a;

    public nbm(a4x a4xVar) {
        a4xVar.getClass();
        this.f23248a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbm) && Intrinsics.d(this.f23248a, ((nbm) obj).f23248a);
    }

    public final int hashCode() {
        return this.f23248a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f23248a, "Content(items=", Separators.RPAREN);
    }
}
