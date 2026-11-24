package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f24054a;
    public final List b;

    public nsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f24054a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsk0)) {
            return false;
        }
        nsk0 nsk0Var = (nsk0) obj;
        return this.f24054a.equals(nsk0Var.f24054a) && Intrinsics.d(this.b, nsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24054a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Stadiums(status=", this.f24054a, ", content=", this.b, Separators.RPAREN);
    }
}
