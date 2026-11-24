package a;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t04 implements gm30 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f33100a;
    public final HandlerThread b;
    public g12 c;
    public final AtomicReference d;
    public final brd e;
    public boolean f;

    public t04(MediaCodec mediaCodec, HandlerThread handlerThread) {
        brd brdVar = new brd();
        this.f33100a = mediaCodec;
        this.b = handlerThread;
        this.e = brdVar;
        this.d = new AtomicReference();
    }

    public static s04 e() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new s04();
                }
                return (s04) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.gm30
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // a.gm30
    public final void b(Bundle bundle) {
        a();
        g12 g12Var = this.c;
        String str = vtt0.f38024a;
        g12Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // a.gm30
    public final void c(int i, int i2, int i3, long j) {
        a();
        s04 s04VarE = e();
        s04VarE.f31395a = i;
        s04VarE.b = i2;
        s04VarE.d = j;
        s04VarE.e = i3;
        g12 g12Var = this.c;
        String str = vtt0.f38024a;
        g12Var.obtainMessage(1, s04VarE).sendToTarget();
    }

    @Override // a.gm30
    public final void d(int i, pef pefVar, long j, int i2) {
        a();
        s04 s04VarE = e();
        s04VarE.f31395a = i;
        s04VarE.b = 0;
        s04VarE.d = j;
        s04VarE.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = s04VarE.c;
        cryptoInfo.numSubSamples = pefVar.f;
        int[] iArr = pefVar.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = pefVar.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = pefVar.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = pefVar.f26848a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = pefVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(pefVar.g, pefVar.h));
        g12 g12Var = this.c;
        String str = vtt0.f38024a;
        g12Var.obtainMessage(2, s04VarE).sendToTarget();
    }

    @Override // a.gm30
    public final void flush() {
        if (this.f) {
            try {
                g12 g12Var = this.c;
                g12Var.getClass();
                g12Var.removeCallbacksAndMessages(null);
                brd brdVar = this.e;
                synchronized (brdVar) {
                    brdVar.b = false;
                }
                g12 g12Var2 = this.c;
                g12Var2.getClass();
                g12Var2.obtainMessage(3).sendToTarget();
                synchronized (brdVar) {
                    while (!brdVar.b) {
                        brdVar.f3075a.getClass();
                        brdVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                itt0.o(e);
            }
        }
    }

    @Override // a.gm30
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // a.gm30
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new g12(this, handlerThread.getLooper(), (byte) 1);
        this.f = true;
    }
}
