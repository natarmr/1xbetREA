package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qkw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ukw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkw(ukw ukwVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ukwVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ukw ukwVar = this.k;
        switch (b) {
            case 0:
                qkw qkwVar = new qkw(ukwVar, yjeVar, (byte) 0);
                qkwVar.j = ((Boolean) obj).booleanValue();
                return qkwVar;
            case 1:
                return new qkw(ukwVar, yjeVar, (byte) 1);
            default:
                return new qkw(ukwVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qkw) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qkw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qkw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        byte b = this.i;
        ukw ukwVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    int i = ukw.X;
                    ukwVar.Z();
                } else {
                    bby bbyVar = ukwVar.T;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                }
                ukwVar.O(z, ((zjw) ukwVar.D()).g);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    h2c h2cVar = new h2c(((or30) ukwVar.C.f13740a.f1850a.c).f25719a, (byte) 16);
                    v6w v6wVar = new v6w(ukwVar, (byte) 7);
                    this.j = true;
                    Object objC2 = h2cVar.c(new uap(v6wVar, (byte) 12), this);
                    if (objC2 != wne.f39444a) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar2) {
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
                    r2u r2uVar = ukwVar.L;
                    this.j = true;
                    objC = r2uVar.c(this);
                    if (objC == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                List list = (List) objC;
                int i2 = ukw.X;
                p7m0 p7m0Var = ukwVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, zjw.a((zjw) value, list, null, null, false, null, false, null, null, null, null, null, null, 524279)));
                return Unit.f46060a;
        }
    }
}
