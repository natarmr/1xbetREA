package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3m f8861a;
    public final float b;
    public final float c;

    public f3g(y3m y3mVar, float f, float f2) {
        y3mVar.getClass();
        this.f8861a = y3mVar;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3g)) {
            return false;
        }
        f3g f3gVar = (f3g) obj;
        return this.f8861a == f3gVar.f8861a && Float.compare(this.b, f3gVar.b) == 0 && Float.compare(this.c, f3gVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(this.f8861a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberBottomSheetRestoredState(value=");
        sb.append(this.f8861a);
        sb.append(", topPx=");
        sb.append(this.b);
        sb.append(", containerPx=");
        return kng0.o(sb, this.c, Separators.RPAREN);
    }
}
