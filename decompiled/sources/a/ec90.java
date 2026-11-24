package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ec90 implements oc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7554a;
    public final d4d b;
    public final String c;

    public ec90(int i, d4d d4dVar, String str) {
        str.getClass();
        this.f7554a = i;
        this.b = d4dVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec90)) {
            return false;
        }
        ec90 ec90Var = (ec90) obj;
        return this.f7554a == ec90Var.f7554a && this.b == ec90Var.b && Intrinsics.d(this.c, ec90Var.c);
    }

    @Override // a.oc90
    public final int getKey() {
        return this.f7554a;
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.b(this.b, Integer.hashCode(this.f7554a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PenaltyExpected(key=");
        sb.append(this.f7554a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", penaltyNumber=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
