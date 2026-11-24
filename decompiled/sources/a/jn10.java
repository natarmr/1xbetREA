package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jn10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pn10 k;
    public final /* synthetic */ csr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn10(pn10 pn10Var, csr csrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pn10Var;
        this.l = csrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        csr csrVar = this.l;
        pn10 pn10Var = this.k;
        switch (b) {
            case 0:
                return new jn10(pn10Var, csrVar, yjeVar, (byte) 0);
            default:
                return new jn10(pn10Var, csrVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((jn10) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    csr csrVar = this.l;
                    long j = csrVar.f4905a.b;
                    this.j = true;
                    int i = pn10.e0;
                    if (this.k.V(j, csrVar, false, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    csr csrVar2 = this.l;
                    long j2 = csrVar2.f4905a.b;
                    this.j = true;
                    int i2 = pn10.e0;
                    if (this.k.V(j2, csrVar2, true, this) == wneVar2) {
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
