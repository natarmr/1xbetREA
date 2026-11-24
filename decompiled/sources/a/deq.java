package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class deq extends diu0 {
    public final Function1 b = beq.f2463a;
    public boolean c = true;
    public final p7m0 d;
    public final h2c e;
    public aeq f;
    public final p7m0 g;
    public final p7m0 h;
    public final p7m0 i;
    public final p7m0 j;
    public final p7m0 k;
    public final p7m0 l;
    public final p7m0 m;
    public final p7m0 n;

    public deq() {
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0VarA = q7m0.a(bool);
        this.d = p7m0VarA;
        this.e = new h2c(p7m0VarA, (byte) 8);
        aeq aeqVar = aeq.f741a;
        this.f = aeqVar;
        p7m0 p7m0VarA2 = q7m0.a(aeqVar);
        this.g = p7m0VarA2;
        this.h = p7m0VarA2;
        p7m0 p7m0VarA3 = q7m0.a(new Pair("", bool));
        this.i = p7m0VarA3;
        this.j = p7m0VarA3;
        p7m0 p7m0VarA4 = q7m0.a(0);
        this.k = p7m0VarA4;
        this.l = p7m0VarA4;
        p7m0 p7m0VarA5 = q7m0.a(bool);
        this.m = p7m0VarA5;
        this.n = p7m0VarA5;
    }

    public final void w(aeq aeqVar, CharSequence charSequence) {
        aeq aeqVar2 = aeq.b;
        charSequence.getClass();
        p7m0 p7m0Var = this.g;
        p7m0Var.getClass();
        p7m0Var.o(null, aeqVar);
        aeq aeqVar3 = aeq.c;
        boolean z = true;
        Pair pair = new Pair(charSequence, Boolean.valueOf(aeqVar == aeqVar3));
        p7m0 p7m0Var2 = this.i;
        p7m0Var2.getClass();
        p7m0Var2.o(null, pair);
        aeq aeqVar4 = this.f;
        aeq aeqVar5 = aeq.f741a;
        int i = R.drawable.fingerprint_dialog_fp_icon;
        if (aeqVar4 != aeqVar5 || aeqVar != aeqVar2) {
            if (aeqVar4 == aeqVar2 && aeqVar == aeqVar3) {
                i = R.drawable.fingerprint_dialog_error;
            } else if ((aeqVar4 != aeqVar3 || aeqVar != aeqVar2) && (aeqVar4 != aeqVar2 || aeqVar != aeq.d)) {
                i = 0;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        p7m0 p7m0Var3 = this.k;
        p7m0Var3.getClass();
        p7m0Var3.o(null, numValueOf);
        aeq aeqVar6 = this.f;
        if ((aeqVar6 == aeqVar5 && aeqVar == aeqVar2) || ((aeqVar6 != aeqVar2 || aeqVar != aeqVar3) && (aeqVar6 != aeqVar3 || aeqVar != aeqVar2))) {
            z = false;
        }
        twn.A(z, this.m, null);
        this.f = aeqVar;
    }
}
