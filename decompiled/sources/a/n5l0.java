package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22949a;
    public final String b;
    public final String c;
    public final y3d d;
    public final y3d e;
    public final boolean f;
    public final boolean g;

    public n5l0(String str, String str2, String str3, y3d y3dVar, y3d y3dVar2, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f22949a = str;
        this.b = str2;
        this.c = str3;
        this.d = y3dVar;
        this.e = y3dVar2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5l0)) {
            return false;
        }
        n5l0 n5l0Var = (n5l0) obj;
        return Intrinsics.d(this.f22949a, n5l0Var.f22949a) && Intrinsics.d(this.b, n5l0Var.b) && Intrinsics.d(this.c, n5l0Var.c) && this.d.equals(n5l0Var.d) && this.e.equals(n5l0Var.e) && this.f == n5l0Var.f && this.g == n5l0Var.g;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f22949a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.g) + brm0.e(rw2.b(rw2.b(iB, 31, j), 31, this.e.f41946a), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SportEventCardCompactMultiScoreModel(scoreOne=", this.f22949a, ", scoreTwo=", this.b, ", scoreTitle=");
        sbN.append(this.c);
        sbN.append(", scoreTwoColor=");
        sbN.append(this.d);
        sbN.append(", scoreOneColor=");
        sbN.append(this.e);
        sbN.append(", scoreOneBold=");
        sbN.append(this.f);
        sbN.append(", scoreTwoBold=");
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
