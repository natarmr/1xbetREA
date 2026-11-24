package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class s260 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31488a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ v360 c;

    public /* synthetic */ s260(gmq gmqVar, v360 v360Var, byte b) {
        this.f31488a = b;
        this.b = gmqVar;
        this.c = v360Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        p260 p260Var;
        a360 a360Var;
        byte b = this.f31488a;
        v360 v360Var = this.c;
        gmq gmqVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof p260) {
                    p260Var = (p260) yjeVar;
                    int i = p260Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        p260Var.j = i - Integer.MIN_VALUE;
                    } else {
                        p260Var = new p260(this, yjeVar);
                    }
                } else {
                    p260Var = new p260(this, yjeVar);
                }
                Object obj = p260Var.i;
                wne wneVar = wne.f39444a;
                int i2 = p260Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    r260 r260Var = new r260(kmqVar, v360Var, (byte) 0);
                    p260Var.j = 1;
                    if (gmqVar.c(r260Var, p260Var) == wneVar) {
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
                if (yjeVar instanceof a360) {
                    a360Var = (a360) yjeVar;
                    int i3 = a360Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a360Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        a360Var = new a360(this, yjeVar);
                    }
                } else {
                    a360Var = new a360(this, yjeVar);
                }
                Object obj2 = a360Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = a360Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    r260 r260Var2 = new r260(kmqVar, v360Var, b2);
                    a360Var.j = 1;
                    if (gmqVar.c(r260Var2, a360Var) == wneVar2) {
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
