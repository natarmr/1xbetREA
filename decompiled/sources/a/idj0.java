package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class idj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ odj0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ idj0(odj0 odj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = odj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        odj0 odj0Var = this.l;
        switch (b) {
            case 0:
                idj0 idj0Var = new idj0(odj0Var, yjeVar, (byte) 0);
                idj0Var.k = obj;
                return idj0Var;
            default:
                idj0 idj0Var2 = new idj0(odj0Var, yjeVar, (byte) 1);
                idj0Var2.k = obj;
                return idj0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((idj0) create((tm4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((idj0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        odj0 odj0Var = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                tm4 tm4Var = (tm4) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    im4 im4Var = odj0Var.x0;
                    this.k = tm4Var;
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(jl4.f16698a, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (tm4Var != null) {
                    if (tm4Var instanceof sm4) {
                        int i = odj0.V0;
                        odj0Var.G(rcj0.f30243a);
                    } else if (tm4Var instanceof rm4) {
                        rm4 rm4Var = (rm4) tm4Var;
                        Throwable th = rm4Var.f30728a;
                        uu4 uu4Var = rm4Var.b;
                        int i2 = odj0.V0;
                        odj0Var.O(th, uu4Var);
                    }
                    p7m0 p7m0Var = odj0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, tcj0.a((tcj0) value, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -2, 2097151)));
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                e7a e7aVar = (e7a) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (e7aVar instanceof d7a) {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        bai0 bai0Var = new bai0(odj0Var, e7aVar, yjeVar, (byte) 13);
                        this.k = null;
                        this.j = true;
                        if (qjj.d0(vs10Var, bai0Var, this) == wneVar2) {
                            return wneVar2;
                        }
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
