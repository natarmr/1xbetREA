package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class whx extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dix k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whx(dix dixVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dixVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dix dixVar = this.k;
        switch (b) {
            case 0:
                return new whx(dixVar, yjeVar, (byte) 0);
            default:
                whx whxVar = new whx(dixVar, yjeVar, (byte) 1);
                whxVar.j = ((Boolean) obj).booleanValue();
                return whxVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((whx) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dix dixVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    yk50 yk50Var = dixVar.y;
                    this.j = true;
                    ((fix) yk50Var.b).b.f35648a.n(null);
                    if (Unit.f46060a == wneVar) {
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
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int i = dix.C;
                    bby bbyVar = dixVar.A;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    dixVar.A = sac.V(jiu0.a(dixVar), new h7w((byte) 26), null, dixVar.t.f22085a, new vhx(dixVar, null), 10);
                } else {
                    bby bbyVar2 = dixVar.A;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                }
                return Unit.f46060a;
        }
    }
}
