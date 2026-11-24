package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lav implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bav f19725a;
    public final wnq0 b;
    public final gav c;
    public final gav d;
    public final v9v e;
    public final th90 f;
    public final x9v g;
    public final x9v h;
    public final w9v i;
    public final String j;
    public final float k;
    public final boolean l;

    public lav(bav bavVar, wnq0 wnq0Var, gav gavVar, gav gavVar2, v9v v9vVar, th90 th90Var, x9v x9vVar, x9v x9vVar2, w9v w9vVar, String str, float f, boolean z) {
        th90Var.getClass();
        this.f19725a = bavVar;
        this.b = wnq0Var;
        this.c = gavVar;
        this.d = gavVar2;
        this.e = v9vVar;
        this.f = th90Var;
        this.g = x9vVar;
        this.h = x9vVar2;
        this.i = w9vVar;
        this.j = str;
        this.k = f;
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lav)) {
            return false;
        }
        lav lavVar = (lav) obj;
        return this.f19725a.equals(lavVar.f19725a) && this.b.equals(lavVar.b) && this.c.equals(lavVar.c) && this.d.equals(lavVar.d) && this.e.equals(lavVar.e) && Intrinsics.d(this.f, lavVar.f) && this.g.equals(lavVar.g) && this.h.equals(lavVar.h) && this.i.equals(lavVar.i) && this.j.equals(lavVar.j) && ycl.b(this.k, lavVar.k) && this.l == lavVar.l;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return "javaClass";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + defpackage.c.a(ua80.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f19725a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j), this.k, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        String strC = ycl.c(this.k);
        StringBuilder sb = new StringBuilder("GoldRushUiModel(gameState=");
        sb.append(this.f19725a);
        sb.append(", timer=");
        sb.append(this.b);
        sb.append(", firstPlayer=");
        sb.append(this.c);
        sb.append(", secondPlayer=");
        sb.append(this.d);
        sb.append(", cubeInfo=");
        sb.append(this.e);
        sb.append(", coordinatesGameFiled=");
        sb.append(this.f);
        sb.append(", firstPlayerGameField=");
        sb.append(this.g);
        sb.append(", secondPlayerGameField=");
        sb.append(this.h);
        sb.append(", finishField=");
        sb.append(this.i);
        sb.append(", defaultBackground=");
        sb.append(this.j);
        sb.append(", dynamicMargin=");
        return defpackage.c.c(strC, ", isRtl=", Separators.RPAREN, sb, this.l);
    }
}
