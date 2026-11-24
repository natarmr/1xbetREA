package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class us8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts8 f36199a;
    public final Rect b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final qr8 g;

    public us8(ts8 ts8Var, Rect rect, float f, float f2, float f3, boolean z, qr8 qr8Var) {
        ts8Var.getClass();
        this.f36199a = ts8Var;
        this.b = rect;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = qr8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us8)) {
            return false;
        }
        us8 us8Var = (us8) obj;
        return Intrinsics.d(this.f36199a, us8Var.f36199a) && this.b.equals(us8Var.b) && Float.compare(this.c, us8Var.c) == 0 && Float.compare(this.d, us8Var.d) == 0 && Float.compare(this.e, us8Var.e) == 0 && this.f == us8Var.f && this.g == us8Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(defpackage.c.a(defpackage.c.a(defpackage.c.a((this.b.hashCode() + (this.f36199a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), this.e, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BracketNodeState(model=");
        sb.append(this.f36199a);
        sb.append(", frame=");
        sb.append(this.b);
        sb.append(", tweeningPercent=");
        vqd.v(sb, this.c, ", collapsingY=", this.d, ", collapsedHeight=");
        sb.append(this.e);
        sb.append(", showBorder=");
        sb.append(this.f);
        sb.append(", contentPosition=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
