package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bde implements mde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2395a;

    public bde(a4x a4xVar) {
        a4xVar.getClass();
        this.f2395a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bde) && Intrinsics.d(this.f2395a, ((bde) obj).f2395a);
    }

    public final int hashCode() {
        return this.f2395a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2395a, "Items(items=", Separators.RPAREN);
    }
}
