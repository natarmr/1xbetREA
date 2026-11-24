package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class qcv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28502a;
    public final ArrayList b;
    public final ArrayList c;

    public qcv(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.f28502a = i;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcv)) {
            return false;
        }
        qcv qcvVar = (qcv) obj;
        return this.f28502a == qcvVar.f28502a && this.b.equals(qcvVar.b) && this.c.equals(qcvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, Integer.hashCode(this.f28502a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GrandPrixStatisticModel(sportId=");
        sb.append(this.f28502a);
        sb.append(", stages=");
        sb.append(this.b);
        sb.append(", seasonSelectors=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
