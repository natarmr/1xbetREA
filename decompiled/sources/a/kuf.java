package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kuf implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f18907a;
    public final a4x b;

    public kuf(hjm hjmVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f18907a = hjmVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuf)) {
            return false;
        }
        kuf kufVar = (kuf) obj;
        return this.f18907a.equals(kufVar.f18907a) && Intrinsics.d(this.b, kufVar.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CUPHEAD_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + hne.e(this.f18907a, 1697497154, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return "CupheadUiModel(key=CUPHEAD_KEY, header=" + this.f18907a + ", rounds=" + this.b + Separators.RPAREN;
    }
}
