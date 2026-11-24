package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class pl2 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ul2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl2(ul2 ul2Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = ul2Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        ul2 ul2Var = this.k;
        switch (b) {
            case 0:
                return new pl2(ul2Var, yjeVar, (byte) 0);
            default:
                return new pl2(ul2Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((pl2) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ul2 ul2Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hjd hjdVar = ul2Var.E;
                    y1p y1pVar = y1p.MAIN;
                    cid cidVar = new cid("bet_favor_events", new fq2());
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = ul2.S;
                    a6u a6uVar = ul2Var.D;
                    if (((nl2) ul2Var.D()).f) {
                        a6uVar.getClass();
                    } else {
                        a6uVar.f = null;
                    }
                    vsg0 vsg0VarH0 = bkb.h0(8L, TimeUnit.SECONDS, new gkr(a6uVar, null, (byte) 17));
                    gmq gmqVarB = ul2Var.B.b(true);
                    abu abuVar = ul2Var.C;
                    utb utbVarC = aoq.c(i120.W(new dnq(uvw.Q(dub.f0(vsg0VarH0, gmqVarB, new ewt(((gst0) abuVar.c).f11847a.c, abuVar, (byte) 11), new ql2(ul2Var, yjeVar, (byte) 0)), false), new rl2(3, null, (byte) 0), (byte) 1)), new zo1((yje) null, ul2Var, (byte) 1));
                    mn1 mn1Var = new mn1(ul2Var, (byte) 15);
                    this.j = true;
                    if (utbVarC.c(mn1Var, this) == wneVar2) {
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
        }
    }
}
