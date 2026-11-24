package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ksk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f18818a;
    public final List b;

    public ksk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f18818a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksk0)) {
            return false;
        }
        ksk0 ksk0Var = (ksk0) obj;
        return this.f18818a.equals(ksk0Var.f18818a) && Intrinsics.d(this.b, ksk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18818a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Promotions(status=", this.f18818a, ", content=", this.b, Separators.RPAREN);
    }
}
