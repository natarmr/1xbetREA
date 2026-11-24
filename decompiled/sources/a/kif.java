package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pif f18334a;
    public final int b;
    public final int c;

    public kif(pif pifVar, int i, int i2) {
        this.f18334a = pifVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kif)) {
            return false;
        }
        kif kifVar = (kif) obj;
        return this.f18334a == kifVar.f18334a && this.b == kifVar.b && this.c == kifVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f18334a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2BombModel(state=");
        sb.append(this.f18334a);
        sb.append(", positionX=");
        sb.append(this.b);
        sb.append(", positionY=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
