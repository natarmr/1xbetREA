package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mxr0 extends nsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22573a;
    public final a4x b;

    public mxr0(a4x a4xVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f22573a = a4xVar;
        this.b = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxr0)) {
            return false;
        }
        mxr0 mxr0Var = (mxr0) obj;
        return Intrinsics.d(this.f22573a, mxr0Var.f22573a) && Intrinsics.d(this.b, mxr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22573a.hashCode() * 31);
    }

    @Override // a.nsm0
    public final a4x r() {
        return this.f22573a;
    }

    public final String toString() {
        return "TournamentBracketStagePlayoff(columns=" + this.f22573a + ", sectionLabels=" + this.b + Separators.RPAREN;
    }
}
