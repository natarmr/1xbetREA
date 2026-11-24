package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18113a;
    public final Date b;
    public final long c;
    public final mnl d;

    public kdm(String str, Date date, long j, mnl mnlVar) {
        this.f18113a = str;
        this.b = date;
        this.c = j;
        this.d = mnlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdm)) {
            return false;
        }
        kdm kdmVar = (kdm) obj;
        return this.f18113a.equals(kdmVar.f18113a) && Intrinsics.d(this.b, kdmVar.b) && this.c == kdmVar.c && this.d.equals(kdmVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f18113a.hashCode() * 31;
        Date date = this.b;
        return this.d.hashCode() + rw2.b((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "DsDateContainerUiModel(dateText=" + this.f18113a + ", dateExpired=" + this.b + ", timeToExpire=" + this.c + ", timeSignaturesUiModel=" + this.d + Separators.RPAREN;
    }
}
