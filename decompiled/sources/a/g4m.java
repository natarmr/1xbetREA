package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g4m implements i4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10673a;

    public g4m(a4x a4xVar) {
        a4xVar.getClass();
        this.f10673a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4m) && Intrinsics.d(this.f10673a, ((g4m) obj).f10673a);
    }

    public final int hashCode() {
        return this.f10673a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f10673a, "Content(items=", Separators.RPAREN);
    }
}
