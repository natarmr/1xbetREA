package a;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class k24 extends ir20 {
    public final ar20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k24(v9d v9dVar, y78 y78Var, IntRange intRange, int i, int i2) {
        super(new y78(y78Var), v9dVar);
        ar20 ar20Var = wb.P;
        v9dVar.getClass();
        int i3 = y78Var.b;
        lc00 lc00VarB = kotlin.collections.a.b();
        int i4 = intRange.f46068a;
        int i5 = i3 + i4;
        int i6 = intRange.b;
        int i7 = i3 + i6 + 1;
        IntRange intRange2 = new IntRange(i5, i7, 1);
        ar20 ar20Var2 = cy2.O;
        lc00VarB.add(new sgi0(intRange2, ar20Var2));
        if (i7 != i) {
            lc00VarB.add(new sgi0(new IntRange(i7, i, 1), cy2.P));
        }
        if (i != i2) {
            lc00VarB.add(new sgi0(new IntRange(i, i2, 1), ar20Var2));
        }
        y78Var.b(kotlin.collections.a.a(lc00VarB));
        switch ((i6 - i4) + 1) {
            case 1:
                ar20Var = wb.K;
                break;
            case 2:
                ar20Var = wb.L;
                break;
            case 3:
                ar20Var = wb.M;
                break;
            case 4:
                ar20Var = wb.N;
                break;
            case 5:
                ar20Var = wb.O;
                break;
        }
        this.f = ar20Var;
    }

    @Override // a.ir20
    public final ar20 d() {
        return this.f;
    }
}
