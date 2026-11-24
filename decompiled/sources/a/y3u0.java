package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class y3u0 extends hwt0 {
    public final wgv b;
    public String c;
    public boolean d;
    public final bhl e;
    public Function0 f;
    public final pz40 g;
    public m78 h;
    public final pz40 i;
    public long j;
    public float k;
    public float l;
    public final x3u0 m;

    public y3u0(wgv wgvVar) {
        this.b = wgvVar;
        wgvVar.i = new x3u0(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new bhl();
        this.f = new o1u0((byte) 7);
        this.g = androidx.compose.runtime.e.e(null);
        this.i = androidx.compose.runtime.e.e(new h7k0(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new x3u0(this, (byte) 1);
    }

    @Override // a.hwt0
    public final void a(fhl fhlVar) {
        e(fhlVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0118  */
    public final void e(fhl fhlVar, float f, a4d a4dVar) {
        int i;
        m78 m78Var;
        vz2 vz2VarC;
        char c;
        long j;
        long jC;
        a4d a4dVar2;
        int i2;
        int i3;
        wgv wgvVar = this.b;
        boolean z = wgvVar.d;
        pz40 pz40Var = this.g;
        if (!z || wgvVar.e == 16) {
            i = 0;
        } else {
            a4d a4dVar3 = (a4d) ((hgk0) pz40Var).getValue();
            iun iunVar = q4u0.f28120a;
            if (!(a4dVar3 instanceof m78) ? a4dVar3 == null : (i3 = ((m78) a4dVar3).c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(a4dVar instanceof m78) ? a4dVar == null : (i2 = ((m78) a4dVar).c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        bhl bhlVar = this.e;
        if (z2 || !h7k0.b(this.j, fhlVar.d())) {
            if (i == 1) {
                jC = wgvVar.e;
                iun iunVar2 = q4u0.f28120a;
                if (y3d.d(jC) != 1.0f) {
                    jC = y3d.c(1.0f, jC);
                }
                m78Var = new m78(jC, 5);
            } else {
                m78Var = null;
            }
            this.h = m78Var;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
            pz40 pz40Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((h7k0) ((hgk0) pz40Var2).getValue()).f12579a >> 32));
            this.l = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((h7k0) ((hgk0) pz40Var2).getValue()).f12579a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fhlVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L))))) & 4294967295L);
            k6z layoutDirection = fhlVar.getLayoutDirection();
            vz2VarC = bhlVar.f2613a;
            uw2 uw2VarA = bhlVar.b;
            if (vz2VarC != null || uw2VarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i4 = (int) (jCeil >> 32);
                Bitmap bitmap = vz2VarC.f38278a;
                c = ' ';
                j = 4294967295L;
                if (i4 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || bhlVar.d != i) {
                }
                bhlVar.c = jCeil;
                a6a a6aVar = bhlVar.e;
                z5a z5aVar = a6aVar.f308a;
                long jQ = n2x.Q(jCeil);
                w6k w6kVar = z5aVar.f43806a;
                k6z k6zVar = z5aVar.b;
                x5a x5aVar = z5aVar.c;
                uw2 uw2Var = uw2VarA;
                long j2 = z5aVar.d;
                z5aVar.f43806a = fhlVar;
                z5aVar.b = layoutDirection;
                z5aVar.c = uw2Var;
                z5aVar.d = jQ;
                uw2Var.l();
                fhl.u(a6aVar, y3d.b, 0L, 0L, 0.0f, null, null, 0, 62);
                this.m.invoke(a6aVar);
                uw2Var.i();
                z5aVar.f43806a = w6kVar;
                z5aVar.b = k6zVar;
                z5aVar.c = x5aVar;
                z5aVar.d = j2;
                vz2VarC.f38278a.prepareToDraw();
                this.d = false;
                this.j = fhlVar.d();
            }
            vz2VarC = azw.c((int) (jCeil >> c), (int) (jCeil & j), i);
            uw2VarA = vw2.a(vz2VarC);
            bhlVar.f2613a = vz2VarC;
            bhlVar.b = uw2VarA;
            bhlVar.d = i;
            bhlVar.c = jCeil;
            a6a a6aVar2 = bhlVar.e;
            z5a z5aVar2 = a6aVar2.f308a;
            long jQ2 = n2x.Q(jCeil);
            w6k w6kVar2 = z5aVar2.f43806a;
            k6z k6zVar2 = z5aVar2.b;
            x5a x5aVar2 = z5aVar2.c;
            uw2 uw2Var2 = uw2VarA;
            long j3 = z5aVar2.d;
            z5aVar2.f43806a = fhlVar;
            z5aVar2.b = layoutDirection;
            z5aVar2.c = uw2Var2;
            z5aVar2.d = jQ2;
            uw2Var2.l();
            fhl.u(a6aVar2, y3d.b, 0L, 0L, 0.0f, null, null, 0, 62);
            this.m.invoke(a6aVar2);
            uw2Var2.i();
            z5aVar2.f43806a = w6kVar2;
            z5aVar2.b = k6zVar2;
            z5aVar2.c = x5aVar2;
            z5aVar2.d = j3;
            vz2VarC.f38278a.prepareToDraw();
            this.d = false;
            this.j = fhlVar.d();
        } else {
            vz2 vz2Var = bhlVar.f2613a;
            if (i != (vz2Var != null ? vz2Var.a() : 0)) {
                if (i == 1) {
                    jC = wgvVar.e;
                    iun iunVar3 = q4u0.f28120a;
                    if (y3d.d(jC) != 1.0f) {
                        jC = y3d.c(1.0f, jC);
                    }
                    m78Var = new m78(jC, 5);
                } else {
                    m78Var = null;
                }
                this.h = m78Var;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                pz40 pz40Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((h7k0) ((hgk0) pz40Var3).getValue()).f12579a >> 32));
                this.l = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((h7k0) ((hgk0) pz40Var3).getValue()).f12579a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fhlVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L))))) & 4294967295L);
                k6z layoutDirection2 = fhlVar.getLayoutDirection();
                vz2VarC = bhlVar.f2613a;
                uw2 uw2VarA2 = bhlVar.b;
                if (vz2VarC != null) {
                    c = ' ';
                    j = 4294967295L;
                    vz2VarC = azw.c((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    uw2VarA2 = vw2.a(vz2VarC);
                    bhlVar.f2613a = vz2VarC;
                    bhlVar.b = uw2VarA2;
                    bhlVar.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    vz2VarC = azw.c((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    uw2VarA2 = vw2.a(vz2VarC);
                    bhlVar.f2613a = vz2VarC;
                    bhlVar.b = uw2VarA2;
                    bhlVar.d = i;
                }
                bhlVar.c = jCeil2;
                a6a a6aVar3 = bhlVar.e;
                z5a z5aVar3 = a6aVar3.f308a;
                long jQ3 = n2x.Q(jCeil2);
                w6k w6kVar3 = z5aVar3.f43806a;
                k6z k6zVar3 = z5aVar3.b;
                x5a x5aVar3 = z5aVar3.c;
                uw2 uw2Var3 = uw2VarA2;
                long j4 = z5aVar3.d;
                z5aVar3.f43806a = fhlVar;
                z5aVar3.b = layoutDirection2;
                z5aVar3.c = uw2Var3;
                z5aVar3.d = jQ3;
                uw2Var3.l();
                fhl.u(a6aVar3, y3d.b, 0L, 0L, 0.0f, null, null, 0, 62);
                this.m.invoke(a6aVar3);
                uw2Var3.i();
                z5aVar3.f43806a = w6kVar3;
                z5aVar3.b = k6zVar3;
                z5aVar3.c = x5aVar3;
                z5aVar3.d = j4;
                vz2VarC.f38278a.prepareToDraw();
                this.d = false;
                this.j = fhlVar.d();
            }
        }
        if (a4dVar != null) {
            a4dVar2 = a4dVar;
        } else {
            a4dVar2 = ((a4d) ((hgk0) pz40Var).getValue()) != null ? (a4d) ((hgk0) pz40Var).getValue() : this.h;
        }
        vz2 vz2Var2 = bhlVar.f2613a;
        if (vz2Var2 == null) {
            xcx.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        fhl.b0(fhlVar, vz2Var2, bhlVar.c, 0L, f, a4dVar2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        pz40 pz40Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((h7k0) ((hgk0) pz40Var).getValue()).f12579a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((h7k0) ((hgk0) pz40Var).getValue()).f12579a & 4294967295L)));
        sb.append(Separators.RETURN);
        return sb.toString();
    }
}
