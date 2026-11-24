package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class rn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fzs0 f30769a;
    public final k050 b = new k050();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(zje zjeVar) {
        pn4 pn4Var;
        k050 k050Var;
        if (zjeVar instanceof pn4) {
            pn4Var = (pn4) zjeVar;
            int i = pn4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn4Var.l = i - Integer.MIN_VALUE;
            } else {
                pn4Var = new pn4(this, zjeVar);
            }
        } else {
            pn4Var = new pn4(this, zjeVar);
        }
        Object obj = pn4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = pn4Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.b;
            pn4Var.i = k050Var2;
            pn4Var.l = 1;
            if (k050Var2.d(pn4Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = pn4Var.i;
            z1x.P(obj);
        }
        try {
            fzs0 fzs0Var = this.f30769a;
            this.f30769a = null;
            return fzs0Var;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fzs0 fzs0Var, zje zjeVar) {
        qn4 qn4Var;
        k050 k050Var;
        if (zjeVar instanceof qn4) {
            qn4Var = (qn4) zjeVar;
            int i = qn4Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn4Var.m = i - Integer.MIN_VALUE;
            } else {
                qn4Var = new qn4(this, zjeVar);
            }
        } else {
            qn4Var = new qn4(this, zjeVar);
        }
        Object obj = qn4Var.k;
        wne wneVar = wne.f39444a;
        int i2 = qn4Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            qn4Var.i = fzs0Var;
            k050Var = this.b;
            qn4Var.j = k050Var;
            qn4Var.m = 1;
            if (k050Var.d(qn4Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = qn4Var.j;
            fzs0 fzs0Var2 = qn4Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            fzs0Var = fzs0Var2;
        }
        try {
            this.f30769a = fzs0Var;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }
}
