package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class l7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19557a;
    public final ArrayList b;

    public l7g0(String str, ArrayList arrayList) {
        this.f19557a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7g0)) {
            return false;
        }
        l7g0 l7g0Var = (l7g0) obj;
        return this.f19557a.equals(l7g0Var.f19557a) && this.b.equals(l7g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19557a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultsGridModel(title=" + this.f19557a + ", rows=" + this.b + Separators.RPAREN;
    }
}
