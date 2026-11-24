package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class van0 implements yan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37099a;

    public van0(a4x a4xVar) {
        a4xVar.getClass();
        this.f37099a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof van0) && Intrinsics.d(this.f37099a, ((van0) obj).f37099a);
    }

    public final int hashCode() {
        return this.f37099a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f37099a, "Loading(shimmerList=", Separators.RPAREN);
    }
}
