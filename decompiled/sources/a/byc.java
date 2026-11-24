package a;

import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class byc implements jr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f3410a = new Regex("^ {0,3}(~~~+|```+)([^`]*)$");

    public static ayc c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        int i = k810Var.b;
        CharSequence charSequence = k810Var.d;
        if (i == idx.x(v9dVar, charSequence)) {
            bh30 bh30VarB = f3410a.b(charSequence.subSequence(i, charSequence.length()));
            if (bh30VarB != null) {
                g3 g3Var = bh30VarB.c;
                MatchGroup matchGroupE = g3Var.e(1);
                String str = matchGroupE != null ? matchGroupE.f46071a : null;
                str.getClass();
                MatchGroup matchGroupE2 = g3Var.e(2);
                String str2 = matchGroupE2 != null ? matchGroupE2.f46071a : null;
                str2.getClass();
                return new ayc(str, str2);
            }
        }
        return null;
    }

    @Override // a.jr20
    public final List a(k810 k810Var, y78 y78Var, mr20 mr20Var) {
        mr20Var.getClass();
        v9d v9dVar = mr20Var.f22248a;
        ayc aycVarC = c(v9dVar, k810Var);
        if (aycVarC == null) {
            return iun.f15405a;
        }
        String str = aycVarC.b;
        int iC = k810Var.c() - str.length();
        y78Var.b(kotlin.collections.a.c(new sgi0(new IntRange(k810Var.c, iC, 1), cy2.b0)));
        if (str.length() > 0) {
            y78Var.b(kotlin.collections.a.c(new sgi0(new IntRange(iC, k810Var.c(), 1), cy2.a0)));
        }
        return kotlin.collections.a.c(new zxc(v9dVar, y78Var, aycVarC.f1665a));
    }

    @Override // a.jr20
    public final boolean b(v9d v9dVar, k810 k810Var) {
        return c(v9dVar, k810Var) != null;
    }
}
