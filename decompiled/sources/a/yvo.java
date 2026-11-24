package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yvo extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cwo k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvo(cwo cwoVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cwoVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cwo cwoVar = this.k;
        switch (b) {
            case 0:
                return new yvo(cwoVar, yjeVar, (byte) 0);
            case 1:
                yvo yvoVar = new yvo(cwoVar, yjeVar, (byte) 1);
                yvoVar.j = ((Boolean) obj).booleanValue();
                return yvoVar;
            case 2:
                return new yvo(cwoVar, yjeVar, (byte) 2);
            default:
                return new yvo(cwoVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yvo) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yvo) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((yvo) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yvo) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objC;
        kvo kvoVar;
        List list;
        Object value2;
        byte b = this.i;
        cwo cwoVar = this.k;
        switch (b) {
            case 0:
                oyg0 oyg0Var = cwoVar.f;
                ocj ocjVar = cwoVar.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    boolean z2 = ((mvo) cwoVar.D()).d == null || !((kvoVar = ((mvo) cwoVar.D()).d) == null || (list = kvoVar.b) == null || !list.isEmpty());
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, mvo.a((mvo) value, false, z2, false, null, null, null, 57)));
                    x4u x4uVar = cwoVar.t;
                    String str = cwoVar.o;
                    this.j = true;
                    objC = ((iqi) x4uVar.f40284a).c(this, str, true);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                kvo kvoVar2 = (kvo) objC;
                int i = cwo.B;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, mvo.a((mvo) value2, false, false, false, kvoVar2, null, null, 49)));
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z3 && ((mvo) cwoVar.D()).d == null && !((mvo) cwoVar.D()).b) {
                    cwoVar.O();
                    cwoVar.M();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bby bbyVar = cwoVar.z;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    jwu jwuVar = cwoVar.v;
                    String str2 = cwoVar.o;
                    this.j = true;
                    if (jwuVar.b(str2, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
