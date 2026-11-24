package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class de70 implements ge70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f5935a;

    public de70(a4x a4xVar) {
        a4xVar.getClass();
        this.f5935a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de70) && Intrinsics.d(this.f5935a, ((de70) obj).f5935a);
    }

    public final int hashCode() {
        return this.f5935a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f5935a, "Content(items=", Separators.RPAREN);
    }
}
