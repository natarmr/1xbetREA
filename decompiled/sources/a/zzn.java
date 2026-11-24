package a;

import android.gov.nist.core.Separators;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn extends zna0 {
    public final zgi0 l;
    public final n0o0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(String str, int i) {
        super(str, null, i);
        str.getClass();
        this.l = zgi0.b;
        this.m = maz.b(new bh1(i, str, this));
    }

    @Override // a.zna0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ugi0)) {
            return false;
        }
        ugi0 ugi0Var = (ugi0) obj;
        return ugi0Var.l() == zgi0.b && Intrinsics.d(this.f44667a, ugi0Var.h()) && Intrinsics.d(j2e.J(this), j2e.J(ugi0Var));
    }

    @Override // a.zna0, a.ugi0
    public final ugi0 g(int i) {
        return ((ugi0[]) this.m.getValue())[i];
    }

    @Override // a.zna0
    public final int hashCode() {
        int iHashCode = this.f44667a.hashCode();
        y2 y2Var = new y2(this);
        int iHashCode2 = 1;
        while (y2Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) y2Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // a.zna0, a.ugi0
    public final c3x l() {
        return this.l;
    }

    @Override // a.zna0
    public final String toString() {
        return CollectionsKt.b0(new rx3(this, (byte) 4), ", ", axq.m(new StringBuilder(), this.f44667a, '('), Separators.RPAREN, null, 56);
    }
}
