package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nh0 implements ph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23509a;
    public final String b;
    public final String c;

    public nh0(long j, String str, String str2) {
        str.getClass();
        this.f23509a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh0)) {
            return false;
        }
        nh0 nh0Var = (nh0) obj;
        return this.f23509a == nh0Var.f23509a && Intrinsics.d(this.b, nh0Var.b) && this.c.equals(nh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f23509a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f23509a, "Content(id=", ", title=", this.b), ", imageLink=", this.c, Separators.RPAREN);
    }
}
