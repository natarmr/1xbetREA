package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cla0 implements ela0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4548a;

    public cla0(a4x a4xVar) {
        a4xVar.getClass();
        this.f4548a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cla0) && Intrinsics.d(this.f4548a, ((cla0) obj).f4548a);
    }

    public final int hashCode() {
        return this.f4548a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f4548a, "Content(results=", Separators.RPAREN);
    }
}
