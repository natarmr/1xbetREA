package a;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class u04 extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public nv20 o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34836a = new Object();
    public final yjc d = new yjc();
    public final yjc e = new yjc();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public u04(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        yjc yjcVar = this.d;
        yjcVar.b = yjcVar.f42734a;
        yjc yjcVar2 = this.e;
        yjcVar2.b = yjcVar2.f42734a;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException != null) {
            this.n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f34836a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f34836a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        ylo yloVar;
        synchronized (this.f34836a) {
            this.d.a(i);
            nv20 nv20Var = this.o;
            if (nv20Var != null && (yloVar = ((mm30) nv20Var.f24171a).i1) != null) {
                yloVar.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        ylo yloVar;
        synchronized (this.f34836a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                nv20 nv20Var = this.o;
                if (nv20Var != null && (yloVar = ((mm30) nv20Var.f24171a).i1) != null) {
                    yloVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f34836a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
