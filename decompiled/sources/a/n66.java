package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n66 implements o66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f22980a;
    public final czm b;
    public final String c;
    public final ezm d;

    public n66(czm czmVar, czm czmVar2, String str, ezm ezmVar) {
        str.getClass();
        this.f22980a = czmVar;
        this.b = czmVar2;
        this.c = str;
        this.d = ezmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n66)) {
            return false;
        }
        n66 n66Var = (n66) obj;
        return this.f22980a.equals(n66Var.f22980a) && this.b.equals(n66Var.b) && Intrinsics.d(this.c, n66Var.c) && Intrinsics.d(this.d, n66Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f22980a.hashCode() * 31)) * 31, 31, this.c);
        ezm ezmVar = this.d;
        return iB + (ezmVar == null ? 0 : ezmVar.hashCode());
    }

    public final String toString() {
        return "TwoPairs(teamOne=" + this.f22980a + ", teamTwo=" + this.b + ", info=" + this.c + ", timerModel=" + this.d + Separators.RPAREN;
    }
}
