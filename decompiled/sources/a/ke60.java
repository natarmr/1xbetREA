package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ke60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18139a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public ke60(je60 je60Var) {
        boolean zF;
        boolean zF2;
        byte bG;
        byte bG2;
        byte bG3;
        int i = je60Var.f16358a;
        ByteBuffer byteBuffer = je60Var.b;
        boolean z = false;
        boolean zF3 = true;
        x0x.A(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        q8b q8bVar = new q8b(bArr, iRemaining);
        this.g = q8bVar.g(3);
        q8bVar.n();
        boolean zF4 = q8bVar.f();
        this.f18139a = zF4;
        if (zF4) {
            q8bVar.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (q8bVar.f()) {
                q8bVar.o(64);
                if (q8bVar.f()) {
                    int i2 = 0;
                    while (!q8bVar.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        q8bVar.o(i2);
                    }
                }
                boolean zF5 = q8bVar.f();
                this.b = zF5;
                if (zF5) {
                    q8bVar.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = q8bVar.f();
            int iG = q8bVar.g(5);
            for (int i3 = 0; i3 <= iG; i3++) {
                q8bVar.o(12);
                if (i3 == 0) {
                    if (q8bVar.g(5) > 7) {
                        q8bVar.f();
                    }
                } else if (q8bVar.g(5) > 7) {
                    q8bVar.n();
                }
                if (this.b) {
                    q8bVar.n();
                }
                if (this.h && q8bVar.f()) {
                    if (i3 == 0) {
                        q8bVar.g(4);
                    } else {
                        q8bVar.o(4);
                    }
                }
            }
        }
        int iG2 = q8bVar.g(4);
        int iG3 = q8bVar.g(4);
        q8bVar.o(iG2 + 1);
        q8bVar.o(iG3 + 1);
        if (this.f18139a) {
            this.c = false;
            zF = false;
        } else {
            zF = q8bVar.f();
            this.c = zF;
        }
        if (zF) {
            q8bVar.o(4);
            q8bVar.o(3);
        }
        q8bVar.o(3);
        if (this.f18139a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            q8bVar.o(4);
            boolean zF6 = q8bVar.f();
            if (zF6) {
                q8bVar.o(2);
            }
            if (q8bVar.f()) {
                this.d = true;
                zF2 = true;
            } else {
                zF2 = q8bVar.f();
                this.d = zF2;
            }
            if (!zF2 || q8bVar.f()) {
                this.e = true;
            } else {
                this.e = q8bVar.f();
            }
            if (zF6) {
                this.f = q8bVar.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        q8bVar.o(3);
        boolean zF7 = (this.g == 2 && q8bVar.f()) ? q8bVar.f() : false;
        boolean zF8 = this.g != 1 ? q8bVar.f() : false;
        if (q8bVar.f()) {
            bG2 = (byte) q8bVar.g(8);
            bG3 = (byte) q8bVar.g(8);
            bG = (byte) q8bVar.g(8);
        } else {
            bG = 0;
            bG2 = 0;
            bG3 = 0;
        }
        if (zF8) {
            q8bVar.n();
        } else if (bG2 != 1 || bG3 != 13 || bG != 0) {
            q8bVar.n();
            int i4 = this.g;
            if (i4 == 0) {
                z = true;
            } else if (i4 == 1) {
                zF3 = false;
            } else if (zF7) {
                boolean zF9 = q8bVar.f();
                zF3 = zF9 ? q8bVar.f() : false;
                z = zF9;
            } else {
                zF3 = false;
                z = true;
            }
            if (z && zF3) {
                q8bVar.g(2);
            }
        }
        q8bVar.n();
    }
}
