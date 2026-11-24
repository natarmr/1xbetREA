package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o2c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24525a;
    public final String b;
    public final o0x c;
    public final int d;
    public final y3d e;
    public final long f;

    public o2c0(String str, String str2, o0x o0xVar, int i, y3d y3dVar, long j) {
        str2.getClass();
        this.f24525a = str;
        this.b = str2;
        this.c = o0xVar;
        this.d = i;
        this.e = y3dVar;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2c0)) {
            return false;
        }
        o2c0 o2c0Var = (o2c0) obj;
        if (!this.f24525a.equals(o2c0Var.f24525a) || !Intrinsics.d(this.b, o2c0Var.b) || !this.c.equals(o2c0Var.c) || this.d != o2c0Var.d || !Intrinsics.d(this.e, o2c0Var.e)) {
            return false;
        }
        long j = o2c0Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int iHashCode;
        int iA = twn.a(this.d, w6x.d(this.c, ua80.b(this.f24525a.hashCode() * 31, 31, this.b), 31), 31);
        y3d y3dVar = this.e;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = y3d.h;
        g2t0 g2t0Var2 = h2t0.b;
        return Long.hashCode(this.f) + ((iA + iHashCode) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbN = b1j.n("ProfileInfoModel(title=", this.f24525a, ", subtitle=", this.b, ", profileIcon=");
        sbN.append(this.c);
        sbN.append(", profileIconPlaceholder=");
        sbN.append(this.d);
        sbN.append(", iconTint=");
        sbN.append(this.e);
        sbN.append(", placeholderTint=");
        sbN.append(strI);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
