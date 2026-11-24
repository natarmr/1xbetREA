package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rq90 implements sq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30921a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public rq90(boolean z, boolean z2, String str, int i) {
        str.getClass();
        this.f30921a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq90)) {
            return false;
        }
        rq90 rq90Var = (rq90) obj;
        return Intrinsics.d(this.f30921a, rq90Var.f30921a) && this.b == rq90Var.b && this.c == rq90Var.c && this.d == rq90Var.d;
    }

    @Override // a.sq90
    public final int getId() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(brm0.e(this.f30921a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("WithoutImage(description=", this.f30921a, ", isLastItem=", this.b, ", selected=");
        sbU.append(this.c);
        sbU.append(", id=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
