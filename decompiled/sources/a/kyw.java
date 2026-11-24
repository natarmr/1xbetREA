package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class kyw implements d1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f19126a;
    public volatile boolean c;
    public ibe0 d;
    public ImageWriter e;
    public Matrix g;
    public ByteBuffer h;
    public ByteBuffer i;
    public ByteBuffer j;
    public ByteBuffer k;
    public ByteBuffer l;
    public ByteBuffer m;
    public final Object n;
    public boolean o;
    public volatile int b = 1;
    public Rect f = new Rect();

    public kyw() {
        new Rect();
        this.g = new Matrix();
        new Matrix();
        this.n = new Object();
        this.o = true;
    }

    public b1x a(e1x e1xVar) {
        return e1xVar.b0();
    }

    public final m3x b(b1x b1xVar) {
        int i = this.c ? this.f19126a : 0;
        synchronized (this.n) {
            try {
                if (this.c && i != 0) {
                    g(b1xVar, i);
                }
                if (this.c || this.b == 3) {
                    d(b1xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new m3x(new q080("No analyzer or executor currently set."), (byte) 1);
    }

    public final void d(b1x b1xVar) {
        if (this.b != 1 && this.b != 3) {
            if (this.b == 2 && this.h == null) {
                this.h = ByteBuffer.allocateDirect(b1xVar.f() * b1xVar.j() * 4);
                return;
            }
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.i;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(b1xVar.f() * b1xVar.j());
            this.i = byteBufferAllocateDirect;
        }
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = this.j;
        if (byteBufferAllocateDirect2 == null) {
            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((b1xVar.f() * b1xVar.j()) / 4);
            this.j = byteBufferAllocateDirect2;
        }
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = this.k;
        if (byteBufferAllocateDirect3 == null) {
            byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((b1xVar.f() * b1xVar.j()) / 4);
            this.k = byteBufferAllocateDirect3;
        }
        byteBufferAllocateDirect3.position(0);
        if (this.b == 3) {
            ByteBuffer byteBufferAllocateDirect4 = this.l;
            if (byteBufferAllocateDirect4 == null) {
                byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(b1xVar.f() * b1xVar.j());
                this.l = byteBufferAllocateDirect4;
            }
            byteBufferAllocateDirect4.position(0);
            ByteBuffer byteBufferAllocateDirect5 = this.m;
            if (byteBufferAllocateDirect5 == null) {
                byteBufferAllocateDirect5 = ByteBuffer.allocateDirect((b1xVar.f() * b1xVar.j()) / 2);
                this.m = byteBufferAllocateDirect5;
            }
            byteBufferAllocateDirect5.position(0);
        }
    }

    @Override // a.d1x
    public final void e(e1x e1xVar) {
        try {
            b1x b1xVarA = a(e1xVar);
            if (b1xVarA != null) {
                f(b1xVarA);
            }
        } catch (IllegalStateException e) {
            l8x.Y("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public void f(b1x b1xVar) {
        m3x m3xVarB = b(b1xVar);
        svu svuVar = new svu(b1xVar);
        m3xVarB.a(new mfr((Object) m3xVarB, (Object) svuVar, (byte) 0), bnk.a());
    }

    public final void g(b1x b1xVar, int i) {
        ibe0 ibe0Var = this.d;
        if (ibe0Var == null) {
            return;
        }
        ibe0Var.e();
        int iJ = b1xVar.j();
        int iF = b1xVar.f();
        int iH = this.d.h();
        int iG = this.d.G();
        boolean z = i == 90 || i == 270;
        int i2 = z ? iF : iJ;
        if (!z) {
            iJ = iF;
        }
        this.d = new ibe0(g1x.r(i2, iJ, iH, iG));
        if (this.b == 1) {
            ImageWriter imageWriter = this.e;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.e = ImageWriter.newInstance(this.d.getSurface(), this.d.G());
        }
    }

    public final void h(Matrix matrix) {
        synchronized (this.n) {
            this.g = matrix;
            new Matrix(this.g);
        }
    }

    public final void i(Rect rect) {
        synchronized (this.n) {
            this.f = rect;
            new Rect(this.f);
        }
    }

    public void c() {
    }
}
