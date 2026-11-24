package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class plm implements tlm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27190a;
    public final ha50 b;
    public final long c;
    public final ga50 d;

    public plm(String str, ha50 ha50Var, long j, ga50 ga50Var) {
        str.getClass();
        ga50Var.getClass();
        this.f27190a = str;
        this.b = ha50Var;
        this.c = j;
        this.d = ga50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plm)) {
            return false;
        }
        plm plmVar = (plm) obj;
        if (!Intrinsics.d(this.f27190a, plmVar.f27190a) || this.b != plmVar.b) {
            return false;
        }
        long j = plmVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, plmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f27190a.hashCode() * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.d.hashCode() + rw2.b(iHashCode, 31, this.c);
    }

    public final String toString() {
        return "Title(title=" + this.f27190a + ", titleMaxLines=" + this.b + ", titleColor=" + y3d.i(this.c) + ", options=" + this.d + Separators.RPAREN;
    }

    public /* synthetic */ plm(String str, long j, ga50 ga50Var) {
        this(str, ha50.TWO_LINES, j, ga50Var);
    }
}
