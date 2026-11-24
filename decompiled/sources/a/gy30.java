package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wx30 f12106a;
    public final tx30 b;
    public final fy30 c;
    public final long d;
    public final List e;
    public final xx30 f;

    public gy30(wx30 wx30Var, sx30 sx30Var, fy30 fy30Var, long j, List list, xx30 xx30Var, int i) {
        tx30 tx30Var = (i & 2) != 0 ? px30.f27736a : sx30Var;
        fy30Var = (i & 4) != 0 ? ey30.f8608a : fy30Var;
        if ((i & 8) != 0) {
            pz40 pz40Var = s6t0.f31722a;
            j = s6t0.b().f33626a.getBackgroundContent();
        }
        list = (i & 32) != 0 ? iun.f15405a : list;
        xx30Var = (i & 64) != 0 ? xx30.f41640a : xx30Var;
        list.getClass();
        this.f12106a = wx30Var;
        this.b = tx30Var;
        this.c = fy30Var;
        this.d = j;
        this.e = list;
        this.f = xx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy30)) {
            return false;
        }
        gy30 gy30Var = (gy30) obj;
        if (!this.f12106a.equals(gy30Var.f12106a) || !Intrinsics.d(this.b, gy30Var.b) || !this.c.equals(gy30Var.c)) {
            return false;
        }
        long j = gy30Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(gy30Var.e) && this.f == gy30Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.f12106a.hashCode() * 31;
        tx30 tx30Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (tx30Var == null ? 0 : tx30Var.hashCode())) * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(false) + ((this.f.hashCode() + dw9.a(brm0.e(rw2.b(iHashCode2, 31, this.d), 31, true), 31, this.e)) * 31);
    }

    public final String toString() {
        return "MenuCellStyles(cellMiddleStyle=" + this.f12106a + ", cellLeftStyle=" + this.b + ", cellRightSideStyle=" + this.c + ", backgroundColor=" + y3d.i(this.d) + ", enabled=true, backgroundGradient=" + this.e + ", cellPosition=" + this.f + ", hasSeparator=false)";
    }
}
