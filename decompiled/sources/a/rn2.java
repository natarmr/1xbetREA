package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class rn2 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yn2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn2(yn2 yn2Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = yn2Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        yn2 yn2Var = this.k;
        switch (b) {
            case 0:
                return new rn2(yn2Var, yjeVar, (byte) 0);
            default:
                return new rn2(yn2Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((rn2) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        byte b = this.i;
        yn2 yn2Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hjd hjdVar = yn2Var.X;
                    y1p y1pVar = y1p.MAIN;
                    cid cidVar = new cid("bet_favor_viewed", new yq2());
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
                n0o0 n0o0Var = yn2Var.Z;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    j3c j3cVar = yn2Var.w;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wcb wcbVar = (wcb) objC;
                boolean zJ = yn2Var.x.j();
                List listA = yn2Var.v.f20692a.a();
                r9u r9uVar = yn2Var.T;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                ym2 ym2Var = new ym2(((sff0) n0o0Var.getValue()).g.y, ((sff0) n0o0Var.getValue()).J, ((sff0) n0o0Var.getValue()).J1, zJ, yn2Var.K, wcbVar, listA, j1q0Var.f15748a.d(ygpVar));
                p7m0 p7m0Var = yn2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, xm2.a((xm2) value, false, false, false, null, null, ym2Var, false, false, false, false, false, false, 261119)));
                return Unit.f46060a;
        }
    }
}
