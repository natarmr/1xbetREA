package a;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class wxc extends ir20 {
    public final y78 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxc(v9d v9dVar, y78 y78Var, k810 k810Var) {
        super(new y78(y78Var), v9dVar);
        v9dVar.getClass();
        this.f = y78Var;
        y78Var.b(kotlin.collections.a.c(new sgi0(new IntRange(k810Var.c, k810Var.c(), 1), cy2.y)));
        this.g = -1;
    }

    @Override // a.ir20
    public final boolean a() {
        return false;
    }

    @Override // a.ir20
    public final int b(k810 k810Var) {
        return k810Var.c();
    }

    @Override // a.ir20
    public final hr20 c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        int i = k810Var.c;
        int i2 = this.g;
        int i3 = k810Var.b;
        if (i < i2) {
            if (i3 == -1) {
                g(k810Var);
            }
            return hr20.e;
        }
        if (i3 != -1) {
            return hr20.e;
        }
        if (i3 != -1) {
            throw new byw("");
        }
        v9d v9dVar2 = this.f15236a;
        v9dVar2.getClass();
        k810 k810VarD = k810Var;
        loop0: while (true) {
            v9d v9dVarS = idx.s(v9dVar2, k810VarD, false);
            if (idx.X(v9dVarS, v9dVar2) && idx.w(v9dVarS, v9dVar2)) {
                CharSequence charSequenceV = idx.v(v9dVarS, k810VarD.d);
                charSequenceV.getClass();
                for (int i4 = 0; i4 < charSequenceV.length(); i4++) {
                    char cCharAt = charSequenceV.charAt(i4);
                    if (cCharAt != ' ' && cCharAt != '\t') {
                        break loop0;
                    }
                }
                k810VarD = k810VarD.d();
                if (k810VarD == null) {
                }
            }
            k810VarD = null;
            break;
        }
        if (k810VarD == null) {
            return hr20.f;
        }
        v9d v9dVarS2 = idx.s(v9dVar2, k810VarD, false);
        k810 k810VarE = k810VarD.e(idx.x(v9dVarS2, k810VarD.d) + 1);
        if (k810VarE != null) {
            Integer numA = k810VarE.a();
            k810 k810VarE2 = k810VarE.e(numA != null ? numA.intValue() : 0);
            if (k810VarE2 != null) {
                CharSequence charSequence = k810VarE2.d;
                int iX = idx.x(v9dVarS2, charSequence);
                int i5 = k810VarE2.b;
                if (i5 < iX + 4) {
                    if (iX <= i5) {
                        while (charSequence.charAt(iX) != '\t') {
                            if (iX != i5) {
                                iX++;
                            }
                        }
                    }
                    return hr20.f;
                }
                g(k810Var);
                this.g = k810VarD.c;
                return hr20.e;
            }
        }
        return hr20.f;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return true;
    }

    public final void g(k810 k810Var) {
        v9d v9dVarR = idx.r(this.f15236a, k810Var);
        int iX = idx.x(v9dVarR, k810Var.d) + k810Var.c + 1;
        IntRange intRange = new IntRange(iX, k810Var.c(), 1);
        if (intRange.b - iX > 0) {
            this.f.b(kotlin.collections.a.c(new sgi0(intRange, cy2.y)));
        }
    }
}
