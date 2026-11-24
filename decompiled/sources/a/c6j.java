package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class c6j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ e6j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6j(e6j e6jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = e6jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        e6j e6jVar = this.k;
        switch (b) {
            case 0:
                c6j c6jVar = new c6j(e6jVar, yjeVar, (byte) 0);
                c6jVar.j = ((Boolean) obj).booleanValue();
                return c6jVar;
            default:
                return new c6j(e6jVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((c6j) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c6j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        e6j e6jVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                i6j i6jVar = ((w5j) e6jVar.D()).f;
                if (z) {
                    if (!(i6jVar instanceof g6j)) {
                        e6jVar.N();
                    }
                } else if (i6jVar instanceof h6j) {
                    p7m0 p7m0Var = e6jVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, w5j.a((w5j) value, f6j.f9013a, null, 95)));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kd30 kd30Var = e6jVar.E;
                    this.j = true;
                    if (kd30Var.N() == wneVar2) {
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
