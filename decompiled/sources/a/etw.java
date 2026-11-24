package a;

import java.util.ArrayList;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class etw extends ir20 {
    public final y78 f;
    public final Regex g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etw(v9d v9dVar, y78 y78Var, Regex regex, k810 k810Var) {
        super(new y78(y78Var), v9dVar);
        v9dVar.getClass();
        this.f = y78Var;
        this.g = regex;
        y78Var.b(kotlin.collections.a.c(new sgi0(new IntRange(k810Var.c, k810Var.c(), 1), cy2.A)));
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
        int i = k810Var.b;
        CharSequence charSequence = k810Var.d;
        if (i != -1) {
            return hr20.e;
        }
        int i2 = k810Var.f17851a;
        bh30 bh30VarB = null;
        CharSequence charSequence2 = i2 > 0 ? (CharSequence) ((ArrayList) k810Var.e.b).get(i2 - 1) : null;
        if (charSequence2 == null) {
            return hr20.f;
        }
        v9d v9dVar2 = this.f15236a;
        v9d v9dVarB = v9dVar2.b(k810Var);
        if (!idx.w(v9dVarB, v9dVar2)) {
            return hr20.f;
        }
        Regex regex = this.g;
        if (regex == null) {
            if (i != -1) {
                throw new byw("");
            }
            s43 s43Var = new s43(v9dVar2, (byte) 10);
            k810 k810VarD = k810Var;
            int i3 = 1;
            while (((Boolean) s43Var.invoke(k810VarD)).booleanValue()) {
                k810VarD = k810VarD.d();
                if (k810VarD == null) {
                    i3++;
                    break;
                }
                i3++;
                if (i3 > 4) {
                    break;
                }
            }
            if (i3 >= 2) {
                return hr20.f;
            }
        }
        if (regex != null) {
            lse0 lse0Var = Regex.b;
            bh30VarB = regex.b(charSequence2);
        }
        if (bh30VarB != null) {
            return hr20.f;
        }
        if (charSequence.length() > idx.x(v9dVarB, charSequence)) {
            this.f.b(kotlin.collections.a.c(new sgi0(new IntRange(idx.x(v9dVarB, charSequence) + k810Var.c + 1, k810Var.c(), 1), cy2.A)));
        }
        return hr20.e;
    }

    @Override // a.ir20
    public final ar20 d() {
        return wb.u;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return true;
    }
}
