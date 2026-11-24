package a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class wti0 extends ir20 {
    public final y78 f;
    public final y78 g;
    public ar20 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wti0(y78 y78Var, v9d v9dVar) {
        super(new y78(y78Var), v9dVar);
        v9dVar.getClass();
        this.f = y78Var;
        this.g = new y78(y78Var);
        this.h = wb.I;
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
        ar20 ar20Var = wb.J;
        v9dVar.getClass();
        if (k810Var.b != -1) {
            return hr20.e;
        }
        CharSequence charSequence = k810Var.d;
        int iX = idx.x(this.f15236a.b(k810Var), charSequence);
        while (iX < charSequence.length() && (charSequence.charAt(iX) == ' ' || charSequence.charAt(iX) == '\t')) {
            iX++;
        }
        if (iX == charSequence.length()) {
            return new hr20(2, 2, 1);
        }
        if (charSequence.charAt(iX) == '-') {
            this.h = ar20Var;
        }
        int i = k810Var.c + 1 + iX;
        ar20 ar20Var2 = Intrinsics.d(this.h, ar20Var) ? cy2.R : cy2.Q;
        ar20 ar20Var3 = cy2.S;
        ar20Var3.getClass();
        y78 y78Var = this.g;
        y78 y78Var2 = (y78) y78Var.c;
        ((ArrayList) y78Var2.c).add(new sgi0(new IntRange(y78Var.b, y78Var2.b, 1), ar20Var3));
        this.f.b(kotlin.collections.a.c(new sgi0(new IntRange(i, k810Var.c(), 1), ar20Var2)));
        int iC = k810Var.c();
        hr20 hr20Var = hr20.f;
        hr20Var.getClass();
        this.c = iC;
        this.d = hr20Var;
        return hr20.e;
    }

    @Override // a.ir20
    public final ar20 d() {
        return this.h;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return k810Var.b == -1;
    }
}
