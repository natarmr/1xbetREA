package a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k7m0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public byte[] G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public byte[] Y;
    public byte b;
    public byte[] d;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int v;
    public int w;
    public int x;
    public byte[] y;
    public byte[] z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17830a = 0;
    public final s68 c = new s68();
    public final int[] e = new int[3240];
    public final int[] f = new int[3240];
    public final zz2 k = new zz2();
    public final zz2 l = new zz2();
    public final zz2 m = new zz2();
    public final int[] n = new int[3];
    public final int[] o = new int[3];
    public final int[] p = new int[6];
    public final int[] q = {16, 15, 11, 4};
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public boolean u = false;
    public int P = 0;
    public long Q = 0;
    public final byte[] R = new byte[0];
    public int S = 0;

    public static void a(k7m0 k7m0Var, InputStream inputStream) {
        int i;
        int i2 = k7m0Var.f17830a;
        s68 s68Var = k7m0Var.c;
        if (i2 != 0) {
            jf4.n("State MUST be uninitialized");
            return;
        }
        if (s68Var.d != null) {
            jf4.n("Bit reader already has associated input stream");
            return;
        }
        edu eduVar = s68Var.c;
        byte[] bArr = s68Var.f31691a;
        int[] iArr = s68Var.b;
        eduVar.c = bArr;
        eduVar.b = iArr;
        s68Var.d = inputStream;
        s68Var.f = 0L;
        s68Var.g = 64;
        s68Var.h = 1024;
        s68Var.e = false;
        s68.e(s68Var);
        s68.a(s68Var, false);
        s68.b(s68Var);
        s68.b(s68Var);
        if (s68.d(s68Var, 1) == 0) {
            i = 16;
        } else {
            int iD = s68.d(s68Var, 3);
            i = 17;
            if (iD != 0) {
                i = 17 + iD;
            } else {
                int iD2 = s68.d(s68Var, 3);
                if (iD2 != 0) {
                    i = iD2 + 8;
                }
            }
        }
        if (i == 9) {
            v4i0.l("Invalid 'windowBits' code");
            return;
        }
        int i3 = 1 << i;
        k7m0Var.O = i3;
        k7m0Var.N = i3 - 16;
        k7m0Var.f17830a = 1;
    }
}
