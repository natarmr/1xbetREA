package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dpa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6456a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public dpa0 q;

    public dpa0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f6456a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        dpa0 dpa0Var = this.q;
        if (dpa0Var == null) {
            this.o = true;
            this.p = true;
        } else if (dpa0Var != null) {
            dpa0Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public final boolean c() {
        dpa0 dpa0Var = this.q;
        if (dpa0Var != null) {
            return dpa0Var.c();
        }
        return this.o || this.p;
    }

    public final String toString() {
        String strH0 = b5x.h0(this.f6456a);
        String strH = ne60.h(this.c);
        String strH2 = ne60.h(this.g);
        boolean zC = c();
        String strA = lpa0.a(this.i);
        List listB = b();
        String strH3 = ne60.h(this.j);
        String strH4 = ne60.h(this.l);
        StringBuilder sbO = f140.o(this.b, "PointerInputChange(id=", strH0, ", uptimeMillis=");
        w6x.z(", position=", strH, ", pressed=", sbO, this.d);
        sbO.append(", pressure=");
        sbO.append(this.e);
        sbO.append(", previousUptimeMillis=");
        kng0.z(sbO, this.f, ", previousPosition=", strH2);
        w6x.A(", previousPressed=", ", isConsumed=", sbO, this.h, zC);
        ua80.t(", type=", strA, ", historical=", sbO, listB);
        sbO.append(", scrollDelta=");
        sbO.append(strH3);
        sbO.append(", scaleFactor=");
        sbO.append(this.k);
        return rw2.o(sbO, ", panOffset=", strH4, Separators.RPAREN);
    }

    public dpa0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
