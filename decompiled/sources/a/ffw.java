package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ffw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hfw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffw(hfw hfwVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hfwVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hfw hfwVar = this.k;
        switch (b) {
            case 0:
                ffw ffwVar = new ffw(hfwVar, yjeVar, (byte) 0);
                ffwVar.j = ((Boolean) obj).booleanValue();
                return ffwVar;
            default:
                return new ffw(hfwVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ffw) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ffw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hfw hfwVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                hfwVar.I = z;
                hfwVar.N();
                hfwVar.M();
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    esg0 esg0Var = hfwVar.C;
                    this.j = true;
                    if (esg0Var.Y(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = hfw.J;
                hfwVar.G(iew.f14657a);
                return Unit.f46060a;
        }
    }
}
