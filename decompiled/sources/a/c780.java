package a;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c780 extends orm0 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(fq80 fq80Var, byte[] bArr) {
        if (fq80Var.a() < bArr.length) {
            return false;
        }
        int i = fq80Var.b;
        byte[] bArr2 = new byte[bArr.length];
        fq80Var.k(bArr2, 0, bArr.length);
        fq80Var.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // a.orm0
    public final long b(fq80 fq80Var) {
        byte[] bArr = fq80Var.f9961a;
        return (((long) this.i) * zvw.U(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // a.orm0
    public final boolean c(fq80 fq80Var, long j, fck0 fck0Var) {
        if (e(fq80Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(fq80Var.f9961a, fq80Var.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListC = zvw.C(bArrCopyOf);
            if (((androidx.media3.common.b) fck0Var.b) == null) {
                awq awqVar = new awq();
                awqVar.n = mg40.n("audio/ogg");
                awqVar.o = mg40.n("audio/opus");
                awqVar.I = i;
                awqVar.K = 48000;
                awqVar.r = arrayListC;
                fck0Var.b = new androidx.media3.common.b(awqVar);
                return true;
            }
        } else {
            boolean zE = e(fq80Var, p);
            androidx.media3.common.b bVar = (androidx.media3.common.b) fck0Var.b;
            if (!zE) {
                bVar.getClass();
                return false;
            }
            bVar.getClass();
            if (!this.n) {
                this.n = true;
                fq80Var.N(8);
                ed40 ed40VarA = kvu0.a(b4x.q((String[]) dnm0.p(fq80Var, false, false).f14945a));
                if (ed40VarA != null) {
                    awq awqVarA = ((androidx.media3.common.b) fck0Var.b).a();
                    awqVarA.l = ed40VarA.b(((androidx.media3.common.b) fck0Var.b).m);
                    fck0Var.b = new androidx.media3.common.b(awqVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // a.orm0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
