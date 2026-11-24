package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mu1 implements ou1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22392a;

    public mu1(a4x a4xVar) {
        a4xVar.getClass();
        this.f22392a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu1) && Intrinsics.d(this.f22392a, ((mu1) obj).f22392a);
    }

    public final int hashCode() {
        return this.f22392a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f22392a, "Content(items=", Separators.RPAREN);
    }
}
