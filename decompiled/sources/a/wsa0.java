package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class wsa0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ata0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wsa0(ata0 ata0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = ata0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        ata0 ata0Var = this.k;
        switch (b) {
            case 0:
                return new wsa0(ata0Var, yjeVar, (byte) 0);
            case 1:
                return new wsa0(ata0Var, yjeVar, (byte) 1);
            case 2:
                return new wsa0(ata0Var, yjeVar, (byte) 2);
            default:
                return new wsa0(ata0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((wsa0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ata0 ata0Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vpu vpuVar = ata0Var.y;
                    this.j = true;
                    if (vpuVar.b(false, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = ata0.S;
                ata0Var.G(lsa0.f20569a);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarD = ata0Var.J.f43985a.d();
                    ysa0 ysa0Var = new ysa0(ata0Var, b2);
                    this.j = true;
                    if (gmqVarD.c(ysa0Var, this) == wneVar2) {
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
                    i89 i89VarA = ((n9s) ata0Var.t.f40284a).a();
                    ysa0 ysa0Var2 = new ysa0(ata0Var, (byte) 2);
                    this.j = true;
                    if (i89VarA.c(ysa0Var2, this) == wneVar3) {
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
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    fnq fnqVarA = ata0Var.z.a();
                    ysa0 ysa0Var3 = new ysa0(ata0Var, (byte) 4);
                    this.j = true;
                    if (fnqVarA.c(ysa0Var3, this) == wneVar4) {
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
        }
    }
}
