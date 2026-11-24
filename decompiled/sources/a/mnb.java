package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class mnb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22080a;
    public final yqc b;
    public final rrc c;
    public final ot d;
    public final jyg0 e;
    public final sp f;
    public final trm0 g;

    public /* synthetic */ mnb(yqc yqcVar, rrc rrcVar, ot otVar, jyg0 jyg0Var, sp spVar, trm0 trm0Var, byte b) {
        this.f22080a = b;
        this.b = yqcVar;
        this.c = rrcVar;
        this.d = otVar;
        this.e = jyg0Var;
        this.f = spVar;
        this.g = trm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object a(ql5 ql5Var, zje zjeVar) {
        lnb lnbVar;
        nnb nnbVar;
        byte b = this.f22080a;
        rrc rrcVar = this.c;
        yqc yqcVar = this.b;
        sp spVar = this.f;
        jyg0 jyg0Var = this.e;
        trm0 trm0Var = this.g;
        ot otVar = this.d;
        switch (b) {
            case 0:
                if (zjeVar instanceof lnb) {
                    lnbVar = (lnb) zjeVar;
                    int i = lnbVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lnbVar.k = i - Integer.MIN_VALUE;
                    } else {
                        lnbVar = new lnb(this, zjeVar);
                    }
                } else {
                    lnbVar = new lnb(this, zjeVar);
                }
                Object obj = lnbVar.i;
                wne wneVar = wne.f39444a;
                int i2 = lnbVar.k;
                if (i2 == 0) {
                    z1x.P(obj);
                    otVar.a(bm5.c, ql5Var);
                    otVar.a(bm5.f2822a, ql5Var);
                    otVar.a(bm5.i, ql5Var);
                    otVar.a(bm5.b, ql5Var);
                    otVar.a(bm5.j, ql5Var);
                    trm0Var.l(bm5.d, ql5Var);
                    jyg0.a(jyg0Var, ql5Var.f28916a);
                    spVar.b(ql5Var);
                    lnbVar.k = 1;
                    if (yqcVar.u(lnbVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rrcVar.E();
                return Unit.f46060a;
            default:
                if (zjeVar instanceof nnb) {
                    nnbVar = (nnb) zjeVar;
                    int i3 = nnbVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nnbVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        nnbVar = new nnb(this, zjeVar);
                    }
                } else {
                    nnbVar = new nnb(this, zjeVar);
                }
                Object obj2 = nnbVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = nnbVar.k;
                if (i4 == 0) {
                    z1x.P(obj2);
                    otVar.a(bm5.c, ql5Var);
                    otVar.a(bm5.f2822a, ql5Var);
                    otVar.a(bm5.i, ql5Var);
                    otVar.a(bm5.b, ql5Var);
                    otVar.a(bm5.j, ql5Var);
                    trm0Var.l(bm5.d, ql5Var);
                    jyg0.a(jyg0Var, ql5Var.f28916a);
                    spVar.b(ql5Var);
                    nnbVar.k = 1;
                    if (yqcVar.u(nnbVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                rrcVar.E();
                return Unit.f46060a;
        }
    }
}
