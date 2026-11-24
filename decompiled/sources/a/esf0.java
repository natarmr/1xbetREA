package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class esf0 {
    public static final dsf0 Companion = new dsf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f8325a;
    public final Integer b;
    public final orf0 c;

    public /* synthetic */ esf0(int i, Double d, Integer num, orf0 orf0Var) {
        if ((i & 1) == 0) {
            this.f8325a = null;
        } else {
            this.f8325a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = orf0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esf0)) {
            return false;
        }
        esf0 esf0Var = (esf0) obj;
        return Intrinsics.d(this.f8325a, esf0Var.f8325a) && Intrinsics.d(this.b, esf0Var.b) && this.c == esf0Var.c;
    }

    public final int hashCode() {
        Double d = this.f8325a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        orf0 orf0Var = this.c;
        return iHashCode2 + (orf0Var != null ? orf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ResidentSubjectResponse(money=" + this.f8325a + ", position=" + this.b + ", safe=" + this.c + Separators.RPAREN;
    }
}
