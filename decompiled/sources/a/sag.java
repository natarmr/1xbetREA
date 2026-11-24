package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sag extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ tag k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sag(tag tagVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tagVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new sag(this.k, yjeVar, (byte) 0);
            default:
                return new sag(this.k, yjeVar, (byte) 1);
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
        return ((sag) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        h660 h660Var = h660.f12515a;
        tag tagVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p7m0 p7m0VarD = tagVar.d.f43639a.d();
                rag ragVar = new rag(tagVar, null, (byte) 0);
                this.j = true;
                p7m0VarD.c(new vnq(h660Var, ragVar, (byte) 2), this);
                return wneVar;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(tagVar.e.f41877a.e());
                    rag ragVar2 = new rag(tagVar, null, (byte) 1);
                    this.j = true;
                    Object objC = gmqVarW.c(new vnq(h660Var, ragVar2, (byte) 2), this);
                    if (objC != wneVar2) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar2) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar2) {
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
