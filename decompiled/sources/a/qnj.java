package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29032a;
    public final String b;

    public qnj(long j, String str) {
        this.f29032a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnj)) {
            return false;
        }
        qnj qnjVar = (qnj) obj;
        return this.f29032a == qnjVar.f29032a && this.b.equals(qnjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + rw2.b(Boolean.hashCode(false) * 31, 31, this.f29032a);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29032a, "OneXGamesByGameId(hasBackStack=false, id=", ", from=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
