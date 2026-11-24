package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hoo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13404a;
    public final int b;

    public hoo0(ArrayList arrayList, int i) {
        this.f13404a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoo0)) {
            return false;
        }
        hoo0 hoo0Var = (hoo0) obj;
        return this.f13404a.equals(hoo0Var.f13404a) && this.b == hoo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f13404a.hashCode() * 31);
    }

    public final String toString() {
        return "TagLine(indices=" + this.f13404a + ", nextIndex=" + this.b + Separators.RPAREN;
    }
}
