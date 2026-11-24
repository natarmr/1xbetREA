package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jyj extends qyj implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final nyj h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Code duplicated, block: B:111:0x017d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    public jyj(int i, ccs0 ccs0Var, int i2, nyj nyjVar, int i3, boolean z, hyj hyjVar, int i4) {
        int i5;
        int iG;
        boolean z2;
        int iG2;
        boolean z3;
        boolean z4;
        boolean z5;
        qcs0 qcs0Var;
        super(i, ccs0Var, i2);
        this.h = nyjVar;
        boolean z6 = nyjVar.B;
        b4x b4xVar = nyjVar.p;
        b4x b4xVar2 = nyjVar.l;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.n = false;
        this.g = syj.h(this.d.d);
        this.i = j16.n(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= b4xVar2.size()) {
                iG = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iG = syj.g(this.d, (String) b4xVar2.get(i8), false);
                if (iG > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = iG;
        int i9 = this.d.f;
        this.l = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.m = syj.f(this.d, nyjVar.m);
        androidx.media3.common.b bVar = this.d;
        int i10 = bVar.f;
        this.o = i10 == 0 || (i10 & 1) != 0;
        this.r = (bVar.e & 1) != 0;
        String str = bVar.p;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.y = z2;
        int i11 = bVar.J;
        this.s = i11;
        this.t = bVar.L;
        int i12 = bVar.k;
        this.u = i12;
        this.f = (i12 == -1 || i12 <= nyjVar.o) && (i11 == -1 || i11 <= nyjVar.n) && hyjVar.apply(bVar);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(Separators.COMMA, -1);
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = vtt0.N(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 < strArrSplit.length) {
                iG2 = syj.g(this.d, strArrSplit[i14], false);
                if (iG2 <= 0) {
                    i14++;
                }
            } else {
                iG2 = 0;
                i14 = Integer.MAX_VALUE;
            }
        }
        this.p = i14;
        this.q = iG2;
        for (int i15 = 0; i15 < b4xVar.size(); i15++) {
            String str2 = this.d.p;
            if (str2 != null && str2.equals(b4xVar.get(i15))) {
                i5 = i15;
                this.v = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.w = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.x = z4;
                boolean z7 = this.f;
                nyj nyjVar2 = this.h;
                z5 = nyjVar2.D;
                qcs0Var = nyjVar2.q;
                if (j16.n(i3, z5) && (z7 || nyjVar2.A)) {
                    qcs0Var.getClass();
                    if (j16.n(i3, false) || !z7 || this.d.k == -1 || nyjVar2.v || ((!nyjVar2.E && z) || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.e = i7;
            }
        }
        this.v = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.w = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.x = z4;
        boolean z8 = this.f;
        nyj nyjVar3 = this.h;
        z5 = nyjVar3.D;
        qcs0Var = nyjVar3.q;
        if (j16.n(i3, z5)) {
            qcs0Var.getClass();
            if (j16.n(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.e = i7;
    }

    @Override // a.qyj
    public final int a() {
        return this.e;
    }

    @Override // a.qyj
    public final boolean b(qyj qyjVar) {
        int i;
        String str;
        jyj jyjVar = (jyj) qyjVar;
        androidx.media3.common.b bVar = jyjVar.d;
        this.h.getClass();
        androidx.media3.common.b bVar2 = this.d;
        int i2 = bVar2.J;
        if (i2 == -1 || i2 != bVar.J) {
            return false;
        }
        return (this.n || ((str = bVar2.p) != null && TextUtils.equals(str, bVar.p))) && (i = bVar2.L) != -1 && i == bVar.L && this.w == jyjVar.w && this.x == jyjVar.x;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jyj jyjVar) {
        boolean z = this.i;
        boolean z2 = this.f;
        ia80 ia80VarA = (z2 && z) ? syj.k : syj.k.a();
        boolean z3 = jyjVar.i;
        int i = jyjVar.u;
        gdd gddVarC = gdd.f11100a.c(z, z3);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(jyjVar.k);
        s950 s950Var = s950.c;
        gdd gddVarB = gddVarC.b(numValueOf, numValueOf2, s950Var).a(this.j, jyjVar.j).a(this.l, jyjVar.l).b(Integer.valueOf(this.m), Integer.valueOf(jyjVar.m), s950Var).c(this.r, jyjVar.r).c(this.o, jyjVar.o).b(Integer.valueOf(this.p), Integer.valueOf(jyjVar.p), s950Var).a(this.q, jyjVar.q).c(z2, jyjVar.f).b(Integer.valueOf(this.v), Integer.valueOf(jyjVar.v), s950Var);
        this.h.getClass();
        gdd gddVarB2 = gddVarB.c(this.w, jyjVar.w).c(this.x, jyjVar.x).c(this.y, jyjVar.y).b(Integer.valueOf(this.s), Integer.valueOf(jyjVar.s), ia80VarA).b(Integer.valueOf(this.t), Integer.valueOf(jyjVar.t), ia80VarA);
        if (Objects.equals(this.g, jyjVar.g)) {
            gddVarB2 = gddVarB2.b(Integer.valueOf(this.u), Integer.valueOf(i), ia80VarA);
        }
        return gddVarB2.e();
    }
}
