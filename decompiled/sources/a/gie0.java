package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gie0 implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i050 f11342a;

    public gie0(i050 i050Var) {
        i050Var.getClass();
        this.f11342a = i050Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gie0) && Intrinsics.d(this.f11342a, ((gie0) obj).f11342a);
    }

    public final int hashCode() {
        return this.f11342a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.f11342a + Separators.RPAREN;
    }
}
