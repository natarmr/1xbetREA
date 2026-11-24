package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tui0 implements vui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34552a;
    public final y3d b;

    public tui0(String str, y3d y3dVar) {
        str.getClass();
        this.f34552a = str;
        this.b = y3dVar;
    }

    @Override // a.vui0
    public final String a() {
        return this.f34552a;
    }

    @Override // a.vui0
    public final y3d b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tui0)) {
            return false;
        }
        tui0 tui0Var = (tui0) obj;
        return Intrinsics.d(this.f34552a, tui0Var.f34552a) && Intrinsics.d(this.b, tui0Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f34552a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "Title(titleText=" + this.f34552a + ", titleColor=" + this.b + Separators.RPAREN;
    }
}
