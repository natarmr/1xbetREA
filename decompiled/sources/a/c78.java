package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c78 extends pm80 {
    public final vz2 f;
    public final long g;
    public boolean h;
    public final long i;
    public float j;
    public a4d k;

    public c78(vz2 vz2Var, long j) {
        int i;
        this.f = vz2Var;
        this.g = j;
        this.h = true;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > vz2Var.f38278a.getWidth() || i > vz2Var.f38278a.getHeight()) {
            jf4.o("Failed requirement.");
            throw null;
        }
        this.i = j;
        this.j = 1.0f;
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.j = f;
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.k = a4dVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c78)) {
            return false;
        }
        c78 c78Var = (c78) obj;
        return Intrinsics.d(this.f, c78Var.f) && ikx.b(0L, 0L) && qkx.a(this.g, c78Var.g) && this.h == c78Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h ? 1 : 0) + rw2.b(rw2.b(this.f.hashCode() * 31, 31, 0L), 31, this.g);
    }

    @Override // a.pm80
    public final long i() {
        return n2x.Q(this.i);
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        int iRound = Math.round(Float.intBitsToFloat((int) (fhlVar.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
        float f = this.j;
        a4d a4dVar = this.k;
        boolean z = this.h;
        fhl.b0(fhlVar, this.f, this.g, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, a4dVar, z ? 1 : 0, 328);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String strE = ikx.e(0L);
        String strB = qkx.b(this.g);
        boolean z = this.h;
        if (z == 0) {
            str = "None";
        } else if (z == 1) {
            str = "Low";
        } else if (z == 2) {
            str = "Medium";
        } else {
            str = z == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append(strE);
        sb.append(", srcSize=");
        return ua80.m(sb, strB, ", filterQuality=", str, Separators.RPAREN);
    }

    public c78(vz2 vz2Var) {
        this(vz2Var, (((long) vz2Var.f38278a.getHeight()) & 4294967295L) | (((long) vz2Var.f38278a.getWidth()) << 32));
    }
}
