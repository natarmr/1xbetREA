package a;

import android.gov.nist.core.Separators;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r04 implements dm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f29610a;
    public final u04 b;
    public final gm30 c;
    public final dq00 d;
    public boolean e;
    public byte f = 0;

    public r04(MediaCodec mediaCodec, HandlerThread handlerThread, gm30 gm30Var, dq00 dq00Var) {
        this.f29610a = mediaCodec;
        this.b = new u04(handlerThread);
        this.c = gm30Var;
        this.d = dq00Var;
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            rw2.x(sb, "Unknown(", i, Separators.RPAREN);
        }
        return sb.toString();
    }

    @Override // a.dm30
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // a.dm30
    public final void c(int i, int i2, int i3, long j) {
        this.c.c(i, i2, i3, j);
    }

    @Override // a.dm30
    public final void d(int i, pef pefVar, long j, int i2) {
        this.c.d(i, pefVar, j, i2);
    }

    @Override // a.dm30
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        u04 u04Var = this.b;
        synchronized (u04Var.f34836a) {
            try {
                mediaFormat = u04Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // a.dm30
    public final void f() {
        this.f29610a.detachOutputSurface();
    }

    @Override // a.dm30
    public final void flush() {
        this.c.flush();
        this.f29610a.flush();
        u04 u04Var = this.b;
        synchronized (u04Var.f34836a) {
            u04Var.l++;
            Handler handler = u04Var.c;
            String str = vtt0.f38024a;
            handler.post(new w1((Object) u04Var, (byte) 10));
        }
        this.f29610a.start();
    }

    @Override // a.dm30
    public final void g(int i) {
        this.f29610a.setVideoScalingMode(i);
    }

    @Override // a.dm30
    public final ByteBuffer h(int i) {
        return this.f29610a.getInputBuffer(i);
    }

    @Override // a.dm30
    public final void i(Surface surface) {
        this.f29610a.setOutputSurface(surface);
    }

    public final void j(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        dq00 dq00Var;
        LoudnessCodecController loudnessCodecController;
        u04 u04Var = this.b;
        HandlerThread handlerThread = u04Var.b;
        x0x.K(u04Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f29610a;
        mediaCodec.setCallback(u04Var, handler);
        u04Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (dq00Var = this.d) != null && ((loudnessCodecController = (LoudnessCodecController) dq00Var.c) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            x0x.K(((HashSet) dq00Var.b).add(mediaCodec));
        }
        this.f = (byte) 1;
    }

    @Override // a.dm30
    public final void k(int i) {
        this.f29610a.releaseOutputBuffer(i, false);
    }

    @Override // a.dm30
    public final boolean l(nv20 nv20Var) {
        u04 u04Var = this.b;
        synchronized (u04Var.f34836a) {
            u04Var.o = nv20Var;
        }
        return true;
    }

    @Override // a.dm30
    public final void m(wm30 wm30Var, Handler handler) {
        this.f29610a.setOnFrameRenderedListener(new p04(this, wm30Var, (byte) 0), handler);
    }

    @Override // a.dm30
    public final void n(int i, long j) {
        this.f29610a.releaseOutputBuffer(i, j);
    }

    @Override // a.dm30
    public final int o() {
        this.c.a();
        u04 u04Var = this.b;
        synchronized (u04Var.f34836a) {
            try {
                u04Var.b();
                int i = -1;
                if (u04Var.l > 0 || u04Var.m) {
                    return -1;
                }
                yjc yjcVar = u04Var.d;
                int i2 = yjcVar.f42734a;
                int i3 = yjcVar.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = yjcVar.c[i2];
                    yjcVar.f42734a = (i2 + 1) & yjcVar.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.dm30
    public final int q(MediaCodec.BufferInfo bufferInfo) {
        this.c.a();
        u04 u04Var = this.b;
        synchronized (u04Var.f34836a) {
            try {
                u04Var.b();
                if (u04Var.l > 0 || u04Var.m) {
                    return -1;
                }
                yjc yjcVar = u04Var.e;
                int i = yjcVar.f42734a;
                int i2 = yjcVar.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = yjcVar.c[i];
                yjcVar.f42734a = yjcVar.d & (i + 1);
                if (i3 >= 0) {
                    u04Var.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) u04Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    u04Var.h = (MediaFormat) u04Var.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.dm30
    public final void r(fdq0 fdq0Var) {
        u04 u04Var = this.b;
        synchronized (u04Var.f34836a) {
            u04Var.b();
            this.c.a();
            fdq0Var.run();
        }
    }

    @Override // a.dm30
    public final void release() {
        dq00 dq00Var;
        dq00 dq00Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                u04 u04Var = this.b;
                synchronized (u04Var.f34836a) {
                    u04Var.m = true;
                    u04Var.b.quit();
                    u04Var.a();
                }
            }
            this.f = (byte) 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f29610a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (dq00Var2 = this.d) != null) {
                    dq00Var2.i(this.f29610a);
                }
                this.f29610a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.f29610a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (dq00Var = this.d) != null) {
                        dq00Var.i(this.f29610a);
                    }
                    this.f29610a.release();
                    this.e = true;
                }
            }
            throw th;
        }
    }

    @Override // a.dm30
    public final ByteBuffer s(int i) {
        return this.f29610a.getOutputBuffer(i);
    }

    @Override // a.dm30
    public final void t(ArrayList arrayList) {
        this.f29610a.subscribeToVendorParameters(arrayList);
    }

    @Override // a.dm30
    public final void v(ArrayList arrayList) {
        this.f29610a.unsubscribeFromVendorParameters(arrayList);
    }
}
