package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class j1x extends j16 {
    public long A;
    public byte B;
    public int Y;
    public androidx.media3.common.b Z;
    public z68 f1;
    public wkj g1;
    public ImageOutput h1;
    public xlo i1;
    public Bitmap j1;
    public boolean k1;
    public vw3 l1;
    public vw3 m1;
    public int n1;
    public boolean o1;
    public final wsf0 t;
    public final wkj u;
    public final ArrayDeque v;
    public boolean w;
    public boolean x;
    public i1x y;
    public long z;

    public j1x(wsf0 wsf0Var) {
        super(4);
        this.t = wsf0Var;
        this.h1 = ImageOutput.f45388a;
        this.u = new wkj(0);
        this.y = i1x.c;
        this.v = new ArrayDeque();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = (byte) 0;
        this.Y = 1;
    }

    @Override // a.j16
    public final int D(androidx.media3.common.b bVar) {
        return wsf0.r(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    public final boolean H(long j) throws dlo {
        boolean z;
        vw3 vw3Var;
        boolean z2;
        int i;
        xlo xloVar;
        int i2;
        int i3;
        androidx.media3.common.b bVar;
        dmo dmoVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.j1;
        if ((bitmap == null || this.l1 != null) && (this.Y != 0 || this.h == 2)) {
            ArrayDeque arrayDeque = this.v;
            if (bitmap == null) {
                this.f1.getClass();
                y68 y68Var = (y68) this.f1.b();
                if (y68Var != null) {
                    if (!y68Var.m(4)) {
                        x0x.G(y68Var.g, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.j1 = y68Var.g;
                        y68Var.w();
                        if (this.k1 && this.j1 != null && this.l1 != null) {
                            this.Z.getClass();
                            androidx.media3.common.b bVar2 = this.Z;
                            int i4 = bVar2.R;
                            int i5 = bVar2.S;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            vw3Var = this.l1;
                            if (((Bitmap) vw3Var.c) == null) {
                                if (z) {
                                    int i6 = vw3Var.f38129a;
                                    this.j1.getClass();
                                    int width = this.j1.getWidth();
                                    androidx.media3.common.b bVar3 = this.Z;
                                    bVar3.getClass();
                                    int i7 = width / bVar3.R;
                                    int height = this.j1.getHeight();
                                    androidx.media3.common.b bVar4 = this.Z;
                                    bVar4.getClass();
                                    int i8 = height / bVar4.S;
                                    int i9 = this.Z.R;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.j1, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.j1;
                                    bitmapCreateBitmap.getClass();
                                }
                                vw3Var.c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = (Bitmap) this.l1.c;
                            bitmap2.getClass();
                            long j2 = this.l1.b;
                            long j3 = j2 - j;
                            if (this.h == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.Y;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        v4i0.e();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < 30000) {
                                xloVar = this.i1;
                                if (xloVar != null) {
                                    long j4 = this.y.b;
                                    this.Z.getClass();
                                    dmoVar = xloVar.f41084a;
                                    if (dmoVar.f1) {
                                        dmoVar.g.a(37).b();
                                    }
                                }
                                this.h1.onImageAvailable(j2 - this.y.b, bitmap2);
                                vw3 vw3Var2 = this.l1;
                                vw3Var2.getClass();
                                long j5 = vw3Var2.b;
                                this.z = j5;
                                while (!arrayDeque.isEmpty() && j5 >= ((i1x) arrayDeque.peek()).f14022a) {
                                    this.y = (i1x) arrayDeque.removeFirst();
                                }
                                this.Y = 3;
                                if (z) {
                                    vw3 vw3Var3 = this.l1;
                                    vw3Var3.getClass();
                                    i2 = vw3Var3.f38129a;
                                    androidx.media3.common.b bVar5 = this.Z;
                                    bVar5.getClass();
                                    i3 = bVar5.S;
                                    bVar = this.Z;
                                    bVar.getClass();
                                    if (i2 == (i3 * bVar.R) - 1) {
                                        this.j1 = null;
                                    }
                                } else {
                                    this.j1 = null;
                                }
                                this.l1 = this.m1;
                                this.m1 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.B == 3) {
                            K();
                            this.Z.getClass();
                            J();
                            return false;
                        }
                        y68Var.w();
                        if (arrayDeque.isEmpty()) {
                            this.x = true;
                            return false;
                        }
                    }
                }
            } else if (this.k1) {
                this.Z.getClass();
                androidx.media3.common.b bVar6 = this.Z;
                int i10 = bVar6.R;
                int i11 = bVar6.S;
                if (i10 != 1) {
                }
                vw3Var = this.l1;
                if (((Bitmap) vw3Var.c) == null) {
                    if (z) {
                        int i12 = vw3Var.f38129a;
                        this.j1.getClass();
                        int width2 = this.j1.getWidth();
                        androidx.media3.common.b bVar7 = this.Z;
                        bVar7.getClass();
                        int i13 = width2 / bVar7.R;
                        int height2 = this.j1.getHeight();
                        androidx.media3.common.b bVar8 = this.Z;
                        bVar8.getClass();
                        int i14 = height2 / bVar8.S;
                        int i15 = this.Z.R;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.j1, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.j1;
                        bitmapCreateBitmap.getClass();
                    }
                    vw3Var.c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.l1.c;
                bitmap3.getClass();
                long j6 = this.l1.b;
                long j7 = j6 - j;
                if (this.h == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            v4i0.e();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                xloVar = this.i1;
                if (xloVar != null) {
                    long j8 = this.y.b;
                    this.Z.getClass();
                    dmoVar = xloVar.f41084a;
                    if (dmoVar.f1) {
                        dmoVar.g.a(37).b();
                    }
                }
                this.h1.onImageAvailable(j6 - this.y.b, bitmap3);
                vw3 vw3Var4 = this.l1;
                vw3Var4.getClass();
                long j9 = vw3Var4.b;
                this.z = j9;
                while (!arrayDeque.isEmpty()) {
                    this.y = (i1x) arrayDeque.removeFirst();
                }
                this.Y = 3;
                if (z) {
                    vw3 vw3Var5 = this.l1;
                    vw3Var5.getClass();
                    i2 = vw3Var5.f38129a;
                    androidx.media3.common.b bVar9 = this.Z;
                    bVar9.getClass();
                    i3 = bVar9.S;
                    bVar = this.Z;
                    bVar.getClass();
                    if (i2 == (i3 * bVar.R) - 1) {
                        this.j1 = null;
                    }
                } else {
                    this.j1 = null;
                }
                this.l1 = this.m1;
                this.m1 = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030 A[PHI: r3
  0x0030: PHI (r3v3 a.wkj) = (r3v2 a.wkj), (r3v13 a.wkj) binds: [B:15:0x0021, B:17:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    public final boolean I(long j) {
        wkj wkjVar;
        int iY;
        ByteBuffer byteBuffer;
        wkj wkjVar2;
        boolean z;
        wkj wkjVar3;
        long j2;
        boolean z2;
        vw3 vw3Var;
        boolean z3;
        androidx.media3.common.b bVar;
        boolean z4;
        boolean z5;
        androidx.media3.common.b bVar2;
        int i;
        wkj wkjVar4;
        if (!this.k1 || this.l1 == null) {
            hsj hsjVar = this.c;
            hsjVar.e();
            z68 z68Var = this.f1;
            if (z68Var != null && this.B != 3 && !this.w) {
                wkj wkjVar5 = this.g1;
                if (wkjVar5 == null) {
                    wkjVar5 = (wkj) z68Var.e();
                    this.g1 = wkjVar5;
                    if (wkjVar5 != null) {
                        wkjVar = wkjVar5;
                        if (this.B == 2) {
                            wkjVar.b = 4;
                            z68 z68Var2 = this.f1;
                            z68Var2.getClass();
                            z68Var2.c(this.g1);
                            this.g1 = null;
                            this.B = (byte) 3;
                            return false;
                        }
                        iY = y(hsjVar, wkjVar5, 0);
                        if (iY != -5) {
                            androidx.media3.common.b bVar3 = (androidx.media3.common.b) hsjVar.b;
                            bVar3.getClass();
                            this.Z = bVar3;
                            this.o1 = true;
                            this.B = (byte) 2;
                            return true;
                        }
                        if (iY != -4) {
                            this.g1.y();
                            byteBuffer = this.g1.g;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                wkjVar2 = this.g1;
                                wkjVar2.getClass();
                                if (wkjVar2.m(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                wkj wkjVar6 = this.g1;
                                wkjVar6.getClass();
                                wkjVar6.e = this.Z;
                                z68 z68Var3 = this.f1;
                                z68Var3.getClass();
                                wkj wkjVar7 = this.g1;
                                wkjVar7.getClass();
                                z68Var3.c(wkjVar7);
                                this.n1 = 0;
                            }
                            wkjVar3 = this.g1;
                            wkjVar3.getClass();
                            if (wkjVar3.m(4)) {
                                this.k1 = true;
                            } else {
                                int i2 = this.n1;
                                j2 = wkjVar3.i;
                                vw3 vw3Var2 = new vw3();
                                vw3Var2.f38129a = i2;
                                vw3Var2.b = j2;
                                this.m1 = vw3Var2;
                                this.n1 = i2 + 1;
                                if (this.k1) {
                                    this.l1 = this.m1;
                                    this.m1 = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    vw3Var = this.l1;
                                    if (vw3Var != null || vw3Var.b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    bVar = this.Z;
                                    bVar.getClass();
                                    if (bVar.R != -1 || (i = (bVar2 = this.Z).S) == -1 || i2 == (i * bVar2.R) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.k1 = z5;
                                    if (z3 || z2) {
                                        this.l1 = this.m1;
                                        this.m1 = null;
                                    }
                                }
                            }
                            wkjVar4 = this.g1;
                            wkjVar4.getClass();
                            if (wkjVar4.m(4)) {
                                this.w = true;
                                this.g1 = null;
                                return false;
                            }
                            long j3 = this.A;
                            wkj wkjVar8 = this.g1;
                            wkjVar8.getClass();
                            this.A = Math.max(j3, wkjVar8.i);
                            if (z) {
                                this.g1 = null;
                            } else {
                                wkj wkjVar9 = this.g1;
                                wkjVar9.getClass();
                                wkjVar9.v();
                            }
                            return !this.k1;
                        }
                        if (iY != -3) {
                            v4i0.e();
                            return false;
                        }
                    }
                } else {
                    wkjVar = wkjVar5;
                    if (this.B == 2) {
                        wkjVar.b = 4;
                        z68 z68Var4 = this.f1;
                        z68Var4.getClass();
                        z68Var4.c(this.g1);
                        this.g1 = null;
                        this.B = (byte) 3;
                        return false;
                    }
                    iY = y(hsjVar, wkjVar5, 0);
                    if (iY != -5) {
                        androidx.media3.common.b bVar4 = (androidx.media3.common.b) hsjVar.b;
                        bVar4.getClass();
                        this.Z = bVar4;
                        this.o1 = true;
                        this.B = (byte) 2;
                        return true;
                    }
                    if (iY != -4) {
                        this.g1.y();
                        byteBuffer = this.g1.g;
                        if (byteBuffer != null) {
                            wkjVar2 = this.g1;
                            wkjVar2.getClass();
                            if (wkjVar2.m(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            wkjVar2 = this.g1;
                            wkjVar2.getClass();
                            if (wkjVar2.m(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            wkj wkjVar10 = this.g1;
                            wkjVar10.getClass();
                            wkjVar10.e = this.Z;
                            z68 z68Var5 = this.f1;
                            z68Var5.getClass();
                            wkj wkjVar11 = this.g1;
                            wkjVar11.getClass();
                            z68Var5.c(wkjVar11);
                            this.n1 = 0;
                        }
                        wkjVar3 = this.g1;
                        wkjVar3.getClass();
                        if (wkjVar3.m(4)) {
                            this.k1 = true;
                        } else {
                            int i3 = this.n1;
                            j2 = wkjVar3.i;
                            vw3 vw3Var3 = new vw3();
                            vw3Var3.f38129a = i3;
                            vw3Var3.b = j2;
                            this.m1 = vw3Var3;
                            this.n1 = i3 + 1;
                            if (this.k1) {
                                this.l1 = this.m1;
                                this.m1 = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                vw3Var = this.l1;
                                if (vw3Var != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                bVar = this.Z;
                                bVar.getClass();
                                if (bVar.R != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.k1 = z5;
                                if (z3) {
                                    this.l1 = this.m1;
                                    this.m1 = null;
                                } else {
                                    this.l1 = this.m1;
                                    this.m1 = null;
                                }
                            }
                        }
                        wkjVar4 = this.g1;
                        wkjVar4.getClass();
                        if (wkjVar4.m(4)) {
                            this.w = true;
                            this.g1 = null;
                            return false;
                        }
                        long j4 = this.A;
                        wkj wkjVar12 = this.g1;
                        wkjVar12.getClass();
                        this.A = Math.max(j4, wkjVar12.i);
                        if (z) {
                            this.g1 = null;
                        } else {
                            wkj wkjVar13 = this.g1;
                            wkjVar13.getClass();
                            wkjVar13.v();
                        }
                        return !this.k1;
                    }
                    if (iY != -3) {
                        v4i0.e();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void J() throws dlo {
        if (this.o1) {
            androidx.media3.common.b bVar = this.Z;
            bVar.getClass();
            int iR = wsf0.r(bVar);
            if (iR != j16.f(4, 0, 0, 0) && iR != j16.f(3, 0, 0, 0)) {
                throw g(new uzw("Provided decoder factory can't create decoder for format."), this.Z, false, 4005);
            }
            z68 z68Var = this.f1;
            if (z68Var != null) {
                z68Var.release();
            }
            this.f1 = new z68((Context) this.t.b);
            this.o1 = false;
        }
    }

    public final void K() {
        this.g1 = null;
        this.B = (byte) 0;
        this.A = -9223372036854775807L;
        z68 z68Var = this.f1;
        if (z68Var != null) {
            z68Var.release();
            this.f1 = null;
        }
    }

    @Override // a.j16, a.x8a0
    public final void c(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.i1 = (xlo) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.f45388a;
            }
            this.h1 = imageOutput;
        }
    }

    @Override // a.j16
    public final String k() {
        return "ImageRenderer";
    }

    @Override // a.j16
    public final boolean m() {
        return this.x;
    }

    @Override // a.j16
    public final boolean o() {
        int i = this.Y;
        if (i != 3) {
            return i == 0 && this.k1;
        }
        return true;
    }

    @Override // a.j16
    public final void p() {
        this.Z = null;
        this.y = i1x.c;
        this.v.clear();
        K();
        this.h1.a();
    }

    @Override // a.j16
    public final void q(boolean z, boolean z2) {
        this.Y = z2 ? 1 : 0;
    }

    @Override // a.j16
    public final void r(long j, boolean z, boolean z2) {
        this.Y = Math.min(this.Y, 1);
        this.x = false;
        this.w = false;
        this.j1 = null;
        this.l1 = null;
        this.m1 = null;
        this.k1 = false;
        this.g1 = null;
        z68 z68Var = this.f1;
        if (z68Var != null) {
            z68Var.flush();
        }
        this.v.clear();
    }

    @Override // a.j16
    public final void s() {
        K();
    }

    @Override // a.j16
    public final void t() {
        K();
        this.Y = Math.min(this.Y, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // a.j16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(androidx.media3.common.b[] r5, long r6, long r8, a.vn30 r10) {
        /*
            r4 = this;
            a.i1x r5 = r4.y
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.v
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.A
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.z
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            a.i1x r6 = new a.i1x
            long r0 = r4.A
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            a.i1x r5 = new a.i1x
            r5.<init>(r0, r8)
            r4.y = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j1x.w(androidx.media3.common.b[], long, long, a.vn30):void");
    }

    @Override // a.j16
    public final void z(long j, long j2) throws dlo {
        if (this.x) {
            return;
        }
        if (this.Z == null) {
            hsj hsjVar = this.c;
            hsjVar.e();
            wkj wkjVar = this.u;
            wkjVar.v();
            int iY = y(hsjVar, wkjVar, 2);
            if (iY != -5) {
                if (iY == -4) {
                    x0x.K(wkjVar.m(4));
                    this.w = true;
                    this.x = true;
                    return;
                }
                return;
            }
            androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar.b;
            bVar.getClass();
            this.Z = bVar;
            this.o1 = true;
        }
        if (this.f1 == null) {
            J();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (H(j)) {
            }
            while (I(j)) {
            }
            Trace.endSection();
        } catch (uzw e) {
            throw g(e, null, false, 4003);
        }
    }
}
