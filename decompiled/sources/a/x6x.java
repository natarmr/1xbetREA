package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class x6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40386a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public x6x(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.f40386a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final String toString() {
        String strH0 = b5x.h0(this.f40386a);
        String strH = ne60.h(this.c);
        String strH2 = ne60.h(this.g);
        boolean z = this.i;
        StringBuilder sbO = f140.o(this.b, "IndirectPointerInputChange(id=", strH0, ", uptimeMillis=");
        w6x.z(", position=", strH, ", pressed=", sbO, this.d);
        sbO.append(", pressure=");
        sbO.append(this.e);
        sbO.append(", previousUptimeMillis=");
        kng0.z(sbO, this.f, ", previousPosition=", strH2);
        w6x.A(", previousPressed=", ", isConsumed=", sbO, this.h, z);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
