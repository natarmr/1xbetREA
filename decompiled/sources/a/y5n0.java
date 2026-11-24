package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class y5n0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42056a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ pzu c;

    public /* synthetic */ y5n0(gmq gmqVar, pzu pzuVar, byte b) {
        this.f42056a = b;
        this.b = gmqVar;
        this.c = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        v5n0 v5n0Var;
        z5n0 z5n0Var;
        byte b = this.f42056a;
        pzu pzuVar = this.c;
        gmq gmqVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof v5n0) {
                    v5n0Var = (v5n0) yjeVar;
                    int i = v5n0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        v5n0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        v5n0Var = new v5n0(this, yjeVar);
                    }
                } else {
                    v5n0Var = new v5n0(this, yjeVar);
                }
                Object obj = v5n0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = v5n0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    x5n0 x5n0Var = new x5n0(kmqVar, pzuVar, (byte) 0);
                    v5n0Var.j = 1;
                    if (gmqVar.c(x5n0Var, v5n0Var) == wneVar) {
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
                if (yjeVar instanceof z5n0) {
                    z5n0Var = (z5n0) yjeVar;
                    int i3 = z5n0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z5n0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        z5n0Var = new z5n0(this, yjeVar);
                    }
                } else {
                    z5n0Var = new z5n0(this, yjeVar);
                }
                Object obj2 = z5n0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = z5n0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    x5n0 x5n0Var2 = new x5n0(kmqVar, pzuVar, b2);
                    z5n0Var.j = 1;
                    if (gmqVar.c(x5n0Var2, z5n0Var) == wneVar2) {
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
