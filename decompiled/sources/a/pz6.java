package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k390 f27829a;
    public final int b;
    public final int c;

    public pz6(k390 k390Var, int i, int i2) {
        k390Var.getClass();
        this.f27829a = k390Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz6)) {
            return false;
        }
        pz6 pz6Var = (pz6) obj;
        return Intrinsics.d(this.f27829a, pz6Var.f27829a) && this.b == pz6Var.b && this.c == pz6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f27829a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Purchase(result=");
        sb.append(this.f27829a);
        sb.append(", boughtCount=");
        sb.append(this.b);
        sb.append(", countPosition=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
