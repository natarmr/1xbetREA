package a;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qp2 implements fuo {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final pnk b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public huo j;
    public ncs0 k;
    public ncs0 l;
    public fvh0 m;
    public boolean n;
    public long o;
    public boolean p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f29094a = new byte[1];
    public int g = -1;

    static {
        String str = vtt0.f38024a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public qp2() {
        pnk pnkVar = new pnk();
        this.b = pnkVar;
        this.l = pnkVar;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[PHI: r4
  0x00e8: PHI (r4v1 a.guo) = (r4v0 a.guo), (r4v6 a.guo) binds: [B:52:0x00e6, B:55:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        guo guoVar2;
        int iE;
        int i;
        this.k.getClass();
        String str = vtt0.f38024a;
        if (guoVar.getPosition() == 0 && !h(guoVar)) {
            throw kq80.a("Could not find AMR header.", null);
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : JosStatusCodes.RTN_CODE_COMMON_ERROR;
            int i3 = z ? r[8] : q[7];
            ncs0 ncs0Var = this.k;
            awq awqVar = new awq();
            awqVar.n = mg40.n(str2);
            awqVar.o = mg40.n(str3);
            awqVar.p = i3;
            awqVar.I = 1;
            awqVar.K = i2;
            ohs0.w(awqVar, ncs0Var);
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int iG = g(guoVar);
                this.e = iG;
                this.f = iG;
                int i5 = this.g;
                if (i5 == -1) {
                    guoVar.getPosition();
                    iG = this.e;
                    this.g = iG;
                    i5 = iG;
                }
                if (i5 == iG) {
                    this.h++;
                }
                fvh0 fvh0Var = this.m;
                if (fvh0Var instanceof e5x) {
                    e5x e5xVar = (e5x) fvh0Var;
                    long j = this.i + this.d + 20000;
                    long position = guoVar.getPosition() + ((long) this.e);
                    v610 v610Var = e5xVar.b;
                    int i6 = v610Var.b;
                    if (i6 == 0 || j - v610Var.d(i6 - 1) >= 100000) {
                        v610 v610Var2 = e5xVar.f7254a;
                        v610 v610Var3 = e5xVar.b;
                        if (v610Var3.b == 0 && j > 0) {
                            v610Var2.a(0L);
                            v610Var3.a(0L);
                        }
                        v610Var2.a(position);
                        v610Var3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
                guoVar2 = guoVar;
                iE = this.l.e(guoVar2, this.f, true);
                if (iE == -1) {
                    i4 = -1;
                } else {
                    i = this.f - iE;
                    this.f = i;
                    if (i <= 0) {
                        this.l.b(this.d + this.i, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
                guoVar2 = guoVar;
            }
        } else {
            guoVar2 = guoVar;
            iE = this.l.e(guoVar2, this.f, true);
            if (iE == -1) {
                i4 = -1;
            } else {
                i = this.f - iE;
                this.f = i;
                if (i <= 0) {
                    this.l.b(this.d + this.i, 1, this.e, 0, null);
                    this.d += 20000;
                }
            }
        }
        guoVar2.getLength();
        if (this.m == null) {
            ca5 ca5Var = new ca5(-9223372036854775807L);
            this.m = ca5Var;
            this.j.f(ca5Var);
        }
        if (i4 == -1) {
            fvh0 fvh0Var2 = this.m;
            if (fvh0Var2 instanceof e5x) {
                long j2 = this.i + this.d;
                ((e5x) fvh0Var2).c = j2;
                this.j.f(fvh0Var2);
                this.k.f(j2);
            }
        }
        return i4;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        fvh0 fvh0Var = this.m;
        if (!(fvh0Var instanceof e5x)) {
            if (j == 0 || !(fvh0Var instanceof q2e)) {
                this.i = 0L;
                return;
            } else {
                q2e q2eVar = (q2e) fvh0Var;
                this.i = (Math.max(0L, j - q2eVar.b) * 8000000) / ((long) q2eVar.e);
                return;
            }
        }
        e5x e5xVar = (e5x) fvh0Var;
        v610 v610Var = e5xVar.b;
        long jD = v610Var.b == 0 ? -9223372036854775807L : v610Var.d(vtt0.c(e5xVar.f7254a, j));
        this.i = jD;
        if (Math.abs(this.o - jD) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        return h(guoVar);
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.j = huoVar;
        ncs0 ncs0VarQ = huoVar.q(0, 1);
        this.k = ncs0VarQ;
        this.l = ncs0VarQ;
        huoVar.o();
    }

    public final int g(guo guoVar) throws kq80 {
        boolean z;
        guoVar.g();
        byte[] bArr = this.f29094a;
        guoVar.n(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw kq80.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw kq80.a(sb.toString(), null);
    }

    public final boolean h(guo guoVar) {
        guoVar.g();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        guoVar.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            guoVar.m(bArr.length);
            return true;
        }
        guoVar.g();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        guoVar.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        guoVar.m(bArr3.length);
        return true;
    }

    @Override // a.fuo
    public final void release() {
    }
}
