package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v2b0 implements x2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f36675a;

    public v2b0(a4x a4xVar) {
        a4xVar.getClass();
        this.f36675a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2b0) && Intrinsics.d(this.f36675a, ((v2b0) obj).f36675a);
    }

    public final int hashCode() {
        return this.f36675a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f36675a, "Content(items=", Separators.RPAREN);
    }
}
