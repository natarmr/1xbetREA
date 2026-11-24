package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g3p extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ i3p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3p(i3p i3pVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i3pVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        i3p i3pVar = this.k;
        switch (b) {
            case 0:
                g3p g3pVar = new g3p(i3pVar, yjeVar, (byte) 0);
                g3pVar.j = ((Boolean) obj).booleanValue();
                return g3pVar;
            case 1:
                return new g3p(i3pVar, yjeVar, (byte) 1);
            default:
                return new g3p(i3pVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((g3p) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g3p) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g3p) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        i3p i3pVar = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                ocj ocjVar = i3pVar.i;
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    if (((w2p) i3pVar.D()).f.isEmpty() || ((w2p) i3pVar.D()).c) {
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var.getValue();
                            value3.getClass();
                        } while (!p7m0Var.m(value3, w2p.a((w2p) value3, true, false, false, null, null, 122)));
                    }
                    i3pVar.N();
                } else if (!z && ((w2p) i3pVar.D()).f38461a) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, w2p.a((w2p) value, false, false, true, null, null, 122)));
                }
                int i = i3p.F;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, w2p.a((w2p) value2, false, z, false, null, null, 125)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    yzn0 yzn0Var = i3pVar.s;
                    this.j = true;
                    if (yzn0Var.l(this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vsg0 vsg0VarH0 = bkb.h0(30L, TimeUnit.SECONDS, new g3p(i3pVar, yjeVar, b2));
                    h3p h3pVar = h3p.b;
                    this.j = true;
                    if (vsg0VarH0.c(h3pVar, this) == wneVar3) {
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
