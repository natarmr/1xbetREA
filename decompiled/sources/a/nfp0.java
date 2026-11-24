package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class nfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23448a;
    public final String b;
    public final ArrayList c;

    public nfp0(long j, String str, ArrayList arrayList) {
        this.f23448a = j;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfp0)) {
            return false;
        }
        nfp0 nfp0Var = (nfp0) obj;
        return this.f23448a == nfp0Var.f23448a && this.b.equals(nfp0Var.b) && this.c.equals(nfp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f23448a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23448a, "TeamMenuModel(sportId=", ", stadiumId=", this.b);
        sbO.append(", items=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
