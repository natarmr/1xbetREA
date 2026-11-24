package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s1l0 implements u1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1l0 f31463a;
    public final p1l0 b;
    public final uf5 c;
    public final String d;
    public final String e;
    public final y3d f;

    public s1l0(p1l0 p1l0Var, uf5 uf5Var, String str, String str2, y3d y3dVar, int i) {
        p1l0 p1l0Var2 = (i & 2) != 0 ? null : p1l0.SPORT_ICON;
        uf5Var = (i & 4) != 0 ? null : uf5Var;
        str2 = (i & 16) != 0 ? null : str2;
        y3dVar = (i & 64) != 0 ? null : y3dVar;
        this.f31463a = p1l0Var;
        this.b = p1l0Var2;
        this.c = uf5Var;
        this.d = str;
        this.e = str2;
        this.f = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1l0)) {
            return false;
        }
        s1l0 s1l0Var = (s1l0) obj;
        return this.f31463a == s1l0Var.f31463a && this.b == s1l0Var.b && Intrinsics.d(this.c, s1l0Var.c) && Intrinsics.d(this.d, s1l0Var.d) && Intrinsics.d(this.e, s1l0Var.e) && Intrinsics.d(this.f, s1l0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f31463a.hashCode() * 31;
        int iHashCode2 = 0;
        p1l0 p1l0Var = this.b;
        int iHashCode3 = (iHashCode + (p1l0Var == null ? 0 : p1l0Var.hashCode())) * 31;
        uf5 uf5Var = this.c;
        int iHashCode4 = (iHashCode3 + (uf5Var == null ? 0 : uf5Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 961;
        y3d y3dVar = this.f;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode2 = Long.hashCode(j);
        }
        return iHashCode6 + iHashCode2;
    }

    public final String toString() {
        return "ChampionshipIcon(largePlaceholderIcon=" + this.f31463a + ", smallPlaceholderIcon=" + this.b + ", badgeStyle=" + this.c + ", largeIconUrl=" + this.d + ", smallIconUrl=" + this.e + ", largeIconColor=null, lageIconPlaceHolderTint=" + this.f + Separators.RPAREN;
    }
}
