package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h7u0 implements f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12593a;

    public h7u0(String str) {
        this.f12593a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h7u0) {
            return Intrinsics.d(this.f12593a, ((h7u0) obj).f12593a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12593a.hashCode();
    }

    public final String toString() {
        return kng0.l("VerbatimTtsAnnotation(verbatim=", this.f12593a, Separators.RPAREN);
    }
}
