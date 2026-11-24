package a;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class exg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lhf0 f8575a;
    public final int b;
    public final fq80 c;
    public dr8 d;
    public dr8 e;
    public dr8 f;
    public long g;

    public exg0(lhf0 lhf0Var) {
        this.f8575a = lhf0Var;
        synchronized (lhf0Var) {
            hu5 hu5Var = ((xvj) lhf0Var.d).c;
        }
        this.b = 65536;
        this.c = new fq80(32);
        dr8 dr8Var = new dr8(0L, 65536);
        this.d = dr8Var;
        this.e = dr8Var;
        this.f = dr8Var;
    }

    public static dr8 c(dr8 dr8Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= dr8Var.b) {
            dr8Var = (dr8) dr8Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (dr8Var.b - j));
            o52 o52Var = (o52) dr8Var.c;
            byteBuffer.put(o52Var.f24666a, ((int) (j - dr8Var.f6545a)) + o52Var.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == dr8Var.b) {
                dr8Var = (dr8) dr8Var.d;
            }
        }
        return dr8Var;
    }

    public static dr8 d(dr8 dr8Var, long j, byte[] bArr, int i) {
        while (j >= dr8Var.b) {
            dr8Var = (dr8) dr8Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (dr8Var.b - j));
            o52 o52Var = (o52) dr8Var.c;
            System.arraycopy(o52Var.f24666a, ((int) (j - dr8Var.f6545a)) + o52Var.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == dr8Var.b) {
                dr8Var = (dr8) dr8Var.d;
            }
        }
        return dr8Var;
    }

    public static dr8 e(dr8 dr8Var, wkj wkjVar, vw3 vw3Var, fq80 fq80Var) {
        if (wkjVar.m(1073741824)) {
            long j = vw3Var.b;
            int iG = 1;
            fq80Var.J(1);
            dr8 dr8VarD = d(dr8Var, j, fq80Var.f9961a, 1);
            long j2 = j + 1;
            byte b = fq80Var.f9961a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            pef pefVar = wkjVar.f;
            byte[] bArr = pefVar.f26848a;
            if (bArr == null) {
                pefVar.f26848a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            dr8Var = d(dr8VarD, j2, pefVar.f26848a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                fq80Var.J(2);
                dr8Var = d(dr8Var, j3, fq80Var.f9961a, 2);
                j3 += 2;
                iG = fq80Var.G();
            }
            int[] iArr = pefVar.d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = pefVar.e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z) {
                int i2 = iG * 6;
                fq80Var.J(i2);
                dr8Var = d(dr8Var, j3, fq80Var.f9961a, i2);
                j3 += (long) i2;
                fq80Var.M(0);
                for (int i3 = 0; i3 < iG; i3++) {
                    iArr[i3] = fq80Var.G();
                    iArr2[i3] = fq80Var.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = vw3Var.f38129a - ((int) (j3 - vw3Var.b));
            }
            mcs0 mcs0Var = (mcs0) vw3Var.c;
            String str = vtt0.f38024a;
            byte[] bArr2 = mcs0Var.b;
            byte[] bArr3 = pefVar.f26848a;
            int i4 = mcs0Var.f21565a;
            int i5 = mcs0Var.c;
            int i6 = mcs0Var.d;
            pefVar.f = iG;
            pefVar.d = iArr;
            pefVar.e = iArr2;
            pefVar.b = bArr2;
            pefVar.f26848a = bArr3;
            pefVar.c = i4;
            pefVar.g = i5;
            pefVar.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = pefVar.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            ehf0 ehf0Var = pefVar.j;
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) ehf0Var.c;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) ehf0Var.b).setPattern(pattern);
            long j4 = vw3Var.b;
            int i7 = (int) (j3 - j4);
            vw3Var.b = j4 + ((long) i7);
            vw3Var.f38129a -= i7;
        }
        if (!wkjVar.m(268435456)) {
            wkjVar.x(vw3Var.f38129a);
            return c(dr8Var, vw3Var.b, wkjVar.g, vw3Var.f38129a);
        }
        fq80Var.J(4);
        dr8 dr8VarD2 = d(dr8Var, vw3Var.b, fq80Var.f9961a, 4);
        int iD = fq80Var.D();
        vw3Var.b += 4;
        vw3Var.f38129a -= 4;
        wkjVar.x(iD);
        dr8 dr8VarC = c(dr8VarD2, vw3Var.b, wkjVar.g, iD);
        vw3Var.b += (long) iD;
        int i8 = vw3Var.f38129a - iD;
        vw3Var.f38129a = i8;
        ByteBuffer byteBuffer = wkjVar.j;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            wkjVar.j = ByteBuffer.allocate(i8);
        } else {
            wkjVar.j.clear();
        }
        return c(dr8VarC, vw3Var.b, wkjVar.j, vw3Var.f38129a);
    }

    public final void a(long j) {
        dr8 dr8Var;
        if (j == -1) {
            return;
        }
        while (true) {
            dr8Var = this.d;
            if (j < dr8Var.b) {
                break;
            }
            lhf0 lhf0Var = this.f8575a;
            o52 o52Var = (o52) dr8Var.c;
            synchronized (lhf0Var) {
                try {
                    hu5 hu5Var = ((xvj) lhf0Var.d).c;
                    synchronized (hu5Var) {
                        try {
                            o52[] o52VarArr = (o52[]) hu5Var.e;
                            int i = hu5Var.d;
                            hu5Var.d = i + 1;
                            o52VarArr[i] = o52Var;
                            hu5Var.c--;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    lhf0Var.G(o52Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dr8 dr8Var2 = this.d;
            dr8Var2.c = null;
            dr8 dr8Var3 = (dr8) dr8Var2.d;
            dr8Var2.d = null;
            this.d = dr8Var3;
        }
        if (this.e.f6545a < dr8Var.f6545a) {
            this.e = dr8Var;
        }
    }

    public final int b(int i) {
        o52 o52VarB;
        dr8 dr8Var = this.f;
        if (((o52) dr8Var.c) == null) {
            lhf0 lhf0Var = this.f8575a;
            synchronized (lhf0Var) {
                o52VarB = ((xvj) lhf0Var.d).c.b();
                ((HashMap) lhf0Var.b).put(o52VarB, (a4a0) lhf0Var.c);
                wvj wvjVar = (wvj) ((xvj) lhf0Var.d).n.get((a4a0) lhf0Var.c);
                if (wvjVar != null) {
                    synchronized (wvjVar) {
                        wvjVar.d++;
                    }
                }
            }
            dr8 dr8Var2 = new dr8(this.f.b, this.b);
            dr8Var.c = o52VarB;
            dr8Var.d = dr8Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
