package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class p90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ u90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p90(u90 u90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = u90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u90 u90Var = this.k;
        switch (b) {
            case 0:
                return new p90(u90Var, yjeVar, (byte) 0);
            case 1:
                return new p90(u90Var, yjeVar, (byte) 1);
            default:
                return new p90(u90Var, yjeVar, (byte) 2);
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
        }
        return ((p90) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        u90 u90Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u90Var.H(new k90(0.0f, 0.0f, false));
                    u90Var.H(new j90(true));
                    o80 o80Var = u90Var.b.d.c.d;
                    fq fqVar = u90Var.c;
                    ly5 ly5Var = new ly5(o80Var.b, lnm0.b, false, o80Var.c, o80Var.d, u90Var.f.a().f4905a.f3145a, o80Var.f24808a);
                    this.j = true;
                    if (fqVar.f(ly5Var, this) == wneVar) {
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
                    qoj0 qoj0Var = u90Var.A;
                    this.j = true;
                    if (qoj0Var.a(i90.f14366a, this) == wneVar2) {
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
            default:
                p80 p80Var = u90Var.b;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    ArrayList arrayListA = p80Var.d.c.a();
                    lg60 lg60Var = u90Var.i;
                    p80Var.getClass();
                    lg60Var.a(p80.a(arrayListA));
                    i5m0 i5m0Var = u90Var.d;
                    this.j = true;
                    if (i5m0Var.b(this) == wneVar3) {
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
        }
    }
}
