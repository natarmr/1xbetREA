package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class y8t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ a9t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8t(a9t a9tVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a9tVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a9t a9tVar = this.k;
        switch (b) {
            case 0:
                return new y8t(a9tVar, yjeVar, (byte) 0);
            default:
                return new y8t(a9tVar, yjeVar, (byte) 1);
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
        return ((y8t) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a9t a9tVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    fq fqVar = a9tVar.b;
                    s9t s9tVar = a9tVar.C;
                    ly5 ly5Var = new ly5(s9tVar.c, lnm0.b, false, s9tVar.f, s9tVar.f31864a, a9tVar.m.a().f4905a.f3145a, a9tVar.C.g);
                    this.j = true;
                    if (fqVar.f(ly5Var, this) == wneVar) {
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
                    a9tVar.j.a(true);
                    i5m0 i5m0Var = a9tVar.c;
                    this.j = true;
                    if (i5m0Var.b(this) == wneVar2) {
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
