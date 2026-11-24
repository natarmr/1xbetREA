package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ye20 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42467a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ qg20 c;

    public /* synthetic */ ye20(p7m0 p7m0Var, qg20 qg20Var, byte b) {
        this.f42467a = b;
        this.b = p7m0Var;
        this.c = qg20Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        we20 we20Var;
        dg20 dg20Var;
        byte b = this.f42467a;
        qg20 qg20Var = this.c;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof we20) {
                    we20Var = (we20) yjeVar;
                    int i = we20Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        we20Var.j = i - Integer.MIN_VALUE;
                    } else {
                        we20Var = new we20(this, yjeVar);
                    }
                } else {
                    we20Var = new we20(this, yjeVar);
                }
                Object obj = we20Var.i;
                wne wneVar = wne.f39444a;
                int i2 = we20Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    clu cluVar = new clu(kmqVar, qg20Var, (byte) 11);
                    we20Var.j = 1;
                    if (gmqVar.c(cluVar, we20Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof dg20) {
                    dg20Var = (dg20) yjeVar;
                    int i3 = dg20Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dg20Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        dg20Var = new dg20(this, yjeVar);
                    }
                } else {
                    dg20Var = new dg20(this, yjeVar);
                }
                Object obj2 = dg20Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = dg20Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    b4v b4vVar = new b4v(kmqVar, qg20Var, (byte) 26);
                    dg20Var.j = 1;
                    if (gmqVar.c(b4vVar, dg20Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
        }
    }
}
