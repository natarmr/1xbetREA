package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ryj extends qyj {
    public final boolean e;
    public final nyj f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final boolean y;
    public final String z;

    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    public ryj(int i, ccs0 ccs0Var, int i2, nyj nyjVar, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iG;
        int i6;
        boolean z4;
        String strC;
        int i7;
        androidx.media3.common.b bVar;
        int i8;
        int i9;
        int i10;
        androidx.media3.common.b bVar2;
        int i11;
        int i12;
        int i13;
        super(i, ccs0Var, i2);
        this.f = nyjVar;
        boolean z5 = nyjVar.z;
        b4x b4xVar = nyjVar.i;
        b4x b4xVar2 = nyjVar.k;
        int i14 = z5 ? 24 : 16;
        int i15 = 0;
        this.s = false;
        if (!z || (((i11 = (bVar2 = this.d).w) != -1 && i11 > nyjVar.f32003a) || ((i12 = bVar2.x) != -1 && i12 > nyjVar.b))) {
            z2 = false;
        } else {
            float f = bVar2.B;
            if ((f == -1.0f || f <= nyjVar.c) && ((i13 = bVar2.k) == -1 || i13 <= nyjVar.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (!z || (((i8 = (bVar = this.d).w) != -1 && i8 < 0) || ((i9 = bVar.x) != -1 && i9 < 0))) {
            z3 = false;
        } else {
            float f2 = bVar.B;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i10 = bVar.k) == -1 || i10 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.g = z3;
        this.h = j16.n(i3, false);
        androidx.media3.common.b bVar3 = this.d;
        float f3 = bVar3.B;
        this.i = f3 != -1.0f && f3 >= 10.0f;
        this.j = bVar3.k;
        int i16 = bVar3.w;
        this.k = (i16 == -1 || (i7 = bVar3.x) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= b4xVar2.size()) {
                iG = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iG = syj.g(this.d, (String) b4xVar2.get(i17), false);
                if (iG > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.m = i17;
        this.n = iG;
        int i18 = this.d.f;
        ia80 ia80Var = syj.k;
        this.o = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i19 = this.d.f;
        this.q = i19 == 0 || (i19 & 1) != 0;
        this.r = syj.g(this.d, str, syj.h(str) == null);
        androidx.media3.common.b bVar4 = this.d;
        String str2 = bVar4.p;
        int i20 = i3 & 384;
        if (i20 == 256 && (strC = qm30.c(bVar4)) != null) {
            str2 = strC;
        }
        for (int i21 = 0; i21 < b4xVar.size(); i21++) {
            if (str2 != null && str2.equals(b4xVar.get(i21))) {
                i5 = i21;
                break;
            }
        }
        this.l = i5;
        this.p = syj.f(this.d, nyjVar.j);
        this.u = i20 == 128 || i20 == 256;
        boolean z6 = i20 == 128;
        this.v = z6;
        this.w = (i3 & 64) == 64;
        this.z = str2;
        if (str2 != null) {
            i6 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.x = i6;
        if (z6) {
            c4d c4dVar = this.d.H;
            if (c4dVar != null) {
                int i22 = c4dVar.c;
                z4 = (i22 == 7 || i22 == 6) ? true : z4;
            } else {
                c4d c4dVar2 = c4d.h;
            }
            z4 = false;
        } else {
            z4 = false;
        }
        this.y = z4;
        boolean z7 = this.e;
        nyj nyjVar2 = this.f;
        androidx.media3.common.b bVar5 = this.d;
        if ((bVar5.f & 16384) == 0 && j16.n(i3, nyjVar2.D) && (z7 || nyjVar2.y)) {
            i15 = (!j16.n(i3, false) || !this.g || !z7 || bVar5.k == -1 || nyjVar2.v || (i14 & i3) == 0) ? 1 : 2;
        }
        this.t = i15;
    }

    public static int c(ryj ryjVar, ryj ryjVar2) {
        gdd gddVarC = gdd.f11100a.c(ryjVar.h, ryjVar2.h);
        Integer numValueOf = Integer.valueOf(ryjVar.m);
        Integer numValueOf2 = Integer.valueOf(ryjVar2.m);
        s950 s950Var = s950.c;
        return gddVarC.b(numValueOf, numValueOf2, s950Var).a(ryjVar.n, ryjVar2.n).a(ryjVar.o, ryjVar2.o).b(Integer.valueOf(ryjVar.p), Integer.valueOf(ryjVar2.p), s950Var).c(ryjVar.q, ryjVar2.q).a(ryjVar.r, ryjVar2.r).c(ryjVar.i, ryjVar2.i).c(ryjVar.e, ryjVar2.e).c(ryjVar.g, ryjVar2.g).b(Integer.valueOf(ryjVar.l), Integer.valueOf(ryjVar2.l), s950Var).c(ryjVar.u, ryjVar2.u).c(ryjVar.w, ryjVar2.w).e();
    }

    @Override // a.qyj
    public final int a() {
        return this.t;
    }

    @Override // a.qyj
    public final boolean b(qyj qyjVar) {
        ryj ryjVar = (ryj) qyjVar;
        if (!this.s && !Objects.equals(this.z, ryjVar.z)) {
            return false;
        }
        this.f.getClass();
        return this.u == ryjVar.u && this.w == ryjVar.w;
    }
}
