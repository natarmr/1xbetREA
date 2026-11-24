package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class l820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19589a;
    public final i2o b;
    public final String c;

    public l820(long j, i2o i2oVar, String str) {
        i2oVar.getClass();
        this.f19589a = j;
        this.b = i2oVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l820)) {
            return false;
        }
        l820 l820Var = (l820) obj;
        return this.f19589a == l820Var.f19589a && this.b == l820Var.b && this.c.equals(l820Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f19589a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetEventErrorModel(gameId=");
        sb.append(this.f19589a);
        sb.append(", errorCode=");
        sb.append(this.b);
        return rw2.o(sb, ", errorMessage=", this.c, Separators.RPAREN);
    }
}
