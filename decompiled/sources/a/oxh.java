package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26011a;
    public final boolean b;
    public final boolean c;
    public final zwh d;
    public final long e;

    public oxh(boolean z, boolean z2, boolean z3, zwh zwhVar, long j) {
        this.f26011a = z;
        this.b = z2;
        this.c = z3;
        this.d = zwhVar;
        this.e = j;
    }

    public static oxh a(oxh oxhVar, boolean z, boolean z2, boolean z3, zwh zwhVar, long j, int i) {
        if ((i & 1) != 0) {
            z = oxhVar.f26011a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = oxhVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = oxhVar.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            zwhVar = oxhVar.d;
        }
        zwh zwhVar2 = zwhVar;
        if ((i & 16) != 0) {
            j = oxhVar.e;
        }
        oxhVar.getClass();
        return new oxh(z4, z5, z6, zwhVar2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxh)) {
            return false;
        }
        oxh oxhVar = (oxh) obj;
        return this.f26011a == oxhVar.f26011a && this.b == oxhVar.b && this.c == oxhVar.c && this.d.equals(oxhVar.d) && this.e == oxhVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f26011a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CyclingResultsTableState(isLoading=", ", isError=", ", isEmpty=", this.f26011a, this.b);
        sbQ.append(this.c);
        sbQ.append(", cyclingResultsModel=");
        sbQ.append(this.d);
        sbQ.append(", checkedChipsId=");
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
