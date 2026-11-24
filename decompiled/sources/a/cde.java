package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cde implements nde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4159a;

    public cde(a4x a4xVar) {
        a4xVar.getClass();
        this.f4159a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cde) && Intrinsics.d(this.f4159a, ((cde) obj).f4159a);
    }

    public final int hashCode() {
        return this.f4159a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f4159a, "Items(items=", Separators.RPAREN);
    }
}
