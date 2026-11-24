package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sc00 implements uc00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f31963a;

    public sc00(int i, y3d y3dVar) {
        this.f31963a = (i & 1) != 0 ? null : y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc00) && Intrinsics.d(this.f31963a, ((sc00) obj).f31963a);
    }

    public final int hashCode() {
        int iHashCode;
        y3d y3dVar = this.f31963a;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode * 961;
    }

    public final String toString() {
        return "Overlay(backgroundColor=" + this.f31963a + ", iconId=null, strokeColor=null)";
    }
}
