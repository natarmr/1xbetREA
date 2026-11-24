package a;

import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class sya extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ uya k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sya(uya uyaVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uyaVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uya uyaVar = this.k;
        switch (b) {
            case 0:
                return new sya(uyaVar, yjeVar, (byte) 0);
            default:
                sya syaVar = new sya(uyaVar, yjeVar, (byte) 1);
                syaVar.j = ((Boolean) obj).booleanValue();
                return syaVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((sya) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        uya uyaVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    cu cuVar = uyaVar.s;
                    long j = ((kya) uyaVar.D()).i;
                    this.j = true;
                    objK = cuVar.k(j, this);
                    if (objK == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                List list = (List) objK;
                int i = uya.D;
                p7m0 p7m0Var = uyaVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, kya.a((kya) value, dyb.o0(list), dyb.o0(list), null, null, false, list.isEmpty(), 0L, null, 348)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = uyaVar.f;
                int i2 = uya.D;
                ocj ocjVar = uyaVar.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, kya.a((kya) value2, null, null, null, null, z2, false, 0L, null, 959)));
                String str = ((kya) uyaVar.D()).d;
                boolean z3 = ((kya) uyaVar.D()).f && !((kya) uyaVar.D()).f19097a.isEmpty();
                if (z2) {
                    if (z2 && !((kya) uyaVar.D()).f) {
                        uyaVar.N();
                    } else if (z2 && str != null) {
                        uyaVar.O(str);
                    } else if (z2 && ((kya) uyaVar.D()).f) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                        } while (!p7m0Var3.m(value3, kya.a((kya) value3, null, null, null, null, false, false, 0L, null, 511)));
                    }
                } else if (!z3) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value4, kya.a((kya) value4, null, null, null, null, false, false, 0L, new UnknownHostException(), 511)));
                }
                return Unit.f46060a;
        }
    }
}
