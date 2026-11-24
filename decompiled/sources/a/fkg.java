package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fkg extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ rdo0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fkg(xcz xczVar, rdo0 rdo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = xczVar;
        this.m = rdo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                fkg fkgVar = new fkg(this.l, this.m, yjeVar, (byte) 0);
                fkgVar.k = obj;
                return fkgVar;
            case 1:
                fkg fkgVar2 = new fkg(this.l, this.m, yjeVar, (byte) 1);
                fkgVar2.k = obj;
                return fkgVar2;
            case 2:
                fkg fkgVar3 = new fkg(this.l, this.m, yjeVar, (byte) 2);
                fkgVar3.k = obj;
                return fkgVar3;
            default:
                fkg fkgVar4 = new fkg(this.l, this.m, yjeVar, (byte) 3);
                fkgVar4.k = obj;
                return fkgVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        slb0 slb0Var = (slb0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((fkg) create(slb0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xlb0 xlb0Var = xlb0.f41064a;
        rdo0 rdo0Var = this.m;
        xcz xczVar = this.l;
        switch (b) {
            case 0:
                slb0 slb0Var = (slb0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (slb0Var == null) {
                        return Unit.f46060a;
                    }
                    if (xczVar.c()) {
                        this.k = null;
                        this.j = true;
                        if (xczVar.f(0, 0, this) == wneVar) {
                            return wneVar;
                        }
                    } else if (rdo0Var != null) {
                        rdo0Var.f30299a.a(xlb0Var);
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                slb0 slb0Var2 = (slb0) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (slb0Var2 == null) {
                        return Unit.f46060a;
                    }
                    if (xczVar.c()) {
                        this.k = null;
                        this.j = true;
                        if (xczVar.f(0, 0, this) == wneVar2) {
                            return wneVar2;
                        }
                    } else if (rdo0Var != null) {
                        rdo0Var.b();
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                slb0 slb0Var3 = (slb0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (slb0Var3 == null) {
                        return Unit.f46060a;
                    }
                    if (xczVar.c()) {
                        this.k = null;
                        this.j = true;
                        if (xczVar.f(0, 0, this) == wneVar3) {
                            return wneVar3;
                        }
                    } else if (rdo0Var != null) {
                        rdo0Var.b();
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                slb0 slb0Var4 = (slb0) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (slb0Var4 == null) {
                        return Unit.f46060a;
                    }
                    if (xczVar.c()) {
                        this.k = null;
                        this.j = true;
                        if (xczVar.f(0, 0, this) == wneVar4) {
                            return wneVar4;
                        }
                    } else if (rdo0Var != null) {
                        rdo0Var.f30299a.a(xlb0Var);
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
