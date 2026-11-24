package a;

import android.gov.nist.core.Separators;
import android.graphics.Point;

/* JADX INFO: loaded from: classes4.dex */
public final class j7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Point f16057a;
    public final int b;
    public final float c;

    public j7t(Point point, int i, float f) {
        this.f16057a = point;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7t)) {
            return false;
        }
        j7t j7tVar = (j7t) obj;
        return this.f16057a.equals(j7tVar.f16057a) && this.b == j7tVar.b && Float.compare(this.c, j7tVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + twn.a(this.b, this.f16057a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesManiaDiceUiModel(point=");
        sb.append(this.f16057a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", rotation=");
        return kng0.o(sb, this.c, Separators.RPAREN);
    }
}
