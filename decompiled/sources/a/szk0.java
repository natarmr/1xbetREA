package a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class szk0 extends zdx {
    public final fq80 b = new fq80();
    public final q8b c = new q8b();
    public coq0 d;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // a.zdx
    public final ed40 y(md40 md40Var, ByteBuffer byteBuffer) {
        cd40 uzk0Var;
        long j;
        long j2;
        fq80 fq80Var = this.b;
        q8b q8bVar = this.c;
        coq0 coq0Var = this.d;
        if (coq0Var != null) {
            long j3 = md40Var.l;
            synchronized (coq0Var) {
                j2 = coq0Var.b;
            }
            if (j3 != j2) {
                coq0 coq0Var2 = new coq0(md40Var.i);
                this.d = coq0Var2;
                coq0Var2.a(md40Var.i - md40Var.l);
            }
        } else {
            coq0 coq0Var3 = new coq0(md40Var.i);
            this.d = coq0Var3;
            coq0Var3.a(md40Var.i - md40Var.l);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        fq80Var.K(bArrArray, iLimit);
        q8bVar.l(bArrArray, iLimit);
        q8bVar.o(39);
        long jG = (((long) q8bVar.g(1)) << 32) | ((long) q8bVar.g(32));
        q8bVar.o(20);
        int iG = q8bVar.g(12);
        int iG2 = q8bVar.g(8);
        fq80Var.N(14);
        if (iG2 == 0) {
            uzk0Var = new uzk0();
        } else if (iG2 == 255) {
            long jB = fq80Var.B();
            int i = iG - 4;
            fq80Var.k(new byte[i], 0, i);
            uzk0Var = new swb0((byte) 0, jB, jG);
        } else if (iG2 == 4) {
            int iZ = fq80Var.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i2 = 0; i2 < iZ; i2++) {
                fq80Var.B();
                boolean z = (fq80Var.z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iZ2 = fq80Var.z();
                    boolean z2 = (iZ2 & 64) != 0;
                    boolean z3 = (iZ2 & 32) != 0;
                    if (z2) {
                        fq80Var.B();
                    }
                    if (!z2) {
                        int iZ3 = fq80Var.z();
                        ArrayList arrayList3 = new ArrayList(iZ3);
                        for (int i3 = 0; i3 < iZ3; i3++) {
                            fq80Var.z();
                            fq80Var.B();
                            arrayList3.add(new zie0());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        fq80Var.z();
                        fq80Var.B();
                    }
                    fq80Var.G();
                    fq80Var.z();
                    fq80Var.z();
                }
                arrayList.add(new pmi0(arrayList2));
            }
            uzk0Var = new vzk0(arrayList);
        } else if (iG2 == 5) {
            coq0 coq0Var4 = this.d;
            fq80Var.B();
            boolean z4 = (fq80Var.z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iZ4 = fq80Var.z();
                boolean z5 = (iZ4 & 64) != 0;
                boolean z6 = (iZ4 & 32) != 0;
                boolean z7 = (iZ4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : swb0.d(jG, fq80Var);
                if (!z5) {
                    int iZ5 = fq80Var.z();
                    ArrayList arrayList4 = new ArrayList(iZ5);
                    for (int i4 = 0; i4 < iZ5; i4++) {
                        fq80Var.z();
                        coq0Var4.b(!z7 ? swb0.d(jG, fq80Var) : -9223372036854775807L);
                        arrayList4.add(new cge0((byte) 26));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    fq80Var.z();
                    fq80Var.B();
                }
                fq80Var.G();
                fq80Var.z();
                fq80Var.z();
                j = jD;
            }
            uzk0Var = new tzk0(j, coq0Var4.b(j), list);
        } else if (iG2 != 6) {
            uzk0Var = null;
        } else {
            coq0 coq0Var5 = this.d;
            long jD2 = swb0.d(jG, fq80Var);
            uzk0Var = new swb0((byte) 1, jD2, coq0Var5.b(jD2));
        }
        return uzk0Var == null ? new ed40(new cd40[0]) : new ed40(uzk0Var);
    }
}
