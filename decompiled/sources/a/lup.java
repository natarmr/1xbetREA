package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class lup extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pup k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lup(pup pupVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pupVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pup pupVar = this.k;
        switch (b) {
            case 0:
                lup lupVar = new lup(pupVar, yjeVar, (byte) 0);
                lupVar.j = ((Boolean) obj).booleanValue();
                return lupVar;
            case 1:
                return new lup(pupVar, yjeVar, (byte) 1);
            default:
                return new lup(pupVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((lup) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lup) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lup) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pup pupVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    int i = pup.C;
                    pupVar.N();
                    pupVar.M(false);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bby bbyVar = pupVar.z;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar2) {
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
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jwu jwuVar = pupVar.u;
                    String str = pupVar.o;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar3) {
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
