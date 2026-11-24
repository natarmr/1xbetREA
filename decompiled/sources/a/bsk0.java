package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f3134a;
    public final List b;

    public bsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f3134a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsk0)) {
            return false;
        }
        bsk0 bsk0Var = (bsk0) obj;
        return this.f3134a.equals(bsk0Var.f3134a) && Intrinsics.d(this.b, bsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3134a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("DotaPopularHeroes(status=", this.f3134a, ", content=", this.b, Separators.RPAREN);
    }
}
