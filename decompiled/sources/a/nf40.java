package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23418a;

    public nf40(a4x a4xVar) {
        a4xVar.getClass();
        this.f23418a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf40) && Intrinsics.d(this.f23418a, ((nf40) obj).f23418a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(nf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f23418a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f23418a, "PromoButtons(items=", Separators.RPAREN);
    }
}
