package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class csr implements Serializable {
    public static final csr e = new csr(new bsr(esr.NOTHING, 0, 0.0d), "", dsr.b, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsr f4905a;
    public final String b;
    public final dsr c;
    public final long d;

    public csr(bsr bsrVar, String str, dsr dsrVar, long j) {
        this.f4905a = bsrVar;
        this.b = str;
        this.c = dsrVar;
        this.d = j;
    }

    public final boolean a() {
        csr csrVar = e;
        esr esrVar = csrVar.f4905a.f3145a;
        bsr bsrVar = this.f4905a;
        return esrVar == bsrVar.f3145a && csrVar.b.equals(this.b) && csrVar.f4905a.b == bsrVar.b && csrVar.c == this.c && csrVar.d == this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csr)) {
            return false;
        }
        csr csrVar = (csr) obj;
        return this.f4905a.equals(csrVar.f4905a) && this.b.equals(csrVar.b) && this.c == csrVar.c && this.d == csrVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ua80.b(this.f4905a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "GameBonus(bonusIdentifierDetails=" + this.f4905a + ", bonusDescription=" + this.b + ", bonusEnabled=" + this.c + ", count=" + this.d + Separators.RPAREN;
    }
}
