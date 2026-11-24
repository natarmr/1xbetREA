package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l6t0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19525a;
    public final hjm b;
    public final hyl c;
    public final pqh d;

    public l6t0(String str, hjm hjmVar, fyl fylVar, pqh pqhVar) {
        this.f19525a = str;
        this.b = hjmVar;
        this.c = fylVar;
        this.d = pqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6t0)) {
            return false;
        }
        l6t0 l6t0Var = (l6t0) obj;
        return this.f19525a.equals(l6t0Var.f19525a) && this.b.equals(l6t0Var.b) && Intrinsics.d(this.c, l6t0Var.c) && this.d.equals(l6t0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f19525a;
    }

    public final int hashCode() {
        int iE = hne.e(this.b, this.f19525a.hashCode() * 31, 31);
        hyl hylVar = this.c;
        return this.d.hashCode() + ((iE + (hylVar == null ? 0 : hylVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UfcStatisticBlockUiModel(key=" + this.f19525a + ", headerModel=" + this.b + ", chipsUiModel=" + this.c + ", statistic=" + this.d + Separators.RPAREN;
    }
}
