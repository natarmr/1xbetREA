package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e8h0 implements g9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7372a;

    public e8h0(a4x a4xVar) {
        a4xVar.getClass();
        this.f7372a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8h0) && Intrinsics.d(this.f7372a, ((e8h0) obj).f7372a);
    }

    public final int hashCode() {
        return this.f7372a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f7372a, "Default(items=", Separators.RPAREN);
    }
}
