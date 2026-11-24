package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nu90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm80 f24139a;
    public final float b;
    public final a4d c;

    public nu90(pm80 pm80Var, float f, a4d a4dVar) {
        pm80Var.getClass();
        this.f24139a = pm80Var;
        this.b = f;
        this.c = a4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu90)) {
            return false;
        }
        nu90 nu90Var = (nu90) obj;
        return Intrinsics.d(this.f24139a, nu90Var.f24139a) && Float.compare(this.b, nu90Var.b) == 0 && Intrinsics.d(this.c, nu90Var.c);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(this.f24139a.hashCode() * 31, this.b, 31);
        a4d a4dVar = this.c;
        return iA + (a4dVar == null ? 0 : a4dVar.hashCode());
    }

    public final String toString() {
        return "PlaceHolderPainterInfo(painter=" + this.f24139a + ", alpha=" + this.b + ", colorFilter=" + this.c + Separators.RPAREN;
    }
}
