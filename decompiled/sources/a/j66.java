package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j66 implements o66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f15969a;
    public final czm b;
    public final String c;
    public final ezm d;

    public j66(czm czmVar, czm czmVar2, String str, ezm ezmVar) {
        str.getClass();
        this.f15969a = czmVar;
        this.b = czmVar2;
        this.c = str;
        this.d = ezmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j66)) {
            return false;
        }
        j66 j66Var = (j66) obj;
        return this.f15969a.equals(j66Var.f15969a) && this.b.equals(j66Var.b) && Intrinsics.d(this.c, j66Var.c) && Intrinsics.d(this.d, j66Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f15969a.hashCode() * 31)) * 31, 31, this.c);
        ezm ezmVar = this.d;
        return iB + (ezmVar == null ? 0 : ezmVar.hashCode());
    }

    public final String toString() {
        return "MultiTeams(teamOne=" + this.f15969a + ", teamTwo=" + this.b + ", info=" + this.c + ", timerModel=" + this.d + Separators.RPAREN;
    }
}
