package a;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wbw implements ncs0 {
    public static final androidx.media3.common.b f;
    public static final androidx.media3.common.b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncs0 f38900a;
    public final androidx.media3.common.b b;
    public androidx.media3.common.b c;
    public byte[] d;
    public int e;

    static {
        awq awqVar = new awq();
        awqVar.o = mg40.n("application/id3");
        f = new androidx.media3.common.b(awqVar);
        awq awqVar2 = new awq();
        awqVar2.o = mg40.n("application/x-emsg");
        g = new androidx.media3.common.b(awqVar2);
    }

    public wbw(ncs0 ncs0Var, int i) {
        this.f38900a = ncs0Var;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                jf4.o(twn.m(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // a.ncs0
    public final void b(long j, int i, int i2, int i3, mcs0 mcs0Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        fq80 fq80Var = new fq80(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.p;
        androidx.media3.common.b bVar = this.b;
        String str2 = bVar.p;
        String str3 = bVar.p;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.p)) {
                f1t0.g0("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.p);
                return;
            }
            peo peoVarQ = hf3.Q(fq80Var);
            androidx.media3.common.b bVarA = peoVarQ.a();
            if (bVarA == null || !Objects.equals(str3, bVarA.p)) {
                f1t0.g0("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + peoVarQ.a());
                return;
            }
            byte[] bArrC = peoVarQ.c();
            bArrC.getClass();
            fq80Var = new fq80(bArrC);
        }
        int iA = fq80Var.a();
        ncs0 ncs0Var = this.f38900a;
        ncs0Var.a(iA, fq80Var);
        ncs0Var.b(j, i, iA, 0, mcs0Var);
    }

    @Override // a.ncs0
    public final void c(androidx.media3.common.b bVar) {
        this.c = bVar;
        this.f38900a.c(this.b);
    }

    @Override // a.ncs0
    public final void d(fq80 fq80Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArrCopyOf = this.d;
        if (bArrCopyOf.length < i3) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i3 / 2) + i3);
            this.d = bArrCopyOf;
        }
        fq80Var.k(bArrCopyOf, this.e, i);
        this.e += i;
    }

    @Override // a.ncs0
    public final int g(bbj bbjVar, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArrCopyOf = this.d;
        if (bArrCopyOf.length < i2) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i2 / 2) + i2);
            this.d = bArrCopyOf;
        }
        int i3 = bbjVar.read(bArrCopyOf, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        c99.f();
        return 0;
    }
}
