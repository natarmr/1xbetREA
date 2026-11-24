package a;

import android.gov.nist.core.Separators;
import android.graphics.Point;

/* JADX INFO: loaded from: classes4.dex */
public final class ych0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Point f42385a;
    public final Point b;
    public final Point c;
    public final Point d;

    public ych0(Point point, Point point2, Point point3, Point point4) {
        this.f42385a = point;
        this.b = point2;
        this.c = point3;
        this.d = point4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ych0)) {
            return false;
        }
        ych0 ych0Var = (ych0) obj;
        return this.f42385a.equals(ych0Var.f42385a) && this.b.equals(ych0Var.b) && this.c.equals(ych0Var.c) && this.d.equals(ych0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f42385a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SeaBattleCanvasCoordinate(leftTopPoint=" + this.f42385a + ", leftBottomPoint=" + this.b + ", rightTopPoint=" + this.c + ", rightBottomPoint=" + this.d + Separators.RPAREN;
    }
}
