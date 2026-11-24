package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qec0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sec0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qec0(sec0 sec0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sec0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sec0 sec0Var = this.k;
        switch (b) {
            case 0:
                return new qec0(sec0Var, yjeVar, (byte) 0);
            case 1:
                return new qec0(sec0Var, yjeVar, (byte) 1);
            default:
                qec0 qec0Var = new qec0(sec0Var, yjeVar, (byte) 2);
                qec0Var.j = ((Boolean) obj).booleanValue();
                return qec0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qec0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qec0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qec0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        bec0 bec0Var;
        Object value2;
        bec0 bec0Var2;
        Object objQ;
        Object value3;
        bec0 bec0Var3;
        Object value4;
        byte b = this.i;
        sec0 sec0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    nou nouVar = sec0Var.w;
                    this.j = true;
                    objA = nouVar.a(tl5.c, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                int i = ((ql5) objA).h;
                List list = sec0.E;
                p7m0 p7m0Var = sec0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bec0Var = (bec0) value;
                } while (!p7m0Var.m(value, bec0.a(bec0Var, null, null, null, false, false, false, false, false, null, false, kdc0.a(bec0Var.p, i, false, 123), 32767)));
                return Unit.f46060a;
            case 1:
                ocj ocjVar = sec0Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    List list2 = sec0.E;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        bec0Var2 = (bec0) value2;
                    } while (!p7m0Var2.m(value2, bec0.a(bec0Var2, null, null, null, false, false, false, false, false, null, false, kdc0.a(bec0Var2.p, 0, true, 119), 32767)));
                    j910 j910Var = sec0Var.x;
                    this.j = true;
                    objQ = j910Var.q(this);
                    if (objQ == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ = obj;
                }
                o7c0 o7c0Var = (o7c0) objQ;
                String str = zvw.V(o7c0Var, sec0Var.v).b;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    bec0Var3 = (bec0) value3;
                } while (!p7m0Var3.m(value3, bec0.a(bec0Var3, null, null, null, false, false, false, false, false, null, false, kdc0.a(bec0Var3.p, o7c0Var.d, false, 123), 32767)));
                sec0Var.G(new iec0(str));
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3 && !((bec0) sec0Var.D()).g) {
                    p7m0 p7m0Var4 = sec0Var.i.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, bec0.a((bec0) value4, null, null, null, false, false, false, true, false, null, false, null, 65471)));
                    sec0Var.M(false, false);
                }
                return Unit.f46060a;
        }
    }
}
