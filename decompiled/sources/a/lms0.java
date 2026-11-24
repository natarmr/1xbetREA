package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class lms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot40 f20314a;
    public final agk0 b;

    public lms0(ot40 ot40Var, agk0 agk0Var) {
        this.f20314a = ot40Var;
        this.b = agk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        kms0 kms0Var;
        if (zjeVar instanceof kms0) {
            kms0Var = (kms0) zjeVar;
            int i = kms0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kms0Var.l = i - Integer.MIN_VALUE;
            } else {
                kms0Var = new kms0(this, zjeVar);
            }
        } else {
            kms0Var = new kms0(this, zjeVar);
        }
        Object objE = kms0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = kms0Var.l;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objE);
            fs40 fs40Var = new fs40(this, b);
            kms0Var.i = this;
            kms0Var.l = 1;
            objE = s0x.P(kms0Var.getContext()).e(fs40Var, kms0Var);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = kms0Var.i;
            z1x.P(objE);
        }
        this.b.m(((Number) objE).floatValue());
        return Unit.f46060a;
    }
}
