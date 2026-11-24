package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b8d0 implements e8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2151a;

    public b8d0(a4x a4xVar) {
        a4xVar.getClass();
        this.f2151a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8d0) && Intrinsics.d(this.f2151a, ((b8d0) obj).f2151a);
    }

    public final int hashCode() {
        return this.f2151a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2151a, "Content(games=", Separators.RPAREN);
    }
}
