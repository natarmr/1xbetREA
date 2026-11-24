package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class meh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21644a;
    public final String b;
    public final ieh c;

    public meh(long j, String str, ieh iehVar) {
        this.f21644a = j;
        this.b = str;
        this.c = iehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meh)) {
            return false;
        }
        meh mehVar = (meh) obj;
        return this.f21644a == mehVar.f21644a && this.b.equals(mehVar.b) && this.c.equals(mehVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f21644a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f21644a, "CyberStageTableGroupModel(id=", ", title=", this.b);
        sbO.append(", table=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
