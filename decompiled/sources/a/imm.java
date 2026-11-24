package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class imm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final llm f15032a;
    public final tlm b;
    public final gmm c;
    public final long d;
    public final boolean e;
    public final y3d f;

    public imm(llm llmVar, tlm tlmVar, gmm gmmVar, long j, boolean z, y3d y3dVar) {
        llmVar.getClass();
        tlmVar.getClass();
        gmmVar.getClass();
        this.f15032a = llmVar;
        this.b = tlmVar;
        this.c = gmmVar;
        this.d = j;
        this.e = z;
        this.f = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imm)) {
            return false;
        }
        imm immVar = (imm) obj;
        if (!Intrinsics.d(this.f15032a, immVar.f15032a) || !Intrinsics.d(this.b, immVar.b) || !Intrinsics.d(this.c, immVar.c)) {
            return false;
        }
        long j = immVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e == immVar.e && Intrinsics.d(this.f, immVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f15032a.hashCode() * 31)) * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iE = brm0.e(rw2.b(iHashCode, 31, this.d), 31, this.e);
        y3d y3dVar = this.f;
        return iE + (y3dVar == null ? 0 : Long.hashCode(y3dVar.f41946a));
    }

    public final String toString() {
        return "DsNavigationBarUiModel(navigationBarLeftStyle=" + this.f15032a + ", navigationBarMiddleStyle=" + this.b + ", navigationBarRightStyle=" + this.c + ", backgroundColor=" + y3d.i(this.d) + ", showSeparator=" + this.e + ", separatorColor=" + this.f + Separators.RPAREN;
    }
}
