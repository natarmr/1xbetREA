package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o2m implements t2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24537a;
    public final o0x b;
    public final int c;
    public final long d;
    public final y3d e;
    public final y3d f;
    public final y3d g;

    public o2m(String str, o0x o0xVar, int i, long j, y3d y3dVar, y3d y3dVar2, y3d y3dVar3) {
        str.getClass();
        o0xVar.getClass();
        this.f24537a = str;
        this.b = o0xVar;
        this.c = i;
        this.d = j;
        this.e = y3dVar;
        this.f = y3dVar2;
        this.g = y3dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2m)) {
            return false;
        }
        o2m o2mVar = (o2m) obj;
        if (!Intrinsics.d(this.f24537a, o2mVar.f24537a) || !Intrinsics.d(this.b, o2mVar.b) || this.c != o2mVar.c) {
            return false;
        }
        long j = o2mVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && Intrinsics.d(this.e, o2mVar.e) && Intrinsics.d(this.f, o2mVar.f) && Intrinsics.d(this.g, o2mVar.g);
    }

    @Override // a.t2m
    public final String getId() {
        return this.f24537a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, w6x.d(this.b, this.f24537a.hashCode() * 31, 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(iA, 31, this.d);
        y3d y3dVar = this.e;
        int iHashCode = (iB + (y3dVar == null ? 0 : Long.hashCode(y3dVar.f41946a))) * 31;
        y3d y3dVar2 = this.f;
        int iHashCode2 = (iHashCode + (y3dVar2 == null ? 0 : Long.hashCode(y3dVar2.f41946a))) * 31;
        y3d y3dVar3 = this.g;
        return iHashCode2 + (y3dVar3 != null ? Long.hashCode(y3dVar3.f41946a) : 0);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        StringBuilder sb = new StringBuilder("Icon(id=");
        sb.append(this.f24537a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", placeholder=");
        kng0.w(this.c, ", placeholderTint=", strI, ", iconColor=", sb);
        sb.append(this.e);
        sb.append(", borderColor=");
        sb.append(this.f);
        sb.append(", backgroundColor=");
        return hne.p(sb, this.g, Separators.RPAREN);
    }

    public /* synthetic */ o2m(o0x o0xVar, int i, long j) {
        this(axq.g(), o0xVar, i, j, null, null, null);
    }
}
