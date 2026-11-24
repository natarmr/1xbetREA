package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tru0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34435a;
    public final int b;
    public final zrm c;

    public tru0(String str, int i, zrm zrmVar) {
        str.getClass();
        this.f34435a = str;
        this.b = i;
        this.c = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tru0)) {
            return false;
        }
        tru0 tru0Var = (tru0) obj;
        return Intrinsics.d(this.f34435a, tru0Var.f34435a) && this.b == tru0Var.b && this.c.equals(tru0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f34435a;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f34435a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "VirtualGamesCategoryUiModel(key=", this.f34435a, ", id=", ", dsSportCellStyle=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
