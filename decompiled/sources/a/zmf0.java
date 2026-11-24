package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zmf0 implements dnf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f44624a;

    public zmf0(a4x a4xVar) {
        a4xVar.getClass();
        this.f44624a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmf0) && Intrinsics.d(this.f44624a, ((zmf0) obj).f44624a);
    }

    public final int hashCode() {
        return this.f44624a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f44624a, "Loaded(items=", Separators.RPAREN);
    }
}
