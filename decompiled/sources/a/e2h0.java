package a;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class e2h0 implements seu0, d1a {
    public int i;
    public SurfaceTexture j;
    public byte[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7086a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final g4c0 c = new g4c0();
    public final o24 d = new o24((byte) 6);
    public final tyc e = new tyc((byte) 7);
    public final tyc f = new tyc((byte) 7);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // a.d1a
    public final void a(long j, float[] fArr) {
        ((tyc) this.d.d).f(fArr, j);
    }

    @Override // a.d1a
    public final void b() {
        this.e.l();
        o24 o24Var = this.d;
        ((tyc) o24Var.d).l();
        o24Var.f24513a = false;
        this.b.set(true);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            n4c.H();
            this.c.c();
            n4c.H();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            n4c.H();
            int i = iArr[0];
            n4c.G(36197, i);
            this.i = i;
        } catch (p7v e) {
            f1t0.R("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: a.d2h0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f5355a.f7086a.set(true);
            }
        });
        return this.j;
    }

    @Override // a.seu0
    public final void d(long j, long j2, androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListA;
        this.e.f(Long.valueOf(j), j2);
        byte[] bArr = bVar.F;
        int i2 = bVar.G;
        byte[] bArr2 = this.m;
        int i3 = this.l;
        this.m = bArr;
        if (i2 == -1) {
            i2 = this.k;
        }
        this.l = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        d4c0 d4c0Var = null;
        if (bArr3 != null) {
            int i4 = this.l;
            int i5 = e4c0.b;
            fq80 fq80Var = new fq80(bArr3);
            try {
                fq80Var.N(4);
                int iM = fq80Var.m();
                fq80Var.M(0);
                if (iM == 1886547818) {
                    fq80Var.N(8);
                    int i6 = fq80Var.b;
                    int i7 = fq80Var.c;
                    while (true) {
                        if (i6 < i7) {
                            int iM2 = fq80Var.m() + i6;
                            if (iM2 > i6 && iM2 <= i7) {
                                int iM3 = fq80Var.m();
                                if (iM3 != 2037673328 && iM3 != 1836279920) {
                                    fq80Var.M(iM2);
                                    i6 = iM2;
                                }
                                fq80Var.L(iM2);
                                arrayListA = e4c0.a(fq80Var);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = e4c0.a(fq80Var);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    c4c0 c4c0Var = (c4c0) arrayListA.get(0);
                    d4c0Var = new d4c0(c4c0Var, c4c0Var, i4);
                } else if (size == 2) {
                    d4c0Var = new d4c0((c4c0) arrayListA.get(0), (c4c0) arrayListA.get(1), i4);
                }
            }
        }
        if (d4c0Var == null || !g4c0.e(d4c0Var)) {
            int i8 = this.l;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 36; i11 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i11 * f) - f3;
                i = i11 + 1;
                float f5 = (i * f) - f3;
                int i12 = 0;
                while (i12 < 73) {
                    int i13 = i;
                    int i14 = 0;
                    int i15 = 2;
                    while (i14 < i15) {
                        float f6 = radians;
                        float f7 = i12 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i14 == 0 ? f4 : f5;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i16 = i9 + 3;
                        float f9 = f;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f7 / f8;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i11 + i14) * f9) / f6;
                        if ((i12 == 0 && i14 == 0) || (i12 == 72 && i14 == 1)) {
                            System.arraycopy(fArr, i9, fArr, i16, 3);
                            i9 += 6;
                            i15 = 2;
                            System.arraycopy(fArr2, i10, fArr2, i17, 2);
                            i10 += 4;
                        } else {
                            i15 = 2;
                            i9 = i16;
                            i10 = i17;
                        }
                        i14++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i12++;
                    i = i13;
                }
            }
            c4c0 c4c0Var2 = new c4c0(new tyc(0, 1, fArr, fArr2));
            d4c0Var = new d4c0(c4c0Var2, c4c0Var2, i8);
        }
        this.f.f(d4c0Var, j2);
    }
}
