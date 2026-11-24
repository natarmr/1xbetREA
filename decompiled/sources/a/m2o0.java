package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2o0 implements s2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kvm f21072a;
    public final kvm b;
    public final y1m c;
    public final String d;
    public final a4x e;
    public final String f;
    public final zum g;

    public m2o0(kvm kvmVar, kvm kvmVar2, y1m y1mVar, String str, a4x a4xVar, String str2, zum zumVar) {
        a4xVar.getClass();
        str2.getClass();
        this.f21072a = kvmVar;
        this.b = kvmVar2;
        this.c = y1mVar;
        this.d = str;
        this.e = a4xVar;
        this.f = str2;
        this.g = zumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2o0)) {
            return false;
        }
        m2o0 m2o0Var = (m2o0) obj;
        return this.f21072a.equals(m2o0Var.f21072a) && this.b.equals(m2o0Var.b) && this.c.equals(m2o0Var.c) && this.d.equals(m2o0Var.d) && Intrinsics.d(this.e, m2o0Var.e) && Intrinsics.d(this.f, m2o0Var.f) && this.g.equals(m2o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(cs0.b(this.e, ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f21072a.hashCode() * 31)) * 31)) * 31, 29791, this.d), 31), 31, this.f);
    }

    public final String toString() {
        return "CyberPoker(firstOpponent=" + this.f21072a + ", secondOpponent=" + this.b + ", scoreModel=" + this.c + ", gameLabel=" + this.d + ", infoLabel=, infoLabel2=, cardOnTableList=" + this.e + ", tagLive=" + this.f + ", options=" + this.g + Separators.RPAREN;
    }
}
