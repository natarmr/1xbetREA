package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ijw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gjw f14898a;
    public final a4x b;

    public ijw(gjw gjwVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f14898a = gjwVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijw)) {
            return false;
        }
        ijw ijwVar = (ijw) obj;
        return Intrinsics.d(this.f14898a, ijwVar.f14898a) && Intrinsics.d(this.b, ijwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14898a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeScrollableContentState(screenState=" + this.f14898a + ", uiItems=" + this.b + Separators.RPAREN;
    }

    public ijw(gjw gjwVar) {
        this(gjwVar, lak0.c);
    }
}
