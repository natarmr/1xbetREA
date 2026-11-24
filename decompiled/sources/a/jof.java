package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pif f16854a;
    public final int b;
    public final int c;

    public jof(pif pifVar, int i, int i2) {
        this.f16854a = pifVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jof)) {
            return false;
        }
        jof jofVar = (jof) obj;
        return this.f16854a == jofVar.f16854a && this.b == jofVar.b && this.c == jofVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f16854a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2MapMovementBombUiModel(bombState=");
        sb.append(this.f16854a);
        sb.append(", positionX=");
        sb.append(this.b);
        sb.append(", positionY=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
