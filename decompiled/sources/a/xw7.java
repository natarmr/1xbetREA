package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xw7 implements dx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41596a;
    public final long b;

    public xw7(long j, ArrayList arrayList) {
        this.f41596a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw7)) {
            return false;
        }
        xw7 xw7Var = (xw7) obj;
        return this.f41596a.equals(xw7Var.f41596a) && this.b == xw7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f41596a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(marketsGroupList=" + this.f41596a + ", hiddenMarketsCount=" + this.b + Separators.RPAREN;
    }
}
