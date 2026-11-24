package a;

/* JADX INFO: loaded from: classes.dex */
public final class f7x implements tel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel f9079a;
    public z6x b;
    public c7x c;
    public b7x d;
    public a7x e;
    public d7x f;
    public j6u0 g;
    public hac h;
    public final y78 i;
    public final y78 j;

    public f7x(hel helVar) {
        this.f9079a = helVar;
        y78 y78Var = new y78((byte) 3, false);
        y78Var.c = new vy40();
        this.i = y78Var;
        y78 y78Var2 = new y78((byte) 11, false);
        y78Var2.c = new iy40();
        this.j = y78Var2;
    }

    public static void c(f7x f7xVar, x6x x6xVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        hel helVar = f7xVar.f9079a;
        b7x b7xVar = f7xVar.d;
        if (b7xVar == null) {
            b7xVar = new b7x();
            b7xVar.f2128a = null;
            b7xVar.b = Long.MAX_VALUE;
            b7xVar.c = false;
            f7xVar.d = b7xVar;
        }
        b7xVar.f2128a = x6xVar;
        b7xVar.b = j;
        hac hacVar = f7xVar.h;
        ma80 ma80Var = helVar.q;
        if (hacVar == null) {
            f7xVar.h = new hac(ma80Var);
        } else {
            hacVar.c = ma80Var;
            hacVar.b = j2;
        }
        b7xVar.c = false;
        f7xVar.f = b7xVar;
    }

    @Override // a.zlt
    public final String F() {
        d7x d7xVar = this.f;
        if (d7xVar instanceof z6x) {
            return ((z6x) d7xVar).c ? "waiting" : "idle";
        }
        if ((d7xVar instanceof b7x) || (d7xVar instanceof a7x)) {
            return "waiting";
        }
        return d7xVar instanceof c7x ? "recognized" : "idle";
    }

    @Override // a.tel
    public final ma80 J() {
        return this.f9079a.q;
    }

    public final void a() {
        z6x z6xVar = this.b;
        if (z6xVar == null) {
            y6x y6xVar = y6x.c;
            z6xVar = new z6x();
            z6xVar.f43891a = y6xVar;
            z6xVar.b = false;
            z6xVar.c = false;
            this.b = z6xVar;
        }
        z6xVar.f43891a = y6x.c;
        z6xVar.b = false;
        z6xVar.c = false;
        this.f = z6xVar;
    }

    public final void b(x6x x6xVar, long j, hac hacVar) {
        a7x a7xVar = this.e;
        if (a7xVar == null) {
            a7xVar = new a7x();
            a7xVar.f396a = null;
            a7xVar.b = Long.MAX_VALUE;
            this.e = a7xVar;
        }
        a7xVar.f396a = x6xVar;
        a7xVar.b = j;
        hacVar.b = 0L;
        this.f = a7xVar;
    }

    public final j6u0 d() {
        j6u0 j6u0Var = this.g;
        if (j6u0Var != null) {
            return j6u0Var;
        }
        jf4.o("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(x6x x6xVar, v6x v6xVar, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = x6xVar.c;
        hel helVar = this.f9079a;
        ma80 ma80Var = helVar.q;
        ma80Var.getClass();
        bk9 bk9Var = uel.f35535a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (ma80Var == ma80.f21447a ? j & 4294967295L : j >> 32))) > 2.0f) {
            j6u0 j6u0VarD = d();
            ma80 ma80Var2 = helVar.q;
            y78 y78Var = this.i;
            vy40 vy40Var = (vy40) y78Var.c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (g7x.v(x6xVar)) {
                y78Var.b = 0;
                vy40Var.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (g7x.w(x6xVar) || g7x.v(x6xVar)) {
                j2 = 4294967295L;
            } else {
                if (vy40Var.b == 3) {
                    int i = y78Var.b;
                    y78Var.b = i + 1;
                    vy40Var.o(i, x6xVar);
                } else {
                    vy40Var.a(x6xVar);
                }
                if (y78Var.b == 3) {
                    y78Var.b = 0;
                }
                Object[] objArr = vy40Var.f38232a;
                int i2 = vy40Var.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((x6x) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = vy40Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = vy40Var.f38232a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((x6x) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / vy40Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (ma80Var2 != null) {
                int i6 = v6xVar.f36896a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = ma80Var2 == ma80.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            j6u0VarD.f16007a.b(x6xVar.b, jFloatToRawIntBits);
            y78 y78Var2 = this.j;
            iy40 iy40Var = (iy40) y78Var2.c;
            int i7 = iy40Var.b;
            if (i7 == 3) {
                int i8 = y78Var2.b;
                y78Var2.b = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    v4i0.m("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = iy40Var.f15572a;
                    long j5 = jArr[i8];
                    jArr[i8] = j;
                }
            } else {
                iy40Var.a(j);
            }
            if (y78Var2.b == 3) {
                y78Var2.b = 0;
            }
            long[] jArr2 = iy40Var.f15572a;
            int i9 = iy40Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = iy40Var.b;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = iy40Var.f15572a;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            helVar.h1(new odl(true, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / iy40Var.b)) & j2)));
        }
    }

    public final void f(x6x x6xVar, x6x x6xVar2, v6x v6xVar, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.g == null) {
            this.g = new j6u0();
        }
        j6u0 j6u0VarD = d();
        hel helVar = this.f9079a;
        ma80 ma80Var = helVar.q;
        y78 y78Var = this.i;
        vy40 vy40Var = (vy40) y78Var.c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (x6xVar.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (x6xVar.c & 4294967295L));
        if (g7x.v(x6xVar)) {
            y78Var.b = 0;
            vy40Var.d();
        }
        if (g7x.w(x6xVar) || g7x.v(x6xVar)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (vy40Var.b == 3) {
                int i = y78Var.b;
                y78Var.b = i + 1;
                vy40Var.o(i, x6xVar);
            } else {
                vy40Var.a(x6xVar);
            }
            if (y78Var.b == 3) {
                y78Var.b = 0;
            }
            Object[] objArr = vy40Var.f38232a;
            int i2 = vy40Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((x6x) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = vy40Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = vy40Var.f38232a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((x6x) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / vy40Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (ma80Var != null) {
            int i6 = v6xVar.f36896a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = ma80Var == ma80.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        j6u0VarD.f16007a.b(x6xVar.b, jFloatToRawIntBits);
        long jE = ne60.e(g7x.V(x6xVar2, helVar.q, v6xVar), j);
        if (((Boolean) helVar.r.invoke(new lpa0(1))).booleanValue()) {
            helVar.h1(new pdl(jE));
        }
        y78 y78Var2 = this.j;
        y78Var2.b = 0;
        ((iy40) y78Var2.c).b = 0;
    }
}
