package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vw80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38137a;
    public final n0x b;
    public final m0x c;
    public final String d;

    public vw80(long j, n0x n0xVar, m0x m0xVar, String str) {
        str.getClass();
        this.f38137a = j;
        this.b = n0xVar;
        this.c = m0xVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw80)) {
            return false;
        }
        vw80 vw80Var = (vw80) obj;
        return this.f38137a == vw80Var.f38137a && this.b.equals(vw80Var.b) && this.c.equals(vw80Var.c) && Intrinsics.d(this.d, vw80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.a(this.c, f140.f(this.b, Long.hashCode(this.f38137a) * 31, 31), 31);
    }

    public final String toString() {
        return "PartnerBottomInfoTeamDisciplineItemUiModel(id=" + this.f38137a + ", image=" + this.b + ", placeholder=" + this.c + ", disciplineName=" + this.d + Separators.RPAREN;
    }
}
