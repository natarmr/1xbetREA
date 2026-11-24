package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y5z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42071a;
    public final fa10 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final z33 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final u33 q;
    public final xr r;
    public final v33 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final r7v w;
    public final kki x;
    public final int y;

    public y5z(List list, fa10 fa10Var, String str, long j, int i, long j2, String str2, List list2, z33 z33Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, u33 u33Var, xr xrVar, List list3, int i5, v33 v33Var, boolean z, r7v r7vVar, kki kkiVar, int i6) {
        this.f42071a = list;
        this.b = fa10Var;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = z33Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = u33Var;
        this.r = xrVar;
        this.t = list3;
        this.u = i5;
        this.s = v33Var;
        this.v = z;
        this.w = r7vVar;
        this.x = kkiVar;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append(Separators.RETURN);
        long j = this.f;
        fa10 fa10Var = this.b;
        y5z y5zVar = (y5z) fa10Var.i.b(j);
        if (y5zVar != null) {
            sb.append("\t\tParents: ");
            sb.append(y5zVar.c);
            for (y5z y5zVar2 = (y5z) fa10Var.i.b(y5zVar.f); y5zVar2 != null; y5zVar2 = (y5z) fa10Var.i.b(y5zVar2.f)) {
                sb.append("->");
                sb.append(y5zVar2.c);
            }
            sb.append(str);
            sb.append(Separators.RETURN);
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append(Separators.RETURN);
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.f42071a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append(Separators.RETURN);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
