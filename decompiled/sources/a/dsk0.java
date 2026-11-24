package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f6615a;
    public final List b;

    public dsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f6615a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsk0)) {
            return false;
        }
        dsk0 dsk0Var = (dsk0) obj;
        return this.f6615a.equals(dsk0Var.f6615a) && Intrinsics.d(this.b, dsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6615a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Line(status=", this.f6615a, ", content=", this.b, Separators.RPAREN);
    }
}
