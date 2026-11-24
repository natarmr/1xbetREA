package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f19217a;
    public final List b;

    public l0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f19217a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0r0)) {
            return false;
        }
        l0r0 l0r0Var = (l0r0) obj;
        return Intrinsics.d(this.f19217a, l0r0Var.f19217a) && Intrinsics.d(this.b, l0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19217a.hashCode() * 31);
    }

    public final String toString() {
        return "BannerTape(status=" + this.f19217a + ", value=" + this.b + Separators.RPAREN;
    }
}
