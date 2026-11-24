package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sbg implements vbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31931a;

    public sbg(a4x a4xVar) {
        a4xVar.getClass();
        this.f31931a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbg) && Intrinsics.d(this.f31931a, ((sbg) obj).f31931a);
    }

    public final int hashCode() {
        return this.f31931a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f31931a, "Content(sections=", Separators.RPAREN);
    }
}
