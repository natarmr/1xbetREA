package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hia implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13104a;
    public final qhj b;
    public final mfa c;

    public hia(long j, qhj qhjVar, mfa mfaVar) {
        this.f13104a = j;
        this.b = qhjVar;
        this.c = mfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hia)) {
            return false;
        }
        hia hiaVar = (hia) obj;
        return this.f13104a == hiaVar.f13104a && this.b.equals(hiaVar.b) && this.c.equals(hiaVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        qhj qhjVar = this.b;
        long j = qhjVar.r;
        long j2 = qhjVar.p;
        long j3 = qhjVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        sb.append(j3);
        sb.append(this.f13104a);
        return sb.toString();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f13104a) * 31)) * 31);
    }

    public final String toString() {
        return "CardFooterUiItem(couponId=" + this.f13104a + ", item=" + this.b + ", model=" + this.c + Separators.RPAREN;
    }
}
