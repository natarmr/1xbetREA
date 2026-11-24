package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class t7c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ v7c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7c(v7c v7cVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v7cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v7c v7cVar = this.k;
        switch (b) {
            case 0:
                return new t7c(v7cVar, yjeVar, (byte) 0);
            default:
                t7c t7cVar = new t7c(v7cVar, yjeVar, (byte) 1);
                t7cVar.j = ((Boolean) obj).booleanValue();
                return t7cVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((t7c) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((t7c) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        v7c v7cVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                byte b2 = 1;
                if (!z) {
                    z1x.P(obj);
                    omi0 omi0VarN = v7cVar.x.n();
                    jz6 jz6Var = new jz6(v7cVar, b2);
                    this.j = true;
                    if (omi0VarN.c(jz6Var, this) == wneVar) {
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
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = v7cVar.Q;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, i7c.a((i7c) value, null, null, null, null, false, z2, false, 12287)));
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, i7c.a((i7c) value2, null, v7cVar.B(), v7cVar.D(), null, false, false, false, 15935)));
                return Unit.f46060a;
        }
    }
}
