package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gar0 implements iar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10983a;

    public gar0(a4x a4xVar) {
        a4xVar.getClass();
        this.f10983a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gar0) && Intrinsics.d(this.f10983a, ((gar0) obj).f10983a);
    }

    public final int hashCode() {
        return this.f10983a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f10983a, "Content(items=", Separators.RPAREN);
    }
}
