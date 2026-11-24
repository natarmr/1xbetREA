package a;

import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public final class vna0 extends pwq {
    public final Timeline$Window c;

    public vna0(bmq0 bmq0Var) {
        super(bmq0Var);
        this.c = new Timeline$Window();
    }

    @Override // a.pwq, a.bmq0
    public final amq0 f(int i, amq0 amq0Var, boolean z) {
        bmq0 bmq0Var = this.b;
        amq0 amq0VarF = bmq0Var.f(i, amq0Var, z);
        if (!bmq0Var.m(amq0VarF.c, this.c, 0L).a()) {
            amq0VarF.f = true;
            return amq0VarF;
        }
        Object obj = amq0Var.f1123a;
        Object obj2 = amq0Var.b;
        int i2 = amq0Var.c;
        long j = amq0Var.d;
        long j2 = amq0Var.e;
        uo uoVar = uo.c;
        amq0VarF.h(obj, obj2, i2, j, j2, true);
        return amq0VarF;
    }
}
