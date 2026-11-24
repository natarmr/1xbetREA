package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pum implements rum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uum f27624a;
    public final uum b;
    public final a2m c;
    public final boolean d;

    public pum(uum uumVar, uum uumVar2, a2m a2mVar, boolean z) {
        this.f27624a = uumVar;
        this.b = uumVar2;
        this.c = a2mVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pum)) {
            return false;
        }
        pum pumVar = (pum) obj;
        return this.f27624a.equals(pumVar.f27624a) && this.b.equals(pumVar.b) && this.c.equals(pumVar.c) && this.d == pumVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rz4.a(this.c, (this.b.hashCode() + (this.f27624a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "V3(firstOpponentModel=" + this.f27624a + ", secondOpponentModel=" + this.b + ", scoreModel=" + this.c + ", supportRtl=" + this.d + Separators.RPAREN;
    }
}
