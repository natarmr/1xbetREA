package a;

/* JADX INFO: loaded from: classes.dex */
public final class oyj extends qyj implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public oyj(int i, ccs0 ccs0Var, int i2, nyj nyjVar, int i3, String str, String str2) {
        int iG;
        super(i, ccs0Var, i2);
        int i4 = 0;
        this.f = j16.n(i3, false);
        int i5 = this.d.e;
        int i6 = nyjVar.u;
        b4x b4xVar = nyjVar.r;
        int i7 = i5 & (~i6);
        this.g = (i7 & 1) != 0;
        this.h = (i7 & 2) != 0;
        b4x b4xVarT = str2 != null ? b4x.t(str2) : b4xVar.isEmpty() ? b4x.t("") : b4xVar;
        int i8 = 0;
        while (true) {
            if (i8 >= b4xVarT.size()) {
                iG = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iG = syj.g(this.d, (String) b4xVarT.get(i8), false);
                if (iG > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.i = i8;
        this.j = iG;
        int i9 = str2 != null ? 1088 : 0;
        int i10 = this.d.f;
        ia80 ia80Var = syj.k;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.k = iBitCount;
        androidx.media3.common.b bVar = this.d;
        this.n = (1088 & bVar.f) != 0;
        int iF = syj.f(bVar, nyjVar.s);
        this.l = iF;
        int iG2 = syj.g(this.d, str, syj.h(str) == null);
        this.m = iG2;
        boolean z = iG > 0 || (b4xVar.isEmpty() && iBitCount > 0) || ((b4xVar.isEmpty() && iF != Integer.MAX_VALUE) || this.g || (this.h && iG2 > 0));
        if (j16.n(i3, nyjVar.D) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // a.qyj
    public final int a() {
        return this.e;
    }

    @Override // a.qyj
    public final boolean b(qyj qyjVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(oyj oyjVar) {
        gdd gddVarC = gdd.f11100a.c(this.f, oyjVar.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(oyjVar.i);
        s950 s950Var = s950.b;
        s950 s950Var2 = s950.c;
        gdd gddVarB = gddVarC.b(numValueOf, numValueOf2, s950Var2);
        int i = oyjVar.j;
        int i2 = this.j;
        gdd gddVarA = gddVarB.a(i2, i);
        int i3 = oyjVar.k;
        int i4 = this.k;
        gdd gddVarC2 = gddVarA.a(i4, i3).b(Integer.valueOf(this.l), Integer.valueOf(oyjVar.l), s950Var2).c(this.g, oyjVar.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(oyjVar.h);
        if (i2 != 0) {
            s950Var = s950Var2;
        }
        gdd gddVarA2 = gddVarC2.b(boolValueOf, boolValueOf2, s950Var).a(this.m, oyjVar.m);
        if (i4 == 0) {
            gddVarA2 = gddVarA2.d(this.n, oyjVar.n);
        }
        return gddVarA2.e();
    }
}
