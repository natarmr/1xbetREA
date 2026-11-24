package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class slv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ daf k;
    public final /* synthetic */ l9s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ slv(daf dafVar, l9s l9sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dafVar;
        this.l = l9sVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l9s l9sVar = this.l;
        daf dafVar = this.k;
        switch (b) {
            case 0:
                return new slv(dafVar, l9sVar, yjeVar, (byte) 0);
            default:
                return new slv(dafVar, l9sVar, yjeVar, (byte) 1);
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
        return ((slv) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        l9s l9sVar = this.l;
        daf dafVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    fck0 fck0Var = (fck0) dafVar.i;
                    String strI = l9sVar.i();
                    this.j = true;
                    if (fck0Var.g(strI, this) == wneVar) {
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
                    String strA = ((ntu) dafVar.h).a();
                    glt0 glt0Var = (glt0) dafVar.k;
                    long jA = l9sVar.a();
                    boolean z3 = ((sff0) dafVar.m).i;
                    this.j = true;
                    if (glt0Var.e(jA, this, strA, z3) == wneVar2) {
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
