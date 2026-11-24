package a;

import androidx.collection.MutableIntList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eez implements ibz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mez f7698a;
    public final /* synthetic */ ma80 b;
    public final /* synthetic */ jez c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ lh80 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ vne g;
    public final /* synthetic */ afv h;

    public eez(mez mezVar, ma80 ma80Var, jez jezVar, eiy eiyVar, lh80 lh80Var, float f, vne vneVar, afv afvVar) {
        this.f7698a = mezVar;
        this.b = ma80Var;
        this.c = jezVar;
        this.d = eiyVar;
        this.e = lh80Var;
        this.f = f;
        this.g = vneVar;
        this.h = afvVar;
    }

    @Override // a.ibz
    public final uj30 a(jbz jbzVar, long j) {
        kez kezVar;
        float fB;
        float fA;
        float fB2;
        long j2;
        long j3;
        int iB;
        c5n0 c5n0Var = jbzVar.b;
        lh80 lh80Var = this.e;
        float f = lh80Var.e;
        float f2 = lh80Var.c;
        mez mezVar = this.f7698a;
        mezVar.v.getValue();
        boolean z = mezVar.f21671a || c5n0Var.M();
        ma80 ma80Var = this.b;
        d5c.H(j, ma80Var);
        jez jezVar = this.c;
        if (jezVar.d != null && p4e.c(jezVar.b, j) && jezVar.c == c5n0Var.getDensity()) {
            kez kezVar2 = jezVar.d;
            kezVar2.getClass();
            kezVar = kezVar2;
        } else {
            jezVar.b = j;
            jezVar.c = c5n0Var.getDensity();
            kezVar = (kez) jezVar.f16399a.invoke(jbzVar, new p4e(j));
            jezVar.d = kezVar;
        }
        boolean z2 = ma80Var == ma80.f21447a;
        ydz ydzVar = (ydz) this.d.invoke();
        k6z layoutDirection = c5n0Var.getLayoutDirection();
        int iOrdinal = ma80Var.ordinal();
        if (iOrdinal == 0) {
            fB = f2;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            fB = s5x0.B(lh80Var, layoutDirection);
        }
        int iT = c5n0Var.T(fB);
        k6z layoutDirection2 = c5n0Var.getLayoutDirection();
        int iOrdinal2 = ma80Var.ordinal();
        if (iOrdinal2 == 0) {
            fA = f;
        } else {
            if (iOrdinal2 != 1) {
                t9f.b();
                return null;
            }
            fA = s5x0.A(lh80Var, layoutDirection2);
        }
        int iT2 = c5n0Var.T(fA);
        k6z layoutDirection3 = c5n0Var.getLayoutDirection();
        int iOrdinal3 = ma80Var.ordinal();
        if (iOrdinal3 == 0) {
            fB2 = s5x0.B(lh80Var, layoutDirection3);
        } else {
            if (iOrdinal3 != 1) {
                t9f.b();
                return null;
            }
            fB2 = f2;
        }
        int iT3 = c5n0Var.T(fB2);
        int iH = ((z2 ? p4e.h(j) : p4e.i(j)) - iT) - iT2;
        if (z2) {
            j2 = ((long) iT3) << 32;
            j3 = iT;
        } else {
            j2 = ((long) iT) << 32;
            j3 = iT3;
        }
        long j4 = j2 | (j3 & 4294967295L);
        int iT4 = c5n0Var.T(s5x0.A(lh80Var, c5n0Var.getLayoutDirection()) + s5x0.B(lh80Var, c5n0Var.getLayoutDirection()));
        int iT5 = c5n0Var.T(f + f2);
        MutableIntList mutableIntListT = c9x.t(ydzVar, mezVar.s, mezVar.k);
        long jB = p4e.b(j, r4e.g(iT4, j), 0, r4e.f(iT5, j), 0, 10);
        int iT6 = c5n0Var.T(this.f);
        boolean zM = c5n0Var.M();
        fez fezVar = mezVar.b;
        dez dezVar = new dez(mezVar, mutableIntListT, ydzVar, kezVar, jB, z2, jbzVar, iH, j4, iT, iT2, iT6, this.g, z, fezVar != null ? fezVar.m : null, this.h);
        hhk hhkVar = mezVar.c;
        int[] iArr = (int[]) hhkVar.c;
        Object obj = hhkVar.g;
        Integer numF = tx3.F(iArr, 0);
        int iJ = k9x.J(numF != null ? numF.intValue() : 0, ydzVar, obj);
        if (!tx3.w(iArr, iJ)) {
            ((lbz) hhkVar.h).b(iJ);
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                iArr = (int[]) ((ens) hhkVar.b).invoke(Integer.valueOf(iJ), Integer.valueOf(iArr.length));
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                hhkVar.c = iArr;
                ((cgk0) hhkVar.d).m(hhk.b(iArr));
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        }
        int[] iArr2 = (int[]) hhkVar.e;
        int length = iArr.length;
        int i = dezVar.s;
        if (length != i) {
            zz2 zz2Var = dezVar.r;
            zz2Var.D();
            int[] iArr3 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= iArr.length || (iB = iArr[i2]) == -1) {
                    if (i2 == 0) {
                        iB = 0;
                    } else {
                        iB = efx.B(iArr3, ((long) i2) & 4294967295L) + 1;
                    }
                }
                iArr3[i2] = iB;
                zz2Var.H(iB, i2);
            }
            iArr = iArr3;
        }
        if (iArr2.length != i) {
            int[] iArr4 = new int[i];
            int i3 = 0;
            while (i3 < i) {
                iArr4[i3] = i3 < iArr2.length ? iArr2[i3] : i3 == 0 ? 0 : iArr4[i3 - 1];
                i3++;
            }
            iArr2 = iArr4;
        }
        fez fezVarC = efx.C(dezVar, Math.round((zM || !mezVar.f21671a) ? mezVar.o : ((Number) ((hgk0) ((l73) mezVar.w.c).b).getValue()).floatValue()), iArr, iArr2, true);
        mezVar.f(fezVarC, c5n0Var.M(), false);
        return fezVarC;
    }
}
