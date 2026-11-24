package a;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yww implements jbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbj f43393a;
    public final int b;
    public final v3c0 c;
    public final byte[] d;
    public int e;

    public yww(jbj jbjVar, int i, v3c0 v3c0Var) {
        x0x.A(i > 0);
        this.f43393a = jbjVar;
        this.b = i;
        this.c = v3c0Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // a.jbj
    public final void c(rsj rsjVar) {
        rsjVar.getClass();
        this.f43393a.c(rsjVar);
    }

    @Override // a.jbj
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a.jbj
    public final Map e() {
        return this.f43393a.e();
    }

    @Override // a.jbj
    public final Uri getUri() {
        return this.f43393a.getUri();
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        jbj jbjVar = this.f43393a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (jbjVar.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = jbjVar.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        fq80 fq80Var = new fq80(bArr3, i5);
                        v3c0 v3c0Var = this.c;
                        long jMax = !v3c0Var.m ? v3c0Var.j : Math.max(v3c0Var.n.z(true), v3c0Var.j);
                        int iA = fq80Var.a();
                        ncs0 ncs0Var = v3c0Var.l;
                        ncs0Var.getClass();
                        ncs0Var.a(iA, fq80Var);
                        ncs0Var.b(jMax, 1, iA, 0, null);
                        v3c0Var.m = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int i8 = jbjVar.read(bArr, i, Math.min(i3, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
