package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qen0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ren0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qen0(ren0 ren0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ren0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ren0 ren0Var = this.k;
        switch (b) {
            case 0:
                return new qen0(ren0Var, yjeVar, (byte) 0);
            case 1:
                return new qen0(ren0Var, yjeVar, (byte) 1);
            default:
                qen0 qen0Var = new qen0(ren0Var, yjeVar, (byte) 2);
                qen0Var.j = ((Boolean) obj).booleanValue();
                return qen0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qen0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qen0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qen0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        ren0 ren0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ouu ouuVar = ren0Var.p;
                    ouuVar.getClass();
                    a1g a1gVarF0 = dub.f0(new vsg0(new atj(ouuVar, null, (byte) 18)), ((j9u) ouuVar.c).f16158a.e(), ((yfu) ouuVar.d).b(), new oyu(4, null, (byte) 0));
                    r0m0 r0m0Var = new r0m0(ren0Var, (byte) 18);
                    this.j = true;
                    if (a1gVarF0.c(r0m0Var, this) == wneVar) {
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
                    int i = ren0.D;
                    p7m0 p7m0Var = ren0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, jen0.a((jen0) value, false, true, false, null, null, 29)));
                    ehf0 ehf0Var = ren0Var.s;
                    this.j = true;
                    if (ehf0Var.l(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = ren0.D;
                ren0Var.N();
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = ren0.D;
                ocj ocjVar = ren0Var.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, jen0.a((jen0) value2, z3, false, false, null, null, 30)));
                if (z3) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                    } while (!p7m0Var3.m(value4, jen0.a((jen0) value4, false, false, false, null, een0.f7681a, 15)));
                    ren0Var.N();
                } else {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, jen0.a((jen0) value3, false, false, false, null, een0.b, 15)));
                }
                return Unit.f46060a;
        }
    }
}
