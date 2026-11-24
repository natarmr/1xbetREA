package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f30064a;
    public final wul b;
    public final long c;

    public r970(wul wulVar, wul wulVar2, long j) {
        vul vulVar = vul.f38053a;
        this.f30064a = wulVar;
        this.b = wulVar2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r970)) {
            return false;
        }
        r970 r970Var = (r970) obj;
        vul vulVar = vul.f38053a;
        if (!this.f30064a.equals(r970Var.f30064a) || !this.b.equals(r970Var.b)) {
            return false;
        }
        long j = r970Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iA = i8i.a(this.b, i8i.a(this.f30064a, vul.b.hashCode() * 31, 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iA;
    }

    public final String toString() {
        return "BottomContent(arrangement=" + vul.b + ", disableDemoButtonModel=" + this.f30064a + ", exitButtonModel=" + this.b + ", backgroundColor=" + y3d.i(this.c) + Separators.RPAREN;
    }
}
