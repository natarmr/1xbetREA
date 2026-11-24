package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32981a;
    public final long b;
    public final List c;

    public sxk0(int i, long j, List list) {
        list.getClass();
        this.f32981a = i;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxk0)) {
            return false;
        }
        sxk0 sxk0Var = (sxk0) obj;
        return this.f32981a == sxk0Var.f32981a && this.b == sxk0Var.b && Intrinsics.d(this.c, sxk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Integer.hashCode(this.f32981a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(vqd.q(this.f32981a, this.b, "SpinAllInfo(freeSpinCounts=", ", freeSpinTimer="), ", prizes=", this.c, Separators.RPAREN);
    }
}
