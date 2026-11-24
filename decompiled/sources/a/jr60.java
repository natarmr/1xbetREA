package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class jr60 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16988a;
    public final /* synthetic */ p6d b;
    public final /* synthetic */ bs60 c;

    public /* synthetic */ jr60(p6d p6dVar, bs60 bs60Var, byte b) {
        this.f16988a = b;
        this.b = p6dVar;
        this.c = bs60Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        gr60 gr60Var;
        mr60 mr60Var;
        byte b = this.f16988a;
        bs60 bs60Var = this.c;
        p6d p6dVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof gr60) {
                    gr60Var = (gr60) yjeVar;
                    int i = gr60Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gr60Var.j = i - Integer.MIN_VALUE;
                    } else {
                        gr60Var = new gr60(this, yjeVar);
                    }
                } else {
                    gr60Var = new gr60(this, yjeVar);
                }
                Object obj = gr60Var.i;
                wne wneVar = wne.f39444a;
                int i2 = gr60Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ir60 ir60Var = new ir60(kmqVar, bs60Var, (byte) 0);
                    gr60Var.j = 1;
                    if (p6dVar.c(ir60Var, gr60Var) == wneVar) {
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
                if (yjeVar instanceof mr60) {
                    mr60Var = (mr60) yjeVar;
                    int i3 = mr60Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mr60Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        mr60Var = new mr60(this, yjeVar);
                    }
                } else {
                    mr60Var = new mr60(this, yjeVar);
                }
                Object obj2 = mr60Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = mr60Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ir60 ir60Var2 = new ir60(kmqVar, bs60Var, b2);
                    mr60Var.j = 1;
                    if (p6dVar.c(ir60Var2, mr60Var) == wneVar2) {
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
