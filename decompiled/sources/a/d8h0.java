package a;

import android.gov.nist.core.Separators;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d8h0 implements f9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f5648a;
    public final boolean b;

    public d8h0(int i, Set set) {
        set = (i & 1) != 0 ? xun.f41520a : set;
        boolean z = (i & 2) == 0;
        set.getClass();
        this.f5648a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8h0)) {
            return false;
        }
        d8h0 d8h0Var = (d8h0) obj;
        return this.f5648a.equals(d8h0Var.f5648a) && this.b == d8h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5648a.hashCode() * 31);
    }

    public final String toString() {
        return "Champs(countries=" + this.f5648a + ", top=" + this.b + Separators.RPAREN;
    }
}
