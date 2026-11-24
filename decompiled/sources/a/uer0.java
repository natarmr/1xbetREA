package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uer0 implements wer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35543a;

    public uer0(a4x a4xVar) {
        a4xVar.getClass();
        this.f35543a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uer0) && Intrinsics.d(this.f35543a, ((uer0) obj).f35543a);
    }

    public final int hashCode() {
        return this.f35543a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f35543a, "Content(items=", Separators.RPAREN);
    }
}
