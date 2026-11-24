package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pj10 implements qj10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj10 f27067a;

    public pj10(vj10 vj10Var) {
        vj10Var.getClass();
        this.f27067a = vj10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj10) && Intrinsics.d(this.f27067a, ((pj10) obj).f27067a);
    }

    public final int hashCode() {
        return this.f27067a.hashCode();
    }

    public final String toString() {
        return "ShowCard(luckyCardModel=" + this.f27067a + Separators.RPAREN;
    }
}
