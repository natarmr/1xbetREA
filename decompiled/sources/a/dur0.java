package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dur0 implements iur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f6711a;
    public final String b;
    public final smr0 c;

    public dur0(a4x a4xVar, String str, smr0 smr0Var) {
        a4xVar.getClass();
        this.f6711a = a4xVar;
        this.b = str;
        this.c = smr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dur0)) {
            return false;
        }
        dur0 dur0Var = (dur0) obj;
        return Intrinsics.d(this.f6711a, dur0Var.f6711a) && this.b.equals(dur0Var.b) && this.c.equals(dur0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f6711a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(totoActiveTirageUiItems=" + this.f6711a + ", totoName=" + this.b + ", totoBottomBarUiModel=" + this.c + Separators.RPAREN;
    }
}
