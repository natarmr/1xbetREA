package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3727a;
    public final boolean b;
    public final o0x c;
    public final m0x d;
    public final y3d e;
    public final y3d f;

    public /* synthetic */ c4i(String str, boolean z, n0x n0xVar, m0x m0xVar, y3d y3dVar, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : n0xVar, (i & 8) != 0 ? null : m0xVar, (i & 16) != 0 ? null : y3dVar, (y3d) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4i)) {
            return false;
        }
        c4i c4iVar = (c4i) obj;
        return Intrinsics.d(this.f3727a, c4iVar.f3727a) && this.b == c4iVar.b && Intrinsics.d(this.c, c4iVar.c) && Intrinsics.d(this.d, c4iVar.d) && Intrinsics.d(this.e, c4iVar.e) && Intrinsics.d(this.f, c4iVar.f);
    }

    public final int hashCode() {
        int iHashCode;
        int iE = brm0.e(this.f3727a.hashCode() * 31, 31, this.b);
        int iHashCode2 = 0;
        o0x o0xVar = this.c;
        int iHashCode3 = (iE + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31;
        m0x m0xVar = this.d;
        int iHashCode4 = (iHashCode3 + (m0xVar == null ? 0 : m0xVar.hashCode())) * 31;
        y3d y3dVar = this.e;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode4 + iHashCode) * 31;
        y3d y3dVar2 = this.f;
        if (y3dVar2 != null) {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        return i + iHashCode2;
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("DSSportEventCardTopLabelModel(label=", this.f3727a, ", popularIconAvailable=", this.b, ", sportIcon=");
        sbU.append(this.c);
        sbU.append(", sportIconPlaceholder=");
        sbU.append(this.d);
        sbU.append(", sportIconTint=");
        sbU.append(this.e);
        sbU.append(", sportIconPlaceholderTint=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }

    public c4i(String str, boolean z, o0x o0xVar, m0x m0xVar, y3d y3dVar, y3d y3dVar2) {
        str.getClass();
        this.f3727a = str;
        this.b = z;
        this.c = o0xVar;
        this.d = m0xVar;
        this.e = y3dVar;
        this.f = y3dVar2;
    }
}
