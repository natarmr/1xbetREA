package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ssk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f32731a;
    public final List b;

    public ssk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f32731a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssk0)) {
            return false;
        }
        ssk0 ssk0Var = (ssk0) obj;
        return this.f32731a.equals(ssk0Var.f32731a) && Intrinsics.d(this.b, ssk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32731a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Venues(status=", this.f32731a, ", content=", this.b, Separators.RPAREN);
    }
}
