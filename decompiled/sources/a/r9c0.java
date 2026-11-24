package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class r9c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ org.xplatform.feature.promo_aggregator.impl.presentation.compose.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9c0(org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = this.k;
        switch (b) {
            case 0:
                return new r9c0(bVar, yjeVar, (byte) 0);
            default:
                return new r9c0(bVar, yjeVar, (byte) 1);
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
        return ((r9c0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        byte b = this.i;
        org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                try {
                    if (!z) {
                        z1x.P(obj);
                        bby bbyVar2 = bVar.N;
                        if (bbyVar2 != null && bbyVar2.isActive()) {
                            this.j = true;
                            if (bbyVar2.join(this) == wneVar) {
                                return wneVar;
                            }
                        }
                        bbyVar = bVar.L;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        return Unit.f46060a;
                    }
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    break;
                } catch (CancellationException unused) {
                }
                bbyVar = bVar.L;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    n660 n660Var = bVar.E;
                    this.j = true;
                    if (n660Var.z(this) == wneVar2) {
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
