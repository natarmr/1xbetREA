package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hi1 implements li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtl f13091a;
    public final bol b;

    public hi1(bol bolVar, mtl mtlVar) {
        mtlVar.getClass();
        this.f13091a = mtlVar;
        this.b = bolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi1)) {
            return false;
        }
        hi1 hi1Var = (hi1) obj;
        return Intrinsics.d(this.f13091a, hi1Var.f13091a) && this.b.equals(hi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13091a.f22376a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(bottomBarUiModel=" + this.f13091a + ", providersCardCollectionUiModel=" + this.b + Separators.RPAREN;
    }
}
