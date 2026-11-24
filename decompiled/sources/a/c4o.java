package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class c4o extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d4o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4o(d4o d4oVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = d4oVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        d4o d4oVar = this.k;
        switch (b) {
            case 0:
                return new c4o(d4oVar, yjeVar, (byte) 0);
            case 1:
                return new c4o(d4oVar, yjeVar, (byte) 1);
            case 2:
                return new c4o(d4oVar, yjeVar, (byte) 2);
            default:
                return new c4o(d4oVar, yjeVar, (byte) 3);
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
        return ((c4o) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        y3o y3oVar;
        Object value2;
        y3o y3oVar2;
        byte b = this.i;
        d4o d4oVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    cr2 cr2Var = new cr2();
                    hjd hjdVar = d4oVar.u;
                    cid cidVar = new cid(kpb.v0(cr2Var), cr2Var);
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar) {
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
                    a6u a6uVar = d4oVar.p;
                    EsportsGamesScreenParams esportsGamesScreenParams = ((y3o) d4oVar.D()).f41962a;
                    a6uVar.getClass();
                    dnq dnqVar = new dnq(new vsg0(new fns(a6uVar, esportsGamesScreenParams, (yje) null, (byte) 22)), new rl2(3, null, (byte) 18), (byte) 1);
                    sxk sxkVar = new sxk(d4oVar, null, (byte) 7);
                    this.j = true;
                    Object objC = dnqVar.c(new vnq(h660.f12515a, sxkVar, (byte) 2), this);
                    if (objC != wneVar2) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar2) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar2) {
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
                    pmi0 pmi0Var = d4oVar.y;
                    this.j = true;
                    if (pmi0Var.f() == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = d4o.H;
                p7m0 p7m0Var = d4oVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    y3oVar = (y3o) value;
                } while (!p7m0Var.m(value, y3o.a(y3oVar, null, null, null, 0, false, false, null, null, 0L, 0L, false, !y3oVar.n, false, 57343)));
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    nsu nsuVar = d4oVar.w;
                    this.j = true;
                    if (nsuVar.a() == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = d4o.H;
                p7m0 p7m0Var2 = d4oVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    y3oVar2 = (y3o) value2;
                } while (!p7m0Var2.m(value2, y3o.a(y3oVar2, null, null, null, 0, false, false, null, null, 0L, 0L, !y3oVar2.m, false, false, 61439)));
                return Unit.f46060a;
        }
    }
}
