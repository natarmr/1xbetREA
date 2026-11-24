package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qhc0 implements shc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28731a;
    public final String b;
    public final long c;
    public final imm d;
    public final imm e;

    public qhc0(String str, String str2, long j, imm immVar, imm immVar2) {
        str.getClass();
        this.f28731a = str;
        this.b = str2;
        this.c = j;
        this.d = immVar;
        this.e = immVar2;
    }

    @Override // a.shc0
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhc0)) {
            return false;
        }
        qhc0 qhc0Var = (qhc0) obj;
        if (!Intrinsics.d(this.f28731a, qhc0Var.f28731a) || !this.b.equals(qhc0Var.b)) {
            return false;
        }
        long j = qhc0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(qhc0Var.d) && this.e.equals(qhc0Var.e);
    }

    @Override // a.shc0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f28731a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.e.hashCode() + h97.a(this.d, rw2.b(iB, 31, this.c), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sbN = b1j.n("Default(imageUrl=", this.f28731a, ", title=", this.b, ", containerColor=");
        sbN.append(strI);
        sbN.append(", expandedNavigationBar=");
        sbN.append(this.d);
        sbN.append(", collapsedNavigationBar=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
