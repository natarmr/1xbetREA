package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f20969a;
    public final List b;

    public m0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f20969a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0r0)) {
            return false;
        }
        m0r0 m0r0Var = (m0r0) obj;
        return Intrinsics.d(this.f20969a, m0r0Var.f20969a) && Intrinsics.d(this.b, m0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20969a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampsLine(status=" + this.f20969a + ", value=" + this.b + Separators.RPAREN;
    }
}
