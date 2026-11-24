package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qa5 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28378a;
    public final zrm b;

    public qa5(long j, zrm zrmVar) {
        this.f28378a = j;
        this.b = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa5)) {
            return false;
        }
        qa5 qa5Var = (qa5) obj;
        return this.f28378a == qa5Var.f28378a && this.b.equals(qa5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f28378a) * 31);
    }

    public final String toString() {
        return "AwardCellUiModel(id=" + this.f28378a + ", dsSportCellStyle=" + this.b + Separators.RPAREN;
    }
}
