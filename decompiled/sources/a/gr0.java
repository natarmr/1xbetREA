package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class gr0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11759a = 0;
    public final /* synthetic */ vsg0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public gr0(vsg0 vsg0Var, long j, jr0 jr0Var) {
        this.b = vsg0Var;
        this.c = j;
        this.d = jr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        dr0 dr0Var;
        jos josVar;
        byte b = this.f11759a;
        long j = this.c;
        Object obj = this.d;
        vsg0 vsg0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof dr0) {
                    dr0Var = (dr0) yjeVar;
                    int i = dr0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dr0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        dr0Var = new dr0(this, yjeVar);
                    }
                } else {
                    dr0Var = new dr0(this, yjeVar);
                }
                Object obj2 = dr0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = dr0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    fr0 fr0Var = new fr0(kmqVar, j, (jr0) obj);
                    dr0Var.j = 1;
                    if (vsg0Var.c(fr0Var, dr0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof jos) {
                    josVar = (jos) yjeVar;
                    int i3 = josVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        josVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        josVar = new jos(this, yjeVar);
                    }
                } else {
                    josVar = new jos(this, yjeVar);
                }
                Object obj3 = josVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = josVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    fr0 fr0Var2 = new fr0(kmqVar, (hie0) obj, j);
                    josVar.j = 1;
                    if (vsg0Var.c(fr0Var2, josVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }

    public gr0(vsg0 vsg0Var, hie0 hie0Var, long j) {
        this.b = vsg0Var;
        this.d = hie0Var;
        this.c = j;
    }
}
