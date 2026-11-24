package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d3s0 implements f3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vr1 f5420a;
    public final String b;

    public d3s0(vr1 vr1Var, String str) {
        str.getClass();
        this.f5420a = vr1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3s0)) {
            return false;
        }
        d3s0 d3s0Var = (d3s0) obj;
        return this.f5420a.equals(d3s0Var.f5420a) && Intrinsics.d(this.b, d3s0Var.b);
    }

    @Override // a.f3s0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5420a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(cell=" + this.f5420a + ", key=" + this.b + Separators.RPAREN;
    }
}
