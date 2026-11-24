package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class lvs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f3j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lvs(f3j f3jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f3jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f3j f3jVar = this.k;
        switch (b) {
            case 0:
                return new lvs(f3jVar, yjeVar, (byte) 0);
            case 1:
                return new lvs(f3jVar, yjeVar, (byte) 1);
            case 2:
                return new lvs(f3jVar, yjeVar, (byte) 2);
            case 3:
                return new lvs(f3jVar, yjeVar, (byte) 3);
            case 4:
                return new lvs(f3jVar, yjeVar, (byte) 4);
            default:
                return new lvs(f3jVar, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((lvs) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        f3j f3jVar = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    yje yjeVar = null;
                    utb utbVarC = aoq.c(new rf0(new fnq(((r1u) f3jVar.m).a(), new fvs(f3jVar, yjeVar, (byte) 0), (byte) 4), (byte) 5), new zo1(yjeVar, (Object) f3jVar, (byte) 29));
                    gvs gvsVar = new gvs(f3jVar, (byte) 0);
                    this.j = true;
                    if (utbVarC.c(gvsVar, this) == wneVar) {
                        return wneVar;
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(((rbu) f3jVar.g).a());
                    gvs gvsVar2 = new gvs(f3jVar, b2);
                    this.j = true;
                    if (gmqVarW.c(gvsVar2, this) == wneVar2) {
                        return wneVar2;
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    fnq fnqVarA = ((vpu) f3jVar.l).a();
                    gvs gvsVar3 = new gvs(f3jVar, (byte) 2);
                    this.j = true;
                    if (fnqVarA.c(gvsVar3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                p7m0 p7m0Var = (p7m0) f3jVar.q;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = (p7m0) f3jVar.r;
                    oy30 oy30Var = new oy30(new ActionMenuDialogParams(((yus) p7m0Var.getValue()).f43284a, ((yus) p7m0Var.getValue()).q, ((yus) p7m0Var.getValue()).b, ((yus) p7m0Var.getValue()).c, ((yus) p7m0Var.getValue()).d, ((yus) p7m0Var.getValue()).e, ((yus) p7m0Var.getValue()).m, ((yus) p7m0Var.getValue()).l && (((yus) p7m0Var.getValue()).r instanceof ox7), ((yus) p7m0Var.getValue()).n, ((yus) p7m0Var.getValue()).o, ((yus) p7m0Var.getValue()).p, (((yus) p7m0Var.getValue()).r instanceof ox7) || (((yus) p7m0Var.getValue()).r instanceof mx7), (String) ((npn) f3jVar.o).d, ((yus) p7m0Var.getValue()).s));
                    this.j = true;
                    p7m0Var2.o(null, oy30Var);
                    if (Unit.f46060a == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p7m0 p7m0Var3 = (p7m0) f3jVar.r;
                    ny30 ny30Var = ny30.f24311a;
                    this.j = true;
                    p7m0Var3.o(null, ny30Var);
                    if (Unit.f46060a == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    p7m0 p7m0Var4 = (p7m0) f3jVar.r;
                    ny30 ny30Var2 = ny30.b;
                    this.j = true;
                    p7m0Var4.o(null, ny30Var2);
                    if (Unit.f46060a == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
