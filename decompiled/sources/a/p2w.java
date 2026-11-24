package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p2w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ r2w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2w(r2w r2wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r2wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r2w r2wVar = this.k;
        switch (b) {
            case 0:
                p2w p2wVar = new p2w(r2wVar, yjeVar, (byte) 0);
                p2wVar.j = ((Boolean) obj).booleanValue();
                return p2wVar;
            default:
                return new p2w(r2wVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((p2w) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((p2w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r2w r2wVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                twn.A(z, r2wVar.A, null);
                p7m0 p7m0Var = r2wVar.y;
                if (!((d3w) p7m0Var.getValue()).f) {
                    d3w d3wVar = (d3w) p7m0Var.getValue();
                    if (!d3wVar.d && !d3wVar.e) {
                        boolean z2 = ((d3w) p7m0Var.getValue()).d;
                    } else if (z) {
                        r2wVar.B(true);
                    } else {
                        r2wVar.D();
                    }
                } else if (z) {
                    r2wVar.B(true);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vkr0 vkr0Var = r2wVar.g;
                    String str = r2wVar.w().f22868a;
                    s77 s77Var = r2wVar.w().c;
                    String str2 = r2wVar.w().g;
                    long j = r2wVar.c;
                    this.j = true;
                    obj = vkr0Var.q(str, s77Var, str2, true, j, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                n3w n3wVar = (n3w) obj;
                r2wVar.G(n3wVar);
                if (!r2w.A(n3wVar.J1) || q3d.j(e4f.l, e4f.m, e4f.g, e4f.j).contains(r2wVar.w().l)) {
                    r2wVar.C.cancel(null);
                }
                return Unit.f46060a;
        }
    }
}
