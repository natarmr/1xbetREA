package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uui0 implements vui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36301a;
    public final y3d b;
    public final String c;
    public final y3d d;
    public final Integer e;

    public uui0(String str, y3d y3dVar, String str2, y3d y3dVar2, Integer num, int i) {
        y3dVar = (i & 2) != 0 ? null : y3dVar;
        y3dVar2 = (i & 8) != 0 ? null : y3dVar2;
        num = (i & 16) != 0 ? null : num;
        str.getClass();
        str2.getClass();
        this.f36301a = str;
        this.b = y3dVar;
        this.c = str2;
        this.d = y3dVar2;
        this.e = num;
    }

    @Override // a.vui0
    public final String a() {
        return this.f36301a;
    }

    @Override // a.vui0
    public final y3d b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uui0)) {
            return false;
        }
        uui0 uui0Var = (uui0) obj;
        return Intrinsics.d(this.f36301a, uui0Var.f36301a) && Intrinsics.d(this.b, uui0Var.b) && Intrinsics.d(this.c, uui0Var.c) && Intrinsics.d(this.d, uui0Var.d) && Intrinsics.d(this.e, uui0Var.e);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = this.f36301a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int iB = ua80.b((iHashCode3 + iHashCode) * 31, 31, this.c);
        y3d y3dVar2 = this.d;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i = (iB + iHashCode2) * 31;
        Integer num = this.e;
        return (i + (num != null ? num.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleSubtitle(titleText=");
        sb.append(this.f36301a);
        sb.append(", titleColor=");
        sb.append(this.b);
        sb.append(", subTitleText=");
        sb.append(this.c);
        sb.append(", subTitleColor=");
        sb.append(this.d);
        sb.append(", subtitleIconRes=");
        return dw9.q(sb, this.e, ", subtitleIconTintColor=null)");
    }
}
