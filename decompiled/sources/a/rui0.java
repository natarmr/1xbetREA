package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rui0 implements vui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31130a;
    public final y3d b;
    public final String c;
    public final y3d d;

    public rui0(String str, y3d y3dVar, String str2, y3d y3dVar2, int i) {
        y3dVar = (i & 2) != 0 ? null : y3dVar;
        y3dVar2 = (i & 8) != 0 ? null : y3dVar2;
        str.getClass();
        str2.getClass();
        this.f31130a = str;
        this.b = y3dVar;
        this.c = str2;
        this.d = y3dVar2;
    }

    @Override // a.vui0
    public final String a() {
        return this.f31130a;
    }

    @Override // a.vui0
    public final y3d b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rui0)) {
            return false;
        }
        rui0 rui0Var = (rui0) obj;
        return Intrinsics.d(this.f31130a, rui0Var.f31130a) && Intrinsics.d(this.b, rui0Var.b) && Intrinsics.d(this.c, rui0Var.c) && Intrinsics.d(this.d, rui0Var.d);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f31130a.hashCode() * 31;
        int iHashCode3 = 0;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int iB = ua80.b((iHashCode2 + iHashCode) * 31, 31, this.c);
        y3d y3dVar2 = this.d;
        if (y3dVar2 != null) {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode3 = Long.hashCode(j2);
        }
        return (iB + iHashCode3) * 961;
    }

    public final String toString() {
        return "SubtitleTitle(titleText=" + this.f31130a + ", titleColor=" + this.b + ", subTitleText=" + this.c + ", subTitleColor=" + this.d + ", subtitleIconRes=null, subtitleIconTintColor=null)";
    }
}
