package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m5h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f21218a;

    public m5h(a4x a4xVar) {
        a4xVar.getClass();
        this.f21218a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5h) && Intrinsics.d(this.f21218a, ((m5h) obj).f21218a);
    }

    public final int hashCode() {
        return this.f21218a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f21218a, "Content(items=", Separators.RPAREN);
    }
}
