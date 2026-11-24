package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aw40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1556a;
    public final String b;
    public final String c;

    public aw40(long j, String str, String str2) {
        this.f1556a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw40)) {
            return false;
        }
        aw40 aw40Var = (aw40) obj;
        return this.f1556a == aw40Var.f1556a && this.b.equals(aw40Var.b) && this.c.equals(aw40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f1556a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f1556a, "ChipsListViewItem(id=", ", name=", this.b), ", imageId=", this.c, Separators.RPAREN);
    }
}
