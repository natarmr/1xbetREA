package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zhk f3329a;
    public final la80 b;
    public final float c;
    public final float d;
    public final w6k e;
    public final float f;
    public final erq g;
    public final t9o0 h;
    public final sly i;
    public final float j;

    public bwk(zhk zhkVar, la80 la80Var, float f, float f2, w6k w6kVar, float f3, erq erqVar, t9o0 t9o0Var, sly slyVar, float f4) {
        this.f3329a = zhkVar;
        this.b = la80Var;
        this.c = f;
        this.d = f2;
        this.e = w6kVar;
        this.f = f3;
        this.g = erqVar;
        this.h = t9o0Var;
        this.i = slyVar;
        this.j = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwk)) {
            return false;
        }
        bwk bwkVar = (bwk) obj;
        return this.f3329a.equals(bwkVar.f3329a) && this.b == bwkVar.b && ycl.b(this.c, bwkVar.c) && ycl.b(this.d, bwkVar.d) && this.e.equals(bwkVar.e) && Float.compare(this.f, bwkVar.f) == 0 && Intrinsics.d(this.g, bwkVar.g) && this.h.equals(bwkVar.h) && this.i.equals(bwkVar.i) && ycl.b(this.j, bwkVar.j);
    }

    public final int hashCode() {
        int iA = defpackage.c.a((this.e.hashCode() + defpackage.c.a(defpackage.c.a((this.b.hashCode() + (this.f3329a.hashCode() * 31)) * 31, this.c, 31), this.d, 31)) * 31, this.f, 31);
        erq erqVar = this.g;
        return Float.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((iA + (erqVar == null ? 0 : erqVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        String strC2 = ycl.c(this.d);
        String strC3 = ycl.c(this.j);
        StringBuilder sb = new StringBuilder("DisplayState(type=");
        sb.append(this.f3329a);
        sb.append(", orientation=");
        sb.append(this.b);
        sb.append(", screenWidthDp=");
        f140.v(sb, strC, ", screenHeightDp=", strC2, ", density=");
        sb.append(this.e);
        sb.append(", fontScale=");
        sb.append(this.f);
        sb.append(", foldingFeature=");
        sb.append(this.g);
        sb.append(", systemInsets=");
        sb.append(this.h);
        sb.append(", keyboardLiftState=");
        sb.append(this.i);
        sb.append(", tabBarHeight=");
        sb.append(strC3);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
