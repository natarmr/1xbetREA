package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9982a;
    public final int b;
    public final ArrayList c;

    public fqm(int i, ArrayList arrayList, boolean z) {
        this.f9982a = z;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqm)) {
            return false;
        }
        fqm fqmVar = (fqm) obj;
        return this.f9982a == fqmVar.f9982a && this.b == fqmVar.b && this.c.equals(fqmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f9982a) * 31, 31);
    }

    public final String toString() {
        return rz4.n(ohs0.t(this.b, "DsSegmentUIModel(isPaused=", ", activeSegmentIndex=", ", durations=", this.f9982a), this.c, Separators.RPAREN);
    }
}
