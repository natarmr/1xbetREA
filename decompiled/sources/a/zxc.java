package a;

import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class zxc extends ir20 {
    public final y78 f;
    public final Regex g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxc(v9d v9dVar, y78 y78Var, String str) {
        super(new y78(y78Var), v9dVar);
        v9dVar.getClass();
        str.getClass();
        this.f = y78Var;
        this.g = new Regex(kng0.l("^ {0,3}", str, "+ *$"));
        this.h = -1;
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
        CharSequence charSequence = k810Var.d;
        if (i < this.h) {
            return hr20.e;
        }
        int i2 = k810Var.b;
        if (i2 != -1) {
            return hr20.e;
        }
        if (i2 != -1) {
            throw new byw("");
        }
        v9d v9dVar2 = this.f15236a;
        v9d v9dVarB = v9dVar2.b(k810Var);
        if (!idx.w(v9dVarB, v9dVar2)) {
            return hr20.f;
        }
        int iC = k810Var.c();
        this.h = iC;
        boolean zG = this.g.g(idx.v(v9dVarB, charSequence));
        y78 y78Var = this.f;
        if (zG) {
            y78Var.b(kotlin.collections.a.c(new sgi0(new IntRange(i + 1, k810Var.c(), 1), cy2.d0)));
            hr20 hr20Var = hr20.f;
            hr20Var.getClass();
            this.c = iC;
            this.d = hr20Var;
        } else {
            int iMin = Math.min(idx.x(v9dVarB, charSequence) + i + 1, iC);
            IntRange intRange = new IntRange(iMin, iC, 1);
            if (iMin < intRange.b) {
                y78Var.b(kotlin.collections.a.c(new sgi0(intRange, cy2.c0)));
            }
        }
        return hr20.e;
    }

    @Override // a.ir20
    public final ar20 d() {
        return wb.r;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return true;
    }
}
